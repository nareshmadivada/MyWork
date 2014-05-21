package com.nestedclass;

// Nested interface which is declared within the interface
interface Showlable {
	void show();

	interface Message {
		void msg();
	}

	class B {
		void mnb() {
			System.out.println("class inside the interface");
		}
	}

}

// Nested interface which is declared within the class
class A {
	interface Message {
		void msg();
	}
}

public class NeatedInterfaces extends Showlable.B {

	public void msg() {
		System.out.println("Hello Nested Interfaces");

	}

	public static void main(String[] args) {
		Showlable.B obj = new NeatedInterfaces(); // upcasting here
		obj.mnb();
	}

}
