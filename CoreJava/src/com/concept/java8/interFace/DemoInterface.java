package com.concept.java8.interFace;

public interface DemoInterface {
	
	 static int  getStatic() {
		
		System.out.println("In interface getStatic");
		return 0;
	}
	 public default int getDefault() {
			
			System.out.println("In interface getSize");
			return 1;
		}
	 
	 public int getRegular();
}
