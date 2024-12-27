package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();

		list.add(new Student("Ram", "Indore"));
		list.add(new Student("Shyam", "Bhopal"));
		list.add(new Student("Aaman", "Ujjain"));
		list.add(new Student("Raman", "Indore"));

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		
	}

}
