package com.corejava;


public class FloatTest {
	static final int i=1;
	static void m1(int x,float y){
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		System.out.println(i);
		FloatTest.m1(12,12.5f);
		System.out.println(i+11);
		float f1 = 3.4f;
		float f2 = 6.25f;

		if (f1 == 3.4f)
			System.out.println("same");
		else
			System.out.println("different");

		if (f2 == 6.25)
			System.out.println("same");
		else
			System.out.println("different");
		
		int a=2;
		a=a++;
		a=a++;
		System.out.println(a);
	}

}
