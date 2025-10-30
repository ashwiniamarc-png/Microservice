package com.concept.comaprableANDComparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee>,Comparator<Employee>{

	
	
	
	private int id;
	private String name;
	private double salaray;
	private int age;
	public Employee(int i, String string, int age , int sal) {
		
		
		this.id =i;
		this.name = string;
		this.salaray = sal;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalaray() {
		return salaray;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaray=" + salaray + ", age=" + age + "]";
	}
	public void setSalaray(double salaray) {
		this.salaray = salaray;
	}
	
	
	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
		
	}
	
	/**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalaray() - e2.getSalaray());
        }
    };

    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge()- e2.getAge();
        }
    };

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
