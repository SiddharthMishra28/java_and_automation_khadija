package com.java.oop.abstraction;

public class Outlook implements SMTP{

	@Override
	public String registerDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getReceipentsEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean sendEmail() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		SMTP gmail = new Outlook();
		gmail.registerDomain();
		gmail.sendEmail();
		
		Outlook outlookClient = new Outlook();
		outlookClient.sendEmail();
	}

}
