package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Businessman b = new Businessman();

		Doctor d = new Doctor();

		Student s = new Student();
		

		b.setName("ARUN");
		
		b.setDateOfBirth(sdf.parse("1995-07-12"));

		b.setAddress("INDORE");

		b.setIncome(250000.00);
		
		

		System.out.println("Businessman Name - " + b.getName());
		
		System.out.println("Date Of Birth " + b.getDateOfBirth());

		System.out.println("Address - " + b.getAddress());

		System.out.println("Income - " + b.getIncome());
		

		d.setName("ROHAN");
		
		d.setDateOfBirth(sdf.parse("1990-02-16"));

		d.setAddress("MUMBAI");

		d.setRegistrationNo("DOC34567890");

		System.out.println("Doctor Name - " + d.getName());
		
		System.out.println("Date Of Birth " + d.getDateOfBirth());

		System.out.println("Address - " + d.getAddress());

		System.out.println("Registration Number - " + d.getRegistrationNo());
		

		s.setName("SOHAN");
		
		s.setDateOfBirth(sdf.parse("2000-12-24"));

		s.setAddress("DELHI");

		s.setRollNo("STU007");

		s.setMarks(78);
		

		System.out.println("Student Name - " + s.getName());
		
		System.out.println("Date Of Birth " + s.getDateOfBirth());

		System.out.println("Address - " + s.getAddress());

		System.out.println("Roll Number - " + s.getRollNo());

		System.out.println("Marks - " + s.getMarks());

	}

}
