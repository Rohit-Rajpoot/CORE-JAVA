package com.rays.collection;

public class Marksheet {
	
	private String rollNo;
	
	private String name;
	
	private int marks;
	
	public Marksheet() {
		// TODO Auto-generated constructor stub
	}
	
	public Marksheet(String rollNo,String name,int marks) {
		this.marks = marks;
		this.name = name;
		this.rollNo = rollNo;
	}
	
	
    public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Marksheet [rollNo = " + rollNo + ", name = " + name + ", marks = " + marks + "] ";
	}
	
	
	

}
