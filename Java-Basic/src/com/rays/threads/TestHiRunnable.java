package com.rays.threads;

public class TestHiRunnable {
	
	public static void main(String[] args) {
		
//		Runnable interface does not have start method so we make a thread object and hold Runnable class into it so that start method can be used
		
		Thread t1 = new Thread(new HiRunnable("HELLO"));
		
		Thread t2 = new Thread(new HiRunnable("BYEE"));
		
		t1.start();
		
		t2.start();
	}

}
