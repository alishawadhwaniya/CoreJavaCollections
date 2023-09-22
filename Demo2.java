package com.mypracticeofcorejava.collections;

import java.util.ArrayList;
import java.util.List;

//ArrayList methods demo

public class Demo2 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(null);
		l1.add(200);
		System.out.println(l1);
		l1.add(1,600);
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.contains(600));
		System.out.println(l1.indexOf(200));
		System.out.println(l1.lastIndexOf(200));
		l1.remove(0);
		System.out.println(l1);
		System.out.println(l1.get(4));
		l1.set(0, 1000);
		System.out.println(l1);
		List l2=new ArrayList();
		l2.add(111);
		l2.add(112);
		l2.add(400);
		l2.add(600);
		System.out.println(l2);
		l2.addAll(l1);
		System.out.println(l2);
		l2.addAll(0,l1);
		System.out.println(l2);
		System.out.println(l2.retainAll(l1));
		System.out.println(l1);
		l1.clear();
		l2.clear();
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1.isEmpty());
	}
}
