package com.rays.threads;

public class HelloThread extends Thread{
	
	String name;
	
	public HelloThread() {
		// TODO Auto-generated constructor stub
	}
	
	public HelloThread(String name) {
		
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i = 1 ; i <=5 ; i++) {
			
			System.out.println(i + "Thread : " + name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
