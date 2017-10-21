package com.collections.sets;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet Implementation
 * 
 * It is not ordered collection
 * 
 * @author Rizvi
 * 
 */
public class MyCollectionsHashSet {

	public static void main(String[] args) {
		HashSet<String> friends = new HashSet<String>();
		friends.add("Mithun");
		friends.add("Saju");
		friends.add("Angur");

		// Set can't approve duplicate value
		friends.add("Angur");

		System.out.println("My Friends: ");
		Iterator<String> itr = friends.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
