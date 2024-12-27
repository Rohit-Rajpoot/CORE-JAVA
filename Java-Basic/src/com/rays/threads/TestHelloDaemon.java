package com.rays.threads;

public class TestHelloDaemon {
	
	public static void main(String[] args) throws Exception {
		
		HelloDaemon h = new HelloDaemon("Daemon Thread....");
		
		h.setDaemon(true);
		
		h.start();
		
		for(int i = 1 ; i <= 5 ; i++) {
			
			Thread.sleep(1000);
			
			System.out.println("main");
		}
	}

}
