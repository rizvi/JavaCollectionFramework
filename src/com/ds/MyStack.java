package com.ds;

import java.util.Iterator;
import java.util.Stack;

/**
 * Stack implementation
 * 
 * @author Rizvi
 *
 */
public class MyStack {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Admins");
		st.push("Manager");
		st.push("Tester");

		System.out.println("Company Employees:");
		Iterator<String> iter = st.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// remove Tester(LIFO)
		st.pop();

		System.out.println("Employees after pop operation in stack:");
		// for-each loop
		for (String obj : st) {
			System.out.println(obj);
		}
	}

}
