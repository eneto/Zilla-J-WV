package com.zuora.zilla.controller;

import java.util.ArrayList;

import com.zuora.api.QueryResult;
import com.zuora.api.object.Account;
import com.zuora.api.object.Product;
import com.zuora.api.object.ProductRatePlan;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.model.*;
import com.zuora.zilla.util.ZApi;
import com.zuora.zilla.util.ZuoraUtility;

public class ProductManager {

	/** The Zuora API instance used to handle soap calls. */
	private ZApi zapi;
	
	private final String addOnProductName = "Add-on Products";
	private final String upgradeGroupField = "UpgradeGroup__c";
	private final String upgradeLevelField = "UpgradeLevel__c";

	public ProductManager() throws Exception {
		// get the stub and the helper
		try {
			zapi = new ZApi();
		} catch (Exception e) {
			throw new Exception("Invalid Login");
		}
	}

	/**
	 * Retrieves information necessary for displaying the details of a particular upgradable product. Includes Rate Plan Description, term options, and additional features.
	 * To use this functionality, custom fields UpgradeGroup__c and UpgradeLevel__c must be defined at the Rate Plan level, and there must be one product titled "Add-On Products"
	 * with each rate plan representing a potential add-on product that the user can select.
	 * 
	 * @param uGroup
	 *            Group name of an upgrade path
	 * @param uLevel
	 *            Rank of rate plan within group
	 * @return Product Detail
	 */

	public ProductDetail getProductByUpgradePath(String uGroup, String uLevel) {
		// Create the object and get the basic information
		ProductDetail detail = new ProductDetail();

		try{

			// Term Length
			getPlansByUpgradePath(detail, uGroup, uLevel);
	
			// Additional Features
			getAdditionalFeatures(detail);
			
		} catch (Exception e){
			detail.setSuccess(false);
			detail.setError(e.getMessage());
		}

		detail.setSuccess(true);
		
		return detail;
	}	

	public void getPlansByUpgradePath(ProductDetail detail, String uGroup, String uLevel) throws Exception{
		
		ArrayList<CatalogRatePlan> termPlans = new ArrayList<CatalogRatePlan>();
		
//      TODO: Pull from Catalog Cache instead of Zuora
//		CatalogModel data = Catalog.readCatalog();
//
//		for(CatalogGroup g : data.getCatalogGroups()){
//			for(CatalogProduct prod : g.getProducts()){
//				for(CatalogProduct prod : g.getProducts()){
//					if(rp.getUpgradeGroup().equals(uGroup) && rp.getUpgradeLevel().equals(uLevel){
//						termPlans = prod.getRatePlans();
//					}
//				}
//			}
//		}

		
		QueryResult qr = zapi.zQuery("Select Id,Name,Description,ProductId From ProductratePlan Where "+upgradeGroupField+"='"+uGroup+"' and "+upgradeLevelField+"='"+uLevel+"'");
		
		ZObject[] objs = qr.getRecords();
		String prodId=null;
		
		for(ZObject obj : objs){
			ProductRatePlan prp = (ProductRatePlan) obj;
			CatalogRatePlan crp = new CatalogRatePlan();
			crp.setName(prp.getName());
			crp.setId(prp.getId());
			crp.setDescription(prp.getDescription());
			prodId = prp.getProductId();
			termPlans.add(crp);
		}

		detail.setFrequencyPlans(termPlans);

		// Rate Plan Description
		// Pull description for first RatePlan returned in Term Length Query
		if(termPlans.size()>0){
			detail.setDescription(termPlans.get(0).getDescription());
			
			QueryResult pqr = zapi.zQuery("select name from product where Id='"+prodId+"'");
			detail.setProductName(((Product)pqr.getRecords()[0]).getName());
		} else {
			throw new Exception("No rate plans are available that match these parameters.");
		}
	}	

	public void getAdditionalFeatures(ProductDetail detail) throws Exception{

		ArrayList<CatalogRatePlan> addPlans = new ArrayList<CatalogRatePlan>();

		CatalogModel data = Catalog.readCatalog();
		
		for(CatalogGroup g : data.getCatalogGroups()){
			for(CatalogProduct prod : g.getProducts()){
				if(prod.getName().equals(addOnProductName)){
					addPlans = prod.getRatePlans();
				}
			}
		}
		
		detail.setAdditionalFeatures(addPlans);
	}
	
	public ProductPreview previewProductDetail(String uGroup, String uLevel) throws Exception{

		ProductPreview preview = new ProductPreview();
		
		
		
		return preview;
	}
}