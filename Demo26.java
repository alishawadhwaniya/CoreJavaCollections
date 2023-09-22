package com.mypracticeofcorejava.collections;

import java.util.WeakHashMap;

public class Demo26 {
	public static void main(String[] args) {
		WeakHashMap<Integer,String> whm=new WeakHashMap<>();
		whm.put(1,"aman");
		whm.put(2,"hello");
		whm.put(3,"hi");
		whm.put(4,"java");
		System.out.println(whm);
	}
}
