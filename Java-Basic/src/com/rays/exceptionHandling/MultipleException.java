package com.rays.exceptionHandling;

import java.util.NoSuchElementException;

public class MultipleException {
	
	public static void main(String[] args) {
		
		String name = "Corporation" ;
		
		try {
			
			System.out.println(name.length());
			
			System.out.println(name.charAt(12));
			
		} catch (StringIndexOutOfBoundsException e) {
			
			System.out.println("Exception 1 - " + e.getMessage());
			
		} catch (NullPointerException e) {
			
			System.out.println("Excetion 2 - " + e.getMessage());
			
		}catch (NoSuchElementException e) {
			
			System.out.println("Excetion 3 - " + e.getMessage());
			
		}finally {
			
			System.out.println("Finally block runs even if exception comes or not");
		}
		
		System.out.println("Program Is Ended");
		
	}

}
