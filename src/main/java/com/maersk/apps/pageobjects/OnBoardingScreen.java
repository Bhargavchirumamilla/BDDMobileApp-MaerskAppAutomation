package com.maersk.apps.pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.maersk.utilities.BaseDeviceView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class OnBoardingScreen extends BaseDeviceView {

	AppiumDriver<MobileElement> driver;

	public OnBoardingScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/toolbar")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement termsConditionsHeader;

	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/usage_tv")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement usageoftheMaerskapplication;

	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/continue_button")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement accept_termsConditions;

	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/view_terms_button")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement view_termsConditions;

	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/terms")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement webView_termsConditions;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.widget.TextView")
	List<MobileElement> headerTermsConditions;

	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/existing_customer_button")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement existing_customer_button;

	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/third_party_agent_button")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement third_party_agent_button;

	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/trucker_button")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement trucker_button;

	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/none_of_the_above_button")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement none_of_the_above_button;
	
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/interstitial_image")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement newPriceImage;
	
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[1]")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement pagination_1;
	
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[2]")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement pagination_2;
	
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/interstitial_image")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement offermage;
	
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/got_it_btn")
	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement gotIt;
	
	
	public boolean existing_customer_button() {
		return verify_element_Enabled(existing_customer_button);
	}
	public boolean newPriceImage() {
		return verify_element_Enabled(newPriceImage);
	}
	
	public boolean  pagination_1() {
		return verify_element_Enabled( pagination_1);
	}
	
	public boolean pagination_2() {
		return verify_element_Enabled(pagination_2);
	}
	
	public boolean offermage() {
		return verify_element_Enabled(offermage);
	}
	

	public boolean tapGotIt() {
		tap(gotIt);
		return true;
	}

	public boolean third_party_agent_button() {
		return verify_element_Enabled(third_party_agent_button);
	}

	public boolean trucker_button() {
		return verify_element_Enabled(trucker_button);
	}

	public boolean none_of_the_above_button() {
		return verify_element_Enabled(none_of_the_above_button);
	}

	public String txt_headerTermsConditions(int index) throws InterruptedException {
		return verify_text(headerTermsConditions.get(0));
	}

	public String txt_usageoftheMaerskapplication() throws InterruptedException {
		return verify_text(usageoftheMaerskapplication);
	}

	public String txt_accept_termsConditions() throws InterruptedException {
		return verify_text(accept_termsConditions);
	}

	public boolean termsConditionsHeader() {
		return verify_element_Enabled(termsConditionsHeader);
	}

	public boolean webView_termsConditions() {
		return verify_element_Enabled(webView_termsConditions);
	}

	public void tap_view_termsConditions() {
		tap(view_termsConditions);
	}

	public void tap_accept_termsConditions() {
		tap(accept_termsConditions);
	}

	public void tap_none_of_the_above_button() {
		tap(none_of_the_above_button);
	}
	
	
	
	
	
	

}
