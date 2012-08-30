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

	public void testRefresh() throws Exception {
		CatalogHelper catalog = null;
		try{
			catalog = new CatalogHelper();
		} catch (Exception e){
			System.out.println(e.getMessage());
			fail("Created Catalog");
		}
		
		try {
			ArrayList<CatalogGroup> groups = catalog.refreshCache();
			for(CatalogGroup g : groups){
				for(CatalogProduct p : g.getProducts()){
					System.out.println("Product : " + p.getName());
				}
			}
			
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}