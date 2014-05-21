package com.examples;

import java.math.BigInteger;

public class AdditionWithOutPlus {
	public static void main(String[] args) {
		int a = 10, b = 20;
		BigInteger c = new BigInteger("13");
		BigInteger d = new BigInteger(new Integer(b).toString());
		BigInteger sum = c.add(d);
		System.out.println(c + "is prime with certainity 1"
				+ c.isProbablePrime(1));

		System.out.println("Sum:" + sum);

		String s = "Java";
		String s1 = "Java";
		String str = new String("Java").intern();

		if (s == str) {
			System.out.println("Equal");

		} else {
			System.out.println("Not Equal");
		}
	}
}
