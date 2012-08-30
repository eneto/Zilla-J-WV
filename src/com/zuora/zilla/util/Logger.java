package com.zuora.zilla.util;

import java.text.DateFormat;
import java.util.Calendar;

public class Logger {
	public static void Log(String message){
	    Calendar cal = Calendar.getInstance();
	    DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,
	        DateFormat.MEDIUM);
	    String dateStr = df.format(cal.getTime());
	    
		System.out.println("["+dateStr+"]  " + message);
	}
}
