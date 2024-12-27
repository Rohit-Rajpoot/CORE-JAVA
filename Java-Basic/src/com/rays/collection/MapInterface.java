package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();

		m.put("1", 88);
		m.put("2", "HELLO");
		m.put("3", true);

		System.out.println(m.get("1"));
		System.out.println(m.get("2"));
		System.out.println(m.get("3"));

	}

}
