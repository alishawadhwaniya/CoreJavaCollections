package com.mypracticeofcorejava.collections;

import java.util.ArrayList;
import java.util.Collections;

//Collections class

public class Demo18 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		al.add(5);
		System.out.println("before sorting: "+al);
		Collections.sort(al);
		System.out.println("After sorting: "+al);
		Collections.reverse(al);
		System.out.println("after reverse: "+al);
	}
}
