package com.testng.automation.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExcel {
	
	WebDriver driver;
	
	@BeforeTest
	public void setupSteps() {
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test(dataProvider = "credentials")
	public void loginTest(String userId, String password) throws InterruptedException {
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys(userId);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(1000);
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "GTPL Bank Manager HomePage");
	}
	
	@DataProvider(name = "credentials")
	public String[][] userCredentialsProvider() throws IOException {
//		return new String[][] {
//			{"mngr604499", "tasAruz"},
//			{"dksajda", "tasAruz"},
//			{"mngr604499", "sdsadad"},
//			{"hsadkhsad", "hskdsad"}
//		};
		return getExcelData("testdata.xlsx", "Sheet1");
	}
	
	public String[][] getExcelData(String xlPath, String xlSheetTab) throws IOException {
		FileInputStream fis = new FileInputStream(new File(xlPath));
//		HSSFWworkbook - xls
//		XSSFWorkbook - xlsx
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet(xlSheetTab);
//		int rowCount = sh.getPhysicalNumberOfRows();
//		int colCount = sh.getRow(0).getPhysicalNumberOfCells();
		int rowCount = sh.getLastRowNum();
		int colCount = sh.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		for(int i=0; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				System.out.println(sh.getRow(i+1).getCell(j).getStringCellValue());
				data[i][j] = sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
}
