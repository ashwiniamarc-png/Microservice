package com.concept.java8.interFace;

public class Impl1 implements DemoInterface{

	public static void main(String[] args) {
		
		
		Impl1 obj1 = new Impl1();
		System.out.println(obj1.getRegular());
		
		System.out.println(obj1.getDefault());
		
//		System.out.println(obj1.get);
//		obj1.getArea();

	}

	@Override
	public int getRegular() {
		// TODO Auto-generated method stub
		return 22;
	}

	
//	public int getDefault() {
//		
//		System.out.println("In class getSize");
//		return 11;
//	}

}
