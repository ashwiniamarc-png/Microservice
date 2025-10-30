package com.concept.collection.hashmap;

import java.util.HashMap;

public class MainStudent {

	public static void main(String args[]) {
		
		HashMap<StudentHM ,String> hm = new HashMap();
		
		
		StudentHM s1 = new StudentHM(1, "abc");
		StudentHM s2 = new StudentHM(1, "abc");
		
		
		System.out.println("s1.equals(s2 "+s1.equals(s2));
		System.out.println("s1.equals(s1 "+s1.equals(s1));
//		System.out.println("s1.equals(s2 "+s1.equals(s2));
		
		
		
//		hm.put("abc",s1);
//		hm.put("abc",s2);
//	
		
		hm.put(s1,"abc");
		hm.put(s2,"abc");
	
		
		System.out.println("Haashhh ma p size "+hm.size());
		System.out.println("Haashhh ma p size "+hm.toString());
//		
		
		
//		StudentHM sm =new StudentHM(1,"Abhi"); 
//		hm.put(sm, "India");
//		sm.setName("Amit");
//		System.out.println("Sm "+hm.get(sm));
//		
		
		}
}
