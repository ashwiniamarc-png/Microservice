package com.test.concept.stramAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(12);
		ls.add(13);
		
		Stream<Integer> s = ls.stream();
		List evenList =  s.filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		
		List ls1 = Arrays.asList(1,2,3,30,6,7);
		Stream s1 = ls1.stream();
	
		
//		s1.filter(i -> i>5 ).collect(Collectors.toList());
		
		Integer[] arrInt = {1,2,3,4,5,6,7,8,8};
//		
//		for(Integer num : arrInt ) {
//			
//			System.out.println(num);
//		}
		
		Stream<Integer> streamInt  = Arrays.stream(arrInt);
//		streamInt.forEach(num -> System.out.println(num));
		
		streamInt.
			filter(i-> i>5).
			map(num  -> {
				
				switch (num)
				
				{
				
				case 1 : return "one ";
				case 2 : return "two ";
				case 3 : return "three ";
				case 4 : return "four ";
				case 5 : return "five ";
				case 6 : return "six ";
				
				case 7 : return "seven ";
				case 8 : return "eight ";
				case 9 : return "nine ";
				case 10 : return "ten ";
				}
				
				return "Number in words not avilbale  "+num;
			}).
			forEach(num -> System.out.println(num));
				
			
		
//		System.out.println("filterStrem"+filterStrem);
//		filterStrem.forEach(num -> System.out.println(num));
//		
		
		System.out.println("Even ");
		Stream<Integer> evenStream = Arrays.stream(arrInt).filter(i-> i%2<=0);
		evenStream.forEach(num -> System.out.print(num));
	}
}
