package com.java.proceduralprog;

public class LogicalOperations {

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 16;
		int num3 = 17;
		// TRUTH TABLE
		// | AND - All conditions should be true then criteria is met
		// | OR - Either one of them is true then criteria is met
		boolean comparisonResult = num2 > num3 || num1 > num3;// Comparison operations
		System.out.println(comparisonResult);
	}

}
