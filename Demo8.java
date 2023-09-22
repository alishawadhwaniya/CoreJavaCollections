package com.mypracticeofcorejava.collections;

import java.util.HashSet;
import java.util.Iterator;

//Set implementation class:- HashSet

public class Demo8 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("three");
		hs.add(null);
		System.out.println(hs);
		hs.remove("three");
		System.out.println(hs);
		
		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
