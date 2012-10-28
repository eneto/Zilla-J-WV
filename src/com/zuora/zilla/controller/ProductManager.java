package com.zuora.zilla.controller;

import com.zuora.api.QueryResult;
import com.zuora.api.object.Account;
import com.zuora.zilla.model.ProductDetail;
import com.zuora.zilla.model.SummaryAccount;
import com.zuora.zilla.util.ZApi;

public class ProductManager {

	/** The Zuora API instance used to handle soap calls. */
	private ZApi zapi;

	public ProductManager() throws Exception {
		// get the stub and the helper
		try {
			zapi = new ZApi();
		} catch (Exception e) {
			throw new Exception("Invalid Login");
		}
	}

	public ProductDetail getProductByUpgradePath(String uGroup, String uLevel) {
		// Create the object and get the basic information
		ProductDetail detail = new ProductDetail();

		
		return detail;
	}	
}
