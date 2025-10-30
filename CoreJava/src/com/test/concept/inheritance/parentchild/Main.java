package com.test.concept.inheritance.parentchild;



//if both parent and child class contains  method
//then object call method from child;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();
		p.test();
		
		
		
		Child c = new Child();
		System.out.println("hi :"+c.i);
		System.out.println("hi child object :"+c.getNum());
		System.out.println("hi parent object :"+p.getNum());


	}

}
