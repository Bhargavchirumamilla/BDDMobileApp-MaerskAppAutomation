package com.maersk.apps.stepdefinition;


import org.testng.Assert;

import com.maersk.apps.helper.LoggerHelper;
import com.maersk.apps.launcher.TestHarness;
import com.maersk.apps.pageobjects.SplashScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Splash extends TestHarness {
	private SplashScreen Splash;
	protected static org.apache.log4j.Logger log = LoggerHelper.getLogger(Splash.class);

	@Given("^Launch MaerskShipping App$")
	public void launch_MaerskShipping_App() throws Throwable {
		Splash = new SplashScreen(testdriver);
		Splash.openApp();
	}

	@Then("^Verify Shipping Icons which are Scrolling$")
	public void verify_Shipping_Icons_which_are_Scrolling() throws Throwable {
		Splash = new SplashScreen(testdriver);
		Assert.assertTrue(Splash.shippingLogos(),
				"Splash Screen : Shipping Icons is mismatched");
	}

}
