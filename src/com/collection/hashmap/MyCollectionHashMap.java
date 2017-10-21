package com.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap Implementation
 * 
 * @author Abu Zakir Rizvi
 * 
 */
public class MyCollectionHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Kony");
		map.put(2, "Pappu");
		map.put(3, "Saju");
		map.put(4, "Raju");
		map.put(5, "Tareq");
		System.out.println("Position 4: Name: " + map.get(4));

		System.out.println("Brother List: ");
		for (Map.Entry m : map.entrySet()) {
			System.out.println("Id: " + m.getKey() + " ==> Name: "
					+ m.getValue());
		}

		// Rename position 4
		map.put(4, "Zahid Parvez Raju");
		System.out.println("After renaming position 4: Name: " + map.get(4));
	}

}
