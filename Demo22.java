package com.mypracticeofcorejava.collections;

import java.util.concurrent.CopyOnWriteArrayList;

//Fail Safe Collection.

public class Demo22 {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> al=new CopyOnWriteArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		for(Integer i:al) {
			System.out.println(i);
			if(i==100) {
				al.add(150);
			}
		}
		System.out.println(al);
	}
}
