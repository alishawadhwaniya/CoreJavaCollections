package com.mypracticeofcorejava.collections;

import java.util.Scanner;
import java.util.StringTokenizer;

//StringTokenizer and Scanner Classes

public class Demo27 {
	public static void main(String[] args) {
		String s="Java programming language";
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num: ");
		int i=sc.nextInt();
		System.out.println("Enter second num: ");
		int j=sc.nextInt();
		System.out.println("sum is "+(i+j));
		sc.close();
	}
}
