package com.mypracticeofcorejava.collections;

import java.util.TreeMap;

//TreeMap demo

public class Demo14 {
	public static void main(String[] args) {
		TreeMap<String, Integer> map=new TreeMap<>();
		map.put("Raju", 101);
		map.put("Ashok", 102);
		map.put("Rani", 103);
		System.out.println(map);
	}
}
