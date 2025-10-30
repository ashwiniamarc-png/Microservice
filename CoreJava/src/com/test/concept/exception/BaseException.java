package com.test.concept.exception;

public class BaseException {
	
	public int getID() throws UserExxception{
		
		
		try {
			
			throw new Exception();
		}catch(Exception e) {
			
			System.out.println("Exception in base class" + e);
		}
		return 1;
	}

}
