package com.examples;

public class Diamond {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i += 2) {
			for (int j = 0; j < 9 - i / 2; j++)
				System.out.print(" ");
			for (int k = 0; k < i; k++)
				System.out.print("*");

			System.out.println();
		}
		for (int i = 7; i > 0; i -= 2) {
			for (int j = 0; j < 9 - i / 2; j++)
				System.out.print(" ");
			for (int k = 0; k < i; k++)
				System.out.print("*");

			System.out.println();
		}
		
		 for (;;) {
		      System.out.println("Hello");
		     break;
		    }
	}

}
