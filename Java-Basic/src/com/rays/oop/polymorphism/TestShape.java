package com.rays.oop.polymorphism;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		
		
		s[0] = new Circle(4);
		s[1] = new Rectangle(12, 16);
		s[2] = new Triangle(7,12);
		
		System.out.println("Total Area = " + calculateArea(s));
		
	
	}
	
	public static double calculateArea(Shape[] s) {
		
		double area = 0;
		
		for (int i = 0; i < s.length; i++) {
			
			area = area + s[i].area() ;
			
		}
		
		return area;
		
	}
}
