package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Queue;


public class QueueInterface {
	
	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		q.offer(99);
		q.add(true);
		q.offer(44.44);
		q.add("HHHHHH");
		q.offer(77);
		
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		q.peek();

		System.out.println(q);
		System.out.println(q);
		System.out.println(q);
		System.out.println(q);
		System.out.println(q);
		
		
	}

}
