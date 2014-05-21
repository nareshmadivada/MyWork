package com.corejava;

public class SwitchEvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int no = 88;
		switch (no % 10) {
		case 0:
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println(no + "is even");
			break;
		default:
			System.out.println(no + "is Odd");

		}

	}

}
