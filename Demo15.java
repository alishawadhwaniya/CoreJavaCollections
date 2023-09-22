package com.mypracticeofcorejava.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

//Queue Interface PriorityQueue

public class Demo15 {
	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<>();
		q.add("Mukesh");
		q.add("Aman");
		q.add("Ashok");
		q.add("Dilip");
		
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		Iterator<String> itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
