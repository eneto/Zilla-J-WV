package com.zuora.zilla.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zuora.api.AmendOptions;
import com.zuora.api.AmendRequest;
import com.zuora.api.AmendResult;
import com.zuora.api.PreviewOptions;
import com.zuora.api.QueryResult;
import com.zuora.api.RatePlanData;
import com.zuora.api.object.Amendment;
import com.zuora.api.object.ProductRatePlan;
import com.zuora.api.object.RatePlan;
import com.zuora.api.object.RatePlanCharge;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.model.AmenderSubscription;
import com.zuora.zilla.util.ZApi;

public class UpgradeManager {
	
	private static final Logger logger = LoggerFactory.getLogger(UpgradeManager.class);

	private ZApi zapi;
	
	/** IDs from lower Product Rate Plans */
	private List<String> lowerPrpId;
	
	private String currentPrpId;
	
	/** IDs from upper Product Rate Plans */
	private List<String> upperPrpId;

	public UpgradeManager() {
		zapi = new ZApi();
		lowerPrpId = new ArrayList<String>();
		upperPrpId = new ArrayList<String>();
	}
	
	/**
	 * If you precise an account name, then we populate immediately the
	 * two lists and the current Rate plan ID
	 * @param accountName
	 */
	public UpgradeManager(String accountName) {
		zapi = new ZApi();
		lowerPrpId = new ArrayList<String>();
		upperPrpId = new ArrayList<String>();
		String currentSubscriptionRPID = getCurrentSubscriptionRatePlanId(accountName);
		String productRatePlanId = getAssociatedProductRatePlanId(currentSubscriptionRPID);
		retrieveGroup(productRatePlanId);
	}
	
	/**
	 * To retrieve the rate plan ID from the current subscription
	 * @param accountName Value passed from the HttpSession (see client)
	 * @return Id of the RatePlan associated with the current subscription
	 */
	public String getCurrentSubscriptionRatePlanId(String accountName) {
		AmenderSubscription subscription = null;
		try {
			subscription = new SubscriptionManager().getCurrentSubscription(accountName);
		} catch (Exception e) {
			logger.error("Error retrieving the current subscription | " + e.getMessage());
		}
		
		return subscription.getActivePlans().get(0).getId();
	}
	
	/**
	 * To retrieve the original product ID
	 * @param ratePlanId the rate plan ID from the subscription
	 * @return Product Rate Plan Id
	 */
	public String getAssociatedProductRatePlanId(String ratePlanId) {
		QueryResult result = null;
		try {
			result = zapi.zQuery("select ProductRatePlanId from RatePlan where Id='" + ratePlanId + "'");
		} catch (Exception e) {
			logger.error("Something went bad while querying RatePlanId=" + ratePlanId + " | " + e.getMessage());
		}
		RatePlan rp = (RatePlan) result.getRecords()[0];
		return rp.getProductRatePlanId();
	}

	public void retrieveGroup(String productRatePlanId) {

		try {
			QueryResult result = zapi.zQuery("select UpgradeGroup__c, UpgradeLevel__c from ProductRatePlan where Id='"
					+ productRatePlanId + "'");
			logger.debug("Retrieved " + result.getSize() + " records from UpgradeGroup request");
			
			ProductRatePlan prp = (ProductRatePlan) result.getRecords()[0];
			logger.debug("Upgrade Group = " + prp.getUpgradeGroup__c() + " (level = " + prp.getUpgradeLevel__c() + ")");
			
			// Save this so we now it's the current rate plan used
			currentPrpId = prp.getId();
			Integer currentGroupLevel = Integer.parseInt(prp.getUpgradeLevel__c());
			
			QueryResult groupResult = zapi.zQuery(
					"select Id, Name, UpgradeLevel__c from ProductRatePlan where UpgradeGroup__c='"
					+ prp.getUpgradeGroup__c() + "'");
			
			// Cast the result
			List<ProductRatePlan> allRatePlan = new ArrayList<ProductRatePlan>();
			for (ZObject zo : groupResult.getRecords()) {
				ProductRatePlan productRatePlan = (ProductRatePlan) zo;
				logger.debug(productRatePlan.getName() + " (lvl " + productRatePlan.getUpgradeLevel__c() + ")");
				allRatePlan.add(productRatePlan);
			}
			
			// Populate the lists
			for (ProductRatePlan p : allRatePlan) {
				Integer pLevel = Integer.parseInt(p.getUpgradeLevel__c());
				
				// If it's not the current product rate plan associated with the subscription
				if (p.getId() != currentPrpId) {
					if (pLevel < currentGroupLevel)
						lowerPrpId.add(p.getId());
					else if (pLevel > currentGroupLevel)
						upperPrpId.add(p.getId());
					else {
						// TODO handle the fact that some product can have the same level
					}
				}
			}

			
		} catch (Exception e) {
			logger.error("Error retrieving the Upgrade Group from the Product Rate Plan Id: "
					+ productRatePlanId + " | " + e.getMessage());
		}
	}
	
