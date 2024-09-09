package com.java.oop.abstraction;

public class BankOfAmerica extends CoreBanking {

	@Override
	public double calculateQuaterlyInterest() {
		this.Balance = (0.04 * this.Balance) + this.Balance;
		return this.Balance;
	}

	@Override
	public double calculateLoanEligibilityAmount() {
		return this.Balance * 10;
	}
	
	public static void main(String[] args) {
		CoreBanking bankOfAmeria = new BankOfAmerica();
		bankOfAmeria.accountHolder = "sid";
		bankOfAmeria.Balance = 10000;
		bankOfAmeria.debit(575);
		bankOfAmeria.crdit(255);
		System.out.println(bankOfAmeria.calculateLoanEligibilityAmount());;
	}

}
