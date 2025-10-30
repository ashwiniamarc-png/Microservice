package com.concept.immutable;

public class StudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Address add = new Address("tirth", "TB", 416003);
		System.out.println("Add hash code "+add.hashCode());
		Student ashwini = new Student(1,"Ashwini",add);
		
//		ashwini.setId(1);
//ashwini.setName("Ashwini");
System.out.println(ashwini);
Address home = ashwini.getAdd();
System.out.println("home hash code "+home.hashCode());
home.setAdd1("nagala ");
//ashwini.setId(2);
//ashwini.setName("Sona");
System.out.println(ashwini);

	}

}
