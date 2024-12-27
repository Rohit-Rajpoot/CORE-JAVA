package com.rays.collection;

public class Student {
	
	private String name;
	private String address;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String address) {

		this.name = name;
		this.address = address;

	}

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + " ";
	}

}
