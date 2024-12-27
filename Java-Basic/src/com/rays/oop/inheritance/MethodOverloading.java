package com.rays.oop.inheritance;

public class MethodOverloading {
	
	public MethodOverloading() {
		
	}
		
    public MethodOverloading(int a,int b) {
    	
    	System.out.println("Sum of two number = " + (a + b));
		
	}

    public MethodOverloading(double a,double b) {
    	
    	System.out.println("multiple of two number = " + (a * b));
	
    }
    
    
    public MethodOverloading(int a,int b,int c) {
    	
    	System.out.println("Sum of two num divisible by third = " + ((a + b) / c));
		
   	}
	
	

}
