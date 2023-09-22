package com.mypracticeofcorejava.collections;

import java.util.ArrayList;
import java.util.ListIterator;

//storing object in arraylist and retrieving it using iterator and listiterator.

public class Demo4 {
	public static void main(String[] args) {
		ArrayList<Student4> al=new ArrayList<>();
		al.add(new Student4(1,"Raju",101));
		al.add(new Student4(2,"Rani",102));
		al.add(new Student4(3,"Nadiya",103));
		al.add(new Student4(4,"Aman",104));
		System.out.println("Approach one using for each loop====");
		for(Student4 s : al) {
			System.out.println(s);
		}
		System.out.println("Approach two using ListIterator");
		ListIterator<Student4> listIterator = al.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
