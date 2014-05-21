package com.corejava;

public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			if (i == 5) {
				for (int n = 5; n > 0; n--) {
					for (int m = 1; m < n; m++) {
						System.out.print(m);
					}
					System.out.println();

				}

			}

		}

	}

}
