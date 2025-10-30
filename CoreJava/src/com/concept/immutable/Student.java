package com.concept.immutable;

public class Student {
	
	final private int id;
	final private String name;
	final private Address add;
	public Address getAdd() {
		return new Address(add.getAdd1(), add.getCity(), add.getPin());
//		return add;
	}

	final private  int getId() {
		return id;
	}

	public Student(int id, String name,Address add) {
		super();
		
		
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}




}
