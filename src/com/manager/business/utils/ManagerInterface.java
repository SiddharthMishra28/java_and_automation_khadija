package com.manager.business.utils;

import com.manager.business.entity.Business;

public interface ManagerInterface {
	
	/**
	 * <p>This method is responsible to create a business entry and persist it to the storage</p>
	 * @param business
	 * @Version 1.0
	 */
	public void createBusiness(Business business);
	
	/**
	 * <p>Reads a business object with provided id from storage</p>
	 * @param id
	 * @Version 1.0
	 */
	public Business getBusiness(String id);
	
	/**
	 * <p>Updates the details of an existing business in the storage</p>
	 * @param id
	 * @param business
	 * @Version 1.0
	 */
	public void updateBusiness(String id, Business business);
	
	/**
	 * <p>Deletes / Removes a business entry from storage for the provided Id</p>
	 * @param id
	 * @Version 1.0
	 */
	public void deleteBusiness(String id);
	
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
