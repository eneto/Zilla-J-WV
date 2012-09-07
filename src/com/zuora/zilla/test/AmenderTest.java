package com.zuora.zilla.test;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.zuora.api.*;
import com.zuora.api.object.*;
import com.zuora.zilla.controller.*;
import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;

import junit.framework.*;
public class AmenderTest extends TestCase {
	
	public AmenderTest(String name) {
		super(name);
	}

	public void testAddRatePlan() throws Exception {
		try{
			ZApi zapi = new ZApi();
			assertTrue(zapi.isLoggedIn);
			
			QueryResult qres = zapi.zQuery("Select Id,Name From ProductRatePlan Where Name='JTest Plan'");
			ZObject[] zplans = qres.getRecords();
			ProductRatePlan prp = (ProductRatePlan) zplans[0];
			assertTrue(prp.getName().equals("JTest Plan"));

			QueryResult qresS = zapi.zQuery("Select Id,Name From Subscription Where Name='JTest Subscription' and Status='Active'");
			ZObject[] zsubs = qresS.getRecords();
			Subscription sub = (Subscription) zsubs[0];
			assertTrue(sub.getName().equals("JTest Subscription"));

			
			/* TEST */
			Amender amender = new Amender();	
			
			//Test Preview Add Amendment
			BigDecimal qty = null;
			AmenderResult amenderRes1 = amender.addRatePlan("JTest Account", prp.getId(), qty, true);
			if(!amenderRes1.isSuccess()){
				System.out.println(amenderRes1.getError());
			}
			assertTrue("Add Product Previewed", amenderRes1.isSuccess());
			System.out.println("Preview Amount: " + amenderRes1.getInvoiceAmount());

			//Test Preview Add Amendment
			AmenderResult amenderRes2 = amender.addRatePlan("JTest Account", prp.getId(), qty, false);
			if(!amenderRes2.isSuccess()){
				System.out.println(amenderRes2.getError());
			}
			assertTrue("Add Product Created", amenderRes2.isSuccess());

			/* TEST */

	
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	public void testRemoveRatePlan() throws Exception {
		try{
			ZApi zapi = new ZApi();
			assertTrue(zapi.isLoggedIn);

			QueryResult qresS = zapi.zQuery("Select Id,Name From Subscription Where Name='JTest Subscription' and Status='Active'");
			ZObject[] zsubs = qresS.getRecords();
			Subscription sub = (Subscription) zsubs[0];
			assertTrue(sub.getName().equals("JTest Subscription"));

			QueryResult qres = zapi.zQuery("Select Id,Name From RatePlan Where SubscriptionId='" + sub.getId() + "'");
			ZObject[] zplans = qres.getRecords();
			RatePlan rp = (RatePlan) zplans[0];
			assertTrue(rp.getName().equals("JTest Plan"));

			/* TEST */
			Amender amender = new Amender();

			//Test Preview Add Amendment
			AmenderResult amenderRes1 = amender.removeRatePlan("JTest Account", rp.getId(), true);
			if(!amenderRes1.isSuccess()){
				System.out.println("NewProduct Amendment Failure: " + amenderRes1.getError());
			}
			assertTrue("Remove Product Previewed", amenderRes1.isSuccess());
			System.out.println("Preview Amount: " + amenderRes1.getInvoiceAmount());

			//Test Preview Add Amendment
			AmenderResult amenderRes2 = amender.removeRatePlan("JTest Account", rp.getId(), false);
			if(!amenderRes2.isSuccess()){
				System.out.println(amenderRes2.getError());
			}
			assertTrue("Remove Product Created", amenderRes2.isSuccess());

			/* TEST */

		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}