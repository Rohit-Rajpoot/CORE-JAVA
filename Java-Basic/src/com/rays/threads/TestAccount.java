package com.rays.threads;

public class TestAccount extends Thread{
	
	private String name;
	
	public static Account a = new Account();

	public TestAccount(String name) {
		
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		
		for(int i = 1 ; i <= 5 ; i++) {
			
			try {
				a.deposit(name, 1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	public static void main(String[] args) {
		
		TestAccount t1 = new TestAccount("Rohan");
		
		TestAccount t2 = new TestAccount("Sohan");
		
		t1.start();
		t2.start();
	}
}

