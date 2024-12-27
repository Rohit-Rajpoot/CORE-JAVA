package com.rays.streamApi;

import java.util.ArrayList;
import java.util.List;

public class TestStreamByFilterFunction {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		list.add("kamal");
		list.add("aman");
		list.add("pawan");
		list.add("tarun");
		list.add("uday");
		list.add("tanmay");
		list.add("tanmay");

		System.out.println("List: " + list);
		
		// list.forEach(System.out::println);
		
		list.forEach(e -> System.out.println(e));
		
		System.out.println("-----filter fucntion-----");
		
		System.out.println("list start with t");
		
		list.stream().filter(e -> e.startsWith("t")).forEach(System.out::println);
		
		System.out.println("----------LIMIT FUNCTION-----------");
		
		list.stream().limit(5).forEach(System.out::println);

	}
		
		
}

