package com.zuora.zilla.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import com.zuora.zilla.controller.Catalog;
import com.zuora.zilla.controller.ProductManager;
import com.zuora.zilla.model.CatalogCharge;
import com.zuora.zilla.model.CatalogGroup;
import com.zuora.zilla.model.CatalogModel;
import com.zuora.zilla.model.CatalogProduct;
import com.zuora.zilla.model.CatalogRatePlan;
import com.zuora.zilla.model.ProductDetail;

public class ProductDetailTest extends TestCase {

	public ProductDetailTest(String name) {
		super(name);
	}

	public void testReadCatalog() throws Exception {
		System.out.print("Reading Catalog ... ");
		Catalog.readCatalog();
		System.out.println("Done");
	}
	
	public void testGetAdditionalProducts() throws Exception {
		try {			
			System.out.println("===Get Additional Products===\n");

			System.out.print("Reading Catalog ... ");
			Catalog.readCatalog();
			System.out.println("Done");
			
			
			
			ProductManager productManager = new ProductManager();
			ProductDetail detail = new ProductDetail();
			productManager.getAdditionalFeatures(detail);
			
			System.out.println(detail.getAdditionalFeatures().size() + " records found.");

			System.out.println("Complete.");

		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}	

	public void testGetTermProducts() throws Exception {
		try {			
			System.out.println("===Get Term Products===\n");

			String upgradeGroup = "Business";
			String upgradeLevel = "1";

			System.out.print("Getting group " + upgradeGroup);
			System.out.println("... Getting level " + upgradeLevel);

			System.out.print("Reading Catalog ... ");
			Catalog.readCatalog();
			System.out.println("Done");
			
			
			
			ProductManager productManager = new ProductManager();
			ProductDetail detail = new ProductDetail();
			productManager.getPlansByUpgradePath(detail, upgradeGroup, upgradeLevel);
			
			System.out.println(detail.getFrequencyPlans().size() + " records found.");

			System.out.println("Complete.");

		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}	

}
