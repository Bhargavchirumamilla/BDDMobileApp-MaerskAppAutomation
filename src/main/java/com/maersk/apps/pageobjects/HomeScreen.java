package com.maersk.apps.pageobjects;

import org.openqa.selenium.support.PageFactory;

import com.maersk.utilities.BaseDeviceView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomeScreen extends BaseDeviceView {

	AppiumDriver<MobileElement> driver;

	public HomeScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/**
	 * 
	 * Xpath
	 * 
	 * Using XPath locators is not recommended and can lead to fragile tests.
	 * Ask development team to provide unique accessibility locators instead!
	 * Maersk Dev's need to provide Accessibility id for both iOS/Android.As of
	 * now Using Xpath.
	 */
	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/label_start_tracking")
	MobileElement startTracking;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/sign_in_button")
	MobileElement logIn;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='Tracking']")
	MobileElement trackingActionBar;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='Schedules']")
	MobileElement schedulesActionBar;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='Price/Book']")
	MobileElement priceBookActionBar;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='Live chat']")
	MobileElement liveChatActionBar;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='More']")
	MobileElement moreActionBar;
	
	public boolean trackingActionBar() throws InterruptedException {
		return verify_element_Enabled(trackingActionBar);
	}
	public boolean schedulesActionBar() throws InterruptedException {
		return verify_element_Enabled(schedulesActionBar);
	}
	public boolean priceBookActionBar() throws InterruptedException {
		return verify_element_Enabled(priceBookActionBar);
	}
	public boolean liveChatActionBar() throws InterruptedException {
		return verify_element_Enabled(liveChatActionBar);
	}
	public boolean moreActionBar() throws InterruptedException {
		return verify_element_Enabled(moreActionBar);
	}
	

	public boolean startTracking() throws InterruptedException {
		return verify_element_Enabled(startTracking);
	}
	

	public boolean logIn() throws InterruptedException {
		return verify_element_Enabled(logIn);
	}

}
