package com.nestedclass;

class Outer {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println(data);
		}
	}

}

public class MemberOutSideClass {
	public static void main(String args[]) {
		Outer outer = new Outer();
		Outer.Inner inn = outer.new Inner();
		inn.msg();
	}

}
