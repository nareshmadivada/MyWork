package com.corejava;

public class TestApp {
	
	private int counter;

	public void printIt() {
		System.out.println("No Param ");
	}

	public void printString(String name) {
		System.out.println("String Param " + name);

	}

	public void printInt(int a) {
		System.out.println("Int param " + a);

	}

	public void setCounter(int counter) {
		this.counter = counter;
		System.out.println("Set Counter: " + counter);
	}

	public void printConuter() {
		System.out.println("Counter: " + this.counter);
	}

}
