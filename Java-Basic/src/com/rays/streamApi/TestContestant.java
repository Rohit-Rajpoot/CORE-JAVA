package com.rays.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestant {
	
	public static void main(String[] args) {
		
		ArrayList<Contestant> list = new ArrayList<Contestant>();
		
		list.add(new Contestant("Rahul", "9876543211"));
		list.add(new Contestant("Aditya", "8765432198"));
		list.add(new Contestant("Varun", "6784537839"));
		list.add(new Contestant("Ashish", "9457932888"));
		list.add(new Contestant("Tanmay", "9876543211"));
		list.add(new Contestant("Ruhaan", "9274944899"));
		list.add(new Contestant("Sumit", "98354774"));
		
//		Get the Phone Number
		
		list.stream().map(e -> e.phoneNo).distinct().filter(e -> e.length() == 10).collect(Collectors.collectingAndThen(Collectors.toList(), e ->{
			
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(System.out::println);
	}

}
