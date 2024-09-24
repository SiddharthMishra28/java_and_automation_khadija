package com.businessmanager.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.businessmanager.entities.Customer;

public class CustomerManager {
	
	List<Customer> customers = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void manageCustomer() {
		System.out.println("CustomerManager.manageCustomer");
	}
}
