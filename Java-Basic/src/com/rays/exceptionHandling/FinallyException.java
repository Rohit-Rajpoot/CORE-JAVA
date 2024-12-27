package com.rays.exceptionHandling;

public class FinallyException {
	public static void main(String[] args) {
		
        int num = 25;
		
		int a = 0;
		
		try {
			int c = num / a ;
			
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Exception - " + e.getMessage());
			
		}finally {
			
			System.out.println("Finally block runs even if exception comes or not");
		}
		
		System.out.println("Program is finally ended");
		
		
		
	}

}
