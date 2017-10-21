package com.collection.arraylist;

import java.util.ArrayList;

/**
 * ArrayList Implementation
 * 
 * @author Abu Zakir Rizvi
 * 
 */
public class MyCollections {
	public static void main(String[] args) {
		ArrayList<String> arList = new ArrayList<String>();
		arList.add("developer");
		arList.add("tester");
		arList.add("manager");
		for (String st : arList) {
			System.out.println(st);
		}
		System.out.println("After removing first element[developer]: ");
		arList.remove(0);
		for (String st : arList) {
			System.out.println(st);
		}
		System.out.println("==============");
		// array class
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Rizvi", 27));
		empList.add(new Employee("Rana", 35));
		empList.add(new Employee("Rakib", 23));
		empList.add(new Employee("Shohag", 38));

		for (Employee emp : empList) {
			System.out.println("Name: " + emp.name + " Age: " + emp.age);
		}
	}

	static class Employee {
		String name;
		int age;

		public Employee(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}
}
