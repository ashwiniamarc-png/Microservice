package com.test.concept.stramAPI;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abc";
		String b =  new String("abc");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
		
		Integer obj3 = new Integer(20);
		   Integer obj4 = new Integer(20);
		// Checking for equality of contents.
		   if(obj3==obj4) {
			 System.out.println("obj3 and obj4 are same");  
		   } else {
			  System.out.println("obj3 and obj4 are not same"); 
		   }
	}

}
