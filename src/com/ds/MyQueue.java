package com.ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Queue and Priority Queue Implementation
 * 
 * @author Rizvi
 * 
 */
public class MyQueue {
	public static void main(String[] args) {
		System.out.println("Basic Queue:");
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(15);
		q.add(10);
		q.add(12);

		System.out.println("Queue data: ");
		Iterator<Integer> itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("First remove in basic queue: " + q.poll());

		System.out.println("Priority Queue: ");
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(25);
		pq.add(20);
		pq.add(23);

		System.out.println("PriorityQueue data using Iterator: ");
		Iterator<Integer> itra = pq.iterator();
		while (itra.hasNext()) {
			System.out.println(itra.next());
		}

		System.out.println("PriorityQueue data using for each loop: ");
		for (Integer e : pq) {
			System.out.println(e);
		}

		// Remove operation will be from less priority
		System.out.println("First remove in priority queue: " + pq.poll());
		System.out.println("Second remove in priority queue: " + pq.poll());

		PriorityQueue<Student> studentQ = new PriorityQueue<Student>();
		studentQ.add(new Student("Rizvi", 27));
		studentQ.add(new Student("Sumi", 24));
		studentQ.add(new Student("Munni", 26));
		studentQ.add(new Student("Panna", 28));
		studentQ.add(new Student("Hira", 25));

		System.out.println("Student List(): ");
		// Method iterator() is not guaranteed to traverse the elements of the
		// PriorityQueue in any particular order.
		Iterator<Student> studItr = studentQ.iterator();
		while (studItr.hasNext()) {
			Student std = studItr.next();
			System.out.println("Name: " + std.name + " Age: " + std.age);
		}
		System.out.println("First Removal: " + studentQ.poll().name);
	}
}
