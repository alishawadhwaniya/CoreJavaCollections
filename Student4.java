package com.mypracticeofcorejava.collections;

public class Student4 implements Comparable<Student4>{
	int id;
	String name;
	int rank;
	public Student4(int id,String name,int rank) {
		this.id=id;
		this.name=name;
		this.rank=rank;
	}
	
	
	@Override
	public String toString() {
		return "Student4 [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	
	@Override
	public int compareTo(Student4 s) {
		// TODO Auto-generated method stub
		//return this.id-s.id;// when we call Collections.sort(al) the compareTo method is called on pairs of objects
//		                       that is this will happen first-element-of-al.compareTo(2nd-element-of-al) and hence the first
//		                       element will become the current one that is this.id and so on and so forth.
		return this.name.compareTo(s.name);
//		return this.rank-s.rank;
	}
}
