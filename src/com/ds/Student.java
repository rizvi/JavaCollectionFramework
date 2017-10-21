package com.ds;

/**
 * Student Class
 * 
 * @author Rizvi
 * 
 */
public class Student implements Comparable<Student> {

	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// if age is equal to next student age, it returns 0
	// if age is greater than next student age, it returns 1
	// if age is less than next student age, it returns -1
	@Override
	public int compareTo(Student std) {
		if (this.age == std.age) {
			return 0;
		} else if (this.age > std.age) {
			return 1;
		} else {
			return -1;
		}
	}
}
