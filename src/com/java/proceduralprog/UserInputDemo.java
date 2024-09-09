package com.java.proceduralprog;

import java.util.Scanner;

public class UserInputDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("#####Bank Managers Application#####");
		System.out.println("Please select an option from below menu:");
		System.out.println("1. Create Account");
		System.out.println("2. Fund Transfer");
		System.out.println("3. Withdrawl");
		int option = sc.nextInt();
		int amount = 0;
		switch(option) {
		case 1:
			System.out.println("Enter firstname");
			break;
		case 2:
			System.out.println("Enter destination account number");
			System.out.println("Fund Transferred");
			break;
		case 3:
			System.out.println("Enter amount to withdraw");
			amount = sc.nextInt();
			System.out.println("Money withdrawl of "+amount+" successful");
			break;
		default:
			System.out.println("Invalid input provided!");
		}
	}
}
