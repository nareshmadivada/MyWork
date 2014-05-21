package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Simple {
	protected void msg() {
		System.out.println("Hello java");
	}
}

public class A extends Simple {
	protected void msg() {
		System.out.println("Hello java");
	}// C.T.Error

	public static void main(String args[]) {
		Simple obj = new Simple();
		obj.msg();
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "M");
		map.put(2, "N");
		map.put(null, "B");
		System.out.println(map.remove(null));
		System.out.println(map.get(3));

		int j = 1, sum = 0, count = 0;

		for (int i = 0; i < 20; i++) {

			sum = j * 2;
			j = sum;
			count++;
			// System.out.println(count);

		}
		System.out.println(j / 2);
		Integer[] n = new Integer[1];
		n[0] = 1;
		System.out.println(Arrays.deepToString(n));
		//List<Integer> list = null;
		//list.add(11);
		// System.out.println(list.get(0));
		// indexoutofboundsexeption

		

	}
}