package com.zuora.zilla.test;


import java.lang.reflect.Field;

import com.zuora.api.object.Contact;
import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;
import com.zuora.zilla.controller.*;

import junit.framework.*;
public class SubscriptionManagerTest extends TestCase {
	
	//NOTE: This test is used to create a subscription with a payment method entered via HPM. 
	//      You will need to provide a reference ID that has not yet been associated for a successful response.
	
	public SubscriptionManagerTest(String name) {
		super(name);
	}

	public void testCreateSubscription() throws Exception {
		try{
			SubscriptionManager sm = new SubscriptionManager();
			
			CartHelper cartHelper = new CartHelper();
			cartHelper.addCartItem("2c92c0f839a234320139ad2551c2000f", "1");

			/*TEST*/
			ResponseSubscribe res = sm.subscribeWithCurrentCart("JTest Email", "2c92c0f839b3b70e0139c1516fc21583", cartHelper);
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