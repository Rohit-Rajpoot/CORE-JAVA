package com.rays.threads;

public class HelloDaemon extends Thread{
	
	String name ;
	
	public HelloDaemon(String name) {
		
		this.name = name;
	}
	
	@Override
	public void run() {
		
		while(true){
				
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(name);
			}
		}
	}


