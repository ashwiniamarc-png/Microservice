package streamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		List<String> fruits = List.of("apple", "chikku", "bannna", "mango", "mango");

		List<Integer> evenResult = numbers.stream()
		        .filter(n -> {
		            System.out.println("filter: " + n);
		            return n % 2 == 0;
		        })
//		        .map(n -> {
//		            System.out.println("map: " + n);
//		            return n * 2;
//		        })
		        .collect(Collectors.toList());

		 System.out.println("output Even No " + evenResult);

		 
		 List<Integer> oddResult = numbers.stream()
			        .filter(n -> {
			            System.out.println("filter: " + n);
			            return n % 2 != 0;
			        })
			        .collect(Collectors.toList());

			 System.out.println("output Odd No " + oddResult);
// find the fruits count 
			 /* Function.identity() → use the element itself as the grouping key.
			 For example: "apple" → key "apple".

			 Collectors.counting() → for each key, count how many times it appears.
			 
			 So Conceptually

Each element flows like this:

apple → groupingBy("apple") → counting() updates count
banana → groupingBy("banana") → counting() updates count
...
			 
			 
			 
			 
			 */

			 Map<String, Long> fruitsCount =  fruits.stream()
				        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

				 System.out.println("output Odd No " + fruitsCount);

				 
			
				 
				 
				 //////////////////////////
				 //find out each char
				 String myName = "Ashwini Amar";
				 
				 Map<Character, Long> charCount = myName.chars() // IntStream of Unicode values
			                .mapToObj(c -> (char) c)              // Convert int → Character
			                .collect(Collectors.groupingBy(
			                        Function.identity(),          // Group by character itself
			                        Collectors.counting()         // Count occurrences
			                ));

			        System.out.println("Count char "+charCount);
				 
			 
	}

}
