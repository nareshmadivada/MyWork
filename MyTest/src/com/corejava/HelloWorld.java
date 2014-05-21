package com.corejava;

import java.util.HashSet;

public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld();
		long i;
		HashSet<Long> set = new HashSet<Long>();
		for (i = 0; i < 10; i++) {
			set.add(i);
			System.out.println("before i" + i);
			set.remove(i - 1);
			System.out.println("after i" + i);

		}
		System.out.println("Size: " + set.size());
	}

	public static void HelloWorld() {
		System.out.println("in");
		new HelloWorld().HelloWorld("HelloWorld");
	}

	public void HelloWorld(String s) {
		System.out.println(s);
	}

	// Method Overloading
	public void Hello(char a) {

	}

	public void Hello(byte a) {

	}

}
