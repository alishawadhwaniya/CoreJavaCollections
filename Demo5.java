package com.mypracticeofcorejava.collections;

//LinkedList Demo

import java.util.LinkedList;

public class Demo5 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.add(1,15);
		System.out.println(ll);
		System.out.println(ll.getLast());
	}
}
