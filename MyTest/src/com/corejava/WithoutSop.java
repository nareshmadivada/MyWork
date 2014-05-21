package com.corejava;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class WithoutSop {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				System.out));
		PrintStream p = System.out;
		// Console cons = System.console();
		// cons.printf("i");
		System.out.printf("e=%f", Math.E);
		System.out.write("\nNaresh".getBytes());
		// System.out.write("99".getBytes());
		for (int i = 1; i <= 10; i++) {
			out.write(i + "\n");
			p.println(i);

		}
		out.flush();

		// By using String
		String message = "";
		for (int i = 1; i <= 10; i++) {
			message += String.valueOf(i) + " ";
		}
		System.out.print(message);

	}

}
