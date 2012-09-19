package com.zuora.zilla.controller;

import java.security.MessageDigest;
import java.util.Random;

import com.zuora.api.*;
import com.zuora.api.object.*;
import com.zuora.zilla.model.ResponseAction;
import com.zuora.zilla.util.*;

/**
 * The PaymentManager class manages existing PaymentMethods, and create source
 * URLs to generate Iframes to enter new credit cards.
 * 
 * @author Mickael Pham <mickael.pham@zuora.com>
 */
public class PaymentManager {

	/** The Constant PAGE_ID. */
	private static final String PAGE_ID = "pageId";

	/** The Constant TENANT_ID. */
	private static final String TENANT_ID = "tenantId";

	/** The Constant API_SECURITY_KEY. */
	private static final String API_SECURITY_KEY = "apiSecurityKey";

	/** The Constant APP_URL. */
	private static final String APP_URL = "appUrl";
		
	/**
	 * Generates a URL for a new subscriber to enter credit card and contact
	 * information.
	 * 
	 * @return New PaymentMethod URL
	 */
	public ResponseAction getNewAccountUrl() {
		return generateUrl();
	}

	/**
	 * Generates a URL for an existing subscriber to enter an additional credit
	 * card. Uses the current logged in User's accountId to attach the payment
	 * method to their account upon submission.
	 * @author Eric Neto
	 * 
	 * @return Existing PaymentMethod URL
	 */
	public ResponseAction getExistingIframeSrc(String accountName) {
		ResponseAction resp = new ResponseAction();
		String iframeUrl = null;

		ZApi zapi = null;
		try {
			zapi = new ZApi();
		} catch (Exception e){
			resp.setSuccess(false);
			resp.setError(e.getMessage());
			return resp;
		}
		
		Contact contact = null;
		String accountId = null;

		// Get the contact and account Id for the given account
		try {
			QueryResult qresAcc = zapi.zQuery("SELECT Id FROM Account WHERE Name='" + accountName + "'");
			if(qresAcc.getSize()==0){
				return null; // ACCOUNT_DOES_NOT_EXIST
			}
			accountId = qresAcc.getRecords()[0].getId();

			QueryResult qresCon = zapi.zQuery("SELECT AccountId, Country, Address1, Address2,"
					+ "City, State, PostalCode, WorkPhone FROM Contact "
					+ "WHERE AccountId = '" + accountId + "'");
			contact = (Contact) qresCon.getRecords()[0];
		} catch (Exception e) {
			resp.setSuccess(false);
			resp.setError(e.getMessage());
			return resp;
		}

		try {
			// Get the base url
			ResponseAction baseResp = generateUrl();
			if(!baseResp.isSuccess())
				return baseResp;
			iframeUrl = baseResp.getData();
			
			// Append information from existing customer
			iframeUrl += "&field_accountId=" + contact.getAccountId();
			
			if (contact.getCountry() != null) {
				if (contact.getCountry().equalsIgnoreCase("united states")) {
					iframeUrl += "&field_creditCardCountry=USA";
				} else if (contact.getCountry().equalsIgnoreCase("canada")) {
					iframeUrl += "&field_creditCardCountry=CAN";
				}
			}
			
			iframeUrl += (contact.getState() != null) ? "&field_creditCardState=" + contact.getState() : "";
			iframeUrl += (contact.getCity() != null) ? "&field_creditCardCity=" + contact.getCity() : "";
			iframeUrl += (contact.getPostalCode() != null) ? "&field_creditCardPostalCode=" + contact.getPostalCode() : "";
			iframeUrl += (contact.getAddress1() != null) ? "&field_creditCardAddress1=" + contact.getAddress1() : "";
			iframeUrl += (contact.getAddress2() != null) ? "&field_creditCardAddress2=" + contact.getAddress2() : "";
			iframeUrl += (contact.getWorkPhone() != null) ? "&field_phone=" + contact.getWorkPhone() : "";
			iframeUrl += (contact.getWorkEmail() != null) ? "&field_email=" + contact.getWorkEmail() : "";

			resp.setSuccess(true);
			resp.setData(iframeUrl);
		} catch (Exception e) {
			resp.setSuccess(false);
			resp.setError(e.getMessage());
			return resp;
		}
		return resp;
	}

