package fr.diginamic.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(2016, 05, 19, 23, 59, 30);
		Date date = cal.getTime();

		System.out.println(date.getDate() + "/0" + date.getMonth() + "/" + (1900 + date.getYear()));

		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();

		System.out.println(date2.getDate() + "/" + (date2.getMonth() + 1) + "/" + (1900 + date2.getYear()) 
		+ " " + date2.getHours() + ":" + date2.getMinutes() + ":" + date2.getSeconds());
	
	    System.out.printf(Locale.FRENCH, "Date Française: %tc \n", new Date());
		System.out.printf(Locale.CHINA, "Date Chinoise: %tc \n", new Date());
	    System.out.printf(Locale.GERMAN, "Date format Allemand: %tc", new Date());
	}

}
