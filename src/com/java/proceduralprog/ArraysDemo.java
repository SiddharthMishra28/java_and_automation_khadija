package com.java.proceduralprog;

public class ArraysDemo {
	public static void main(String[] args) {
		// <DATA_TYPE>[] <variable name> = new <DATA_TYPE>[<SIZE>];
		String[] myStringArray = new String[4];
		// <DATA_TYPE>[] <variable name> = {"data..."};
		String[] myStrings = {"Hello", "hi", "wassup", "howdy"};
		//                      0        1      2         3  // n - 1
		System.out.println(myStrings[2]);
		
		// | first name | last name | email | phone |
		// | khadija    | ....
		String[][] myData = new String[3][4];
		// String[][] variable_name = {
		//                   { "firstname", "lastname", "email" , "phone"}
		//                   { "khadija" .... }
		//                  }
		String[][] cars = { 
				{"make", "model", "type"},  //0
				// 0       1        2
				{"merc", "s600", "sedan"},  //1
				// 0       1        2
				{"audi", "q7", "SUV"}       //2
		};
		System.out.println(cars[1][1]);
		// single dimension array
		for(int i=0; i<myStrings.length; i++) {
			System.out.println(myStrings[i]);
		}
		
		System.out.println("------------------------------");
		
		for(int j=0; j<cars.length; j++) {
			for(int k=0; k<cars[j].length; k++) {
				System.out.println(cars[j][k]);
			}
		}
	}
}
