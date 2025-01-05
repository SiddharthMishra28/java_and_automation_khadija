package com.automation.framework.tests;

import org.testng.annotations.Test;

import com.automation.framework.config.Lifecycle;

public class SampleTest extends Lifecycle{
	
	@Test
	public void testOne() throws InterruptedException {
		utils.navigateTo("https://www.google.com");
		Thread.sleep(2000);
	}
}
