package com.zuora.zilla.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.TimeZone;

import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;

import edu.emory.mathcs.backport.java.util.Arrays;

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

	/** The Stub to query from Zuora. */
	private ZuoraServiceStub stub;

	/** To retrieve the current authentication to use the API. */
	private SessionHeader header;

	/** Wrapper to query the API in an elegant form. */
	private ZuoraAPIHelper helper;

	public AccountManager() {
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
	
	public SummaryAccount getAccountDetail(String accountEmail) {
		SummaryAccount summary = null;
		try {
			// Find the AccountId associated with this contact email
			Query query = new Query();
			query.setQueryString("SELECT AccountId FROM Contact WHERE WorkEmail = '" + accountEmail + "'");
			QueryResponse resp = stub.query(query, this.header);
			
			String accountId = null;
			if (resp.getResult().getSize() != 0) {
				accountId = ((Contact) resp.getResult().getRecords()[0]).getAccountId().getID();
			} else {
				// User doesn't exist
				return null;
			}
			
			// Get the account associated
			summary = new SummaryAccount();
			query = new Query();
			query.setQueryString("SELECT Id, Name, Balance, LastInvoiceDate FROM Account WHERE Id = '" + accountId + "'");
			resp = stub.query(query, this.header);
//			for (Account account : (Account[]) resp.getResult().getRecords()) {
			for (ZObject zobject : resp.getResult().getRecords()) {
				Account account = (Account) zobject;
				summary.setName(account.getName());
				summary.setBalance(account.getBalance().toPlainString());
				
				// Get the date of last invoice
				TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
				dateFormat.setTimeZone(tz);
				Calendar date = account.getLastInvoiceDate();
				if (date != null) {
					date.setTimeZone(tz);
					summary.setLastInvoiceDate(dateFormat.format(date.getTime()));
				} else {
					summary.setLastInvoiceDate(null);
				}
				
				// Query the last payment
				Query paymentQuery = new Query();
				paymentQuery.setQueryString("SELECT Amount, EffectiveDate, CreatedDate FROM Payment WHERE AccountId = '" + accountId + "'");
				QueryResponse paymentResp = stub.query(paymentQuery, this.header);
				
				if (paymentResp.getResult().getSize() == 0) {
					summary.setLastPaymentAmount(null);
					summary.setLastPaymentDate(null);
				} else {
					List<Payment> listPayments = new ArrayList<Payment>();
					
					for (ZObject z : paymentResp.getResult().getRecords()) {
						Payment payment = (Payment) z;
						listPayments.add(payment);
					}
					Payment[] payments = (Payment[]) listPayments.toArray(new Payment[listPayments.size()]);
//					Payment[] payments = (Payment[]) paymentResp.getResult().getRecords();
					Arrays.sort(payments, new CmpPayments());
					// TODO check this has been really sorted..
					summary.setLastPaymentAmount(payments[0].getAmount().toPlainString());
					// Set TimeZone
					Calendar effectiveDate = payments[0].getEffectiveDate();
					effectiveDate.setTimeZone(tz);
					summary.setLastPaymentDate(dateFormat.format(effectiveDate.getTime()));
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return summary;
	}

	/**
	 * Get contact information from the given user, including address
	 * information.
	 * 
	 * @param accountEmail
	 *            email of the target account
	 * @return Contact Detail model populated with a single contact on this
	 *         account
	 */
	public SummaryContact getContactDetail(String accountEmail) {
		SummaryContact summaryContact = new SummaryContact();
		
		// Get Account ID associated with this email address
		String accountId = null;
		Query accountQuery = new Query();
		accountQuery.setQueryString("SELECT Id FROM Account WHERE Name='" + accountEmail + "'");
		try {
			QueryResult result = this.stub.query(accountQuery, header).getResult();
			Account acc = (Account) result.getRecords()[0];
			accountId = acc.getId().getID();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (accountId == null) {
			summaryContact.setSuccess(false);
			summaryContact.setError("USER_DOESNT_EXIST");
			return summaryContact;
		}
		
		// Get contact information associated with this account ID
		Query contactQuery = new Query();
		contactQuery.setQueryString("SELECT FirstName,LastName,Address1,Address2,City,State,PostalCode,Country FROM Contact WHERE AccountId='" + accountId + "'");
		try {
			QueryResult result = this.stub.query(contactQuery, header).getResult();
			
			if (result.getSize() == 0) {
				summaryContact.setSuccess(false);
				summaryContact.setError("CONTACT_DOESNT_EXIST");
				return summaryContact;
			}
			
			Contact contact = (Contact) result.getRecords()[0];
			
			summaryContact.setFirstName(contact.getFirstName());
			summaryContact.setLastName(contact.getLastName());
			summaryContact.setCountry(contact.getCountry());
			summaryContact.setState((contact.getState() != null) ? contact.getState() : "");
			summaryContact.setAddress1((contact.getAddress1() != null) ? contact.getAddress1() : "");
			summaryContact.setAddress2((contact.getAddress2() != null) ? contact.getAddress2() : "");
			summaryContact.setCity((contact.getCity() != null) ? contact.getCity() : "");
			summaryContact.setPostalCode((contact.getPostalCode() != null) ? contact.getPostalCode() : "");
			
			summaryContact.setSuccess(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return summaryContact;
	}
	
	public SummaryAccount getCompleteDetail(String accountEmail) {
		// Create the object and get the basic information
		SummaryAccount summary = getAccountDetail(accountEmail);
		
		// Retrieve all the payment methods
		summary.setPaymentMethodSummaries(getPaymentMethodSummary(accountEmail));
		
		// Retrieve all contact information
		summary.setContactSummary(getContactDetail(accountEmail));
		
		return summary;
	}
	
	/**
	 * Get payment information from the account associated with this email address
	 * @param email User's work email
	 * @return Payment methods list
	 */
	public List<PaymentDetail> getPaymentMethodSummary(String email) {
		// Step #1: retrieve the account ID associated with this email
		Query accountQuery = new Query();
		accountQuery.setQueryString("SELECT AccountId FROM Contact WHERE WorkEmail='" + email + "'");
		String accountId = null;
		try {
			QueryResponse accountResponse = stub.query(accountQuery, this.header);
			Contact c = (Contact) accountResponse.getResult().getRecords()[0];
			accountId = c.getAccountId().getID();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Account does not exist!
		if (accountId == null) {
			return null;
		}
		
		// Get default payment method id for this account
		String defaultPaymentMethodId = null;
		Query defaultPmQuery = new Query();
		defaultPmQuery.setQueryString("SELECT DefaultPaymentMethodId FROM Account WHERE Id='" + accountId + "'");
		try {
			QueryResponse resp = stub.query(defaultPmQuery, this.header);
			Account acc = (Account) resp.getResult().getRecords()[0];
			System.out.println(accountId);
			defaultPaymentMethodId = acc.getDefaultPaymentMethodId().getID();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Payment method doesn't exist
		if (defaultPaymentMethodId == null) {
			return null;
		}
		
		// Prepare the list of payment detail
		List<PaymentDetail> details = new ArrayList<PaymentDetail>();
		
		// Get payment methods with this account id
		Query paymentsQuery = new Query();
		paymentsQuery.setQueryString("SELECT Id,CreditCardHolderName,CreditCardMaskNumber,"
					+ "CreditCardExpirationYear,CreditCardExpirationMonth,CreditCardType "
					+ "from PaymentMethod WHERE AccountId='" + accountId + "'");
		try {
			QueryResponse resp = stub.query(paymentsQuery, this.header);
			for (ZObject z : resp.getResult().getRecords()) {
				PaymentMethod pm = (PaymentMethod) z;
				PaymentDetail d = new PaymentDetail();
				d.setId(pm.getId().getID());
				d.setCardHolderName(pm.getCreditCardHolderName());
				d.setMaskedNumber(pm.getCreditCardMaskNumber());
				d.setExpirationYear(pm.getCreditCardExpirationYear());
				d.setExpirationMonth(pm.getCreditCardExpirationMonth());
				d.setCardType(pm.getCreditCardType());
				d.setDefaultCard((pm.getId().getID().equals(defaultPaymentMethodId)));
				details.add(d);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return details;
	}
	
	/**
	 * Update the given user's information
	 * @return the user ID if successful
	 */
	public String updateContact(String accountName, SummaryContact updatedContact) {
		
		// Get Account ID with this name
		String accountId = null;
		Query accountQuery = new Query();
		accountQuery.setQueryString("SELECT Id FROM Account WHERE Name='" + accountName + "'");
		
		try {
			QueryResult result = this.stub.query(accountQuery, header).getResult();
			Account acc = (Account) result.getRecords()[0];
			accountId = acc.getId().getID();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		// Get the contact ID associated with this account
		ID contactId = null;
		Query contactQuery = new Query();
		contactQuery.setQueryString("SELECT Id FROM Contact WHERE AccountId='" + accountId + "'");
		
		try {
			QueryResult result = this.stub.query(contactQuery, header).getResult();
			Contact contact = (Contact) result.getRecords()[0];
			contactId = contact.getId();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		// Create a contact record with this ID and all parameters that were passed in
		Contact updated = new Contact();
		updated.setId(contactId);
		updated.setFirstName(updatedContact.getFirstName());
		updated.setLastName(updatedContact.getLastName());
		updated.setCountry(updatedContact.getCountry());
		updated.setAddress1(updatedContact.getAddress1());
		updated.setAddress2(updatedContact.getAddress2());
		updated.setPostalCode(updatedContact.getPostalCode());
		updated.setCity(updatedContact.getCity());
		updated.setState(updatedContact.getState());
		
		String returnedId = null;
		
		try {
			returnedId = this.helper.update(updated).getID();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnedId;
	}
	
	/**
	 * Comparator to sort payments by effective date.
	 */
	private class CmpPayments implements Comparator<Payment> {

		@Override
		public int compare(Payment a, Payment b) {
			return a.getCreatedDate().compareTo(b.getCreatedDate());
		}
		
	}

	public boolean checkEmailAvailability(String targetEmail) {
		// Prepare the zQuery
		Query query = new Query();
		query.setQueryString("SELECT Id FROM Contact WHERE WorkEmail = '"
				+ targetEmail + "'");
		try {
			QueryResponse resp = stub.query(query, this.header);
			if (resp != null) {
				if (resp.getResult().getSize() != 0) {
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

}
