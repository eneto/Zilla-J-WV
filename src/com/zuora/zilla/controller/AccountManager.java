package com.zuora.zilla.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import com.zuora.api.*;
import com.zuora.api.object.*;
import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;

/**
 * The AccountManager class manages Account information for the logged in user.
 * 
 * All account summaries are based on the user that has been authetnicated and
 * whose Email address has been stored in the Session Header. To retrieve any of
 * these summaries, the user must:
 * 
 * 	1) Populate the Session['uEmail'] with their contact email
 * 	2) Call the Get Account Detail Method
 * 
 * @author Mickael Pham <mickael.pham@zuora.com>
 * 
 */
public class AccountManager {

	/** The Zuora API instance used to handle soap calls. */
	private ZApi zapi;

	public AccountManager() throws Exception {
		// get the stub and the helper
		try {
			zapi = new ZApi();
		} catch (Exception e) {
			throw new Exception("Invalid Login");
		}
	}

	public SummaryAccount getCompleteDetail(String accountName) {
		// Create the object and get the basic information
		SummaryAccount accountSummary = new SummaryAccount();

		Account acc = null;
		QueryResult qresAcc = null;
		try {
			qresAcc = zapi.zQuery("SELECT Id,Name,Balance,LastInvoiceDate,DefaultPaymentMethodId FROM Account WHERE Name='" + accountName + "'");
			if(qresAcc.getSize() == 0){
				accountSummary.setSuccess(false);
				accountSummary.setError("USER_DOESNT_EXIST");
				return accountSummary;
			}
			acc = (Account) qresAcc.getRecords()[0];
		} catch (Exception e) {
			e.printStackTrace();
		}

		//Get Account Information
		accountSummary.setName(acc.getName());
		accountSummary.setBalance(acc.getBalance());
		accountSummary.setLastInvoiceDate(acc.getLastInvoiceDate());
		String defaultPmId = acc.getDefaultPaymentMethodId();

		QueryResult paymentResult = null;
		try {
			paymentResult = zapi.zQuery("SELECT Amount,EffectiveDate,CreatedDate FROM Payment WHERE AccountId='" + acc.getId() + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(paymentResult.getSize()==0){
			accountSummary.setLastPaymentDate(null);
			accountSummary.setLastInvoiceDate(null);
		} else {
			//Sort payments by date
			ArrayList<ZObject> listPayments = new ArrayList<ZObject>(Arrays.asList(paymentResult.getRecords()));
			Collections.sort(listPayments, new CmpPayments());
			Payment lastPayment = (Payment) listPayments.toArray()[0];
			accountSummary.setLastPaymentDate(lastPayment.getEffectiveDate());
			accountSummary.setLastPaymentAmount(lastPayment.getAmount());
		}
		//Get Contact with this email
		SummaryContact contactSummary = new SummaryContact();
		QueryResult qresCons = null;
		try {
			qresCons = zapi.zQuery("SELECT FirstName,LastName,Address1,Address2,City,State,PostalCode,Country FROM Contact WHERE AccountId='"+ acc.getId() +"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Contact cont = null;
		if(qresCons.getSize()==0){
			accountSummary.setSuccess(false);
			accountSummary.setError("CONTACT_DOESNT_EXIST");
			return accountSummary;
		} else {
			cont = (Contact) qresCons.getRecords()[0];
		}

		contactSummary.setFirstName(cont.getFirstName());
		contactSummary.setLastName(cont.getLastName());
		contactSummary.setCountry(cont.getCountry());
		contactSummary.setState(cont.getState());
		contactSummary.setAddress1(cont.getAddress1());
		contactSummary.setAddress2(cont.getAddress2());
		contactSummary.setCity(cont.getCity());
		contactSummary.setPostalCode(cont.getPostalCode());

		contactSummary.setSuccess(true);

		accountSummary.setContactSummary(contactSummary);
		
		// Get payment methods with this account id
		ArrayList<PaymentDetail> paymentSummaries = new ArrayList<PaymentDetail>();
		
		QueryResult qresPms = null;
		try {
			qresPms = zapi.zQuery("SELECT Id,CreditCardHolderName,CreditCardMaskNumber,"
					+ "CreditCardExpirationYear,CreditCardExpirationMonth,CreditCardType "
					+ "from PaymentMethod WHERE AccountId='" + acc.getId() + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (ZObject z : qresPms.getRecords()) {
			PaymentMethod pm = (PaymentMethod) z;
			PaymentDetail d = new PaymentDetail();
			d.setId(pm.getId());
			d.setCardHolderName(pm.getCreditCardHolderName());
			d.setMaskedNumber(pm.getCreditCardMaskNumber());
			d.setExpirationYear(pm.getCreditCardExpirationYear());
			d.setExpirationMonth(pm.getCreditCardExpirationMonth());
			d.setCardType(pm.getCreditCardType());
			d.setDefaultCard((pm.getId().equals(defaultPmId)));
			paymentSummaries.add(d);
		}
		accountSummary.setPaymentMethodSummaries(paymentSummaries);
		
		accountSummary.setSuccess(true);
		return accountSummary;
	}
	
	
	/**
	 * Update the given user's information
	 * @return the user ID if successful
	 */
	public ResponseUpdateContact updateContact(String accountName, SummaryContact updatedContact) {
		
		ResponseUpdateContact contactResult = new ResponseUpdateContact();
		
		// Get Account ID with this name
		String accountId = null;
		try {
			QueryResult qresAcc = zapi.zQuery("SELECT Id FROM Account WHERE Name='" + accountName + "'");
			if(qresAcc.getSize() == 0){
				contactResult.setSuccess(false);
				contactResult.setError("USER_DOESNT_EXIST");
				return contactResult;
			}
			Account acc = (Account) qresAcc.getRecords()[0];
			accountId = acc.getId();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Get the contact ID associated with this account
		Contact contact = null;
		try {
			QueryResult qresCon = zapi.zQuery("SELECT Id FROM Contact WHERE AccountId='" + accountId + "'");
			if(qresCon.getSize() == 0){
				contactResult.setSuccess(false);
				contactResult.setError("CONTACT_DOESNT_EXIST");
				return contactResult;
			}
			contact = (Contact) qresCon.getRecords()[0];
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Create a contact record with this ID and all parameters that were passed in
		Contact updated = new Contact();
		updated.setId(contact.getId());
		
		if(updatedContact.getFirstName()!=null) updated.setFirstName(updatedContact.getFirstName());
		if(updatedContact.getLastName()!=null) updated.setLastName(updatedContact.getLastName());
		if(updatedContact.getCountry()!=null) updated.setCountry(updatedContact.getCountry());
		if(updatedContact.getAddress1()!=null) updated.setAddress1(updatedContact.getAddress1());
		if(updatedContact.getAddress2()!=null) updated.setAddress2(updatedContact.getAddress2());
		if(updatedContact.getPostalCode()!=null) updated.setPostalCode(updatedContact.getPostalCode());
		if(updatedContact.getCity()!=null) updated.setCity(updatedContact.getCity());
		if(updatedContact.getState()!=null) updated.setState(updatedContact.getState());


		try {
			SaveResult[] uRes = zapi.zUpdate(new ZObject[] { updated });
			if(uRes[0].getSuccess()){
				contactResult.setSuccess(true);
			} else {
				contactResult.setSuccess(false);
				contactResult.setError(uRes[0].getErrors()[0].getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return contactResult;
	}

	/**
	 * Comparator to sort payments by effective date.
	 */
	private class CmpPayments implements Comparator<ZObject> {

		@Override
		public int compare(ZObject a, ZObject b) {
			return ((Payment)a).getCreatedDate().compareTo(((Payment)b).getCreatedDate());
		}
		
	}

	public boolean checkEmailAvailability(String targetName) {
		
		//Disallow apostrophes in account names
		if(targetName.contains("'")){
			return false;
		}
		
		// Find any accounts with this account name'
		
		// Get Account ID with this name
		String accountId = null;
		try {
			QueryResult qresAcc = zapi.zQuery("SELECT Id FROM Account WHERE Name='" + targetName + "'");
			if(qresAcc.getSize() == 0){
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
