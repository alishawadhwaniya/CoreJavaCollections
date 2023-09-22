package com.mypracticeofcorejava.collections;

import java.util.ArrayDeque;

//Deque ArrayDeque Demo.

public class Demo16 {
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("Mukesh");
		ad.add("Nargish");
		ad.add("Aman");
		ad.add("Nadiya");
		System.out.println(ad);
		ad.addFirst("One");
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);
	}
}
