package com.zuora.zilla.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zuora.api.QueryResult;
import com.zuora.api.object.RatePlan;
import com.zuora.zilla.model.AmenderSubscription;
import com.zuora.zilla.util.ZApi;

public class UpgradeManager {
	
	private static final Logger logger = LoggerFactory.getLogger(UpgradeManager.class);

	private ZApi zapi;

	public UpgradeManager() {
		zapi = new ZApi();
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
		QueryResult result = null;
		try {
			result = zapi.zQuery("select UpgradeGroup__c, UpgradeLevel__c from ProductRatePlan where Id='"
					+ productRatePlanId + "'");
			logger.debug("Retrieved " + result.getSize() + " records from UpgradeGroup request");
			
		} catch (Exception e) {
			logger.error("Error retrieving the Upgrade Group from the Product Rate Plan Id: "
					+ productRatePlanId);
		}
	}
}
