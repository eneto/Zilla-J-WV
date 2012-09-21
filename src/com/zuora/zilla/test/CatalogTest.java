package com.zuora.zilla.test;

import java.util.ArrayList;

import com.zuora.api.*;
import com.zuora.api.object.*;
import com.zuora.zilla.controller.*;
import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;

import junit.framework.*;
public class CatalogTest extends TestCase {

	public CatalogTest(String name) {
		super(name);
	}

	public void testRefreshCatalog() throws Exception {
		try {
			System.out.println("===Catalog Refresh===\n");
			System.out.print("Refreshing...");
			CatalogModel data = Catalog.readCatalog();
			ArrayList<CatalogGroup> groups = data.getCatalogGroups();
			System.out.println("Complete.");
			for(CatalogGroup g : groups){
				for(CatalogProduct p : g.getProducts()){
					System.out.println("Product : " + p.getName());
					for(CatalogRatePlan rp : p.getRatePlans()){
						System.out.println("\tProduct Rate Plan : " + rp.getName());
						for(CatalogCharge c : rp.getCharges()){
							System.out.println("\t\tProduct Rate Plan Charge : " + c.getName());
						}
					}
				}
			}
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	public void testReadCatalog() throws Exception{
		try {
			System.out.println("===Catalog Read===\n");
			System.out.print("Reading...");
			CatalogModel data = Catalog.readCatalog();
			ArrayList<CatalogGroup> groups = data.getCatalogGroups();
			System.out.println("Complete.");
			for(CatalogGroup g : groups){
				for(CatalogProduct p : g.getProducts()){
					System.out.println("Product : " + p.getName());
					for(CatalogRatePlan rp : p.getRatePlans()){
						System.out.println("\tProduct Rate Plan : " + rp.getName());
						for(CatalogCharge c : rp.getCharges()){
							System.out.println("\t\tProduct Rate Plan Charge : " + c.getName());
						}
					}
				}
			}
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
}