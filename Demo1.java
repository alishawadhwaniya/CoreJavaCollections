package com.mypracticeofcorejava.collections;

import java.util.ArrayList;

//ArrayList Demo

public class Demo1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(100.5);
		al.add(true);
		al.add("Hello");
		System.out.println(al);
		System.out.println("size before removal: "+al.size());
		al.remove(0);
		System.out.println("Size after removal: "+al.size());
	}
}
