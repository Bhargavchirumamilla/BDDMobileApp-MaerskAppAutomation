package com.maersk.utilities;

import java.time.Duration;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.maersk.apps.config.config;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

/**
 * BaseDeviceView
 * 
 * @author Bhargav Chirumamilla Maersk, Created by Bhargav Chirumamilla on
 *         12/06/2020 Copyright (c) 2020 Maersk. All rights reserved.
 * 
 */

public class BaseDeviceView extends BaseDeviceElement {

	public static String getAttributeType = null;
	protected Wait<WebDriver> wait;
	protected MobileElement element = null;
	AppiumDriver<MobileElement> driver;

	public BaseDeviceView() {

	}

	/**
	 * This method will wait for Mobile element to appear
	 * 
	 * @param element
	 * @param timeout
	 */
	// Wait for element present for Mobile element
	public void waitForWebElementPresent(MobileElement element, int timeout) {
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	/**
	 * This method will wait for a Mobile element present
	 */

	public void fluentWait(WebDriver driver, long withTimeoutDuration) {

		wait = new FluentWait<WebDriver>(driver).withTimeout(withTimeoutDuration, TimeUnit.SECONDS).pollingEvery(3,
				TimeUnit.SECONDS);

	}

	public void visibilityOf(MobileElement element, long withTimeoutDuration) {
		fluentWait(testdriver, withTimeoutDuration);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToBeClickable(MobileElement element, long withTimeoutDuration) {
		fluentWait(testdriver, withTimeoutDuration);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void acceptAlerts() {
		try {
			Thread.sleep(2);
			testdriver.switchTo().alert().accept();
			log.info("Alerts Presented and tap Accept");
		} catch (Exception ex) {
			log.info("Alerts not Presented");
		}
	}

	public void dismissAlerts() {
		try {
			Thread.sleep(2);
			testdriver.switchTo().alert().dismiss();
			log.info("Alerts Presented and tap Dismiss");
		} catch (Exception ex) {
			log.info("Alerts not Presented");
		}
	}

	/**
	 * Swipes down from the top of the screen
	 * 
	 * @throws InterruptedException
	 * 
	 */

	public void swipeUp() throws InterruptedException {
		Thread.sleep(2);
		Duration smallWait = Duration.ofMillis(1000);
		Dimension size = testdriver.manage().window().getSize();
		int startY = (int) (size.height * 0.90);
		int endY = (int) (size.height * 0.30);
		int startX = size.width / 2;

		TouchAction tAction = new TouchAction(testdriver);
		int iosEndY = (int) (size.height * 0.50);
		if (config.getPlatform().equalsIgnoreCase("iOS")) {
			tAction.press(startX, startY).waitAction(Duration.ofMillis(200)).moveTo(6, -iosEndY).release().perform();
		} else {
			tAction.press(startX, startY).waitAction(smallWait).moveTo(startX, endY).release().perform();
		}
		log.info("Swipe Up completed");
	}

	public void swipeDown() {
		Duration smallWait = Duration.ofMillis(1000);
		log.info("About to do swipe");
		Dimension size = testdriver.manage().window().getSize();
		int startX = (int) size.width / 2;
		int startY = (int) size.height / 4;
		int endX = (int) size.width / 2;
		int endY = (int) (size.height / 2);

		TouchAction tAction = new TouchAction(testdriver);
		if (config.getPlatform().equalsIgnoreCase("iOS")) {
			tAction.press(startX, startY).waitAction(Duration.ofMillis(200)).moveTo(6, endY).release().perform();
		} else {
			tAction.press(startX, startY).waitAction(smallWait).moveTo(endX, endY).release().perform();
		}
		log.info("Swipe  Down completed");
	}

	public void swipeRightToLeft() {
		log.info("About to swipe from Right to Left");
		Duration smallWait = Duration.ofMillis(1000);
		Dimension size = testdriver.manage().window().getSize();
		int startX = (int) (size.width - size.width / 5);
		int startY = (int) (size.height / 2);

		int endX = (int) (size.width / 5);
		int endY = (int) (size.height / 2);
		TouchAction tAction = new TouchAction(testdriver);
		if (config.getPlatform().equalsIgnoreCase("iOS")) {
			tAction.press(startX, startY).waitAction(Duration.ofMillis(200)).moveTo(-size.width / 4, 0).release()
					.perform();
		} else {
			tAction.press(startX, startY).waitAction(smallWait).moveTo(endX, endY).release().perform();
		}

		log.info("Swipe RightToLeft completed");
		// We may have to refresh the page on android
		if (!config.getPlatform().equalsIgnoreCase("iOS")) {
			log.info("Refreshing the page");
			testdriver.getPageSource();
		}
	}

	public void swipeLeftToRight() {
		log.info("About to swipe from Left to Right");
		Duration smallWait = Duration.ofMillis(1000);
		Dimension size = testdriver.manage().window().getSize();
		int startX = (int) (size.width - size.width / 5);
		int startY = (int) (size.height / 2);

		int endX = (int) (size.width / 5);
		int endY = (int) (size.height / 2);
		TouchAction tAction = new TouchAction(testdriver);
		if (config.getPlatform().equalsIgnoreCase("iOS")) {
			tAction.press(endX, startY).waitAction(Duration.ofMillis(200)).moveTo(-size.width / 4, 0).release()
					.perform();
		} else {
			tAction.press(endX, startY).waitAction(smallWait).moveTo(startX, startY).release().perform();
		}

		log.info("Swipe Left To Right completed");
		// We may have to refresh the page on android
		if (!config.getPlatform().equalsIgnoreCase("iOS")) {
			log.info("Refreshing the page");
			testdriver.getPageSource();
		}
	}

	public String UiScrollable(MobileElement mobileElement) {
		return "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + mobileElement
				+ ".instance(0));";

	}

	public void hidekeyboard() {
		if (config.getPlatform().equalsIgnoreCase("iOS")) {

			TouchAction tap = new TouchAction(testdriver);
			tap.tap(PointOption.point(1280, 1013)).perform();
		} else {

			((HidesKeyboard) testdriver).hideKeyboard();
		}
	}

}