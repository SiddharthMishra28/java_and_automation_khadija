package com.businessmanager.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.businessmanager.entities.Business;
import com.businessmanager.entities.Customer;

public class CustomerManager {
	
	List<Customer> customers = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void manageCustomer() {
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("Customer Management Menu:");
			System.out.println("1. Create a customer");
			System.out.println("2. Read a customer detail");
			System.out.println("3. Update customer detail");
			System.out.println("4. Delete a customer");
			System.out.println("5. Navigate Back to Main Menu:");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1 -> createCustomer();
				case 2 -> readCustomer();
				case 3 -> updateCustomer();
				case 4 -> deleteCustomer();
				case 5 -> isRunning = false;
				default -> System.out.println("Invalid option selected!");
			}
		}
	}

	private void deleteCustomer() {
		System.out.println("Enter Id of the customer to delete : ");
		int id = sc.nextInt();
		sc.nextLine();
		Customer customer = findCustomerById(id);
		if(customer != null) {
			customers.remove(customers);
			System.out.println("Customer Removed Successfully!");
		}else {
			System.out.println("No customer with id "+id+" exists");
		}
	}

	private void updateCustomer() {
		System.out.println("Enter Id of the customer to update : ");
		int id = sc.nextInt();
		sc.nextLine();
		Customer customer = findCustomerById(id);
		if(customer != null) {
			System.out.println("Enter business name to update : ");
			String name = sc.nextLine();
			customer.setCustomerName(name);
			System.out.println("Customer updated successfully!");
		}else {
			System.out.println("No customer with id "+id+" exists");
		}
	}

	private void readCustomer() {
		System.out.println("Enter the customer Id to Read Details :");
		int id = sc.nextInt();
		sc.nextLine();
		Customer customer = findCustomerById(id);
		if(customer != null) {
			System.out.println(customer);
		}else {
			System.out.println("No customer with id "+id+" exists");
		}
	}
	

	private void createCustomer() {
		System.out.println("Enter customer id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter customer name : ");
		String name = sc.nextLine();
		customers.add(new Customer(id, name));
		System.out.println("Customer Created Successfully!");
	}
	
	public Customer findCustomerById(int id) {
		for(Customer customer : customers) {
			if(customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}
}
