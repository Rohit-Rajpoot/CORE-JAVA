package com.rays.oop.polymorphism;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank[] b = new Bank[3];
		
		b[0] = new AxisBank();
		
		b[1] = new HdfcBank();
		
		b[2] = new IciciBank();
		
		
	b[0].setInterestRate(12.0);
	b[0].setName("AXIS BANK");
	
	System.out.println("Bank Name - " + b[0].getName());
	
	System.out.println("Interest Rate - " + b[0].getInterestRate());
	
	System.out.println("-------------------------------------");
	
	
	b[1].setInterestRate(11.0);
	b[1].setName("HDFC BANK");
	
    System.out.println("Bank Name - " + b[1].getName());
	
	System.out.println("Interest Rate - " + b[1].getInterestRate());
	
	System.out.println("-------------------------------------");
	
	
	b[2].setInterestRate(10.5);
	b[2].setName("ICICI BANK");
	
    System.out.println("Bank Name - " + b[2].getName());
	
	System.out.println("Interest Rate - " + b[2].getInterestRate());
	
	System.out.println("-------------------------------------");
	
	
	
	
	
		
		
	}

}
