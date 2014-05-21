package com.corejava;

public class Parent {
	public final void foo(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		Derived d = new Derived();
		d.foo();
	}
}

class Derived extends Parent {

	public void foo() {

		foo("Hai");

	}
}
