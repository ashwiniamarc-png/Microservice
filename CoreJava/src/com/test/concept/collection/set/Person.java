package com.test.concept.collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals() to check for field equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Override hashCode() to ensure consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }



    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);
        Person person3 = new Person("Alice", 30);
        personSet.add(person1);  // Adds successfully
        personSet.add(person2);  // Duplicate, won't be added
        personSet.add(person3);  // Adds su
        
//      Person person1 = new Person("John", 25);
//      Person person2 = new Person("John", 25);
//      Person person3 = new Person("Alice", 30); 
        // Adding persons to set
//        personSet.add(new Person("John", 25));  // Adds successfully
//        personSet.add(new Person("John", 25));  // Duplicate, won't be added
//        personSet.add(new Person("Alice", 25));  // Adds successfully

        // Print the set to verify that no duplicates were added
        System.out.println(personSet);
    }
}