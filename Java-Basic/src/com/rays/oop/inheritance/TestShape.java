package com.rays.oop.inheritance;

public class TestShape {
	
	public static void main(String[] args) {
		
		
		
		Circle c = new Circle();
		
		Rectangle r = new Rectangle();
		
		Triangle t = new Triangle();

		c.setColor("RED");
		c.setBorderWidth(5);
		c.setRadius(2);

		System.out.println("color = " + c.getColor());
		System.out.println("BorderWidth = " + c.getBorderWidth());
		System.out.println("radius = " + c.getRadius());
		System.out.println("area = " + c.area());
		
		
		r.setColor("BLUE");
		r.setBorderWidth(10);
		r.setLenght(5);
		r.setWidth(5);

		System.out.println("color = " + r.getColor());
		System.out.println("borderwidth = " + r.getBorderWidth());
		System.out.println("lenght = " + r.getLenght());
		System.out.println("width = " + r.getWidth());
		System.out.println("area = " + r.area());
		
		t.setColor("BLACK");
		t.setBorderWidth(3);
		t.setBase(8);
		t.setHeight(12);
		
		System.out.println("color = " + t.getColor());
		System.out.println("borderwidth = " + t.getBorderWidth());
		System.out.println("base = " + t.getBase());
		System.out.println("height = " + t.getHeight());
		System.out.println("area = " + t.area());

	}

}
