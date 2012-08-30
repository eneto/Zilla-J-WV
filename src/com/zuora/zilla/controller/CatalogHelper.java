package com.zuora.zilla.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;

/**
 * This class wraps all API calls in order to retrieve the final catalog (with
 * all groups, rate plans, charges, etc.) avaiable as from today (no outdated
 * products are returned by this clas).
 * 
 * @author Mickael Pham <mickael.pham@zuora.com>
 */
public class CatalogHelper {

	/** The Stub to query from Zuora. */
	private ZuoraServiceStub stub;

	/** To retrieve the current authentication to use the API. */
	private SessionHeader header;

	/** Wrapper to query the API in an elegant form. */
	private ZuoraAPIHelper helper;

	/** Vector that contains all available products, rate plans and charges. */
	private static List<CatalogGroup> catalogGroups = null;

	/** Date formatted to query Zuora, using GMT-8 (see ZuoraUtility). */
	private String today;

	/** Public constructor, set up using the current stub and header. */
	public CatalogHelper() {
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

	/** Return all available products (available today). */
	public void refreshCache() {
		CatalogHelper.catalogGroups = new ArrayList<CatalogGroup>();
		// TODO Get the separate groups if required (base product, add on, etc.)

		this.today = ZuoraUtility.getCurrentDate();

		// Step #1 -> get all products
		Vector<CatalogProduct> products = getAllProducts();

		// Step #2 -> get all rate plans
		for (CatalogProduct product : products) {
			Vector<CatalogRatePlan> ratePlans = getAllRatePlans(product);
			product.setRatePlans(ratePlans);
		}

		// Step #3 -> get all charges
		for (CatalogProduct product : products) {
			for (CatalogRatePlan catalogRatePlan : product.getRatePlans()) {
				Vector<CatalogCharge> charges = getAllCharges(catalogRatePlan);
				
				boolean quantifiable = false;
				String uom = null;
				
				for (CatalogCharge charge : charges) {
					if (!charge.getChargeType().equals("Usage")
							&& (charge.getChargeModel().equals("Per Unit Pricing")
								|| charge.getChargeModel().equals("Tiered Pricing")
								|| charge.getChargeModel().equals("Volume Pricing"))) {
						uom = charge.getUom();
						quantifiable = true;
					}
				}
				
				catalogRatePlan.setQuantifiable(quantifiable);
				catalogRatePlan.setUom(uom);
				catalogRatePlan.setCharges(charges);
			}
		}

		// print output
		// printProducts(products);

		CatalogGroup catalogGroup = new CatalogGroup();
		catalogGroup.setProducts(products);
		catalogGroup.setName("");

		// Add this catalog group to the vector
		CatalogHelper.catalogGroups.add(catalogGroup);
	}

	public List<CatalogGroup> getCatalogGroups() {
		if (CatalogHelper.catalogGroups == null) {
			refreshCache();
		}
		return CatalogHelper.catalogGroups;
	}

	/** Display catalogGroup object in the console. */
	public void printProducts(Vector<CatalogProduct> products) {
		for (CatalogProduct p : products) {
			System.out.println(p.getName() + " -> " + p.getDescription());
			for (CatalogRatePlan rp : p.getRatePlans()) {
				System.out.println("\t" + rp.getName() + " -> "
						+ rp.getDescription());
				for (CatalogCharge cc : rp.getCharges()) {
					System.out.println("\t\t" + cc.getName() + " | "
							+ cc.getChargeModel());
				}
			}
		}
	}

	/**
	 * Given a RatePlan ID, retrieves all rateplan information by searching through the cached catalog file
	 * @param ratePlanId
	 * @return RatePlan model
	 */
	public CatalogRatePlan getRatePlan(String ratePlanId) {
		CatalogRatePlan ratePlan = null;
		for (CatalogGroup catalogGroup : this.getCatalogGroups()) {
			for (CatalogProduct catalogProduct : catalogGroup.getProducts()) {
				for (CatalogRatePlan catalogRatePlan : catalogProduct.getRatePlans()) {
					if (catalogRatePlan.getId().equalsIgnoreCase(ratePlanId)) {
						ratePlan = catalogRatePlan;
					}
				}
			}
		}
		return ratePlan;
	}
	
	private Vector<CatalogProduct> getAllProducts() {
		Vector<CatalogProduct> products = new Vector<CatalogProduct>();

		Query query = new Query();
		query.setQueryString("select Id, Name, Description from Product where EffectiveStartDate < '"
				+ today + "' and EffectiveEndDate > '" + today + "'");

		// Prepare the response object
		QueryResponse response = null;
		try {
			response = stub.query(query, this.header);
			if (response != null) {
				ZObject[] records = response.getResult().getRecords();
				for (int i = 0; i < records.length; i++) {
					Product p = (Product) records[i];
					CatalogProduct catalogProduct = new CatalogProduct();
					catalogProduct.setId(p.getId().getID());
					catalogProduct.setName(p.getName());
					catalogProduct.setDescription(p.getDescription());
					products.add(catalogProduct);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return products;
	}

	private Vector<CatalogRatePlan> getAllRatePlans(CatalogProduct product) {
		Vector<CatalogRatePlan> ratePlans = new Vector<CatalogRatePlan>();

		try {
			Query query = new Query();
			query.setQueryString("Select Id, Name, Description from ProductRatePlan where ProductId='"
					+ product.getId()
					+ "' and EffectiveStartDate < '"
					+ today
					+ "' and EffectiveEndDate > '" + today + "'");
			QueryResult result;
			if ((result = stub.query(query, header).getResult()) != null) {
				ZObject[] qRatePlans = result.getRecords();
				for (int i = 0; i < qRatePlans.length; i++) {
					ProductRatePlan prp = (ProductRatePlan) qRatePlans[i];
					CatalogRatePlan rp = new CatalogRatePlan();
					rp.setId(prp.getId().getID());
					rp.setName(prp.getName());
					rp.setProductName(product.getName());
					rp.setDescription(prp.getDescription());
					rp.setQuantifiable(new Boolean(false));

					// add to vector
					ratePlans.add(rp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ratePlans;
	}

	private Vector<CatalogCharge> getAllCharges(CatalogRatePlan catalogRatePlan) {
		Vector<CatalogCharge> charges = new Vector<CatalogCharge>();

		try {
			Query query = new Query();
			query.setQueryString("Select Id, Name, Description, UOM, ChargeModel, ChargeType from ProductRatePlanCharge where ProductRatePlanId='"
					+ catalogRatePlan.getId() + "'");
			QueryResult result = stub.query(query, header).getResult();
			if (result != null) {
				ZObject[] zObject = result.getRecords();
				// cast
				for (int i = 0; i < zObject.length; i++) {
					ProductRatePlanCharge prpc = (ProductRatePlanCharge) zObject[i];
					CatalogCharge cc = new CatalogCharge();

					if (prpc != null) {
						cc.setChargeModel(prpc.getChargeModel());
						cc.setChargeType(prpc.getChargeType());
						cc.setDescription(prpc.getDescription());
						cc.setId(prpc.getId().getID());
						cc.setName(prpc.getName());
						cc.setUom(prpc.getUOM());
						charges.add(cc);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return charges;
	}

}
