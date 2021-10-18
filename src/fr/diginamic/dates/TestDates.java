package fr.diginamic.dates;

import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.getDate() + "/" + (date.getMonth() + 1) + "/" + (1900 + date.getYear()));
		
		Date date2 = new Date(2016, 5, 19, 23, 59, 30);
		System.out.println(date2.getDate() + "/0" + date2.getMonth() + "/" + date2.getYear() 
		+ " " + date2.getHours() + ":" + date2.getMinutes() + ":" + date2.getSeconds());
		
		Date date3 = new Date();
		System.out.println(date3.getDate() + "/" + (date3.getMonth() + 1) + "/" + (1900 + date3.getYear()) 
		+ " " + date3.getHours() + ":" + date3.getMinutes() + ":" + date3.getSeconds());
	}

}
