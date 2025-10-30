package com.concept.hashCodeEqual;

import java.util.HashMap;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);
		
		
		HashMap< Employee, String> hm = new HashMap<Employee, String>();
		hm.put(e1, "l1");
		hm.put(e2, "l1");

		
		System.out.println("Empl "+hm.size());
		System.out.println("Empl "+hm.entrySet());
		
		Integer in1= new  Integer(1);
		Integer in2= new  Integer(1);
		HashMap< Integer, String> hmInt = new HashMap<Integer, String>();
		hmInt.put(in1, "l1");
		hmInt.put(in2, "l1");
		
		System.out.println("Integer "+hmInt.size());
		System.out.println("Empl "+hmInt.entrySet());

		
	}

}
