package com.rays.oop;

import java.util.Date;

public class Person {

	private String name;
	private String address;
	private Date dob;

	public void setName(String name) {

		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String address) {

		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setDob(Date dob) {

		this.dob = dob;
	}
	
	public Date getDob() {
		return this.dob;
	}

}
