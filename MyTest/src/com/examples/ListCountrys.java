package com.examples;

import java.util.Locale;

public class ListCountrys {
	private ListCountrys(){
		System.out.println("private Constructor");
		
	}
	public static void main(String[] args) {
		ListCountrys cc = new ListCountrys();
		cc.getCountrys(Locale.UK);
	}
	public final native String add(String s);
	public native int as();

	public void getCountrys(Locale locale) {
		int i = 1;
		String[] locales = Locale.getISOCountries();
		for (String s : locales) {
			Locale l =new Locale("", s);
			System.out.println(i + ") Country Code = " + l.getCountry()
					+ ", Country Name =" + l.getDisplayCountry(locale));
			i++;

		}
	}

}
