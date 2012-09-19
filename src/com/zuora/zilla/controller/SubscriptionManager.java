package com.zuora.zilla.controller;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import com.zuora.api.*;
import com.zuora.api.object.*;

import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;

/**
 * This manager allows the user to create and/or preview a subscription (this
 * one based on items that are stored in the current cart).
 * 
 * @author Mickael Pham <mickael.pham@zuora.com>
 * 
 */
public class SubscriptionManager {

	/** The Zuora API instance used to handle soap calls. */
	private ZApi zapi;
	
	public SubscriptionManager() throws Exception {
		// get the stub and the helper
		try {
			zapi = new ZApi();
		} catch (Exception e) {
			throw new Exception("Invalid Login");
		}
	}

	/**
	 * Retrieve all details of the current and removed rateplans on the logged
	 * in user's subscription.
	 * 
	 * @param userEmail User's given Email address
	 * @return Active Subscription details
	 */
	public AmenderSubscription getCurrentSubscription(String accountName) {
		// Step #1: get the associated account Id
		String accountId = null;

		try {
			QueryResult qresAcc = zapi.zQuery("SELECT Id FROM Account WHERE Name='" + accountName + "'");
			accountId = qresAcc.getRecords()[0].getId();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (accountId == null)
			return null; // ACCOUNT_DOES_NOT_EXIST
		
		// Get Active Subscription
		AmenderSubscription activeSubscription = new AmenderSubscription();
		
		QueryResult qresLastSub = null;
		try {
			qresLastSub = zapi.zQuery("SELECT Id,Name,Status,Version,PreviousSubscriptionId,"
					+ "ContractEffectiveDate,TermStartDate FROM Subscription WHERE AccountId='"
					+ accountId + "' AND Status='Active'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if (qresLastSub.getSize() == 0)
				return null; // SUBSCRIPTION_DOES_NOT_EXIST
			
			Subscription subscription = (Subscription) qresLastSub.getRecords()[0];
			
			activeSubscription.setUserEmail(accountName);
			activeSubscription.setSubscriptionId(subscription.getId());
			activeSubscription.setVersion(subscription.getVersion());
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
			
			activeSubscription.setEndOfTermDate(Calendar.getInstance());
			activeSubscription.setStartDate(dateFormat.format(subscription.getTermStartDate().getTime()));
			
			// Prepare list of existing rate plan
			List<AmenderPlan> activePlans = new ArrayList<AmenderPlan>();
			List<AmenderPlan> removedPlans = new ArrayList<AmenderPlan>();
			
			// Get active rate plan 
			QueryResult activeResult = null;
			try {
				activeResult = zapi.zQuery("SELECT Id,Name,ProductRatePlanId FROM RatePlan WHERE SubscriptionId='" + activeSubscription.getSubscriptionId() + "'");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// Loop through all the rate plan
			for (ZObject zObj : activeResult.getRecords()) {
				// Cast
				RatePlan rp = (RatePlan) zObj;
				
				AmenderPlan newPlan = new AmenderPlan();
				
				newPlan.setId(rp.getId());
				newPlan.setName(rp.getName());
				
				// Get product name
				try {
					QueryResult productRatePlanResult = zapi.zQuery("SELECT Description,ProductId FROM ProductRatePlan WHERE Id='" + rp.getProductRatePlanId() + "'");
					ProductRatePlan curPrp = (ProductRatePlan) productRatePlanResult.getRecords()[0];
					
					QueryResult productResult = zapi.zQuery("SELECT Id,Name FROM Product WHERE Id='" + curPrp.getProductId() + "'");
					Product curProd = (Product) productResult.getRecords()[0];

					newPlan.setDescription((curPrp.getDescription() != null) ? curPrp.getDescription() : "");
					newPlan.setProductName(curProd.getName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				// Get all charges
				List<AmenderCharge> charges = new ArrayList<AmenderCharge>();

				QueryResult chargesResult = null;
				try {
					chargesResult = zapi.zQuery("SELECT Id,Name,ProductRatePlanChargeId,ChargeModel,ChargeType,UOM,Quantity,ChargedThroughDate " +
							"FROM RatePlanCharge WHERE RatePlanId='" + rp.getId() + "'");
				} catch (Exception e) {
					e.printStackTrace();
				}
				for (ZObject z2 : chargesResult.getRecords()) {
					RatePlanCharge rpc = (RatePlanCharge) z2;
					AmenderCharge newCharge = new AmenderCharge();
					
					newCharge.setId(rpc.getId());
					newCharge.setName(rpc.getName());
					newCharge.setChargeModel(rpc.getChargeModel());
					newCharge.setProductRatePlanChargeId(rpc.getProductRatePlanChargeId());
					
					if (!rpc.getChargeModel().equals("Flat Fee Pricing")) {
						// TODO Also exlude usage charges
						newPlan.setUom(rpc.getUOM());
						newPlan.setQuantity(rpc.getQuantity().toPlainString());
						newCharge.setUom(rpc.getUOM());
						newCharge.setQuantity(rpc.getQuantity().toPlainString());
					}
					
					// For all charges, find maximum ChargedThroughDate
					if (rpc.getChargedThroughDate() != null) {
						if (rpc.getChargedThroughDate().compareTo(Calendar.getInstance()) > 0) {
							activeSubscription.setEndOfTermDate(rpc.getChargedThroughDate());
						}
					}
					
					charges.add(newCharge);
				}
				
				newPlan.setAmenderCharges(charges);
				activePlans.add(newPlan);
				
			}
			
			// Get removed rate plan
			// Get active rate plan 
			QueryResult removedPlanResult = null;
			try {
				removedPlanResult = zapi.zQuery("SELECT Id,Name,AmendmentType,AmendmentId,ProductRatePlanId FROM RatePlan " +
						"WHERE SubscriptionId='" + activeSubscription.getSubscriptionId() + "' AND AmendmentType='RemoveProduct'");
			} catch (Exception e) {
				e.printStackTrace();
			}
			for (ZObject z3 : removedPlanResult.getRecords()) {
				// Cast
				RatePlan rp = (RatePlan) z3;
				
				// TODO clean this..
				if (rp == null)
					continue;
				
				AmenderPlan newPlan = new AmenderPlan();
				
				newPlan.setId(rp.getId());
				newPlan.setName(rp.getName());
				
				// Get product name
				try {
					QueryResult productRatePlanResult = zapi.zQuery("SELECT Description,ProductId FROM ProductRatePlan WHERE Id='" + rp.getProductRatePlanId() + "'");
					ProductRatePlan curPrp = (ProductRatePlan) productRatePlanResult.getRecords()[0];
					
					QueryResult productResult = zapi.zQuery("SELECT Description,ProductId FROM Product WHERE Id='" + curPrp.getProductId() + "'");
					Product curProd = (Product) productResult.getRecords()[0];

					newPlan.setDescription((curPrp.getDescription() != null) ? curPrp.getDescription() : "");
					newPlan.setProductName(curProd.getName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				newPlan.setAmendmentId(rp.getAmendmentId());
				newPlan.setAmendmentType(rp.getAmendmentType());
				newPlan.setEffectiveDate("end of current billing period.");
				
				// Query amendment for this rate plan to get Effective Removal Date
				try {
					QueryResult amdResult = zapi.zQuery("SELECT Id,ContractEffectiveDate FROM Amendment WHERE Id='" + newPlan.getAmendmentId() + "'");
					Amendment amd = (Amendment) amdResult.getRecords()[0];
					newPlan.setEffectiveDate(dateFormat.format(amd.getContractEffectiveDate().getTime()));
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				// Get all charges
				List<AmenderCharge> charges = new ArrayList<AmenderCharge>();
				QueryResult chargesResult = null;
				try {
					chargesResult = zapi.zQuery("SELECT Id,Name,ProductRatePlanChargeId,ChargeModel,ChargeType,UOM,Quantity,ChargedThroughDate " +
							"FROM RatePlanCharge WHERE RatePlanId='" + rp.getId() + "'");
				} catch (Exception e) {
					e.printStackTrace();
				}
				for (ZObject z2 : chargesResult.getRecords()) {
					RatePlanCharge rpc = (RatePlanCharge) z2;
					AmenderCharge newCharge = new AmenderCharge();
					
					newCharge.setId(rpc.getId());
					newCharge.setName(rpc.getName());
					newCharge.setChargeModel(rpc.getChargeModel());
					newCharge.setProductRatePlanChargeId(rpc.getProductRatePlanChargeId());
					
					if (!rpc.getChargeModel().equals("Flat Fee Pricing")) {
						// TODO Also exclude usage charges
						newPlan.setUom(rpc.getUOM());
						newPlan.setQuantity(rpc.getQuantity().toPlainString());
						newCharge.setUom(rpc.getUOM());
						newCharge.setQuantity(rpc.getQuantity().toPlainString());
					}
					
					// For all charges, find maximum ChargedThroughDate
					if (rpc.getChargedThroughDate() != null) {
						if (rpc.getChargedThroughDate().compareTo(Calendar.getInstance()) > 0) {
							activeSubscription.setEndOfTermDate(rpc.getChargedThroughDate());
						}
					}
					
					charges.add(newCharge);
				}
				
				removedPlans.add(newPlan);
				
			}
			
			activeSubscription.setActivePlans(activePlans);
			activeSubscription.setRemovedPlans(removedPlans);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return activeSubscription;
	}

	/**
	 * Creates a subscription after a user has successfully submitted their
	 * payment information. Subscribes using email address as account name,
	 * contact information from the created payment method, and rate plan data
	 * from the user's current Cart.
	 * 
	 * @param $userEmail
	 *            User's given Email address
	 * @param $pmId
	 *            PaymentMethod ID that was created in Zuora by the Z-Payments
	 *            Page
	 * @return SubscribeResult. If the email has already been used in this
	 *         tenant, returns the error string, 'DUPLICATE_EMAIL', If the
	 *         Payment Method ID passed doesn't exist, returns the error string,
	 *         'INVALID_PMID'
	 */
	public ResponseSubscribe subscribeWithCurrentCart(String userEmail, String pmId, CartHelper cartHelper) {
		
		ResponseSubscribe data = new ResponseSubscribe();
		
		try {
			if (!new AccountManager().checkEmailAvailability(userEmail)) {
				data.setError("DUPLICATE_EMAIL");
				data.setSuccess(false);
				return data;
			}
		} catch (Exception e) {
			data.setError("INVALID_EMAIL");
			data.setSuccess(false);
			return data;
		}
		
		// Get Contact Information from newly created user
		QueryResult pmResult = null;
		try {
			pmResult = zapi.zQuery("SELECT CreditCardAddress1,CreditCardAddress2,"
					+ "CreditCardCity,CreditCardCountry,CreditCardHolderName,"
					+ "CreditCardPostalCode,CreditCardState,Phone FROM PaymentMethod"
					+ " WHERE Id='" + pmId + "'");
		} catch (Exception e) {
			data.setError("INVALID_PMID");
			data.setSuccess(false);
			return data;
		}
		
		if (pmResult == null || pmResult.getSize() == 0) {
			data.setError("INVALID_PMID");
			data.setSuccess(false);
			return data;
		}
		
		PaymentMethod pm = (PaymentMethod) pmResult.getRecords()[0];
		String holderName = (pm.getCreditCardHolderName() != null) ? pm.getCreditCardHolderName() : "";
		
		// Derive first and last name from CardHolderName
		String firstName, lastName;
		
		if (holderName.contains(" ")) {
			String[] split = holderName.split("\\s+", 2);
			firstName = split[0];
			lastName = split[1];
			
		} else {
			firstName = holderName;
			lastName = "-";
		}
		
		// Populate the fields
		String address1 = (pm.getCreditCardAddress1() != null) ? pm.getCreditCardAddress1() : "";
		String address2 = (pm.getCreditCardAddress2() != null) ? pm.getCreditCardAddress2() : "";
		String city = (pm.getCreditCardCity() != null) ? pm.getCreditCardCity() : "";
		String country = (pm.getCreditCardCountry() != null) ? pm.getCreditCardCountry() : "";
		String postalCode = (pm.getCreditCardPostalCode() != null) ? pm.getCreditCardPostalCode() : "";
		String state = (pm.getCreditCardState() != null) ? pm.getCreditCardState() : "";
		String phone = (pm.getPhone() != null) ? pm.getPhone() : "";
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		Calendar today = Calendar.getInstance();
		int mday = today.get(Calendar.DAY_OF_MONTH);
		
		ZuoraUtility zu = new ZuoraUtility();
		
		// Set up the account
		Account acc = new Account();
		acc.setAutoPay(Boolean.parseBoolean(zu.getPropertyValue("defaultAutopay")));
		acc.setCurrency(zu.getPropertyValue("defaultCurrency"));
		acc.setName(userEmail);
		acc.setPaymentTerm(zu.getPropertyValue("defaultPaymentTerm"));
		acc.setBatch(zu.getPropertyValue("defaultBatch"));
		acc.setBillCycleDay(mday);
		acc.setStatus("Active");
		
		if (Boolean.parseBoolean(zu.getPropertyValue("makeSfdcAccount"))) {
			// TODO Integrate with SalesForce.Com
		}
		
		// Set up contact
		Contact billToContact = new Contact();
		billToContact.setAddress1(address1);
		billToContact.setAddress2(address2);
		billToContact.setCity(city);
		billToContact.setFirstName(firstName);
		billToContact.setLastName(lastName);
		billToContact.setPostalCode(postalCode);
		billToContact.setState(state);
		billToContact.setWorkEmail(userEmail);
		billToContact.setWorkPhone(phone);
		billToContact.setCountry(country);
		
		// Set up subscription
		SubscribeOptions subscribeOptions = new SubscribeOptions();
		subscribeOptions.setGenerateInvoice(true);
		subscribeOptions.setProcessPayments(true);
		
		PreviewOptions previewOptions = new PreviewOptions();
		previewOptions.setEnablePreviewMode(false);
		
		Subscription subscription = new Subscription();
		subscription.setContractEffectiveDate(today);
		subscription.setTermStartDate(today);
		subscription.setTermType("EVERGREEN");
		subscription.setStatus("Active");
		
		SubscriptionData subscriptionData = new SubscriptionData();
		try{
			subscriptionData.setRatePlanData(SubscriptionManager.getSubscriptionDataRatePlanFromCart(cartHelper));
		} catch (Exception e){
			data.setSuccess(false);
			data.setError(e.getMessage());
			return data;
		}
		subscriptionData.setSubscription(subscription);
		
		// Create the subscription request
		SubscribeRequest subReq = new SubscribeRequest();
		subReq.setAccount(acc);
		subReq.setBillToContact(billToContact);
		subReq.setPaymentMethod(pm);
		subReq.setSubscribeOptions(subscribeOptions);
		subReq.setPreviewOptions(previewOptions);
		subReq.setSubscriptionData(subscriptionData);

		SubscribeRequest[] subscribes = new SubscribeRequest[1];
		subscribes[0] = subReq;

		// Do the subscription with Zuora API
		SubscribeResult[] resp = null;
		try{
			resp = zapi.zSubscribe(subscribes);
			if(resp[0].getSuccess()){
				data.setSubscriptionId(resp[0].getSubscriptionId());
				data.setSuccess(true);
			} else {
				data.setError(resp[0].getErrors()[0].getMessage());
				data.setSuccess(false);
			}
		} catch (Exception e){
			data.setError(e.getMessage());
			data.setSuccess(false);
			return data;
		}

		return data;
	}

	/**
	 * Creates dummy subscription with current cart, used to determine the value
	 * of the first invoice.
	 * @author Eric Neto
	 * 
	 * @return SubscribeResult with preview information
	 * @throws UnexpectedErrorFault
	 * @throws RemoteException
	 */
	public SubscribePreview previewCurrentCart(CartHelper cartHelper) {
		SubscribePreview preview = new SubscribePreview();
		

		//If Cart is empty, return an empty cart message
		if(cartHelper.getCartItems().size()==0){
			preview.invoiceAmount = 0.00;
			preview.success = false;
			preview.error = "EMPTY_CART";
			return preview;
		}
		
		// Get the data from the sample (in order to preview from a 'fake'
		// account)
		Account account = AccountSample.makeAccount();
		Contact billingContact = AccountSample.makeContact();
		SubscribeOptions subscribeOptions = AccountSample.makeSubscriptionOptions();
		PreviewOptions previewOptions = AccountSample.makePreviewOptions();

		// Set up subscription
		Subscription subscription = SubscriptionManager.makeSubscription();
		SubscriptionData subscriptionData = new SubscriptionData();
		try{
			subscriptionData.setRatePlanData(SubscriptionManager.getSubscriptionDataRatePlanFromCart(cartHelper));
		} catch (Exception e){
			preview.setSuccess(false);
			preview.setError(e.getMessage());
			return preview;
		}
		subscriptionData.setSubscription(subscription);

		// Create the subscription request
		SubscribeRequest subReq = new SubscribeRequest();
		subReq.setAccount(account);
		subReq.setBillToContact(billingContact);
		subReq.setSubscribeOptions(subscribeOptions);
		subReq.setPreviewOptions(previewOptions);
		subReq.setSubscriptionData(subscriptionData);

		SubscribeRequest[] subscribes = new SubscribeRequest[1];
		subscribes[0] = subReq;

		// Do the subscription with Zuora API
		SubscribeResult[] resps = null;
		try{
			resps = zapi.zSubscribe(subscribes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		SubscribeResult resp = resps[0];
		if(resp.getSuccess()){
			if(resp.getInvoiceData()!=null){
				//For a successful preview with invoice, return the amount.
				preview.setInvoiceAmount(resp.getInvoiceData()[0].getInvoice().getAmount().doubleValue());
				preview.setSuccess(true);
			} else {
				//For a successful preview with a zero-dollar invvoice, return 0.00.
				preview.setInvoiceAmount(0.00);
				preview.setSuccess(true);
			}
		} else {
			//For an unsuccessful preview, return an appropriate error.
			preview.setSuccess(false);
			String errorResponse = resp.getErrors()[0].getMessage();
			if(errorResponse.contains("ProductRatePlanId is invalid")){
				preview.setError("RATE_PLAN_DOESNT_EXIST");
			} else if (errorResponse.contains("RatePlan is out of date.")){
				preview.setError("RATE_PLAN_EXPIRED");
			} else {
				preview.setError(errorResponse);
			}
		}
		return preview;
	}

	/**
	 * Make the current subscription
	 * 
	 * @return the subscription
	 */
	private static Subscription makeSubscription() {
		Subscription subscription = new Subscription();
		subscription
				.setContractEffectiveDate(ZuoraUtility.getCurrentCalendar());
		subscription.setTermStartDate(ZuoraUtility.getCurrentCalendar());
		subscription.setTermType("EVERGREEN");
		subscription.setStatus("Active");
		return subscription;
	}

	/**
	 * Assembles RatePlan information by pulling all rate plans in the user's
	 * current cart
	 * 
	 * @param cartHelper
	 *            the current cart (from HttpSession and the web client)
	 * @return RatePlanData for subscribe
	 * @throws Exception 
	 */
	private static RatePlanData[] getSubscriptionDataRatePlanFromCart( CartHelper cartHelper) throws Exception {
		// Create the return object
		ArrayList<RatePlanData> rpds = new ArrayList<RatePlanData>();
		
		// Loop for each item in the current cart
		for (CartItem cartItem : cartHelper.getCartItems()) {
			// Create and populate the Rate Plan Data to be included in the
			// current subscription
			RatePlanData ratePlanData = new RatePlanData();

			// Parameters for the current Rate Plan
			RatePlan ratePlan = new RatePlan();
			ratePlanData.setRatePlan(ratePlan);

			// Get the ID of the current product rate plan
			String productRatePlanId =  cartItem.getRatePlanId();
			ratePlan.setProductRatePlanId(productRatePlanId);

			// If there is price per quantity defined, set up RatePlanCharge data to override all quantities on this plan with the given amount
			CatalogRatePlan crp = Catalog.getRatePlan(productRatePlanId);
			if (crp.getQuantifiable()){
				if(cartItem.getQuantity() == null){
					throw new Exception("NULL_QTY");
				}
				BigDecimal bdQty = null;
				try{
					double qty = Double.parseDouble(cartItem.getQuantity());
					bdQty = new BigDecimal(qty);
				} catch (Exception e){
					throw new Exception("PARSE_QTY_ERROR");
				}
					
				ArrayList<RatePlanChargeData> rpcds = new ArrayList<RatePlanChargeData>();
				ArrayList<CatalogCharge> ccharges = crp.getCharges();
				for(CatalogCharge ccharge : ccharges){
					if((ccharge.getChargeModel().equals("Per Unit Pricing") || ccharge.getChargeModel().equals("Tiered Pricing") || ccharge.getChargeModel().equals("Volume Pricing")) &&
						!ccharge.getChargeType().equals("Usage"))
					{
						RatePlanChargeData rpcd = new RatePlanChargeData();
						RatePlanCharge rpc = new RatePlanCharge();
						rpc.setProductRatePlanChargeId(ccharge.getId());
						rpc.setQuantity(bdQty);
						rpcd.setRatePlanCharge(rpc);
						rpcds.add(rpcd);
					}
				}
				rpcds.trimToSize();
				if(rpcds.size()>0){
					RatePlanChargeData[] rpcdsA = rpcds.toArray(new RatePlanChargeData[rpcds.size()]);
					ratePlanData.setRatePlanChargeData(rpcdsA);
				}
			}

			// Add this RatePlanData to the subscription data
			rpds.add(ratePlanData);
		}
		rpds.trimToSize();
		
		RatePlanData[] rpdsArray = new RatePlanData[rpds.size()];
		for(int i = 0; i < rpds.size(); i++){
			rpdsArray[i] = rpds.get(i);
		}
		return rpdsArray;
	}
}
