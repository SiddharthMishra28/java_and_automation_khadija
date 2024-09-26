package com.businessmanager.entities;

import java.util.ArrayList;
import java.util.List;

public class Business {
	
	private int id;
	private String businessName;
	private List<Customer> customers = new ArrayList<>();
	
	public Business(int id, String businessName) {
		this.id = id;
		this.businessName = businessName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}

	@Override
	public String toString() {
		return "Business [id=" + id + ", businessName=" + businessName + ", customers=" + customers + "]";
	}
	
}
