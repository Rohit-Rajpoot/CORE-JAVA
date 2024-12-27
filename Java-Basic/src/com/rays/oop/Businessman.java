package com.rays.oop;

public class Businessman extends Person1 implements Richman,SocialWorker {

	@Override
	public void helpToOthers() {
		
		System.out.println("Let's go we have a opportunity to help others");
	}

	@Override
	public void earnMoney() {
		
		System.out.println("We need to work hard for earning more money");
		
	}

	@Override
	public void donation() {
		
		System.out.println("We will donate some money to the Orphanage");
		
	}

	@Override
	public void party() {
		
		System.out.println("Complete your work fast we have a party tonight");
		
	}

}
