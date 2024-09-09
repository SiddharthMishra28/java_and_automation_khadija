package com.java.oop.abstraction;

// PARTIAL ABSTRACTION
public abstract class CoreBanking {
	
	String accountHolder;
	double Balance;
	
	public double deposit(double moneyValue) {
		Balance = Balance + moneyValue;
		return Balance;
	}
	
	public void debit(double amountToDebit) {
		Balance = Balance - amountToDebit;
		System.out.println("Balance After Debit is "+Balance);
	}
	
	public void crdit(double amountToCredit) {
		Balance = Balance + amountToCredit;
		System.out.println("Balance After Credit is "+Balance);
	}
	
	public abstract double calculateQuaterlyInterest();
	
	public abstract double calculateLoanEligibilityAmount();
}
