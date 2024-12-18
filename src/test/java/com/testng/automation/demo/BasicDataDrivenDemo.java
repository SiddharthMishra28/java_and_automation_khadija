package com.testng.automation.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataDrivenDemo {
	
	@Test(dataProvider = "greetdata")
	public void dummyTest(String greet, String personName) {
		System.out.println(greet+" there "+personName);
	}
	
	// DATAPROVIDER
	// Object[][] / String[][] - 2D Object/String Array
	@DataProvider(name = "greetdata")
	public String[][] greetDataProvider() {
		return new String[][]{
			{"Hi", "Sid"},
			{"Hello", "Khadija"},
			{"Ola", "Bhabani"}
		};
	}
	
}
