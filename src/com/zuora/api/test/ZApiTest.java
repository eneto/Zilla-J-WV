package com.zuora.api.test;

import java.rmi.RemoteException;
import java.util.Calendar;


import com.zuora.api.*;
import com.zuora.api.fault.*;
import com.zuora.api.object.*;
import com.zuora.api.util.ZApi;

import junit.framework.*;

public class ZApiTest extends TestCase {
	
	public ZApiTest(String name) {
		super(name);
	}
	
	public void testZLogin() {
		try{
			ZApi zapi = new ZApi();
			assertTrue("Logged in", zapi.isLoggedIn);
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	


	
	public void testZCreate() throws RemoteException, UnexpectedErrorFault, InvalidTypeFault {
		try{
			ZApi zapi = new ZApi();
			assertTrue("Logged in", zapi.isLoggedIn);
			
			Product testProd = new Product();
			testProd.setName("JTest Product");
			testProd.setDescription("JTest Description");
			Calendar sdate = Calendar.getInstance();
			Calendar edate = Calendar.getInstance();
			sdate.add(Calendar.YEAR, -50);
			edate.add(Calendar.YEAR, 50);
			testProd.setEffectiveStartDate(sdate);
			testProd.setEffectiveEndDate(edate);
			
			SaveResult[] sr = zapi.zCreate(new ZObject[] { testProd });
			assertTrue("Created Product", sr[0].getSuccess());
			
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	public void testZQuery() throws RemoteException, UnexpectedErrorFault, InvalidTypeFault, MalformedQueryFault, InvalidQueryLocatorFault {
		try{
			ZApi zapi = new ZApi();
			assertTrue("Logged in", zapi.isLoggedIn);
	
			QueryResult qres = zapi.zQuery("Select Id,Name,Description From Product Where Name='JTest Product'");
			ZObject[] zprods = qres.getRecords();
			Product p1 = (Product) zprods[0];
	
			assertTrue("Found JTest Product", p1.getDescription().equals("JTest Description"));
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	public void testZUpdate() throws RemoteException, UnexpectedErrorFault, InvalidTypeFault, MalformedQueryFault, InvalidQueryLocatorFault {
		try{
			ZApi zapi = new ZApi();
			assertTrue("Logged in", zapi.isLoggedIn);
	
			QueryResult qres = zapi.zQuery("Select Id,Description From Product Where Name='JTest Product'");
			ZObject[] zprods = qres.getRecords();
			Product p1 = (Product) zprods[0];
			assertTrue("Found JTest Product", p1.getDescription().equals("JTest Description"));
			
			p1.setDescription("JTest Description 2");
			SaveResult[] sr = zapi.zUpdate(new ZObject[] { p1 });
			if(!sr[0].getSuccess()){
				System.out.println(sr[0].getErrors()[0].getMessage());
			}
			assertTrue("Updated Product", sr[0].getSuccess());
			
			QueryResult qres2 = zapi.zQuery("Select Id,Description From Product Where Name='JTest Product'");
			ZObject[] zprods2 = qres2.getRecords();
			Product p2 = (Product) zprods2[0];
			assertTrue("Found Updated JTest Product", p2.getDescription().equals("JTest Description 2"));

		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	public void testZDelete() throws RemoteException, UnexpectedErrorFault, InvalidTypeFault, MalformedQueryFault, InvalidQueryLocatorFault, InvalidValueFault {
		try{
			ZApi zapi = new ZApi();
			assertTrue("Logged in", zapi.isLoggedIn);
	
			QueryResult qres = zapi.zQuery("Select Id,Description From Product Where Name='JTest Product'");
			ZObject[] zprods = qres.getRecords();
			Product p1 = (Product) zprods[0];
			
			
			DeleteResult[] delRes = zapi.zDelete(new String[] { p1.getId() }, "Product");
			assertTrue(delRes[0].getSuccess());
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
}
