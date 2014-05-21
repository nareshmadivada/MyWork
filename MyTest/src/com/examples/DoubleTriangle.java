package com.examples;

import java.util.Scanner;

public class DoubleTriangle {
	public static void main(String[] args) {
		int n = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any No:");
		int no = s.nextInt();
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			n++;

		}
		if (n % no == 0) {
			for (int k = n-1; k >= 1; k--) {
				for (int j = 1; j <= k; j++) {
					System.out.print(j);
				}

				System.out.println();
			}

		}
	}
}
