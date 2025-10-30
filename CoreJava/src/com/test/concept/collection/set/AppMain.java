package com.test.concept.collection.set;

import java.nio.file.DirectoryIteratorException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		 list.add(null);
		 list.add("AA");
		 list.add("BB");
		 list.add("bb");
		 list.add(null);
		 list.add("bb");
		 list.add(null);
		Set set = new HashSet<>(list);
		System.out.println(set);
		
		
		set.remove(null);
		System.out.println("After Removing null obj, set "+set);
		
		System.out.println("set "+set.contains("BB1"));
		
		
		//
		Iterator it = set.iterator();
		while(it.hasNext()) {
			String str =(String) it.next();
			System.out.println("Each ele "+str);
			
			// Removing Mango element. 

		    if(str.equals("BB"))
		    { 
		      it.remove(); 
		    } 
//			set.remove("null");
		}
		System.out.println("After Remove BB from iterator  "+ set);
		
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println("Each ele "+ it.next());
//			
//		}
		
		set.forEach(System.out::println);
		
		
		Set setOrder = new HashSet<>();
		setOrder.add("C");
		setOrder.add("B");
		setOrder.add("AEEE");
		setOrder.add(null);
		System.out.println("Before linked list "+setOrder);
		setOrder = new LinkedHashSet(setOrder);
		System.out.println("After linked list "+setOrder);
		
		
		
		Set link = new LinkedHashSet<>();
		link.add("A");
		link.add("V");
		link.add("B");
		link.add("C");

		System.out.println(link);
	}

}
