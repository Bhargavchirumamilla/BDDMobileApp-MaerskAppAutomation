package com.maersk.apps.pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.maersk.utilities.BaseDeviceView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LanguageSelectionScreen extends BaseDeviceView {

	AppiumDriver<MobileElement> driver;
	private OnBoardingScreen Onboarding;

	public LanguageSelectionScreen(AppiumDriver<MobileElement> driver) {
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
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/toolbar")
	MobileElement selectLanguageToolBar;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/continue_button")
	MobileElement okorContinue;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/language_check")
	MobileElement checkButton;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.widget.TextView")
	List<MobileElement> select_LanguageName;

	public boolean languageSelection(String languageName) throws InterruptedException {
		boolean flag = true;
		try {

			switch (languageName) {
			case "EN":
				tap(select_LanguageName.get(1));
				break;

			case "ES":
				tap(select_LanguageName.get(2));
				break;

			case "FR":
				tap(select_LanguageName.get(3));
				break;

			case "POR":
				tap(select_LanguageName.get(4));
				break;

			case "CH":
				tap(select_LanguageName.get(5));
				break;

			case "JP":
				tap(select_LanguageName.get(6));
				break;

			default:

				break;
			}
		} catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException ex) {
			log.error("User,Unable to Select Language Under Select Language Screen", ex);
			flag = false;
		}
		return flag;
	}

	public String txt_okorContinue() throws InterruptedException {
		Onboarding = new OnBoardingScreen(testdriver);
		tap(okorContinue);
		visibilityOf(Onboarding.accept_termsConditions,7);
		return verify_text(Onboarding.accept_termsConditions);
	}

	public boolean checkButton() throws InterruptedException {
		return verify_element_Enabled(checkButton);
	}

	public boolean okorContinue() throws InterruptedException {
		return verify_element_Enabled(okorContinue);
	}

	public boolean selectLanguageToolBar() throws InterruptedException {
		return verify_element_Enabled(selectLanguageToolBar);
	}
}
