package com.zuora.zilla.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.TimeZone;

import com.zuora.api.*;
import com.zuora.api.object.*;

public class ZuoraUtility {

	/** The Constant FILE_PROPERTY_NAME. */
	private static final String FILE_PROPERTY_NAME = "config.properties";

	/** The Constant FILE_PATH. */
	private static final String FILE_PATH = "filepath";

	/** The properties. */
	private static Properties properties;

	
	/**
	 * Print a message.
	 */
	public void print(String msg) {
		System.out.println(msg);
	}
	
	/**
	 * Load properties.
	 */
	public void loadProperties() {
		// Retrieve resource
		InputStream is = getClass().getResourceAsStream("/" + FILE_PROPERTY_NAME);
		properties = new Properties();
		try {
			properties.load(is);
		} catch (IOException e) {
			print("Error while reading input data file: "
					+ FILE_PROPERTY_NAME);
			print(e.getMessage());
		}
	}

	/**
	 * Gets the properties.
	 * 
	 * @return the properties
	 */
	public Properties getProperties() {
		if (properties == null) {
			loadProperties();
		}
		return properties;
	}

	/**
	 * Gets the property value.
	 * 
	 * @param propertyName
	 *            the property name
	 * @return the property value
	 */
	public String getPropertyValue(String propertyName) {
		return getProperties().getProperty(propertyName);
	}

	/**
	 * Gets the current date.
	 * 
	 * @return the current date
	 */
	public static String getCurrentDate() {
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar calendar = new GregorianCalendar();
		calendar.setTimeZone(tz);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		return dateFormat.format(calendar.getTime());
	}
	
	/**
	 * Get current calendar.
	 * 
	 * @return the calendar
	 */
	public static Calendar getCurrentCalendar() {
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar calendar = new GregorianCalendar();
		calendar.setTimeZone(tz);
		return calendar;
	}
	
	/**
	 * Get today's day number.
	 * 
	 * @return the current day number
	 */
	public static int getCurrentDayNumber() {
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar calendar = new GregorianCalendar();
		calendar.setTimeZone(tz);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * Write file.
	 * 
	 * @param data
	 *            the data
	 */
	public static void writeFile(byte[] data) {
		ZuoraUtility utility = new ZuoraUtility();
		new File(utility.getPropertyValue(FILE_PATH)).mkdirs();
		String strFilePath = utility.getPropertyValue(FILE_PATH) + "INV-"
				+ System.currentTimeMillis() + ".pdf";
		try {
			FileOutputStream fos = new FileOutputStream(strFilePath);
			fos.write(data);
			fos.close();
			System.out.println("Invoice PDF generated @ " + strFilePath);
		} catch (FileNotFoundException ex) {
			System.out.println("FileNotFoundException : " + ex);
		} catch (IOException ioe) {
			System.out.println("IOException : " + ioe);
		}
	}
}
