package com.test.concept.exception;

public class ChildException extends BaseException {
	
public int getID() throws UserExxception{

	
	try {
		
		throw new Exception();
	}catch(Exception e) {
		
		System.out.println("Exception in child class  class" + e);
	}
	
	throw new Exception();
	
}
//	
	
	



}
