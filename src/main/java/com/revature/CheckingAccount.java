package com.revature;

public class CheckingAccount implements BankAccount {

	private double balance = 00.00;
	private long accountNumber;
	
	public CheckingAccount () {
		this.balance = 0.00;
		this.accountNumber = 34896526443560L;
	}
	
	
	
	
	public static void main (String[] args) {
		
		CheckingAccount a = new CheckingAccount();
		
		Admin peter = new Admin ("Peter");
		
		a.accessAccount(peter);
		
	}
	
	
	
	
	@Override
	public void accessAccount(User clearance) {
		
		String failed = "Please join our bank at any branch to begin storing your funds and assets.";
		String success = "Welcome, " + clearance.getName();
		
		switch (clearance.getClass().getSimpleName().toUpperCase()) {
			case "ADMIN":
				System.out.println(success);
				// showAdministratorMenu();
				break;
			case "TELLER":
				// showTellerMenu();
				System.out.println(success);
				break;
			case "HOLDER":
				// showHolderMenu();
				System.out.println(success);
				break;
			default:
				System.out.println(failed);
		}

	}
	
	/**
	 * @return the balance
	 */
	public double getBalance () {
		return this.balance;
	}
	
	/**
	 * Deposit money into the user account
	 */
	public void deposit (double amount) {
		this.balance += amount;
	}
	
	/**
	 * Withdraw money from the user account
	 */
	public void withdraw (double amount) {
		this.balance -= amount;
	}

	/**
	 * @return the accountNumber
	 */
	public long getAccountNumber () {
		return this.accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber (long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
