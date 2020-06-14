/**
 * BaseDeviceElement
 * 
 * @author Bhargav Chirumamilla Maersk, Created by Bhargav Chirumamilla
 *         on 12/06/2020 Copyright (c) 2020 Maersk. All rights reserved.
 * 
 */

package com.maersk.utilities;

import java.util.Calendar;
import java.util.Random;

import org.apache.log4j.Logger;

import com.maersk.apps.helper.LoggerHelper;
import com.maersk.apps.launcher.TestHarness;

import io.appium.java_client.MobileElement;

public abstract class BaseDeviceElement extends TestHarness {
	protected Object elementSelector;
	protected static Logger log = LoggerHelper.getLogger(BaseDeviceElement.class);

	/**
	 * Returns the current date in the jvm's timezone
	 *
	 * @param currentDate
	 * @param timeZoneId
	 * @return Date object
	 */
	public static long getCurrentDate() {

		Calendar cal = Calendar.getInstance();
		return cal.getTime().getTime();
	}

	public static int getRandomNumber() {

		Random rnd = new Random();
		int id = rnd.nextInt(5000);
		return id;

	}

	public String verify_text(MobileElement element) throws InterruptedException {
		String text = element.getAttribute(BaseDeviceView.getAttributeType).trim();
		log.info("User found text in screen is available : " + text);
		return text;
	}

	public String verify_text_selected(MobileElement element) throws InterruptedException {
		String text = element.getAttribute("selected").trim();
		log.info("User found Selected Item Automatically in screen is available : " + text);
		return text;
	}

	public boolean verify_element_Enabled(MobileElement element) {
		boolean res = element.isEnabled();
		log.info("User found  element in screen is available : " + res);
		return res;
	}

	public String verify_element_Present(MobileElement element) {
		boolean res = element.isDisplayed();
		log.info("User found  element is Displayed in screen is available : " + res);
		return null;
	}

	public void tap(MobileElement element) {
		element.click();
		log.info("User Tap MobileElement is  : " + element);

	}

	public String verify_text_newLine(MobileElement element) throws InterruptedException {
		String text = element.getAttribute(BaseDeviceView.getAttributeType).replaceAll("\n", "");
		log.info("User found text in screen is available : " + text);
		return text;
	}

	public void clearTextBoxWithTip(MobileElement element) {
		element.clear();
		log.info("User Clear Text Box With Tip is  : " + element);
	}

}
