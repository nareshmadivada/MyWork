package com.examples;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExpTest {

	static public  void main(String[] args) {
		try {
			newMethod();
		} catch (RuntimeException re) {
			System.out.println("runtime");

		} catch (Exception e) {
			System.out.println("exception");

		} finally {
			System.out.println("finally");
		}
		System.out.println("normal");
		System.gc();

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(2, "mnb");
		lhm.put(1, "java");
		for (Map.Entry<Integer, String> map : lhm.entrySet()) {
			System.out.println(map.getKey() + "" + map.getValue());
		}
		for (Object key : lhm.keySet()) {
			System.out.println(key.toString() + " keySet " + lhm.get(key));

		}
		Iterator<Entry<Integer, String>> itr = lhm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) itr
					.next();
			System.out.println(me.getKey() + " while  " + me.getValue());

		}

	}

	static void newMethod() {
		new RuntimeException();

	}
}
