package com.corejava;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 5, j = 0;

		if (System.out.printf("Helloworld\n") != null) {

		}
		switch (i) {

		case 0:
			j += 3;

		default:
			j += 4;
			System.out.println("default");

		case 2:
			System.out.println("case 2");

		}
		System.out.println("J" + j);
		
		// String Test
		String s = "30";
		s = s.concat(".5");
		System.out.println(s);
		double d = Double.parseDouble(s);
		s = Double.toString(d);
		System.out.println(s);
		int p = (int) Math.ceil(Double.valueOf(s).doubleValue());
		System.out.println(p);

	}

}
