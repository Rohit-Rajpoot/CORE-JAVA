package com.rays.threads;

public class TestHelloThread {
	
	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread("Rohan");
		
		HelloThread t2 = new HelloThread("Sohan");
		
		t1.setPriority(8);
		
		t1.start();
		
		t2.start();
		
	}

}
