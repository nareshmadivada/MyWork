package com.examples;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetCurrentDateTime {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss.SSS a");
		// String To Date Conversion
		String strDate = "2014-02-06 10:11:12.123 AM ";
		java.util.Date dates = dateFormat.parse(strDate);
		System.out.println("String-Date " + dates);
		// get current date time with Date()
		long curmils = System.currentTimeMillis();
		long nanotm = System.nanoTime();
		System.out.println("Nono TM: " + nanotm);
		System.out.println("sys TM " + curmils);
		java.util.Date date = new java.util.Date();
		Date sqlDate = new Date(date.getTime());
		System.out.println("Sqldate " + sqlDate);
		System.out.println(dateFormat.format(sqlDate));

		// get current date time with Calendar()
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		Calendar grCal = new GregorianCalendar();
		System.out.println(dateFormat.format(grCal.getTime()));
		// Check Leap Year
		GregorianCalendar calla=new GregorianCalendar();
		System.out.println(calla.isLeapYear(2000));
		

	}

}
