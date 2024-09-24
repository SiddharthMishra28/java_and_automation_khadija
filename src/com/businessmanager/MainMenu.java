package com.businessmanager;

import java.util.Scanner;

import com.businessmanager.utils.AddressManager;
import com.businessmanager.utils.BusinessManager;
import com.businessmanager.utils.CustomerManager;

public class MainMenu {
	
	public static void main(String[] args) {
		BusinessManager businessManager = new BusinessManager();
		CustomerManager customerManager = new CustomerManager();
		AddressManager addressManager = new AddressManager();
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("Choose an option from below Menu:");
			System.out.println("1. Business Management");
			System.out.println("2. Customer Management");
			System.out.println("3. Address Management");
			System.out.println("4. Quit Program");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1 -> businessManager.manageBusiness();
				case 2 -> customerManager.manageCustomer();
				case 3 -> addressManager.manageAddress();
				case 4 -> isRunning = false;
				default -> System.out.println("Invalid option selected");
			}
		}
		
	}
}
