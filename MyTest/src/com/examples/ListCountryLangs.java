/**
 * 
 */
package com.examples;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * @author naresh
 * 
 */
public class ListCountryLangs {
	private Map<String, String> map = new HashMap<String, String>();

	public ListCountryLangs() {
		initLanguageMap();
	}

	public static void main(String[] args) {
		ListCountryLangs lc = new ListCountryLangs();
		lc.getLanguages();
	}

	public void getLanguages() {
		int supportedLocale = 0, nonSupportedLocale = 0;
		String[] countries = Locale.getISOCountries();
		for (String code : countries) {
			Locale obj = null;
			if (map.get(code) == null) {
				obj = new Locale("", code);
				nonSupportedLocale++;

			} else {
				obj = new Locale(map.get(code), code);
				supportedLocale++;

			}
			System.out.println("Country Code = " + obj.getCountry()
					+ ", Country Name = " + obj.getDisplayCountry(obj)
					+ ", Languages = " + obj.getDisplayLanguage());

		}
		System.out.println("nonSupportedLocale : " + nonSupportedLocale);
		System.out.println("supportedLocale : " + supportedLocale);

	}

	public void initLanguageMap() {
		Locale[] locale = Locale.getAvailableLocales();
		for (Locale obj : locale) {
			if ((obj.getDisplayCountry() != null)
					&& (!"".equals(obj.getDisplayCountry()))) {
				map.put(obj.getCountry(), obj.getLanguage());
			}

		}
	}

}
