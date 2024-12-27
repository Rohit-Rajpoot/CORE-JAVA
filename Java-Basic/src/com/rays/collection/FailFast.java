package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();

		list.add("abc");
		list.add(52);
		list.add('a');

		// fail fast
		Iterator it = list.iterator();

		// If we add any value in ArrayList after the Iterator object is created we get a ConcurrentModificationException
        // list.add(true);

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
