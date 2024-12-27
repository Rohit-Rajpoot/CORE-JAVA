package com.rays.oop;

public class TestBusinessman {
	
	public static void main(String[] args) {
		
		Richman r = new Businessman();
		
		r.donation();
		
		r.earnMoney();
		
		r.party();
		
		SocialWorker s = new Businessman();
		
		s.helpToOthers();
		
		Businessman b = new Businessman();
		
        b.setName("ROHAN BAJPAI");
        
        System.out.println("Name - " + b.getName());
		
		b.setAddress("INDORE");
		
		System.out.println("Address -" + b.getAddress());
		
		b.donation();
		
		b.earnMoney();
		
		b.helpToOthers();
		
		b.party();
		
		
		
	}

}
