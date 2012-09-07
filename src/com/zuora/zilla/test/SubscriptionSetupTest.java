package com.zuora.zilla.test;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.zuora.api.*;
import com.zuora.api.object.*;
import com.zuora.zilla.controller.*;
import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;

import junit.framework.*;
public class SubscriptionSetupTest extends TestCase {
	
	public SubscriptionSetupTest(String name) {
		super(name);
	}

	public void testCleanup() throws Exception {
		try{
			ZApi zapi = new ZApi();
			assertTrue(zapi.isLoggedIn);

			QueryResult qresa = zapi.zQuery("Select Id From Account Where Name='JTest Account'");
			
			if(qresa.getSize()>0){
				ZObject[] zacts = qresa.getRecords();

				Account acc = (Account) zacts[0];			
				DeleteResult[] delaRes = zapi.zDelete(new String[] { acc.getId() }, "Account");
				if(!delaRes[0].getSuccess()){
					System.out.println("Cleanup Account Failure: " + delaRes[0].getErrors()[0].getMessage());
				}
				assertTrue("Delete Account", delaRes[0].getSuccess());				
			}
	
			QueryResult qresp = zapi.zQuery("Select Id From Product Where Name='JTest Product'");
			if(qresp.getSize()>0){
				ZObject[] zprods = qresp.getRecords();
				Product p1 = (Product) zprods[0];			
				DeleteResult[] delpRes = zapi.zDelete(new String[] { p1.getId() }, "Product");
				if(!delpRes[0].getSuccess()){
					System.out.println("Cleanup Product Failure: " + delpRes[0].getErrors()[0].getMessage());
				}
				assertTrue("Delete Product", delpRes[0].getSuccess());
			}
			
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	public void testSetUpProduct(){
		try{
			//Log in
			ZApi zapi = new ZApi();
			assertTrue(zapi.isLoggedIn);

			Calendar sdate = Calendar.getInstance();
			Calendar edate = Calendar.getInstance();
			sdate.add(Calendar.YEAR, -50);
			edate.add(Calendar.YEAR, 50);

			//Set up a Product
			Product testProd = new Product();
			testProd.setName("JTest Product");
			testProd.setEffectiveStartDate(sdate);
			testProd.setEffectiveEndDate(edate);
			SaveResult[] srp = zapi.zCreate(new ZObject[] { testProd });
			assertTrue("Created Product", srp[0].getSuccess());
			String pId = srp[0].getId();
			
			//Set up a ProductRatePlan
			ProductRatePlan testPrp = new ProductRatePlan();
			testPrp.setName("JTest Plan");
			testPrp.setEffectiveStartDate(sdate);
			testPrp.setEffectiveEndDate(edate);
			testPrp.setProductId(pId);
			SaveResult[] srprp = zapi.zCreate(new ZObject[] { testPrp });
			assertTrue("Created Rate Plan", srprp[0].getSuccess());
			String rpId = srprp[0].getId();

			//Set up a ProductRatePlanCharge
			ProductRatePlanCharge testPrpc = new ProductRatePlanCharge();
			testPrpc.setName("JTest Charge");
			testPrpc.setBillCycleType("DefaultFromCustomer");
			testPrpc.setBillingPeriod("Month");
			testPrpc.setChargeModel("Flat Fee Pricing");
			testPrpc.setChargeType("Recurring");
			testPrpc.setProductRatePlanId(rpId);
			testPrpc.setTriggerEvent("ContractEffective");

			//Set up a ProductRatePlanChargeTier
			ProductRatePlanChargeTier testPrpct = new ProductRatePlanChargeTier();
			testPrpct.setActive(true);
			testPrpct.setCurrency("USD");
			testPrpct.setPrice(new BigDecimal(9.99));
			testPrpct.setTier(0);
			
			testPrpc.setProductRatePlanChargeTierData(new ProductRatePlanChargeTier[] { testPrpct });
			SaveResult[] srprpc = zapi.zCreate(new ZObject[] { testPrpc });
			assertTrue("Created Charge", srprpc[0].getSuccess());


		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	public void testSetUpSubscription() throws Exception {
		try{
			ZApi zapi = new ZApi();
			assertTrue(zapi.isLoggedIn);

			ZuoraUtility zu = new ZuoraUtility();

			// Set up the account
			Account acc = new Account();
			
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
			Calendar today = Calendar.getInstance();
			int mday = today.get(Calendar.DAY_OF_MONTH);	
			
			acc.setAutoPay(false);
			acc.setCurrency("USD");
			acc.setName("JTest Account");
			acc.setPaymentTerm(zu.getPropertyValue("defaultPaymentTerm"));
			acc.setBatch(zu.getPropertyValue("defaultBatch"));
			acc.setBillCycleDay(mday);
			acc.setStatus("Active");
			
			// Set up contact
			Contact billToContact = new Contact();
			billToContact.setFirstName("John");
			billToContact.setLastName("Smith");
			billToContact.setCountry("United States");
			billToContact.setState("California");
			
			// Get Payment Method ID
			PaymentMethod pm = new PaymentMethod();
			pm.setCreditCardNumber("4111111111111111");
			pm.setCreditCardHolderName("John Smith");
			pm.setCreditCardExpirationMonth(12);
			pm.setCreditCardExpirationYear(2020);
			pm.setCreditCardType("Visa");
			pm.setType("CreditCard");
			
			// Set up subscribe Options
			SubscribeOptions subscribeOptions = new SubscribeOptions();
			subscribeOptions.setGenerateInvoice(false);
			subscribeOptions.setProcessPayments(false);
			
			PreviewOptions previewOptions = new PreviewOptions();
			previewOptions.setEnablePreviewMode(false);

			//Set up SubscriptionData
			SubscriptionData subscriptionData = new SubscriptionData();

			Subscription subscription = new Subscription();
			subscription.setName("JTest Subscription");
			subscription.setContractEffectiveDate(today);
			subscription.setTermStartDate(today);
			subscription.setTermType("EVERGREEN");
			subscription.setStatus("Active");
			
			//Set up RatePlanData
			QueryResult qprpres = zapi.zQuery("Select Id From ProductRatePlan Where Name='JTest Plan'");
			assertTrue("Rate Plan Found", qprpres.getSize()==1);
			ZObject[] zprps = qprpres.getRecords();
			String prpId = zprps[0].getId();
			System.out.println(prpId);
			
			RatePlanData rpd = new RatePlanData();
			RatePlan rp = new RatePlan();
			rp.setProductRatePlanId(prpId);
			rpd.setRatePlan(rp);
			RatePlanData[] rpds = new RatePlanData[] { rpd };

			subscriptionData.setRatePlanData(rpds);
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
			try {
				resp = zapi.zSubscribe(subscribes);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(!resp[0].getSuccess()){
				System.out.println(resp[0].getErrors()[0].getMessage());
			}
			assertTrue("Created Subscription", resp[0].getSuccess());
			
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}