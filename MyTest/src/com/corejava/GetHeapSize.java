package com.corejava;

public class GetHeapSize {
	public static void main(String[] args) {

		// Get the jvm heap size.
		long heapSize = Runtime.getRuntime().totalMemory();
		long freeSize = Runtime.getRuntime().freeMemory();
		long maxSize = Runtime.getRuntime().maxMemory();

		System.out.println("Heap Size = " + heapSize);
		System.out.println("Free Size = " + freeSize);
		System.out.println("Max Size = " + maxSize);

	}
}
