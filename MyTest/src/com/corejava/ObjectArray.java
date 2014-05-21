package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectArray {
	public static void main(String[] args) {
		ObjectArray test = new ObjectArray();
		test.process();
		/*ArrayList list=new ArrayList();
		int a=2;
		list.add(a);
		System.out.println(list.get(0));*/
	}
	
	
	

	private void process() {
		
		Object[] obj = new Object[] { "A", 1, "M","N" };

		System.out.println("Before Object [] ");
		for (Object temp : obj) {
			System.out.println(temp);
		}

		System.out.println("\nAfter Object [] ");
		Object[] newObj = appendValue(obj, "B");
		for (Object temp : newObj) {
			System.out.println(temp);
		}

	}

	private Object[] appendValue(Object[] obj, Object newObj) {

		ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(obj));
		temp.add(newObj);
		return temp.toArray();

	}

}
