package com.rays.oop;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Accounts a = new Accounts();
		
		a.setNumber("ROH12345678");
		a.setAccountType("Saving");
		a.setBalance(100000.00);
		
		
		System.out.println("Account Number - " + a.getNumber());
		System.out.println("Account Type - " + a.getAccountType());
		System.out.println("Total Balance - " + a.getBalance());
		
		
		a.deposit(5000.00);
		
		System.out.println("Balance After Deposit - " + a.getBalance());
		
		a.fundTransfer(10000.00);
		
		System.out.println("Balance After Fund Transfer - " + a.getBalance());
		
		a.payBills(7000.00);
		
		System.out.println("Balance After Pay Bills - " + a.getBalance());
		
		a.withdrawal(25000.00);
		
		System.out.println("Balance After Withdrawal - " + a.getBalance());
		
		
	}

}
