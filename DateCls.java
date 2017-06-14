package com.java;

import java.util.Calendar;
import java.util.Date;


public class DateCls 
{
	public static void main(String[] args) 
	{
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(date.getHours());
		System.out.println(date.getYear()+1900);
		System.out.println(date.getDay());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getFirstDayOfWeek());
	}
}
