/**
 * 
 */
package com.corejava;

/**
 * @author naresh
 * 
 */
public class BubbleSort {

	public static void main(String... args) {
		int[] array = { 2, 1, 4, 3 };
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}

		}
		for (int r = 0; r < array.length; r++) {

			System.out.println(array[r]);
		}

	}

}
