package com.test.concept.stramAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentApp studentApp = new StudentApp();


		
		
//		Stream<Student> streamStudent = studentApp.getStudentList().stream();
		
		// get name of stuedent start with A and store in the stream of string
		
		
		Stream<Student> s1 =studentApp.getStudentList().stream();
//		System.out.println(s1.count());
		List<String>  result = s1.filter(s-> s.getName().startsWith("a")).map(s2 -> s2.getName()).collect(Collectors.toList()); 
		result.forEach(stuobj -> System.out.println(stuobj)); 
	
		
		
		
		//to stream
		System.out.println("Stream ");
		Stream<Student> s2=studentApp.getStudentList().stream();
		Stream<String>  resultStream = s2.filter(s-> s.getName().startsWith("a")).map(m2 -> m2.getName()); 
		resultStream.forEach(stuobj -> System.out.println(stuobj)); 
	
		
		// from student object to map name and mobile number
		System.out.println("Student to map util");
		Stream<Student> s3=studentApp.getStudentList().stream();
		Map<String,Integer>  resultStream3 = s3.filter(s-> s.getName().startsWith("a") || s.getName().startsWith("v")).
											 collect(Collectors.toMap(Student::getName,Student::getMobile)); 
		System.out.println("HashMap Elements: " + resultStream3);

		
		//to print city grouping
		Stream<Student> s4=studentApp.getStudentList().stream();
		
		List<String> listofcity =  s4.map( e -> e.getCity().toLowerCase() )
        .distinct()
        .collect(Collectors.toList());
		
		System.out.println("listofcity Elements: " + listofcity);
		
		
		
		//to print city with there count in map 
				Stream<Student> s5=studentApp.getStudentList().stream();
				Map<String,Long> cityMap =s5.collect(Collectors.groupingByConcurrent(Student::getCity, Collectors.counting()));
				System.out.println("cityMap Elements: " + cityMap);

				
				
	// caluculate square
				 List<Integer> numbers = new ArrayList<Integer>();
				    numbers.add(1);
				    numbers.add(2);
				    numbers.add(3);
				    numbers.add(4);
				    numbers.add(5);
				    numbers.add(6);

				    Function<Integer, Integer> square = x -> x * x;
				    numbers.stream().map(square).forEach(x -> System.out.println(x));

				    // or
				    List<Integer> squareNumbers = numbers.stream().map(square).filter(z ->z <20)
				            .collect(Collectors.toList());
				    System.out.println("squareNumbers"+squareNumbers);

				    int cocunt = (int) numbers.stream().map(x -> x * x).filter(z ->z <20).count();
				    System.out.println("cocunt "+cocunt);
		
		
//		streamStudent.
//		filter(stuobj -> stuobj.getAge()> 30 ).
//		map(stuobj -> stuobj.getName().toUpperCase()).sorted().
//		limit(1).
//		sorted().
//		forEach(stuobj -> System.out.println(""+stuobj.toString()));
//		
		//select only starting name A
		
//		System.out.println("Student Size"+s1.count());
//		List<String> result = s1.filter(s-> s.getName().startsWith("A")).
//				map(s -> s.getName()).collect(Collectors.toList());
		
//		System.out.println(result); 
	}
	
	
	public static List<Student> getStudentList(){
		
	ArrayList studentList = new ArrayList();
	
	
	
	
	Student ashwini  = new Student(1, "ashwini", 40, 10000000,"Pune");
	Student swati  = new Student(2, "swati", 50, 22000000,"Nashik");
	Student neela  = new Student(3, "neela", 70, 333300000,"kop");
	Student varsha  = new Student(4, "varsha", 41, 4400000,"Mum");
	Student rani  = new Student(5, "rani", 10, 5500000,"Mum");
	Student raja  = new Student(6, "raja", 20, 600000,"pune");
	
	studentList.add(ashwini);
	studentList.add(swati);
	studentList.add(neela);
	studentList.add(varsha);
	studentList.add(rani);
	studentList.add(raja);
	
	return studentList;
	}

}
