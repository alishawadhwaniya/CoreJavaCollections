package com.mypracticeofcorejava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Map and its methods demo: Storing Student4 obj in it.

public class Demo13 {
	public static void main(String[] args) {
		
		Student4 s1=new Student4(101,"Raju",1);
		Student4 s2=new Student4(102,"Rani",2);
		Student4 s3=new Student4(103,"Aman",3);
		
		
		Map<Integer,Student4> map=new HashMap<>();
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		
		Set<Integer> key=map.keySet();
		for(Integer i:key) {
			System.out.println(i+"="+map.get(i));
		}
		
		Set<Entry<Integer,Student4>> entryset=map.entrySet();
		for(Entry<Integer,Student4> e:entryset) {
			System.out.println(e.getKey()+"--"+e.getValue());
		}
	}
}
