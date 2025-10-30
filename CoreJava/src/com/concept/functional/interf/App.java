package com.concept.functional.interf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s = "Ashwini";
		
//		boolean check = s.startsWith("a", 0);
		
		
		
		
//		Predicate<String> predicate = x -> {
//		    for (int i = 0 ; i < x.length() ; i++) {
//		        if ( ! Character.isLetter(x.charAt(i)) && !(x.charAt(i) == '_')) {
//		            return false;
//		        }
//		    }
//		    return true;
//		};
//		
		System.out.println("hhh");
		
		
		// checks alfabets occusrance and it is counts
		String str= "Communication";  
		Map<String, Long> result = Arrays.
								stream(str.split("")).
								map(String::toLowerCase).
								collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())); 
		
		System.out.println(result);
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Anitabh");
		memberNames.add("Lokesh");
		
		System.out.println("Print Starts with  AM");
		memberNames.stream().filter((c) -> c.startsWith("Am"))
        .forEach(System.out::println);
		
		
		
		System.out.println("Print contains n");
		memberNames.stream().filter((c) -> c.contains("n"))
        .forEach(System.out::println);
		
		
		//filter data get in straema obj
		Stream<String> mydata = memberNames.stream().filter((c) -> c.contains("n"));
		
		long count = memberNames.stream().filter((c) -> c.contains("n")).count();
		System.out.println(mydata + "*** Count"+count);
		mydata.forEach(p -> System.out.println(p));
		// print start with specific char
		
		//filter data then map  --get in stream
		System.out.println("______________________________________________________");
		Stream<String>   list= memberNames.stream().filter((c) -> c.contains("n")).map(String::toUpperCase);
		list.forEach(p -> System.out.println(p));
		
		
		
		System.out.println("sorted ______________________________________________________");
		
		Stream<String> sorted = memberNames.stream().sorted();
		
		sorted.forEach(p -> System.out.println(p));
		
		
		System.out.println("Phonee numbers and start with 91 and print in sort order ______________________________________________________");
		
		
		List<String>  phoneList = new  ArrayList<>();
		phoneList.add("919090909090");
		phoneList.add("918090909090");
		phoneList.add("917090909090");
		phoneList.add("927090909090");
		phoneList.add("227090909090");
		
		
		Stream<String> sortIndiaPhone = phoneList.stream().filter((m) -> m.startsWith("91")).sorted();
		//sortIndiaPhone.forEach(p -> System.out.println(p));

		
		List<String> sss = sortIndiaPhone.collect(Collectors.toList());

		System.out.println("List"+sss);
		

		
		

	}

}
