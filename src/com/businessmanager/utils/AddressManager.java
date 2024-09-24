package com.businessmanager.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.businessmanager.entities.Address;

public class AddressManager {
	
	List<Address> addresses = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void manageAddress() {
		System.out.println("AddressManager.manageAddress");
	}
}
