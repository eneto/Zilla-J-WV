package com.zuora.zilla.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.zuora.api.*;
import com.zuora.api.object.*;

import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;

/**
 * This class wraps all API calls in order to retrieve the final catalog (with
 * all groups, rate plans, charges, etc.) avaiable as from today (no outdated
 * products are returned by this clas).
 * 
 * TODO Use Data Exports instead of queries
 * 
 * @author Mickael Pham <mickael.pham@zuora.com>
 */
public class CatalogHelper {
	/** Vector that contains all available products, rate plans and charges. */
	private static List<CatalogGroup> catalogGroups = null;

	/** Date formatted to query Zuora, using GMT-8 (see ZuoraUtility). */
	private String today;

	/** The Zuora API instance used to handle soap calls. */
	private ZApi zapi;
	
	public CatalogHelper() throws Exception {
		// get the stub and the helper
		try {
			zapi = new ZApi();
		} catch (Exception e) {
			throw new Exception("Invalid Login");
		}
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

		QueryResult productResult = null;
		try {
			productResult = zapi.zQuery("select Id, Name, Description from Product where EffectiveStartDate < '"
					+ today + "' and EffectiveEndDate > '" + today + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Prepare the response object
		try {
			ZObject[] records = productResult.getRecords();
			for (int i = 0; i < records.length; i++) {
				Product p = (Product) records[i];
				CatalogProduct catalogProduct = new CatalogProduct();
				catalogProduct.setId(p.getId());
				catalogProduct.setName(p.getName());
				catalogProduct.setDescription(p.getDescription());
				products.add(catalogProduct);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return products;
	}

	private Vector<CatalogRatePlan> getAllRatePlans(CatalogProduct product) {
		Vector<CatalogRatePlan> ratePlans = new Vector<CatalogRatePlan>();

		try {
			QueryResult productResult = null;
			try {
				productResult = zapi.zQuery("select Id, Name, Description from Product where EffectiveStartDate < '"
						+ today + "' and EffectiveEndDate > '" + today + "'");
			} catch (Exception e) {
				e.printStackTrace();
			}

			QueryResult prpResult = null;
			try {
				productResult = zapi.zQuery("Select Id, Name, Description from ProductRatePlan where ProductId='"
						+ product.getId()
						+ "' and EffectiveStartDate < '"
						+ today
						+ "' and EffectiveEndDate > '" + today + "'");
			} catch (Exception e) {
				e.printStackTrace();
			}

			ZObject[] qRatePlans = prpResult.getRecords();
			for (int i = 0; i < qRatePlans.length; i++) {
				ProductRatePlan prp = (ProductRatePlan) qRatePlans[i];
				CatalogRatePlan rp = new CatalogRatePlan();
				rp.setId(prp.getId());
				rp.setName(prp.getName());
				rp.setProductName(product.getName());
				rp.setDescription(prp.getDescription());
				rp.setQuantifiable(new Boolean(false));

				// add to vector
				ratePlans.add(rp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ratePlans;
	}

	private Vector<CatalogCharge> getAllCharges(CatalogRatePlan catalogRatePlan) {
		Vector<CatalogCharge> charges = new Vector<CatalogCharge>();

		try {
			QueryResult chargesResult = null;
			try {
				chargesResult = zapi.zQuery("Select Id, Name, Description, UOM, ChargeModel, ChargeType from ProductRatePlanCharge where ProductRatePlanId='"
						+ catalogRatePlan.getId() + "'");
			} catch (Exception e) {
				e.printStackTrace();
			}
				
			ZObject[] zCharges = chargesResult.getRecords();
			// cast
			for (int i = 0; i < zCharges.length; i++) {
				ProductRatePlanCharge prpc = (ProductRatePlanCharge) zCharges[i];
				CatalogCharge cc = new CatalogCharge();

				if (prpc != null) {
					cc.setChargeModel(prpc.getChargeModel());
					cc.setChargeType(prpc.getChargeType());
					cc.setDescription(prpc.getDescription());
					cc.setId(prpc.getId());
					cc.setName(prpc.getName());
					cc.setUom(prpc.getUOM());
					charges.add(cc);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return charges;
	}

}
