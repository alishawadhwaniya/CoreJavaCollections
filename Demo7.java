package com.mypracticeofcorejava.collections;

import java.util.Enumeration;
import java.util.Stack;

//Stack Demo

public class Demo7 {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		
		Enumeration elements = s.elements();
		
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
	}
}
