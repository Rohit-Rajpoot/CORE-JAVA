package com.rays.threads;

public class Account {
	
	private int balance;

	public int getBalance() throws Exception {
		
		Thread.sleep(1000);
		return balance;
	}

	public void setBalance(int balance) throws Exception {
		Thread.sleep(1000);
		this.balance = balance;
	}
	
	public void deposit( String name ,int amount) throws Exception {	
		
		synchronized (this) {
			
			int total = balance + amount ;
			
			setBalance(total);
			
		}
		
		System.out.println(name +" " + balance);
		
	}
	
//	public synchronized void deposit(String name , int amount) throws Exception {
//		
//		int total = balance + amount;
//		
//		setBalance(total);
//		
//		System.out.println(name + " " + total);
//		
//	}	
	
	
	
}



	
	