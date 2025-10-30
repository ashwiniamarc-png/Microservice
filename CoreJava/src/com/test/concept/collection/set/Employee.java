package com.test.concept.collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
	
	private Integer id;

	private String name;

     Employee(Integer id,String name){

         this.id=id;

         this.name=name;

     }
     
//  // Override equals() to check for field equality
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) return true;
//         if (obj == null || getClass() != obj.getClass()) return false;
//         Employee employee = (Employee) obj;
//         return id == employee.id && Objects.equals(name, employee.name);
//     }
//
//     // Override hashCode() to ensure consistency with equals()
//     @Override
//     public int hashCode() {
//         return Objects.hash(id,name);
//     }

     @Override
     public String toString() {
         return "Person{" + "name='" + name + '\'' + ", id=" + id + '}';
     }


 public static void main(String args[]) {

 Employee e1= new Employee(1,"Sachin");

 Employee e2= new Employee(1,"Sachin");

 Employee e3= new Employee(1,"nitin");

 Set<Employee> set = new HashSet<>();

 set.add(e1);

 set.add(e2);

 set.add(e3);

 System.out.println(set);
 }

}
