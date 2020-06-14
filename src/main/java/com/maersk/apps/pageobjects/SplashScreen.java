package com.maersk.apps.pageobjects;

import org.openqa.selenium.support.PageFactory;

import com.maersk.utilities.BaseDeviceView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SplashScreen extends BaseDeviceView {
	AppiumDriver<MobileElement> driver;


	public SplashScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@iOSFindBy(id = "need ipa file to identify")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/animation_view")
	MobileElement animationView;
	
	public boolean shippingLogos() throws InterruptedException {
		return verify_element_Enabled(animationView);
	}

}
