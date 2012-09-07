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
public class CleanupTest extends TestCase {
	
	public CleanupTest(String name) {
		super(name);
	}

	public void testProductCleanup() throws Exception {
		try{
			ZApi zapi = new ZApi();
			assertTrue(zapi.isLoggedIn);

			QueryResult qresa = zapi.zQuery("Select Id From Account Where Name='JTest Account'");

			if(qresa.getSize()>0){
				ZObject[] zacts = qresa.getRecords();

				Account acc = (Account) zacts[0];			
				DeleteResult[] delaRes = zapi.zDelete(new String[] { acc.getId() }, "Account");
				if(!delaRes[0].getSuccess()){
					System.out.println(delaRes[0].getErrors()[0].getMessage());
				}
				assertTrue("Delete Account", delaRes[0].getSuccess());				
			}

			QueryResult qresp = zapi.zQuery("Select Id From Product Where Name='JTest Product'");
			if(qresp.getSize()>0){
				ZObject[] zprods = qresp.getRecords();
				Product p1 = (Product) zprods[0];			
				DeleteResult[] delpRes = zapi.zDelete(new String[] { p1.getId() }, "Product");
				if(!delpRes[0].getSuccess()){
					System.out.println(delpRes[0].getErrors()[0].getMessage());
				}
				assertTrue("Delete Product", delpRes[0].getSuccess());
			}

		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}