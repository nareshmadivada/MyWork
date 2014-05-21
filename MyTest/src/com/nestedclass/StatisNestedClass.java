/**
 * 
 */
package com.nestedclass;

/**
 * @author naresh
 * 
 */
public class StatisNestedClass {
	static int a = 18;

	static class Inner {
		// Static method
		static void msg() {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// StatisNestedClass.Inner in=new StatisNestedClass.Inner();
		StatisNestedClass.Inner.msg();
	}

}
