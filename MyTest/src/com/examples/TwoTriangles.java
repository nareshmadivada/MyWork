package com.examples;

import java.util.Scanner;

public class TwoTriangles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any No:");
		int no = s.nextInt();
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= no - (i - 1); j++) {
				System.out.print("*");
				if (j == no - (i - 1)) {
					for (int k = 1; k <= i; k ++) {
						System.out.print(" ");
					}
					for (int m = 1; m <= i; m++) {
						System.out.print(" ");

					}
					for (int n = 1; n <= no - (i - 1); n++) {
						System.out.print("*");

					}

				}
			}
			System.out.println();

		}
		
		//reverse
		

	}
}
