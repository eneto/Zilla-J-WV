package com.zuora.zilla.controller;

import java.util.ArrayList;

import com.zuora.api.PreviewOptions;
import com.zuora.api.QueryResult;
import com.zuora.api.RatePlanData;
import com.zuora.api.SubscribeOptions;
import com.zuora.api.SubscribeRequest;
import com.zuora.api.SubscribeResult;
import com.zuora.api.SubscriptionData;
import com.zuora.api.object.Account;
import com.zuora.api.object.Contact;
import com.zuora.api.object.Product;
import com.zuora.api.object.ProductRatePlan;
import com.zuora.api.object.RatePlan;
import com.zuora.api.object.Subscription;
import com.zuora.api.object.ZObject;
import com.zuora.zilla.model.*;
import com.zuora.zilla.util.AccountSample;
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
	 * To use this functionality, custom fields UpgradeGroup__c and UpgradeLevel__c must be defined at the ProductRatePlan level, and there must be one product titled "Add-On Products"
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

	public ProductPreview previewProductDetail(String uGroup, String uLevel, String baseId, String addons, String coupon) throws Exception{

		ProductPreview preview = new ProductPreview();

		//Set up product rate plans: Include Base product, add ons, and discount

		//Base Plan = baseId
		QueryResult qrBase = zapi.zQuery("Select Description from ProductRatePlan where Id='"+baseId+"'");
		if(qrBase.getSize()==1){
			preview.setBaseDescription(((ProductRatePlan) qrBase.getRecords()[0]).getDescription());
		}

		//Add-ons = delimited addons
		String[] addonIds;
		if(addons.equals("")){
			addonIds = new String[] { };
		} else if(!addons.contains("|")){
			addonIds = new String[] { addons };
		} else {
			addonIds = addons.split("\\|");			
		}

		//Query Zuora for Discount coupon codes (CouponCode__c on ProductRatePlan)
		String discountId = null;
		try{
			if(coupon.equals("")){
				preview.setDiscount(false);
			} else {
				QueryResult qr = zapi.zQuery("Select Id,Name,Description from ProductRatePlan where CouponCode__c='"+coupon+"'");
				if(qr.getSize()==0){
					preview.setDiscount(false);
				} else {
					ProductRatePlan discRp = (ProductRatePlan) qr.getRecords()[0];
					preview.setDiscountName(discRp.getName());
					preview.setDiscountDescription(discRp.getDescription());
					discountId = discRp.getId();
					preview.setDiscount(true);
				}
			}
		} catch (Exception e){
			preview.setDiscount(false);
		}

		CartHelper pcart = new CartHelper();

		pcart.addCartItem(baseId, "1");
		for(String addonId : addonIds){
			pcart.addCartItem(addonId, "1");
		}
		if(preview.isDiscount()){
			pcart.addCartItem(discountId, "1");
		}

		SubscriptionManager subscriptionManager = new SubscriptionManager();

		SubscribePreview sprev = subscriptionManager.previewCurrentCart(pcart);
		
		preview.setSuccess(sprev.isSuccess());
		if(sprev.isSuccess()){
			preview.setPreviewAmount(sprev.getInvoiceAmount());
		} else {
			preview.setError(sprev.getError());
		}
		
		return preview;
	}
}