package hashmap;

import java.util.HashMap;

public class AppInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		HashMap<String , String> hm = new HashMap<String, String>();
		hm.put(null, null);hm.put("1", null);hm.put("2", null);
		System.out.println("hm "+hm);//we can store multiple null as values
		
		
		HashMap<String , String> hm1 = new HashMap<String, String>();
		hm1.put(null, null);hm1.put(null,"1");hm1.put(null,"2");
		System.out.println("hm1 "+hm1);//we cant store multiple null as keys last one override
		
		
		HashMap<String , String> hm2 = new HashMap<String, String>();
		hm2.put("1", "1");hm2.put("1","11");hm2.put("1","111");
		System.out.println("hm2   "+hm2);//we  store multiple time same key as string it will replaced with last one 
		
		
		HashMap<String , Emp> obj1 = new HashMap<String, Emp>();
		obj1.put("1", new Emp());obj1.put("1",new Emp());obj1.put("1",new Emp());
		System.out.println("obj1   "+obj1);//if key same value last one consider
		
		HashMap<Emp,String> obj2 = new HashMap<Emp,String>();
		obj2.put( new Emp(),"1");obj2.put(new Emp(),"1");obj2.put(new Emp(),"1");
		System.out.println("obj2   "+obj2);//if we implement hash code and equals method in emp class, o/p will only one emp otherwise it will disp three 
		
		HashMap<Emp,String> obj3 = new HashMap<Emp,String>();
		Emp e1 = new Emp(1,"a","x");
		Emp e2 = new Emp(1,"b","x");
		Emp e3 = new Emp(1,"a","x");
		obj3.put(e1 ,"1");
		obj3.put( e2,"2");
		obj3.put( e3,"3");
		
		System.out.println("obj3   "+obj3);//if we implement hash code and equals method in emp class, o/p will only one emp otherwise it will disp three 
		
		
		
		
	}

}
