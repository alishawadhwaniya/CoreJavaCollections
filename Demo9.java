package com.mypracticeofcorejava.collections;

import java.util.HashSet;
import java.util.Iterator;

//Storing Student4 obj using HashSet.

public class Demo9 {
	public static void main(String[] args) {
		HashSet<Student4> hs=new HashSet<>();
		hs.add(new Student4(101,"Raju",1));
		hs.add(new Student4(102,"Rani",2));
		hs.add(new Student4(103,"Nadiya",3));
		hs.add(new Student4(104,"Krish",4));
		hs.add(new Student4(105,"Krish",5));
		
		Iterator<Student4> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
