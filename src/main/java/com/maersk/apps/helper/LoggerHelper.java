package com.maersk.apps.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Logger Helper
 * 
 *@author Bhargav Chirumamilla Maersk, Created by Bhargav Chirumamilla
 *         on 12/06/2020 Copyright (c) 2020 Maersk. All rights reserved.
 *
 */
public class LoggerHelper {

	private static boolean root = false;

	public static Logger getLogger(Class cls) {
		if (root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}

	public static void main(String[] args) {
		Logger log = LoggerHelper.getLogger(LoggerHelper.class);
		log.info("I am test");

	}
}
