package com.concept.hashCode;

import java.util.HashMap;

class MyDemo{
	@Override
	public int hashCode() {
		
		System.out.println("hash code method call");
		
			return super.hashCode();
	}
	
	
}
public class AppHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello";
		
		
		System.out.println(s.hashCode());
		
		
		
		HashMap<MyDemo, String> hm = new HashMap<MyDemo, String>();
		MyDemo mydemo = new MyDemo();
		
		MyDemo mydemo1 = new MyDemo();
		hm.put(mydemo, "s");
		hm.put(mydemo, "s");
		hm.put(mydemo1, "s");
		hm.put(mydemo1, "s");
		
		System.out.println("Size"+hm.size());
		System.out.println("Size"+hm.entrySet());

		
		
		///check hash code and euql
		
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1.hashCode() + "   " +s2.hashCode());
		System.out.println(s1.equals(s2) );
		System.out.println(s1==s2 );
		
		
		
		String s3 = "abc";
		String s4 = new String("abc");
		String s5 = new String("abc");
		
		System.out.println(s4.hashCode() + "   " +s5.hashCode());
		System.out.println(s4.equals(s5) );
//		System.out.println(s3==s4 );
		
		
	}
	
	

}
