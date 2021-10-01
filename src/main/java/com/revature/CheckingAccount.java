package com.revature;

public class CheckingAccount {

	private String accountNumber;
	private double balance;

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Deposit money into the user account
	 */
	public void deposit (double amount) {
		setBalance(this.balance += amount);
	}
	
	/**
	 * Withdraw money from the user account
	 */
	public void withdraw (double amount) {
		setBalance(this.balance -= amount);
	}
	
}
