package com.collection.sets;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet Implementation
 * 
 * It is ordered collection
 * 
 * @author Rizvi
 * 
 */
public class MyCollectionsTreeSet {

	public static void main(String[] args) {
		TreeSet<String> jigriDosto = new TreeSet<String>();
		jigriDosto.add("Mithun");
		jigriDosto.add("Saju");
		jigriDosto.add("Angur");
		jigriDosto.add("Jillu");
		jigriDosto.add("Ashraful");

		System.out.println("My Friends: ");
		Iterator<String> itr = jigriDosto.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
