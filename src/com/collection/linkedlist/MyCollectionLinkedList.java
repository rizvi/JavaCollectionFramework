package com.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedList Implementation
 * 
 * @author Abu Zakir Rizvi
 * 
 */
public class MyCollectionLinkedList {

	public static void main(String[] args) {
		LinkedList<String> friendList = new LinkedList<String>();
		friendList.add("Rakhi");
		friendList.add("Rony");
		friendList.add("Pushpo");
		friendList.add("Diba");
		friendList.add("Koly");
		friendList.add("Mitthe");

		System.out.println("My University Friends: ");
		Iterator<String> itr = friendList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
