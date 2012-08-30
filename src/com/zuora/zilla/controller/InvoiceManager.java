package com.zuora.zilla.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.zuora.api.*;
import com.zuora.api.object.*;
import com.zuora.zilla.util.*;

public class InvoiceManager {
	
	/** The Zuora API instance used to handle soap calls. */
	private ZApi zapi;
	
	public InvoiceManager() throws Exception {
		// get the stub and the helper
		try {
			zapi = new ZApi();
		} catch (Exception e) {
			throw new Exception("Invalid Login");
		}
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

		
		// Get all invoices with this Account ID
		QueryResult qresInvs = null;
		try {
			qresInvs = zapi.zQuery("SELECT Id,CreatedDate FROM Invoice WHERE AccountId='" + accountId + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Invoice> listInvoices = new ArrayList<Invoice>();
		
		for (ZObject z1 : qresInvs.getRecords()) {
			Invoice invoice = (Invoice) z1;
			listInvoices.add(invoice);
		}
		
		if (listInvoices.size() > 0) {
			// Sort invoices by invoice date
			Collections.sort(listInvoices, new CmpInvoices());

			Invoice[] invoices = (Invoice[]) listInvoices.toArray();
			
			// Use the first invoice and return the body
			try {
				QueryResult qresLastInv = zapi.zQuery("SELECT Body FROM Invoice WHERE Id='" + invoices[0].getId() + "'");
				Invoice i = (Invoice) qresLastInv.getRecords()[0];
				return i.getBody();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
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
