/**
 * 
 */
package com.nestedclass;

/**
 * @author naresh
 * 
 */
class MemberClass {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println(data);
		}
	}

	void display() {
		Inner in = new Inner();
		in.msg();
	}

	public static void main(String[] args) {
		MemberClass outer = new MemberClass();
		outer.display();
	}

}
