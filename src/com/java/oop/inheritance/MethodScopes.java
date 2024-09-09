package com.java.oop.inheritance;

public class MethodScopes {
	
	void sumOfNumbers(int firstNumber, int secondNumber) {
		System.out.println(firstNumber + secondNumber);
	}
	
	public static void main(String[] args) {
		MethodScopes ms = new MethodScopes();
		ms.sumOfNumbers(15, 24);
	}
}
