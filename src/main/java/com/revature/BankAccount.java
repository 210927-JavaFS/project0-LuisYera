package com.revature;

public interface BankAccount {
	
	public void accessAccount(User clearance);
	public double getBalance();
	public void deposit (double amount);
	public void withdraw (double amount);
	
}
