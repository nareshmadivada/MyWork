package com.examples;

import java.util.Scanner;

public class Factorial {
	static int fact = 1;
	public static void main(String[] args) {
		
		System.out.println("Enter Any No:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = n; i >= 1; i--) {
			fact = fact * i;

		}
		System.out.println("Factorial Value of Given No:" + fact);

}
}
