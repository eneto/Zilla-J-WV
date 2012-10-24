package com.zuora.zilla.test;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zuora.zilla.controller.UpgradeManager;

public class UpgradeManagerTest {
	
	public static final String ACCOUNT_NAME = "mickael.pham@zuora.com";

	public static final Logger logger = LoggerFactory.getLogger(UpgradeManagerTest.class);
	
	@Test
	public void testRetrievingRatePlanId() {
		String rpId = new UpgradeManager().getCurrentSubscriptionRatePlanId(ACCOUNT_NAME);
		Assert.assertNotNull(rpId);
		logger.debug("Retrieving Rate Plan Id: " + rpId);
		Assert.assertEquals("2c92a0f93a6d39a0013a910522443932", rpId);
	}
}
