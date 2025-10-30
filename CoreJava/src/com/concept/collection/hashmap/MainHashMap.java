package com.concept.collection.hashmap;

import java.util.HashMap;

public class MainHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>() ;
		
		hm.put("aa", "1");
		hm.put("aa", "2");hm.put("aa", "4");hm.put("aa", "999");
		System.out.println(hm);
		

	}

}
