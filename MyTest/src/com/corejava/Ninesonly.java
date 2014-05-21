package com.corejava;

import java.util.Scanner;

public class Ninesonly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter No Upto 200");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for (int i = 0; i <= number; i++) {
			if ((i == 9) || (i % 10 == 9) || (i / 10 == 9) || (i % 10 == 19)
					|| (i / 10 == 19)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("No of 9's :" + count);

	}

}
