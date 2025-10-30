package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AppInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = {5,9,11,2,8,21,10,1};

		
		List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
		List<Integer> sortlist =list.stream().sorted().toList();
		
		System.out.println("Original list : "+list);	
		System.out.println("sorted list :"+ sortlist);
		
		List<Integer> revlist =list.stream().sorted(Comparator.reverseOrder()).toList();
		
		
		System.out.println("Reveresorder  list : "+revlist);
		//find second highest number
		 int last = revlist.stream().skip(1).findFirst().get();
		System.out.println("Second highest number  : "+last);

	}

}
