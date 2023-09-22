package com.mypracticeofcorejava.collections;

import java.util.LinkedHashSet;

//LinkedHashSet

public class Demo10 {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(null);
		lhs.add(20);
		System.out.println(lhs);
	}
}
