package com.rays.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(new Marksheet("104", "Ram", 56, 62, 72));
		list.add(new Marksheet("102", "Baldev", 55, 91, 63));
		list.add(new Marksheet("105", "Uday", 58, 73, 55));
		list.add(new Marksheet("103", "Aaman", 66, 85, 75));
		list.add(new Marksheet("101", "Pawan", 36, 42, 33));
		
		list.forEach(System.out::println);

		System.out.println("--------comparator start---------");

		System.out.println("----comapre by rollno-----");

		CompareByRollNo r = new CompareByRollNo();

		Collections.sort(list, r);

		list.forEach(System.out::println);

		System.out.println("----comapre by phy-----");

		CompareByPhy p = new CompareByPhy();

		Collections.sort(list, p);

		list.forEach(System.out::println);
		
		System.out.println("---------compare by name---------");
		
		CompareByName n = new CompareByName();
		
		Collections.sort(list, n);
		
		list.forEach(System.out::println);
	}
		

	 
	}

