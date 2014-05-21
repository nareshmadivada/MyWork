/**
 * 
 */
package com.nestedclass;

/**
 * @author naresh
 * 
 */
public class LocalInnerClass {
	private int data = 15;

	void display() {
		final int a = 10; // Final
		class Local {
			void msg() {
				System.out.println(a);
			}

		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String[] args) {
		LocalInnerClass li = new LocalInnerClass();
		li.display();
	}

}
