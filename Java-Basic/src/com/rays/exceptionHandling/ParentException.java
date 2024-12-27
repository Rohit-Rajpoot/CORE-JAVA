package com.rays.exceptionHandling;

public class ParentException {
	
	public static void main(String[] args) {
		
		String name = "Android" ;
		
		try {
			
			System.out.println("Name Length - " + name.length());
			
			System.out.println("Name Value - " + name.charAt(8));
			
		} catch (RuntimeException e) {
			
			System.out.println("Exception - " + e.getMessage());
			
		}finally {
			
			System.out.println("Used Parent Exception Here");
		}
		
		System.out.println("Parent class of Runtime Exception is Exception");
	}

}
