package com.manager.business.entity;

import java.util.List;

public class Business {
	
	private String businessId;
	private String businessName;
	private String businessSector;
	private String annualRevenue;
	private String TaxId;
	private List<Customer> customers; // 1 to many
	
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessSector() {
		return businessSector;
	}
	public void setBusinessSector(String businessSector) {
		this.businessSector = businessSector;
	}
	public String getAnnualRevenue() {
		return annualRevenue;
	}
	public void setAnnualRevenue(String annualRevenue) {
		this.annualRevenue = annualRevenue;
	}
	public String getTaxId() {
		return TaxId;
	}
	public void setTaxId(String taxId) {
		TaxId = taxId;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
	
}
