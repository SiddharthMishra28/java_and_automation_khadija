package com.businessmanager.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.businessmanager.entities.Business;
import com.businessmanager.entities.Customer;

public class BusinessManager {
	
	List<Business> businesses = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void manageBusiness(CustomerManager customerManager) {
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("Business Management Menu:");
			System.out.println("1. Create a Business:");
			System.out.println("2. Read a Business:");
			System.out.println("3. Update a Business:");
			System.out.println("4. Delete a Business:");
			System.out.println("5. Associate a customer with a business");
			System.out.println("6. Navigate Back to Main Menu:");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 -> createBusiness();
			case 2 -> readBusiness();
			case 3 -> updateBusiness();
			case 4 -> deleteBusiness();
			case 5 -> associateCustomer(customerManager);
			case 6 -> isRunning = false;
			default -> System.out.println("Invalid option selected!");
			}
		}
	}

	private void associateCustomer(CustomerManager customerManager) {
		System.out.println("Enter business Id to associate a customer : ");
		int id = sc.nextInt();
		sc.nextLine();
		Business business = findBusinessById(id);
		if(business != null) {
			System.out.println("Enter the customer id to associate the business with : ");
			int customerId = sc.nextInt();
			sc.nextLine();
			Customer customer = customerManager.findCustomerById(customerId);
			if(customer != null) {
				business.addCustomer(customer);
				System.out.println("Customer addded to business successfully!");
			}else {
				System.out.println("No customer with id "+id+" exists");
			}
		}else {
			System.out.println("No business with id "+id+" exists");
		}
	}

	private void deleteBusiness() {
		System.out.println("Enter business id to delete the business : ");
		int id = sc.nextInt();
		sc.nextLine();
		Business business = findBusinessById(id);
		if(business != null) {
			businesses.remove(business);
			System.out.println("Business Removed Successfully!");
		}else {
			System.out.println("No business with id "+id+" exists");
		}
	}

	private void updateBusiness() {
		System.out.println("Enter Id of the business to update : ");
		int id = sc.nextInt();
		sc.nextLine();
		Business business = findBusinessById(id);
		if(business != null) {
			System.out.println("Enter business name to update : ");
			String name = sc.nextLine();
			business.setBusinessName(name);
			System.out.println("Business Updated Successfully!");
		}else {
			System.out.println("No business with id "+id+" exists");
		}
	}

	private void readBusiness() {
		System.out.println("Enter the business Id to Read Details :");
		int id = sc.nextInt();
		sc.nextLine();
		Business business = findBusinessById(id);
		if(business != null) {
			System.out.println("Business Details are "+business);
		}else {
			System.out.println("No business with id "+id+" exists");
		}
	}

	private Business findBusinessById(int id) {
		for(Business business : businesses) {
			if(business.getId() == id) {
				return business;
			}
		}
		return null;
	}

	private void createBusiness() {
		System.out.println("Please enter business Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Business Name : ");
		String name = sc.nextLine();
		businesses.add(new Business(id, name));
		System.out.println("Business Created Successfully!");
	}
}
