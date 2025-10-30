package com.test.concept.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Set<String> s = new HashSet();
			s.add("A");
			s.add("B");
			s.add("C");
			s.add("D");
			s.add("A");
			System.out.println("Hash Set Size"+s.size());

			
			Set n = new HashSet();
			n.add(10);
			n.add(11);
			n.add(9);
			n.add(8);
			n.add(9);
			System.out.println("Hash Set int  Size"+n.size());
			
			
			
	}

}
