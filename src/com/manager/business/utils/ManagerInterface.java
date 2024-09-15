package com.manager.business.utils;

import com.manager.business.entity.Business;

public interface ManagerInterface {
	
	/**
	 * 
	 * @param business
	 */
	public void createBusiness(Business business);
	
	public void getBusiness(int id);
	
	public void updateBusiness(int id, Business business);
	
	public void deleteBusiness(int id);
	
	// Customers
	
	// Addressess
	
	/**
	 * Welcome to Business Manager:
		Select option from below Menu:
		1. Business Management
		2. Customer Management
		3. Address Management
		
		on choosing 1:
		1. Create a Business
		2. Edit Details for a business
		3. Get Details for a business
		4. Remove / Delete Business details
		
		on choosing 2:
		1. Create a customer for a business
		2. Edit customer details associated with a business
		3. Get Customer Details for a business
		4. Remove / Delete Customer
...
	 */
}
