package com.corejava;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// Create the sorted set
		SortedSet<String> set = new TreeSet<String>();

		// Add elements to the set
		set.add("b");
		set.add("c");
		set.add("a");

		String s = new String("abc,");
		s = s.substring(0, s.length() - 1);
		System.out.println(s);

		// Iterating over the elements in the set
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			// Get element
			Object element = it.next();
			System.out.println(element.toString());
		}
		System.out.println(set.headSet("c"));
		System.out.println(set.tailSet("b"));
		System.out.println(set.subSet("a", "c"));

	}

}
