package com.examples;

class Bits1 {

	public static void main(String args[]) {

		System.out.println(" ~ NOT opeartor");

		// invert 12
		System.out.println("~ 12 = " + ~12);

		System.out.println(" | OR opeartor");

		// apply the | operator
		int x = 11 | 10;
		System.out.println("11|10 = " + x);

		System.out.println(" & AND opeartor");

		// apply the & operator
		int x1 = 11 & 10;
		System.out.println("11&10 = " + x1);

		System.out.println(" ^ XOR opeartor");

		// apply the ^ operator
		int x2 = 11 ^ 10;
		System.out.println("11^10 = " + x2);

		int y = 11 << 10;

		System.out.println("11<<10 = " + y);

		int z = 11 >> 10;

		System.out.println("11>>10 = " + z);

		int i = 11 >>> 10;

		System.out.println("11>>>10 = " + i);
		
		  int r = -1;  
		  
	       System.out.println(r>>>29);  // The value of 'x>>>29' is 00...0111
	       System.out.println(r>>>30);  // The value of 'x>>>30' is 00...0011 
	       System.out.println(r>>>31);  // The value of 'x>>>31' is 00...0001 

	}
}
