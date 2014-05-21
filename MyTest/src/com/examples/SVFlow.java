package com.examples;

public class SVFlow {

	SVFlow() {
		System.out.println("constructor");
	}

	{
		System.out.println("non static block");
	}

	static {
		System.out.println("static block");
	}

	void display() {
		System.out.println("core java");
	}

	public static void main(String[] args) {
		System.out.println("main");
		SVFlow sv = new SVFlow();
	}

}
