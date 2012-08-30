package com.zuora.zilla.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.zuora.zilla.util.*;

import edu.emory.mathcs.backport.java.util.Arrays;

public class InvoiceManager {
	
	/** The Stub to query from Zuora. */
	private ZuoraServiceStub stub;

	/** To retrieve the current authentication to use the API. */
	private SessionHeader header;

	/** Wrapper to query the API in an elegant form. */
	private ZuoraAPIHelper helper;
	
	/** Public constructor, set up using the current stub and header. */
	public InvoiceManager() {
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
	 * Retrieves the latest invoice on the given user's account as a PDF body to
	 * be rendered by the user's browser.
	 * 
	 * @param accountName
	 *            Name of the target account
	 * @return PDF Body of invoice
	 */
	public String getLastInvoicePdf(String accountName) {
		
		// Get contact with this email
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
		
		// Get all invoices with this Account ID
		Query invoiceQuery = new Query();
		invoiceQuery.setQueryString("SELECT Id,CreatedDate FROM Invoice WHERE AccountId='" + accountId + "'");
		List<Invoice> listInvoices = new ArrayList<Invoice>();
		
		try {
			QueryResult result = this.stub.query(invoiceQuery, header).getResult();
			for (ZObject z1 : result.getRecords()) {
				Invoice invoice = (Invoice) z1;
				listInvoices.add(invoice);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		if (listInvoices.size() > 0) {
			// Sort invoices by invoice date
			Invoice[] invoices = (Invoice[]) listInvoices.toArray(new Invoice[listInvoices.size()]);
			Arrays.sort(invoices, new CmpInvoices());
			
			// Use the first invoice and return the body
			Query bodyQuery = new Query();
			bodyQuery.setQueryString("SELECT Body FROM Invoice WHERE Id='" + invoices[0].getId().getID() + "'");
			
			try {
				QueryResult result = this.stub.query(bodyQuery, header).getResult();
				Invoice i = (Invoice) result.getRecords()[0];
				return i.getBody();
				
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			
		} else {
			return null;
		}
	}
	
	/**
	 * Comparator to sort invoices by invoice date
	 */
	private class CmpInvoices implements Comparator<Invoice> {

		@Override
		public int compare(Invoice a, Invoice b) {
			return a.getCreatedDate().compareTo(b.getCreatedDate());
		}
		
	}
}
