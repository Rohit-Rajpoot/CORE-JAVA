package com.rays.oop;

public class Accounts {
	
	private String number;
	
	private String accountType;
	
	private Double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		
		this.balance = this.balance + amount;
		
	}
	
    public void withdrawal(double amount) {
		
		this.balance = this.balance - amount;
		
	}

    public void fundTransfer(double amount) {
		
		this.balance = this.balance - amount;
		
	}

    public void payBills(double amount) {
		
		this.balance = this.balance - amount;
		
	}
	
	

}
