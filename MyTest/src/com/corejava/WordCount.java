package com.corejava;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Hai This is Java is";
		String[] words = string.toLowerCase().split("\\s+");
		Map<String, Integer> wordCounts = new HashMap<String, Integer>();
		Date date=new Date();
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		int year=cal.get(Calendar.YEAR);
		System.out.println(year);

		for (String word : words) {
			Integer count = wordCounts.get(word);
			if (count == null) {
				count = 0;
			}
			wordCounts.put(word, count + 1);
			System.out.println("count" + count);
		}
		List<String> list=new ArrayList<String>();
		int wordCount = 1;
		String[] temp = new String[string.length()];

		for (int i = 0; i < string.length(); i++) {
			char chardata = string.charAt(i);
			String str=Character.toString(chardata);
			list.add(str);
			if (string.charAt(i) == ' ') {
				
				String s=list.toString();
				System.out.println(s);
				
				int fre = Collections.frequency(list, s);
				System.out.println(wordCount + " Word frequency " + fre);
				wordCount++;
			}
		}

		System.out.println("No of Word count is = " + wordCount);
	}
}
