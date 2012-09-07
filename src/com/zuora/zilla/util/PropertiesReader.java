package com.zuora.zilla.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

	/** The Constant FILE_PROPERTY_NAME. */
	private static final String FILE_PROPERTY_NAME = "config.properties";

	/** The Constant FILE_PATH. */
	private static final String FILE_PATH = "filepath";

	/** The properties. */
	private static Properties properties;
	
	/**
	 * Constructor loads in the properties file.
	 */
	public PropertiesReader(){
		loadProperties();
	}
	
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
}