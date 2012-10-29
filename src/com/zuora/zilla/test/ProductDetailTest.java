package com.zuora.zilla.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.zuora.zilla.controller.Catalog;
import com.zuora.zilla.controller.ProductManager;
import com.zuora.zilla.model.CatalogCharge;
import com.zuora.zilla.model.CatalogGroup;
import com.zuora.zilla.model.CatalogModel;
import com.zuora.zilla.model.CatalogProduct;
import com.zuora.zilla.model.CatalogRatePlan;

public class ProductDetailTest {

	public ProductDetailTest(String name) {
		super(name);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	public void testGetProductDetail() throws Exception {
		try {
			System.out.println("===Get Product Detail===\n");
			
			String upgradeGroup = "Business";
			String upgradeLevel = "1";
			
			System.out.print("Getting group " + upgradeGroup);
			System.out.println("... Getting level " + upgradeLevel);

			ProductManager productManager = new ProductManager();
			productManager.getProductByUpgradePath(upgradeGroup, upgradeLevel);
			
			System.out.println("Complete.");

		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	
	
}
