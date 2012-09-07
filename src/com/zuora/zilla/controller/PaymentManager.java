package com.zuora.zilla.controller;

import java.security.MessageDigest;
import java.util.Random;

import com.zuora.api.*;
import com.zuora.api.object.*;
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

	
	/** The Zuora API instance used to handle soap calls. */
	private ZApi zapi;
	
	public PaymentManager() throws Exception {
		// get the stub and the helper
		try {
			zapi = new ZApi();
		} catch (Exception e) {
			throw new Exception("Invalid Login");
		}
	}
	
	/**
	 * Generates a URL for a new subscriber to enter credit card and contact
	 * information.
	 * 
	 * @return New PaymentMethod URL
	 */
	public String getNewAccountUrl() {
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
	public String getExistingIframeSrc(String accountName) {
		String iframeUrl = null;

		try {
			ZApi zapi = new ZApi();
		} catch (Exception e){
			return e.getMessage();
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
			e.printStackTrace();
		}

		try {
			// Get the base url
			iframeUrl = generateUrl();
			
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iframeUrl;
	}

	/**
	 * Used to generate the Base URL for both Existing and New accounts, using
	 * the configured Z-Payments Page information.
	 * 
	 * @return Base HPM URL
	 */
	private String generateUrl() {
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

		} catch (Exception e) {
			e.printStackTrace();
		}

		return iframeUrl;
	}
	
	/**
	 * Sets the default payment method of the logged in user to a different payment method on their account.
	 * @param $pmId ID of new active payment method
	 */
	public void changePaymentMethod() {
		// TODO
	}
	
	/**
	 * Deletes the selected payment method from the logged in user's account.
	 * @param $pmId ID of payment method to be removed
	 */
	public void removePaymentMethod() {
		// TODO
	}
}
