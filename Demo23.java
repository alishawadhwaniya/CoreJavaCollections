package com.mypracticeofcorejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Fail Fast HashMap

public class Demo23 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1,"Raju");
		hm.put(2,"Rani");
		hm.put(3, "Amee");
		hm.put(4,"Amy");
		
		Set<Integer> keys=hm.keySet();
		Iterator<Integer> i=keys.iterator();
		while(i.hasNext()) {
			int key=i.next();
			System.out.println(key);
			System.out.println(hm.get(key));
			hm.put(5,"Nani");
		}
	}
}
