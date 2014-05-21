package com.corejava;

import java.util.Scanner;

public class SumofDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0, rem = 0, totSum = 0;
		System.out.println("Enter Any No:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		/*for (int n = 0; n <= number; n++) {
			sum = sum + n;
		}*/
		while (number > 0) {
			rem = number % 10;
			totSum += rem;
			number = number / 10;

		}
		System.out.println(totSum);

	}

}
