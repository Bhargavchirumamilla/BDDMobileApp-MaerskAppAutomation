package com.maersk.utilities;

import org.apache.log4j.Logger;

import com.maersk.apps.config.config;
import com.maersk.apps.helper.LoggerHelper;

public class TestData {

	private static String languageselection = config.getLanguage();
	static Logger log = LoggerHelper.getLogger(Logger.class);

	/**
	 * TestData * @author Bhargav Chirumamilla Maersk, Created by Bhargav
	 * Chirumamilla on 12/06/2020 Copyright (c) 2020 Maersk. All rights
	 * reserved.
	 * 
	 */

	public final static class getValidCalenderDateMonthYear {
		public final static String Calender_Date_Month_Year = "June202020";

	}

	public static String getlanguage() {
		String language = null;
		switch (languageselection) {

		case "EN":
			language = "";
			break;

		case "ES":
			language = "";
			break;

		case "FR":
			language = "";
			break;

		case "POR":
			language = "";
			break;

		case "CH":
			language = "";
			break;

		case "JP":
			language = "";
			break;

		}
		log.info("The language TestData class is being used to pass test data : " + language);
		return language;
	}

}
