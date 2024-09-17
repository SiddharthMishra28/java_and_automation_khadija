package com.manager.business.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.manager.business.entity.Business;

public class BusinessManagerUtils implements ManagerInterface{
	
	List<Business> businesses = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void createBusiness(Business business) {
		businesses.add(business);
	}

	@Override
	public void getBusiness(int id) {
		businesses.get(id);	
	}

	@Override
	public void updateBusiness(int id, Business business) {
		Business originalBusiness = businesses.get(id);
		originalBusiness.setBusinessName(business.getBusinessName());
		originalBusiness.setBusinessSector(business.getBusinessSector());
		originalBusiness.setTaxId(business.getTaxId());
		originalBusiness.setAnnualRevenue(business.getAnnualRevenue());
	}

	@Override
	public void deleteBusiness(int id) {
		businesses.remove(id);		
	}
	
	public void displayMainMenu() {
		System.out.println("Select option from below Menu:");
		System.out.println("1. Business Management");
		System.out.println("2. Customer Management");
		System.out.println("3. Address Management");
		System.out.println("4. Quit Program");
	}
	
	public void showBusinessManagementMenu() {
		System.out.println("Select option from below Menu:");
		System.out.println("1. Create a Business");
		System.out.println("2. Edit Details for a business");
		System.out.println("3. Get Details for a business");
		System.out.println("4. Remove / Delete Business details");
		System.out.println("5. Back to previous menu");
	}
	
	public void showCustomerManagementMenu() {
		System.out.println("Select option from below Menu:");
		System.out.println("1. Create a Business");
		System.out.println("2. Edit Details for a business");
		System.out.println("3. Get Details for a business");
		System.out.println("4. Remove / Delete Business details");
		System.out.println("5. Back to previous menu");
	}
	
	public void showAddressManagementMenu() {
		System.out.println("Select option from below Menu:");
		System.out.println("1. Create a Business");
		System.out.println("2. Edit Details for a business");
		System.out.println("3. Get Details for a business");
		System.out.println("4. Remove / Delete Business details");
		System.out.println("5. Back to previous menu");
	}
	
	public Business getBusinessDetailsFromUser() {
		System.out.println("....");
		return null;
	}
	

}
