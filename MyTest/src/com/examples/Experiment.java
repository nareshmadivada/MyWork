package com.examples;

//Yes you can do that. Only observation, to the above comments: 
//the return type can be different if one is the subtype of the other. Example: 

interface A {
	Object one();
	
}

interface B {
	String one();
}

public class Experiment implements A, B {


	public  String one() {
		System.out.println("In String");
		return "One";
	}

	public static void main(String... args) {
		A a = new Experiment();
		B b = new Experiment();

		System.out.println("A: " + a.one());
		System.out.println("B: " + b.one());
	}
}
