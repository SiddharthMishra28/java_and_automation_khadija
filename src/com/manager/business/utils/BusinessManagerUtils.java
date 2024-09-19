package com.manager.business.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.manager.business.entity.Business;

public class BusinessManagerUtils implements ManagerInterface{
	
	List<Business> businesses = new ArrayList<>();
	Scanner sc;

	@Override
	public void createBusiness(Business business) {
		businesses.add(business);
	}

	@Override
	public Business getBusiness(String id) {
		for(Business business : businesses) {
			if(business.getBusinessId().equalsIgnoreCase(id)) {
				return business;
			}
		}
		return null;
	}

	@Override
	public void updateBusiness(String id, Business business) {
		
	}

	@Override
	public void deleteBusiness(String id) {
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
		sc = new Scanner(System.in);
		System.out.println("Select option from below Menu:");
		System.out.println("1. Create a Business");
		System.out.println("2. Edit Details for a business");
		System.out.println("3. Get Details for a business");
		System.out.println("4. Remove / Delete Business details");
		System.out.println("5. Back to previous menu");
		int option = 0;
		option = sc.nextInt();
		switch(option) {
			case 1: {
				this.createBusiness(getBusinessDetailsFromUser());
				break;
			}
			case 2: {
				// edit business
				break;
			}
			case 3: {
				System.out.println("Enter the business Id you wish to Read");
				Business searchedBusiness = getBusiness(sc.nextLine());
				System.out.println("Business ID : "+searchedBusiness.getBusinessId());
				System.out.println("Business Name : "+searchedBusiness.getBusinessName());
				System.out.println("Business Sector "+searchedBusiness.getBusinessSector());
				System.out.println("Business Revenue : "+searchedBusiness.getAnnualRevenue());
				System.out.println("Tax Identification : "+searchedBusiness.getTaxId());
				break;
			}
			case 4: {
				System.out.println("Enter the business Id you wish to delete");
				deleteBusiness(sc.nextLine());
				break;
			}
		}
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
		Business business = new Business();
		System.out.println("Please enter  Business Id");
		business.setBusinessId(sc.nextLine());
		System.out.println("Please enter Business Name");
		business.setBusinessName(sc.nextLine());
		System.out.println("Please enter Business Sector");
		business.setBusinessSector(sc.nextLine());
		System.out.println("Please enter Annual Revenue");
		business.setAnnualRevenue(sc.nextLine());
		System.out.println("Please enter Tax Id");
		business.setTaxId(sc.nextLine());
		return business;
	}
	

}
