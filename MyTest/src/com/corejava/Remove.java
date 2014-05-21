package com.corejava;

import java.util.ArrayList;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);

		removeDuplicate(list);
	}

	private static void removeDuplicate(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}

		}
		System.out.println(list);
	}

}
