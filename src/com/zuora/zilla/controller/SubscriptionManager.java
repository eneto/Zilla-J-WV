package com.zuora.api.controller;

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

import org.apache.axis2.AxisFault;

import com.zuora.api.axis2.UnexpectedErrorFault;
import com.zuora.api.axis2.ZuoraServiceStub;
import com.zuora.api.axis2.ZuoraServiceStub.Account;
import com.zuora.api.axis2.ZuoraServiceStub.Amendment;
import com.zuora.api.axis2.ZuoraServiceStub.Contact;
import com.zuora.api.axis2.ZuoraServiceStub.ID;
import com.zuora.api.axis2.ZuoraServiceStub.PaymentMethod;
import com.zuora.api.axis2.ZuoraServiceStub.PreviewOptions;
import com.zuora.api.axis2.ZuoraServiceStub.Product;
import com.zuora.api.axis2.ZuoraServiceStub.ProductRatePlan;
import com.zuora.api.axis2.ZuoraServiceStub.Query;
import com.zuora.api.axis2.ZuoraServiceStub.QueryResponse;
import com.zuora.api.axis2.ZuoraServiceStub.QueryResult;
import com.zuora.api.axis2.ZuoraServiceStub.RatePlan;
import com.zuora.api.axis2.ZuoraServiceStub.RatePlanCharge;
import com.zuora.api.axis2.ZuoraServiceStub.RatePlanData;
import com.zuora.api.axis2.ZuoraServiceStub.SessionHeader;
import com.zuora.api.axis2.ZuoraServiceStub.Subscribe;
import com.zuora.api.axis2.ZuoraServiceStub.SubscribeOptions;
import com.zuora.api.axis2.ZuoraServiceStub.SubscribeRequest;
import com.zuora.api.axis2.ZuoraServiceStub.SubscribeResponse;
import com.zuora.api.axis2.ZuoraServiceStub.SubscribeResult;
import com.zuora.api.axis2.ZuoraServiceStub.Subscription;
import com.zuora.api.axis2.ZuoraServiceStub.SubscriptionData;
import com.zuora.api.axis2.ZuoraServiceStub.ZObject;
import com.zuora.api.model.AmenderSubscription;
import com.zuora.api.test.AccountSample;
import com.zuora.api.util.ZuoraAPIHelper;
import com.zuora.api.util.ZuoraUtility;

/**
 * This manager allows the user to create and/or preview a subscription (this
 * one based on items that are stored in the current cart).
 * 
 * @author Mickael Pham <mickael.pham@zuora.com>
 * 
 */
public class SubscriptionManager {

	/** The Stub to query from Zuora. */
	private ZuoraServiceStub stub;

	/** To retrieve the current authentication to use the API. */
	private SessionHeader header;

	/** Wrapper to query the API in an elegant form. */
	private ZuoraAPIHelper helper;

