package com.rays.oop;

public class TestAutomobiles {
	
	public static void main(String[] args) {
		
		Automobiles a =new Automobiles();
		
		a.setColor("Black");
		a.setMake("Honda City");
		a.setSpeed(75);
		
		System.out.println("Color Of Model -" + a.getColor());
		
		System.out.println("Model Name - " + a.getMake());
		
		System.out.println("Speed Km/h - " + a.getSpeed());
	}

}
