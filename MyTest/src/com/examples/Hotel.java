package com.examples;

/**
 * @author naresh
 * 
 */

class Restaurant {
	public Restaurant() {
		System.out.println("Super Constructor");
	}

	public static void book(short a) {
		System.out.print("in parent short ");
	}

	static void add(int a) {
		System.out.println(a);

	}
}

public class Hotel extends Restaurant {
	public static void book(short a) {
		System.out.print("short ");
	}

	public static void book(Short a) {
		System.out.print("SHORT ");
	}

	public static void book(Long a) {
		System.out.print("LONG ");
	}

	static void add(int a) {
		System.out.println("in Child " + a);

	}

	{
		System.out.println("Anonymous block");
	}

	private Hotel() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		short shortRoom = 1;
		long intRoom = 2;
		Restaurant r = new Hotel();
		book(shortRoom);
		book(intRoom);
		add(1);
	}
	

}

