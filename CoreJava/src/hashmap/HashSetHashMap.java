package hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetHashMap  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer , String> obj1 = new HashMap<Integer, String>();
		
		obj1.put(1, "1");
		obj1.put(2, "21");
		obj1.put(2111, null);
		obj1.put(2231, null);
		System.out.println(obj1);
	
		HashSet<String> obj2 = new HashSet<String>();
		obj2.add(null);
		obj2.add("3");
		obj2.add("2");
		obj2.add(null);
		System.out.println(obj2);
		
		
		
	}

}
