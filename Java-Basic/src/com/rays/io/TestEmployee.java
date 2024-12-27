package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {
	
	public static void main(String[] args) throws Exception, Exception {
		
		Employee e = new Employee("Rays", 1);

		// Serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/IO/employee.txt"));

		out.writeObject(e);

		out.close();

		// Deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/IO/employee.txt"));

		e = (Employee) in.readObject();

		System.out.println(e);

		in.close();
	}
}