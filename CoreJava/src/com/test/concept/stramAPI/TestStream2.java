package com.test.concept.stramAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream2 {

	public static <E> void main(String[] args) {
		 
		List ls1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer> s1 = ls1.stream();
	
		
		Stream streamFilter = s1.filter( num -> num % 2 <=0 ).filter(num -> num>4);
		streamFilter.forEach(num -> System.out.println(" "+num));
		
		Collection<String> setName = new HashSet<String>();
		setName.add("AShwini");
		setName.add("Anuuuu");
		setName.add("Kavita");
		setName.add("Biba");
		setName.add("Zuck");
		
		Stream<String> streamName = setName.stream().filter(str -> str.startsWith("A") || str.startsWith("B")).map(str ->str.toUpperCase()).sorted();
		streamName.forEach(str -> System.out.println(" "+str)); 
		streamName.
		
		
	}}	
		
		
		
////		s1.filter(i -> i>5 ).collect(Collectors.toList());
//		
//		Integer[] arrInt = {1,2,3,4,5,6,7,8,8};
////		
////		for(Integer num : arrInt ) {
////			
////			System.out.println(num);
////		}
//		
//		Stream<Integer> streamInt  = Arrays.stream(arrInt);
////		streamInt.forEach(num -> System.out.println(num));
//		
//		streamInt.
//			filter(i-> i>5).
//			map(num  -> {
//				
//				switch (num)
//				
//				{
//				
//				case 1 : return "one ";
//				case 2 : return "two ";
//				case 3 : return "three ";
//				case 4 : return "four ";
//				case 5 : return "five ";
//				case 6 : return "six ";
//				
//				case 7 : return "seven ";
//				case 8 : return "eight ";
//				case 9 : return "nine ";
//				case 10 : return "ten ";
//				}
//				
//				return "Number in words not avilbale  "+num;
//			}).
//			forEach(num -> System.out.println(num));
				
			
		
//		System.out.println("filterStrem"+filterStrem);
//		filterStrem.forEach(num -> System.out.println(num));
//		
//		
//		System.out.println("Even ");
//		Stream<Integer> evenStream = Arrays.stream(arrInt).filter(i-> i%2<=0);
//		evenStream.forEach(num -> System.out.print(num));
//	}

