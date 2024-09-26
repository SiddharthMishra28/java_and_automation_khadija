package com.businessmanager.entities;

import java.util.List;

public class Customer {
	
	private int id;
	private String customerName;
	private List<Address> addresses;
	
	public Customer(int id, String customerName) {
		this.id = id;
		this.customerName = customerName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", addresses=" + addresses + "]";
	}
	
}
