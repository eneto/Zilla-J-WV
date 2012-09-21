package com.zuora.zilla.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

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
 * @author Eric Neto <eric.neto@zuora.com>
 */
public class Catalog {
	/**ArrayList containing all catalog groups**/
	private static ArrayList<CatalogGroup> catalogGroups;
	
	
	/** Date formatted to query Zuora, using GMT-8 (see ZuoraUtility). */
	private static String today;

	/** The Zuora API instance used to handle soap calls. */
	private static ZApi zapi;


	public static CatalogModel readCatalog() {
		if(catalogGroups==null){
			//Read in from a file.
//	         CatalogModel cat = null;
//	         System.out.println("reading cache");
//	         try
//	         {
//	            FileInputStream fileIn =
//	            		new FileInputStream("catalog_cache.ser");
//	            ObjectInputStream in = new ObjectInputStream(fileIn);
//	        	System.out.println("cache read from file");
//	            cat = (CatalogModel) in.readObject();
//	            in.close();
//	            fileIn.close();
//	            
//	            return cat.getCatalogGroups();
//	            
//	        }catch(Exception e) {
//				//If the file doesn't exist, refresh the catalog
//	        	System.out.println(e.getMessage());
//	        	System.out.println("cache not found; reading from zuora");
				return refreshCatalog();        
//	        }
		} else {
			CatalogModel data = new CatalogModel();
			data.setSuccess(true);
			data.setCatalogGroups(catalogGroups);
			return data;
		}
	}
	
	/** Return all products available today. */
	public static CatalogModel refreshCatalog() {
		zapi = new ZApi();
		CatalogModel data = new CatalogModel();
		ArrayList<CatalogGroup> catalogGroups = new ArrayList<CatalogGroup>();
		
		try{
			// TODO Allow user to filter out specific groups, to be configured in the config file
			// TODO Optimize to use Data Exports instead of queries
	
			today = ZuoraUtility.getCurrentDate();
	
			// Step #1 -> get all products
			ArrayList<CatalogProduct> products = getAllProducts();
			products.trimToSize();
	
			// Step #2 -> get all rate plans
			for (CatalogProduct product : products) {
				ArrayList<CatalogRatePlan> ratePlans = getAllRatePlans(product);
				ratePlans.trimToSize();
				product.setRatePlans(ratePlans);
			}
	
			// Step #3 -> get all charges
			for (CatalogProduct product : products) {
				for (CatalogRatePlan catalogRatePlan : product.getRatePlans()) {
					ArrayList<CatalogCharge> charges = getAllCharges(catalogRatePlan);
					charges.trimToSize();
	
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
	
			// Add this catalog group to the ArrayList
			catalogGroups.add(catalogGroup);
			catalogGroups.trimToSize();
		} catch (Exception e){
			data.setError(e.getMessage());
			data.setSuccess(false);
			return data;
		}
		
		//Write the catalog to a file for future use.
//		CatalogModel cat = new CatalogModel();
//		try{
//			FileOutputStream fileOut =
//				new FileOutputStream("catalog_cache.ser");
//			ObjectOutputStream out =
//				new ObjectOutputStream(fileOut);
//			out.writeObject(cat);
//			out.close();
//			fileOut.close();
//		} catch (Exception e){
//			System.out.println(e.getMessage());
//		}
		
		Catalog.catalogGroups = catalogGroups;
		
		data.setCatalogGroups(catalogGroups);
		data.setSuccess(true);
		return data;
	}

	/** Display catalogGroup object in the console. */
	public static void printProducts(ArrayList<CatalogProduct> products) {
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
	public static CatalogRatePlan getRatePlan(String ratePlanId) {
		CatalogRatePlan ratePlan = null;
		ArrayList<CatalogGroup> catalogGroups = readCatalog().getCatalogGroups();
		for (CatalogGroup catalogGroup : catalogGroups) {
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
	
	private static ArrayList<CatalogProduct> getAllProducts() throws Exception {
		ArrayList<CatalogProduct> products = new ArrayList<CatalogProduct>();

		QueryResult productResult = zapi.zQuery("select Id, Name, Description from Product where EffectiveStartDate < '"
				+ today + "' and EffectiveEndDate > '" + today + "'");
		
		// Prepare the response object
		ZObject[] records = productResult.getRecords();
		for (int i = 0; i < records.length; i++) {
			Product p = (Product) records[i];
			CatalogProduct catalogProduct = new CatalogProduct();
			catalogProduct.setId(p.getId());
			catalogProduct.setName(p.getName());
			catalogProduct.setDescription(p.getDescription());
			products.add(catalogProduct);
		}

		return products;
	}

	private static ArrayList<CatalogRatePlan> getAllRatePlans(CatalogProduct product) throws Exception {
		ArrayList<CatalogRatePlan> ratePlans = new ArrayList<CatalogRatePlan>();

		QueryResult prpResult = zapi.zQuery("Select Id, Name, Description from ProductRatePlan where ProductId='"
					+ product.getId()
					+ "' and EffectiveStartDate < '"
					+ today
					+ "' and EffectiveEndDate > '" + today + "'");

		ZObject[] qRatePlans = prpResult.getRecords();
		if(prpResult.getSize()>0){
			for (int i = 0; i < qRatePlans.length; i++) {
				ProductRatePlan prp = (ProductRatePlan) qRatePlans[i];
				CatalogRatePlan rp = new CatalogRatePlan();
				rp.setId(prp.getId());
				rp.setName(prp.getName());
				rp.setProductName(product.getName());
				rp.setDescription(prp.getDescription());
				rp.setQuantifiable(new Boolean(false));

				// add to ArrayList
				ratePlans.add(rp);
			}
		}

		return ratePlans;
	}

	private static ArrayList<CatalogCharge> getAllCharges(CatalogRatePlan catalogRatePlan) throws Exception {
		ArrayList<CatalogCharge> charges = new ArrayList<CatalogCharge>();
		QueryResult chargesResult = zapi.zQuery("Select Id, Name, Description, UOM, ChargeModel, ChargeType from ProductRatePlanCharge where ProductRatePlanId='"
						+ catalogRatePlan.getId() + "'");
				
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
		
		return charges;
	}

}
