package com.rays.oop;

public class ConstructorCalling {
	
	private String name ;
	
	private String address ;
	
	private String mobileNo ;
	
	public ConstructorCalling() {
		
		System.out.println("This is default constructor");
		
	}
	
    public ConstructorCalling(String name, String address) {
    	
    	this();
    	
    	this.name = name;
    	
    	this.address = address;
    	
    	System.out.println("Name - " + this.name);
    	System.out.println("Addres - " + this.address);
		
	}

    public ConstructorCalling(String name, String address, String mobileNo) {
    	
    	this(name, address);
    	
    	this.mobileNo = mobileNo;
    	
    	System.out.println("Mobile Number - " + this.mobileNo);
	
    }

}
