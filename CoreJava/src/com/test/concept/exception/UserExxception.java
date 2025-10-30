package com.test.concept.exception;

public class UserExxception extends Exception {
	
    public void IncorrectFileNameException(String errorMessage) { 
    	
    	System.out.println("errorMessage "+errorMessage);
//    	super(errorMessage);
    }

}
