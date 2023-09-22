package com.mypracticeofcorejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Demo to show that Collections.sort(al) method works on al to sort if and only if all the elements in the list implement Comparable interface.

public class Demo19 {
	public static void main(String[] args) {
		List<Student4> al=new ArrayList<>();
		al.add(new Student4(101,"Raju",3));
		al.add(new Student4(104,"Rani",4));
		al.add(new Student4(103,"Shweta",5));
		al.add(new Student4(102,"Kaju",1));
		al.add(new Student4(105,"Sanju",2));
		
//		Collections.sort(al);//this will give error when Student4 doesn't implement comparable interface.
		Collections.sort(al);
		
		for(Student4 s:al) {
			System.out.println(s);
		}
		
	}
}
