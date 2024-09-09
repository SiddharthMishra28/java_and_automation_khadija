package com.java.oop.encapsulation;

public class Profile {
	
	public String firstName;
	public String lastName;
	private String phone;
	protected String email;
	public int age;
	private double salary;
	private String password;
	
	// GETTERS AND SETTERS
	// READ        WRITE
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phoneNumber) {
		this.phone = phoneNumber;
	}
	
	public void setPassword(String password) {
		if(password.length() < 8) {
			System.out.println("Invalid password! length should be minimum 8");
		}else {
			this.password = password;
		}
	}
	
}
