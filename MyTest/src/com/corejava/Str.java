package com.corejava;

public class Str {

	public static void main(String[] args) {
		String a = "java";
		String b = a + "spring";
		String ab = "javaspring";
		System.out.print(b == ab);
		System.out.print(b.equals(ab));
	}

}
