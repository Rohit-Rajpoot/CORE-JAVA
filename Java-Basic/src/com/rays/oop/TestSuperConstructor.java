package com.rays.oop;

public class TestSuperConstructor extends ConstructorCalling{
	
	public TestSuperConstructor() {
	
	}
	
	public TestSuperConstructor(String name, String address, String mobileNo) {
		super(name, address, mobileNo);
	}
	
	public static void main(String[] args) {
		
		TestSuperConstructor t = new TestSuperConstructor("Divyansh", "Delhi,Inda", "8989783333");
	}

}
