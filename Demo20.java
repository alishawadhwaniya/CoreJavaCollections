package com.mypracticeofcorejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparator Demo

public class Demo20 {
	public static void main(String[] args) {
		ArrayList<Employee20> emps=new ArrayList<>();
		
		emps.add(new Employee20(101, "David", 15000.00));
		emps.add(new Employee20(105, "Putin", 25000.00));
		emps.add(new Employee20(103, "Cathy", 45000.00));
		emps.add(new Employee20(104, "Anny", 35000.00));
		
		Collections.sort(emps,new EmpIdComparator20());
		Collections.sort(emps,new EmpNameComparator20());
		
		Collections.sort(emps,new Comparator<Employee20>() {
			@Override
			public int compare(Employee20 e1, Employee20 e2) {
				// TODO Auto-generated method stub
//				if(e1.salary>e2.salary) {
//					return -1;
//				}else if(e1.salary<e2.salary) {
//					return 1;
//				}else {
//					return 0;
//				}
				return (int)e2.salary-(int)e1.salary;
			}
		});
		
		for(Employee20 e:emps) {
			System.out.println(e);
		}
	}
}
