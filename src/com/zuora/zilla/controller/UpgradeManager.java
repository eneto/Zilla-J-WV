package com.zuora.zilla.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zuora.api.QueryResult;
import com.zuora.api.object.ProductRatePlan;
import com.zuora.api.object.ProductRatePlanCharge;
import com.zuora.api.object.RatePlan;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.model.AmenderCharge;
import com.zuora.zilla.model.AmenderPlan;
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
	
	public void retrieveProductsFromCatalog() {
		
	}
	
//	public AmenderPlan getAmenderPlanFromId(String productRatePlanId) {
//		AmenderPlan amenderPlan = null;
//		
//		// Get the name and description for this product
//		try {
//			QueryResult ratePlanQuery = zapi.zQuery("select Name, Description from ProductRatePlan where Id='"
//					+ productRatePlanId + "'");
//			
//			ProductRatePlan prp = (ProductRatePlan) ratePlanQuery.getRecords(0);
//			
//			amenderPlan = new AmenderPlan();
//			amenderPlan.setAmendmentId(prp.getId());
//			amenderPlan.setName(prp.getName());
//			amenderPlan.setDescription(prp.getDescription());
//			
//			
//		} catch (Exception e) {
//			logger.error("Error while querying product rate plan " + productRatePlanId + " | " + e.getMessage());
//		}
//		
//		// Get the charges
//		amenderPlan.setAmenderCharges(getAmenderChargesFromId(productRatePlanId));
//		
//		return amenderPlan;
//	}
	
//	public List<AmenderCharge> getAmenderChargesFromId(String productRatePlanId) {
//		List<AmenderCharge> charges = new ArrayList<AmenderCharge>();
//		
//		try {
//			QueryResult chargesResult = zapi.zQuery("SELECT Id,Name,"
//					+ "ProductRatePlanChargeId,ChargeModel,ChargeType,UOM,"
//					+ "Quantity,ChargedThroughDate FROM ProductRatePlanCharge "
//					+ "WHERE ProductRatePlanId='" + productRatePlanId + "'");
//			
//			for (ZObject zObject : chargesResult.getRecords()) {
//				ProductRatePlanCharge prpc = (ProductRatePlanCharge) zObject;
//				
//			}
//			
//		} catch (Exception e) {
//			logger.error("Error retrieving charges for product rate plan "
//					+ productRatePlanId + " | " + e.getMessage());
//		}
//		
//		return charges;
//	}
	
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
