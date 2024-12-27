package com.rays.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
	
	String name;
	int id;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
}
