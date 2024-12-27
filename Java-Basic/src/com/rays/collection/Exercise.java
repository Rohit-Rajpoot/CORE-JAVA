package com.rays.collection;

import java.util.ArrayList;

public class Exercise {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add("One");
		a.add("Two");
		a.add("Three");
		
		Integer i = new Integer(4);
		
		a.add(i);
		
		Integer value = (Integer)a.get(3);
		
		System.out.println("Index 3 value = " + value);
		
		
	
	}

}