	/** Public constructor, set up using the current stub and header. */
	public SubscriptionManager() {
		// get the stub and the helper
		try {
			this.stub = new ZuoraServiceStub();
			this.helper = new ZuoraAPIHelper();
		} catch (AxisFault e1) {
			e1.printStackTrace();
		}
		// generate header (user log in)
		try {
			helper.login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.header = helper.getHeader();
	}

	/**
	 * Retrieve all details of the current and removed rateplans on the logged
	 * in user's subscription.
	 * 
	 * @param userEmail User's given Email address
	 * @return Active Subscription details
	 */
	public AmenderSubscription getCurrentSubscription(String accountName) {
		// Step #1: from email, get the associated account Id

		Query accountQuery = new Query();
		accountQuery.setQueryString("SELECT Id FROM Account WHERE Name='" + accountName + "'");
		String accountId = null;

/*
		Query accountQuery = new Query();
		accountQuery.setQueryString("SELECT AccountId FROM Contact WHERE WorkEmail='" + email + "'");
		String accountId = null;
*/
		
		try {
			QueryResponse resp = stub.query(accountQuery, this.header);
			ID accountID = resp.getResult().getRecords()[0].getId();
			accountId = accountID.getID();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (accountId == null)
			return null; // ACCOUNT_DOES_NOT_EXIST
		
		// Get Active Subscription
		AmenderSubscription activeSubscription = new AmenderSubscription();
		
		Query subscriptionQuery = new Query();
		subscriptionQuery.setQueryString("SELECT Id,Name,Status,Version,PreviousSubscriptionId,"
				+ "ContractEffectiveDate,TermStartDate FROM Subscription WHERE AccountId='"
				+ accountId + "' AND Status='Active'");
		
		try {
			QueryResult result = stub.query(subscriptionQuery, this.header).getResult();
			
			if (result.getSize() == 0)
				return null; // SUBSCRIPTION_DOES_NOT_EXIST
			
			Subscription subscription = (Subscription) result.getRecords()[0];
			
			activeSubscription.setUserEmail(accountName);
			activeSubscription.setSubscriptionId(subscription.getId().getID());
			activeSubscription.setVersion(subscription.getVersion());
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
			
			activeSubscription.setEndOfTermDate(Calendar.getInstance());
			activeSubscription.setStartDate(dateFormat.format(subscription.getTermStartDate().getTime()));
			
			// Prepare list of existing rate plan
			List<AmenderPlan> activePlans = new ArrayList<AmenderPlan>();
			List<AmenderPlan> removedPlans = new ArrayList<AmenderPlan>();
			
			// Get active rate plan 
			Query activeQuery = new Query();
			activeQuery.setQueryString("SELECT Id,Name,ProductRatePlanId FROM RatePlan WHERE SubscriptionId='" + activeSubscription.getSubscriptionId() + "'");
			QueryResult activeResult = this.stub.query(activeQuery, header).getResult();
			
			// Loop through all the rate plan
			for (ZObject zObj : activeResult.getRecords()) {
				// Cast
				RatePlan rp = (RatePlan) zObj;
				
				AmenderPlan newPlan = new AmenderPlan();
				
				newPlan.setId(rp.getId().getID());
				newPlan.setName(rp.getName());
				
				// Get product name
				Query prpQuery = new Query();
				prpQuery.setQueryString("SELECT Description,ProductId FROM ProductRatePlan WHERE Id='" + rp.getProductRatePlanId().getID() + "'");
				ProductRatePlan prp = (ProductRatePlan) this.stub.query(prpQuery, header).getResult().getRecords()[0];
				newPlan.setDescription((prp.getDescription() != null) ? prp.getDescription() : "");
				
				Query productQuery = new Query();
				productQuery.setQueryString("SELECT Name FROM Product WHERE Id ='" + prp.getProductId().getID() + "'");
				Product product = (Product) this.stub.query(productQuery, header).getResult().getRecords()[0];
				newPlan.setProductName(product.getName());
				
				// Get all charges
				List<AmenderCharge> charges = new ArrayList<AmenderCharge>();
				Query chargesQuery = new Query();
				chargesQuery.setQueryString("SELECT Id,Name,ProductRatePlanChargeId,ChargeModel,ChargeType,UOM,Quantity,ChargedThroughDate FROM RatePlanCharge WHERE RatePlanId='" + rp.getId().getID() + "'");
				QueryResult chargesResult = this.stub.query(chargesQuery, header).getResult();
				for (ZObject z2 : chargesResult.getRecords()) {
					RatePlanCharge rpc = (RatePlanCharge) z2;
					AmenderCharge newCharge = new AmenderCharge();
					
					newCharge.setId(rpc.getId().getID());
					newCharge.setName(rpc.getName());
					newCharge.setChargeModel(rpc.getChargeModel());
					newCharge.setProductRatePlanChargeId(rpc.getProductRatePlanChargeId().getID());
					
					if (!rpc.getChargeModel().equals("Flat Fee Pricing")) {
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
			Query removedPlanQuery = new Query();
			removedPlanQuery.setQueryString("SELECT Id,Name,AmendmentType,AmendmentId,ProductRatePlanId FROM RatePlan WHERE SubscriptionId='" + activeSubscription.getSubscriptionId() + "' AND AmendmentType='RemoveProduct'");
			QueryResult removedPlanResult = this.stub.query(removedPlanQuery, header).getResult();
			for (ZObject z3 : removedPlanResult.getRecords()) {
				// Cast
				RatePlan rp = (RatePlan) z3;
				
				// TODO clean this..
				if (rp == null)
					continue;
				
				AmenderPlan newPlan = new AmenderPlan();
				
				newPlan.setId(rp.getId().getID());
				newPlan.setName(rp.getName());
				
				// Get product name
				Query prpQuery = new Query();
				prpQuery.setQueryString("SELECT Description,ProductId FROM ProductRatePlan WHERE Id='" + rp.getProductRatePlanId().getID() + "'");
				ProductRatePlan prp = (ProductRatePlan) this.stub.query(prpQuery, header).getResult().getRecords()[0];
				newPlan.setDescription((prp.getDescription() != null) ? prp.getDescription() : "");
				
				Query productQuery = new Query();
				productQuery.setQueryString("SELECT Name FROM Product WHERE Id ='" + prp.getProductId().getID() + "'");
				Product product = (Product) this.stub.query(productQuery, header).getResult().getRecords()[0];
				newPlan.setProductName(product.getName());
				
				newPlan.setAmendmentId(rp.getAmendmentId().getID());
				newPlan.setAmendmentType(rp.getAmendmentType());
				newPlan.setEffectiveDate("end of current billing period.");
				
				// Query amendment for this rate plan to get Effective Removal Date
				Query amdQuery = new Query();
				amdQuery.setQueryString("SELECT Id,ContractEffectiveDate FROM Amendment WHERE Id='" + newPlan.getAmendmentId() + "'");
				Amendment amd = (Amendment) this.stub.query(amdQuery, header).getResult().getRecords()[0];
				newPlan.setEffectiveDate(dateFormat.format(amd.getContractEffectiveDate().getTime()));
				
				// Get all charges
				List<AmenderCharge> charges = new ArrayList<AmenderCharge>();
				Query chargesQuery = new Query();
				chargesQuery.setQueryString("SELECT Id,Name,ProductRatePlanChargeId,ChargeModel,ChargeType,UOM,Quantity,ChargedThroughDate FROM RatePlanCharge WHERE RatePlanId='" + rp.getId().getID() + "'");
				QueryResult chargesResult = this.stub.query(chargesQuery, header).getResult();
				for (ZObject z2 : chargesResult.getRecords()) {
					RatePlanCharge rpc = (RatePlanCharge) z2;
					AmenderCharge newCharge = new AmenderCharge();
					
					newCharge.setId(rpc.getId().getID());
					newCharge.setName(rpc.getName());
					newCharge.setChargeModel(rpc.getChargeModel());
					newCharge.setProductRatePlanChargeId(rpc.getProductRatePlanChargeId().getID());
					
					if (!rpc.getChargeModel().equals("Flat Fee Pricing")) {
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
	public Map<String, Object> subscribeWithCurrentCart(String userEmail, String pmId, CartHelper cartHelper) {
		
		Map<String, Object> data = new HashMap<String, Object>();
		
		if (!new AccountManager().checkEmailAvailability(userEmail)) {
			data.put("error", "DUPLICATE_EMAIL");
			return data;
		}
		
		System.out.println("** Start querying Zuora with PaymentId: " + pmId);
		
		// Get Contact Information from newly created user
		Query pmQuery = new Query();
		pmQuery.setQueryString("SELECT CreditCardAddress1,CreditCardAddress2,"
				+ "CreditCardCity,CreditCardCountry,CreditCardHolderName,"
				+ "CreditCardPostalCode,CreditCardState,Phone FROM PaymentMethod"
				+ " WHERE Id='" + pmId + "'");
		
		QueryResult pmResult = null;
		try {
			pmResult = this.stub.query(pmQuery, this.header).getResult();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if (pmResult == null || pmResult.getSize() == 0) {
			data.put("error", "INVALID_PMID");
			return data;
		}
		
		PaymentMethod pm = (PaymentMethod) pmResult.getRecords()[0];
		String holderName = (pm.getCreditCardHolderName() != null) ? pm.getCreditCardHolderName() : "";
		
		System.out.println("** Holder Name: " + holderName);
		
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
		
		SubscriptionData subscriptionData = SubscriptionManager.getSubscriptionDataRatePlanFromCart(cartHelper);
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
		Subscribe subscribe = new Subscribe();
		subscribe.setSubscribes(subscribes);
		SubscribeResponse resp = null;
		
		try {
			resp = stub.subscribe(subscribe, this.header);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		if (resp != null && resp.getResult()[0].getSuccess()) {
//			return userEmail;
//		}
		
		if (resp != null) {
			System.out.println("** Stub response is NOT null!");
			if (resp.getResult()[0].getSuccess()) {
				data.put("success", resp);
				data.put("userEmail", userEmail);
				return data;
			} else {
				for (com.zuora.api.axis2.ZuoraServiceStub.Error err : resp.getResult()[0].getErrors()) {
					System.out.println("*** " + err.getField() + " -> " + err.getMessage());
					System.out.println("*** " + err.toString());
				}
			}
		} else {
			System.out.println("** The stub response is null..");
		}
		
		data.put("error", "A_PROBLEM_OCCURED");
		return data;
	}

	/**
	 * Creates dummy subscription with current cart, used to determine the value
	 * of the first invoice.
	 * 
	 * @return SubscribeResult with preview information
	 * @throws UnexpectedErrorFault
	 * @throws RemoteException
	 */
	public BigDecimal previewCurrentCart(CartHelper cartHelper)
			throws RemoteException, UnexpectedErrorFault {
		// Get the data from the sample (in order to preview from a 'fake'
		// account)
		Account account = AccountSample.makeAccount();
		Contact billingContact = AccountSample.makeContact();
		SubscribeOptions subscribeOptions = AccountSample
				.makeSubscriptionOptions();
		PreviewOptions previewOptions = AccountSample.makePreviewOptions();

		// Set up subscription
		Subscription subscription = SubscriptionManager.makeSubscription();
		SubscriptionData subscriptionData = SubscriptionManager
				.getSubscriptionDataRatePlanFromCart(cartHelper);
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

		Subscribe subscribe = new Subscribe();
		subscribe.setSubscribes(subscribes);
		SubscribeResponse resp = stub.subscribe(subscribe, this.header);
		SubscribeResult result = resp.getResult()[0];
		if (result.getErrors() == null) {
			return result.getInvoiceData()[0].getInvoice()
					.getAmountWithoutTax();
		}
		return null;
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
	 */
	private static SubscriptionData getSubscriptionDataRatePlanFromCart(
			CartHelper cartHelper) {
		// Create the return object
		SubscriptionData subscriptionData = new SubscriptionData();

		// Loop for each item in the current cart
		for (CartItem cartItem : cartHelper.getCartItems()) {
			// Create and populate the Rate Plan Data to be included in the
			// current subscription
			RatePlanData ratePlanData = new RatePlanData();

			// Parameters for the current Rate Plan
			RatePlan ratePlan = new RatePlan();
			ratePlanData.setRatePlan(ratePlan);

			// Get the ID of the current product rate plan
			ID productRatePlanId = new ID();
			productRatePlanId.setID(cartItem.getRatePlanId());
			ratePlan.setProductRatePlanId(productRatePlanId);

			// If there is price per quantity defined
			// if (cartItem.getQuantity() != null && cartItem.getQuantity() !=
			// 1) {
			// TODO
			// }

			// Add it to the current subscription data
			subscriptionData.addRatePlanData(ratePlanData);
		}
		return subscriptionData;
	}
}