	public void downgradeOrUpgrade(String subscriptionId, String oldRatePlanId, String newProductRatePlanId, boolean preview, boolean isUpgrade) {
//		AmenderResult amenderResult = new AmenderResult();
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		
		Calendar endOfCycle = null;
		
		// If it's an upgrade, effective immediately
		if (isUpgrade)
			endOfCycle = Calendar.getInstance();
		else
			endOfCycle = getLatestChargedThroughDate(oldRatePlanId);
		
		// If it's null, no charge has been invoiced, so we can put today's date even if it's a downgrade
		if (endOfCycle == null) {
			logger.debug("No charge has been invoiced, defaulting to today's date");
			endOfCycle = Calendar.getInstance();
		}
		
		// Step #1: Remove the current rate plan
		Amendment removeProductAmendment = new Amendment();
		
		removeProductAmendment.setName("Remove Product");
		removeProductAmendment.setStatus("Completed");
		removeProductAmendment.setType("RemoveProduct");
		removeProductAmendment.setSubscriptionId(subscriptionId);
		removeProductAmendment.setContractEffectiveDate(endOfCycle);
		removeProductAmendment.setServiceActivationDate(endOfCycle);
		removeProductAmendment.setCustomerAcceptanceDate(endOfCycle);
		removeProductAmendment.setEffectiveDate(endOfCycle);
		
		
		RatePlanData rpd = new RatePlanData();
		RatePlan rp = new RatePlan();
		rp.setAmendmentSubscriptionRatePlanId(oldRatePlanId);
		rpd.setRatePlan(rp);
		removeProductAmendment.setRatePlanData(rpd);
		
		// Step #2: Option for the first amendment = NO invoice generation
		AmendOptions ao = new AmendOptions();
		ao.setGenerateInvoice(false);
		ao.setProcessPayments(false);
		
		PreviewOptions po = new PreviewOptions();
		po.setEnablePreviewMode(preview);
		po.setNumberOfPeriods(1);
		
		AmendRequest amReq = new AmendRequest();
		
		amReq.setAmendments(new Amendment[] { removeProductAmendment } );
		amReq.setAmendOptions(ao);
		amReq.setPreviewOptions(po);
		
		try {
			AmendResult[] amResp = zapi.zAmend(new AmendRequest[] { amReq });
		} catch (Exception e) {
			logger.error("Error during amend #1 - downgrade");
			e.printStackTrace();
		}
		
		// Step #3: Add the new rate plan
		Amendment addProductAmendment = new Amendment();
		
		addProductAmendment.setName("Add Product");
		addProductAmendment.setStatus("Completed");
		addProductAmendment.setType("NewProduct");
		addProductAmendment.setSubscriptionId(subscriptionId);
		addProductAmendment.setContractEffectiveDate(endOfCycle);
		addProductAmendment.setServiceActivationDate(endOfCycle);
		addProductAmendment.setCustomerAcceptanceDate(endOfCycle);
		addProductAmendment.setEffectiveDate(endOfCycle);
		
		RatePlanData rpd2 = new RatePlanData();
		RatePlan rp2 = new RatePlan();
		rp2.setProductRatePlanId(newProductRatePlanId);
		rpd2.setRatePlan(rp2);
		addProductAmendment.setRatePlanData(rpd2);
		
		// Step #4: Option for the second amendment = Invoice Generation
		AmendOptions ao2 = new AmendOptions();
		ao2.setGenerateInvoice(true);
		ao2.setProcessPayments(false);
		
		AmendRequest amReq2 = new AmendRequest();
		
		amReq2.setAmendments(new Amendment[] { addProductAmendment });
		amReq2.setAmendOptions(ao2);
		
		PreviewOptions po2 = new PreviewOptions();
		po2.setEnablePreviewMode(preview);
		
		amReq2.setPreviewOptions(po2);
		
		try {
			AmendResult[] amResp = zapi.zAmend(new AmendRequest[] { amReq2 });
		} catch (Exception e) {
			logger.error("Error during amend #2 - downgrade");
			e.printStackTrace();
		}

	}
	
	/**
	 * Go through all the charges for a precise RatePlanId and return the latest date
	 * @param ratePlanId
	 * @return NULL if no charge has been invoiced
	 */
	public Calendar getLatestChargedThroughDate(String ratePlanId) {
		Calendar latest = null;
		try {
			QueryResult chargesResult = zapi.zQuery("Select Id, Name, ChargedThroughDate from RatePlanCharge where RatePlanId='" + ratePlanId + "'");
			
			for (ZObject zObject : chargesResult.getRecords()) {
				RatePlanCharge rpc = (RatePlanCharge) zObject;
				if (latest == null) {
					latest = rpc.getChargedThroughDate();
				} else if (latest.compareTo(rpc.getChargedThroughDate()) < 0) {
					latest = rpc.getChargedThroughDate();
				}
			}
		} catch (Exception e) {
			logger.error("Error getting latest charged date from RP ID: " + ratePlanId + " | " + e.getMessage());
		}
		logger.debug("Returned " + latest);
		return latest;
	}
	
	/** GETTERS */
	
	public List<String> getLowerPrpId() {
		return lowerPrpId;
	}
	
	public List<String> getUpperPrpId() {
		return upperPrpId;
	}
	
	public String getCurrentPrpId() {
		return currentPrpId;
	}
}
