package com.concept.functionalIntf;

import java.util.function.Predicate;

public class AppPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate <Integer> lessthan = i->(i<10);
		
		System.out.println(lessthan.test(12));

	}

}
