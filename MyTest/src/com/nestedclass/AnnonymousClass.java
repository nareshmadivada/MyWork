/**
 * 
 */
package com.nestedclass;

/**
 * @author naresh
 * 
 */

// Program of annonymous inner class by abstract class
abstract class Person {
	abstract void eat();
}

// Program of annonymous inner class by interface

/*
 * interface Person{ abstract void eat(); }
 */
public class AnnonymousClass {
	public static void main(String[] args) {
		char a=10;
		char b='a';
		System.out.println((int)b);
		Person p = new Person() {

			@Override
			public void eat() {
				System.out.println("Nice Fruits");

			}
		};
		p.eat();
	}

}
