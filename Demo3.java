package com.mypracticeofcorejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//methods to retrieve data from ArrayList:-

public class Demo3 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("Approach 1===for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("Approach 2===forEach loop");
		for(Object obj:al) {
			System.out.println(obj);
		}
		System.out.println("Approach 3===Iterator");
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("approach 5====ListIterator method");
		ListIterator<Integer> listIterator = al.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("approach 5====foreach method");
		al.forEach(i -> {
			System.out.println(i);
		});
	}
}
