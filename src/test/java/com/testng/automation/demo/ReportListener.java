package com.testng.automation.demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReportListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started...");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Succeeded...");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed!!!");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Testing Started...");
		System.out.println(context.getHost());
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
}
