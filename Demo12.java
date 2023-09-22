package com.mypracticeofcorejava.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Map interface and its methods demo

public class Demo12 {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1,"Raju");
		map.put(2,"Rani");
		map.put(3,"Aman");
		map.put(3,"David");
		map.put(4,"Neha");
		map.put(5,"nargish");
		map.put(6,"Mukesh");
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Rani"));
		map.remove(2);
		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		for(Integer i:keys) {
			System.out.println(i+"--"+map.get(i));
		}
		
		Collection<String> values=map.values();
		for(String s:values) {
			System.out.println(s);
		}
		
		Set<Entry<Integer,String>> entryset=map.entrySet();
		Iterator<Entry<Integer,String>> itr =entryset.iterator();
		while(itr.hasNext()) {
			Entry<Integer,String> entry=itr.next();
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}
		
		for(Entry<Integer,String> entry:entryset) {
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map.size());
	}
}
