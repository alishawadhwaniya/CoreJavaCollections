package com.mypracticeofcorejava.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

//IdentityHashMap and HashMap difference

public class Demo25 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("ashok", 1);
		hm.put("aman", 2);
		hm.put("mukesh", 3);
		hm.put(new String("ashok"), 4);//hashmap uses equals method to find out if two keys are same and then if they are same then replaces.
//		equals method compares the content of the keys 
		System.out.println(hm);
		System.out.println("============");
		IdentityHashMap<String, Integer> ihm=new IdentityHashMap<>();
		ihm.put("ashok", 1);
		ihm.put("aman", 2);
		ihm.put("mukesh", 3);
		ihm.put(new String("ashok"), 4);//this will be added 
		ihm.put("ashok", 5);
		System.out.println(ihm);
	}
}
