package com.java.oop.abstraction;


//COMPLETE ABSTRACTION
public interface SMTP {
	
	/**
	 * Searches for Domain Authority and Gets rights
	 * @return
	 */
	public String registerDomain();
	
	/**
	 * Captures Email address of receiver
	 * @return
	 */
	public String getReceipentsEmailAddress();
	
	/**
	 * Sends email and returns the status true if email delivered
	 * @return
	 */
	public boolean sendEmail();
	
}
