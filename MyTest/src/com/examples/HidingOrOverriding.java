package com.examples;

class Cat {
	public static void foo() {
		System.out.println("static foo() method from Animal.");
	}

	public void bar() {
		System.out.println("static bar() method from Animal.");
	}

}

public class HidingOrOverriding extends Cat {
	public static void foo() {
		System.out.println("static foo() method from Cat.");
	}

	@Override
	public void bar() {
		System.out.println("static bar() method from Cat.");
	}

	public static void main(String[] args) {
		Cat c = new Cat();
		Cat ho=new HidingOrOverriding();
		ho.foo();
		ho.bar();

	}

}
