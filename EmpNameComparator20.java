package com.mypracticeofcorejava.collections;

import java.util.Comparator;

public class EmpNameComparator20 implements Comparator<Employee20> {
	@Override
	public int compare(Employee20 e1, Employee20 e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}
}
