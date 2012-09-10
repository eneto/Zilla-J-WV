package com.zuora.zilla.test;


import java.lang.reflect.Field;

import com.zuora.api.object.Contact;
import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;
import com.zuora.zilla.controller.*;

import junit.framework.*;
public class AccountDetailTest extends TestCase {
	
	public AccountDetailTest(String name) {
		super(name);
	}

	public void testGetCompleteDetail() throws Exception {
		try{
			AccountManager am = new AccountManager();

			System.out.println("====== Get Account Detail ======");

			/*TEST*/
			SummaryAccount summary = am.getCompleteDetail("JTest Account");
			/*TEST*/
			
			//Print results
			for (Field field : summary.getClass().getDeclaredFields()) {
			    field.setAccessible(true);
			    String name = field.getName();
			    Object value = field.get(summary);
			    System.out.printf("%s: %s%n", name, value);
			}
			assertTrue("Summary retrieved", summary.getSuccess());
		} catch (Exception e){
			fail(e.getMessage());
		}
	}

	public void testUpdateContact() throws Exception {
		try{
			AccountManager am = new AccountManager();

			System.out.println("====== Get Update Contact ======");
			
			/*TEST*/
			SummaryContact updatedContact = new SummaryContact();
			updatedContact.setPostalCode(String.valueOf(System.nanoTime()));
			ResponseUpdateContact res = am.updateContact("JTest Account", updatedContact);
			/*TEST*/

			//Print results
			for (Field field : res.getClass().getDeclaredFields()) {
			    field.setAccessible(true);
			    String name = field.getName();
			    Object value = field.get(res);
			    System.out.printf("%s: %s%n", name, value);
			}			

			assertTrue("Summary retrieved", res.isSuccess());
		} catch (Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
