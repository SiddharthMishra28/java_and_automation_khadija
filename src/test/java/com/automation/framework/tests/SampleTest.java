package com.automation.framework.tests;

import org.testng.annotations.Test;

import com.automation.framework.config.Lifecycle;
import com.automation.framework.pages.SignInPage;
import com.automation.framework.reporting.ReportListener;
import com.aventstack.extentreports.Status;

public class SampleTest extends Lifecycle{
	
	SignInPage signInPage;
	
	@Test
	public void testOne() throws InterruptedException {
		signInPage = new SignInPage(driver);
		signInPage.signIn("http://vistacommerce-qa.rf.gd/","test@email.com", "Pass2");
		Thread.sleep(2000);
		ReportListener.test.log(Status.INFO, "Sample Info Log!!");
	}
}
