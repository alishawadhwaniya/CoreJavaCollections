package com.mypracticeofcorejava.collections;

//For Demo20

public class Employee20 {
	int id;
	String name;
	double salary;

	public Employee20(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee20 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
