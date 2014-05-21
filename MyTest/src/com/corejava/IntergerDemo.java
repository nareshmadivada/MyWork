package com.corejava;

public class IntergerDemo {

	public static void add(int c) {
		System.out.println("int Method" + c);

	}

	public static void add(String s) {
		System.out.println("String Method");

	}

	public static void main(String[] args) {

		int i = 5;
		System.out.println("Number = " + i);
		// get two double numbers
		double x = 2.0;
		double y = 5.4;

		// print x raised by y and then y raised by x
		System.out.println("Math.pow(" + x + "," + y + ")=" + Math.pow(x, y));
		System.out.println("Math.pow(" + y + "," + x + ")=" + Math.pow(y, x));

		// get two random double numbers
		double m = Math.random();
		double n = Math.random();

		// print the numbers and print the higher one
		System.out.println("Random number 1:" + m);
		System.out.println("Random number 2:" + n);
		System.out.println("Highest number:" + Math.max(m, n));

		/*
		 * returns the string representation of the unsigned integer value
		 * represented by the argument in binary (base 2)
		 */
		System.out.println("Binary is " + Integer.toBinaryString(i));
		// returns the number of one-bits
		System.out.println("Number of one bits = " + Integer.bitCount(i));
		System.out.println("Number Reverse = " + Integer.reverse(i));
		System.out.println("Number Left Rotate = " + Integer.rotateLeft(i, 1));
		int j = Integer.rotateLeft(i, 1);
		System.out.println(Integer.toBinaryString(j));
		System.out
				.println("Number Right Rotate = " + Integer.rotateRight(j, 1));
		int k = Integer.rotateRight(j, 1);
		System.out.println(Integer.toBinaryString(k));

		// String Constructors
		byte[] arr = { '1', '2', '3' };
		String s = new String(arr);
		System.out.println("s" + s);

		add('c');

	}

}
