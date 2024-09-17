package com.manager.business;

import java.util.Scanner;

import com.manager.business.utils.BusinessManagerUtils;

public class Main {
	
	public static void main(String[] args) {
		int entityOption = 0;
		boolean isRunning = true;
		BusinessManagerUtils utils = new BusinessManagerUtils();
		Scanner sc = new Scanner(System.in);
		System.out.println("######### Welcome to Business Manager ########");
		utils.displayMainMenu();
		entityOption = sc.nextInt();
		while(isRunning) {
			switch (entityOption) {
				case 1: {
					utils.showBusinessManagementMenu();
					break;
				}
				case 2: {
					utils.showCustomerManagementMenu();
					break;
				}
				case 3: {
					utils.showAddressManagementMenu();
					break;
				}
				case 4: {
					System.out.println("Thanks! see you later!");
					isRunning = false;
					break;
				}
				default: {
					System.out.println("Bad Input Please select a correct option from the menu");
					break;
				}
			}
			break;
		}
	}
}
