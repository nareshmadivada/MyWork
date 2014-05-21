package com.examples;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.ArrayUtils;
import org.joda.time.DateTime;

public class DayTime {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {

		String dateStart = "02-03-2014 ";
		String dateStop = "02-11-2014";
		Date d1 = null;
		Date d2 = null;
		int curTime = 0, endTime = 0, mrgStart = 9, stDay = 0, endDay = 0;
		int[] wHours = { 9, 10, 11, 12, 13, 14, 15, 16, 17 };
		int[] nonWHrs = { 18, 19, 20, 21, 22, 23, 24, 1, 2, 3, 4, 5, 6, 7, 8 };
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Calendar cal = Calendar.getInstance();
		// d1 = cal.getTime();

		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter Start Date &Time"); String stTime =
		 * s.next(); System.out.println("Enter End Date &Time"); String endTime
		 * = s.next();
		 */
		// int day = cal.DAY_OF_WEEK;
		// curTime = cal.HOUR_OF_DAY;

		d1 = format.parse(dateStart);
		d2 = format.parse(dateStop);
		System.out.println("ddddd"+d1);
		DateTime dt1 = new DateTime(d1);
		DateTime dt2 = new DateTime(d2);
		curTime = dt1.getHourOfDay();
		stDay = dt1.getDayOfWeek();
		endDay = dt2.getDayOfWeek();
		endTime = dt2.getHourOfDay();
		boolean stWH = ArrayUtils.contains(wHours, curTime);
		boolean endWH = ArrayUtils.contains(wHours, endTime);

		if (stDay == 6 || stDay == 7) {
			System.out.println("Weekend");
		} else {

			if (stWH) {
				while (curTime < 17) {
					curTime += 1;
					endTime--;
					if (endTime == 0) {
						break;
					}

				}
				if (endTime == 0) {
					System.out.println("To day: " + curTime + "Hrs");
				} else {
					while (endTime >= 0) {
						mrgStart += 1;
						endTime--;
						if (endTime == 0) {
							break;
						}

					}
					System.out.println("Next Day:" + mrgStart + "Hrs");
				}

			} else {
				while (endTime >= 0) {
					mrgStart += 1;
					endTime--;
					if (endTime == 0) {
						break;
					}

				}
				System.out.println("Next Day:" + mrgStart + "Hrs");
			}

		}

		/*
		 * System.out.print(Days.daysBetween(dt1, dt2).getDays() + " days, ");
		 * System.out.print(Hours.hoursBetween(dt1, dt2).getHours() % 24 +
		 * " hours, "); System.out.print(Minutes.minutesBetween(dt1,
		 * dt2).getMinutes() % 60 + " minutes, ");
		 * System.out.print(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60 +
		 * " seconds.");
		 */

	}
}
