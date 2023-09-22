package com.mypracticeofcorejava.collections;

import java.util.ArrayList;

//Fail Fast Collection:- gives error when we try to modify collection during traversing it

public class Demo21 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
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
