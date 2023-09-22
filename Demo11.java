package com.mypracticeofcorejava.collections;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet demo

public class Demo11 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("Raja");
		ts.add("Rani");
		ts.add("Rani");
		ts.add("Ashok");
		System.out.println(ts);
		Iterator iterator = ts.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
