package com.examples;

import java.util.ArrayList;

public class ArraylistTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i1 = 100;
		String s2 = "TWO";
		double d3 = 3.14;
		ArrayList<String> array = new ArrayList<String>();
		array.add("Java");
		array.add("Spring");
		array.add("Hybernate");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Java");
		al2.add("Struts");
		al2.retainAll(array);
		for (String s : al2) {
			System.out.println("RetainAll" + s);
		}

		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> arrayList = new ArrayList<Comparable>();
		arrayList.add(i1);
		arrayList.add(s2);
		arrayList.add(d3);

		System.out.println("s2 value is "
				+ arrayList.get(arrayList.indexOf(s2)).toString());
		System.out.println("d3 value is "
				+ arrayList.get(arrayList.indexOf(d3)).toString());
		System.out.println("i1 value is "
				+ arrayList.get(arrayList.indexOf(i1)).toString());
	}
}
