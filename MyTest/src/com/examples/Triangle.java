package com.examples;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any No:");
		int no = s.nextInt();
		// Triangle Shape
		for (int i = 0; i < no; i++) {
			for (int j = i; j < no; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		// Reverse Triangle
		/*
		 * for (int i = 1; i <= no; i++) { for (int j = i; j > 1; j--) {
		 * System.out.print(" ");
		 * 
		 * } for (int k = 1; k <= no - (i - 1); k++) { System.out.print("*");
		 * for (int m = 1; m < k; m += k) { System.out.print("*"); } }
		 * System.out.println();
		 * 
		 * }
		 */
	}

}
