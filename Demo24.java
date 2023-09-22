package com.mypracticeofcorejava.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

//ConcurrentHashMap

public class Demo24 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<>();
		chm.put(1,"aman");
		chm.put(2,"alisha");
		chm.put(3,"mukesh");
		chm.put(4,"nargish");
		
		Set<Integer> keys=chm.keySet();
		Iterator<Integer> i=keys.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			chm.put(5,"nadiya");
		}
		System.out.println(chm);
	}
}
