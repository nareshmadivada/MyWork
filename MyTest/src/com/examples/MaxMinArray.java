package com.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

public class MaxMinArray {
	
	public static void main(String[] args) {

		int[] a = { 3, 5, 1, 4, 2 };

		List<Integer> b = Arrays.asList(ArrayUtils.toObject(a));

		System.out.println("Min Value:" + Collections.min(b));
		System.out.println("Max Value:" + Collections.max(b));
	}

}
