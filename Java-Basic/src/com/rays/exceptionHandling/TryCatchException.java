package com.rays.exceptionHandling;

public class TryCatchException{
	
	public static void main(String[] args) {
		
		int num = 25;
		
		int a = 0;
		
		try {
			int c = num / a ;
			
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Exception - " + e.getMessage());
		}
		
		System.out.println("Program is finally ended");
		
	}

}
