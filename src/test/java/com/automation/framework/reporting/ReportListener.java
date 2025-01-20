package com.automation.framework.reporting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automation.framework.config.Lifecycle;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportListener implements ITestListener {
	
	public static ExtentReports extent = new ExtentReports();
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getName()+" PASSED!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getThrowable());
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
		spark = new ExtentSparkReporter(Lifecycle.config.getProperty("reporting_directory"));
		spark.config().setDocumentTitle(Lifecycle.config.getProperty("report_name"));
		spark.config().setTheme(Theme.DARK);
		spark.config().setTimelineEnabled(true);
		extent.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
}
