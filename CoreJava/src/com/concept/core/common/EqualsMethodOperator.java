package com.concept.core.common;

public class EqualsMethodOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="abc";
		String s2="abc";
		System.out.println("s1.equals---(s2)"+s1.equals(s2));
		
		
		boolean b = s1==s2; 
		System.out.println("s1==s2 =======UUUULLLL"+b);
		
		TestObj t1 = new TestObj(1);
		TestObj t2 = new TestObj(1);
		
		System.out.println("object comparision "+t1.equals(t2));
		
		
		 b = t1==t2; 
		System.out.println("comparing ref "+b);
		
		
//		String s3 = s1;
//		s1="abc1";
//		
//		b = s1==s3; 
//		System.out.println("s1==s2 =======UUUULLLL"+b);
//		System.out.println("s1.equals(s2)"+s1.equals(s3));
//		
//		System.out.println("s1==s2 "+s1==s2);
//		
//		System.out.println("s1.equals(s2) CHANGE"+s1.equals(s2));
		
//		String s3 = new String("abc");
//		String s4 = new String("abc");
//		System.out.println("s3.equals(s4)"+s3.equals(s4));
//		System.out.println("s3==s4 "+s3==s4);
		
//		
//		Object ob1 = new Object();
//		Object ob2 = new Object();
//		Object ob3 = ob1;
//		System.out.println("ob1.equals(ob2)"+ob1.equals(ob2));
//		
//		System.out.println("ob1.equals(ob3)"+ob1.equals(ob3));//object comapre ref
//		
//		
//		System.out.println("s3==s4 "+ob1==ob2);
		
		
//		Integer i1 = new Integer(100);
//		Integer i2 = new Integer(100);
//		System.out.println("s1.equals(s2)"+i1.equals(i2));
//		System.out.println("s1==s2 "+(i1==i2));
//		Integer i3 = i1;
//		System.out.println("s1.equals(s2)"+i1.equals(i3));
//		System.out.println("s1==s2 "+(i1==i3));
		
		
		
		
	}
	
}