	/**
	 * Used to generate the Base URL for both Existing and New accounts, using
	 * the configured Z-Payments Page information.
	 * 
	 * @return Base HPM URL
	 */
	private ResponseAction generateUrl() {		
		ResponseAction resp = new ResponseAction();
		
		String iframeUrl = null;

		// Get infos from properties file
		ZuoraUtility utility = new ZuoraUtility();
		String pageId = utility.getPropertyValue(PAGE_ID);
		String tenantId = utility.getPropertyValue(TENANT_ID);
		String apiSecurityKey = utility.getPropertyValue(API_SECURITY_KEY);
		String appUrl = utility.getPropertyValue(APP_URL);

		// generate random token
		String tokenBound = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuffer sb = new StringBuffer();
		Random r = new Random();
		int len = tokenBound.length();
		for (int i = 0; i < 32; i++) {
			sb.append(tokenBound.charAt(r.nextInt(len)));
		}
		// end generate random token

		String token = sb.toString();

		String queryString = "id=" + pageId + "&" + "tenantId=" + tenantId
				+ "&" + "timestamp=" + new java.util.Date().getTime() + "&"
				+ "token=" + token;

		// Concatenate API security key with query string
		String queryStringToHash = queryString + apiSecurityKey;
		try {
			// Get UTF8 bytes
			byte[] queryStringToSignInBytes = queryStringToHash
					.getBytes("UTF-8");
			// Create MD5 hash
			MessageDigest md5Digester = MessageDigest.getInstance("MD5");
			byte[] hashedQueryString = md5Digester
					.digest(queryStringToSignInBytes);

			// Convert to hex
			String hashedStringInHex = new java.math.BigInteger(1,
					hashedQueryString).toString(16);
			while (hashedStringInHex.length() < 32) {
				hashedStringInHex = "0" + hashedStringInHex;
			}

			// encode to Base64
			String hashedQueryStringBase64ed = new sun.misc.BASE64Encoder()
					.encode(hashedStringInHex.getBytes());
			// URL safe the signature
			hashedQueryStringBase64ed = hashedQueryStringBase64ed.replace('+', '-');
			hashedQueryStringBase64ed = hashedQueryStringBase64ed.replace('/', '_');

			// formulate the URL
			iframeUrl = appUrl + "/apps/PublicHostedPaymentMethodPage.do?"
					+ "method=requestPage&" + queryString + "&" + "signature="
					+ hashedQueryStringBase64ed;
			resp.setSuccess(true);
			resp.setData(iframeUrl);
		} catch (Exception e) {
			resp.setSuccess(false);
			resp.setError(e.getMessage());
		}

		return resp;
	}
	
	/**
	 * Sets the default payment method of the logged in user to a different payment method on their account.
	 * @param $pmId ID of new active payment method
	 */
	public ResponseAction changePaymentMethod(String accountName, String pmId) {
		ResponseAction resp = new ResponseAction();

		if(pmId==null){
			resp.setSuccess(false);
			resp.setError("NULL_PM_ID");
			return resp;
		}
		
		ZApi zapi = new ZApi();
		try {
			zapi = new ZApi();
		} catch (Exception e){
			resp.setSuccess(false);
			resp.setError("INVALID_LOGIN");
			return resp;
		}

		String accountId = null;
		try {
			QueryResult qresAcc = zapi.zQuery("SELECT Id FROM Account WHERE Name='" + accountName + "'");
			accountId = qresAcc.getRecords()[0].getId();
		} catch (Exception e) {
			resp.setSuccess(false);
			resp.setError(e.getMessage());
			return resp;
		}

		if (accountId == null){
			resp.setSuccess(false);
			resp.setError("ACCOUNT_NOT_FOUND");
			return resp;
		}
		
		Account account = new Account();
		account.setId(accountId);
		account.setDefaultPaymentMethodId(pmId);
		
		try {
			SaveResult[] upRes = zapi.zUpdate(new Account[]{ account });
			if(upRes[0].getSuccess()){
				resp.setSuccess(true);
				return resp;
			} else {
				resp.setSuccess(false);
				resp.setError(upRes[0].getErrors()[0].getMessage());
				return resp;
			}
		} catch (Exception e) {
			resp.setSuccess(false);
			resp.setError(e.getMessage());
			return resp;
		}
	}
	
	/**
	 * Deletes the selected payment method from the logged in user's account.
	 * @param accountName This should be the name of the logged in user, passed in to verify that the current usable is allowed to delete this payment method
	 * @param $pmId ID of payment method to be removed
	 */
	public ResponseAction removePaymentMethod(String accountName, String pmId) {
		ResponseAction resp = new ResponseAction();
		
		if(pmId==null){
			resp.setSuccess(false);
			resp.setError("NULL_PM_ID");
			return resp;
		}
		
		ZApi zapi = null;
		try {
			zapi = new ZApi();
		} catch (Exception e){
			resp.setSuccess(false);
			resp.setError("INVALID_LOGIN");
			return resp;
		}

		try {
			//TODO: Validate this payment method is owned by the account passed in
			
			DeleteResult[] delRes = zapi.zDelete(new String[] { pmId }, "PaymentMethod");
			if(delRes[0].getSuccess()){
				resp.setSuccess(true);
				return resp;
			} else {
				resp.setSuccess(false);
				resp.setError(delRes[0].getErrors()[0].getMessage());
				return resp;
			}
		} catch (Exception e) {
			resp.setSuccess(false);
			resp.setError(e.getMessage());
			return resp;
		}
	}
}