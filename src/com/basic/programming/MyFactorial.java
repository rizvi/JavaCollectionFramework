package com.basic.programming;

/**
 * Basic Programming: Factorial
 * 
 * @author Rizvi
 * 
 */
public class MyFactorial {
	public static void main(String[] args) {
		System.out.println("factorial of 5: " + fact(5));
	}

	static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
}
