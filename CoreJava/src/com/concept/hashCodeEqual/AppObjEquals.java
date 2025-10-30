package com.concept.hashCodeEqual;

public class AppObjEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		

		
		// Create two Myclass objects having the same content.
		// In this case, references of both objects will be different.
		Employee obj1 = new Employee(20);
		Employee obj2= new Employee(20);
		
		System.out.println("obj1.equals(obj2)  "+obj1.equals(obj2));
		System.out.println("obj1==obj2" +(obj1==obj2));
		
		
		// Checking for equality of objects.
		   if(obj1.equals(obj2)) {
			  System.out.println("obj1 and obj2 are same"); 
		   } else {
			  System.out.println("obj1 and obj2 are not same"); 
		   }
		// Create two wrapper class objects and store the same content.
		// In this case, references of both objects will be different.
		   Integer obj3 = new Integer(20);
		   Integer obj4 = new Integer(20);
		// Checking for equality of contents.
		   if(obj3.equals(obj4)) {
			 System.out.println("obj3 and obj4 are same");  
		   } else {
			  System.out.println("obj3 and obj4 are not same"); 
		   }
		  }
		
		
	}

