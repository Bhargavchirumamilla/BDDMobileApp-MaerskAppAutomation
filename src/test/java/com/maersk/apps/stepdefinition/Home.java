package com.maersk.apps.stepdefinition;

import org.testng.Assert;

import com.maersk.apps.helper.LoggerHelper;
import com.maersk.apps.launcher.TestHarness;
import com.maersk.apps.pageobjects.HomeScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Home extends TestHarness {
	private HomeScreen Home;
	protected static org.apache.log4j.Logger log = LoggerHelper.getLogger(Home.class);

	@Given("^User navigated To Tracking Page By Default$")
	public void user_navigated_To_Tracking() throws Throwable {
		Home = new HomeScreen(testdriver);
		Assert.assertTrue(Home.startTracking(), "Navigate to Home page is mismatched");
	}

	@When("^Verify Login Button$")
	public void verify_Login_Button() throws Throwable {
		Assert.assertTrue(Home.logIn(), "Login Button is mismatched");

	}

	@When("^Verify Tracking Action Bar$")
	public void verify_Tracking() throws Throwable {
		Home = new HomeScreen(testdriver);
		Assert.assertTrue(Home.trackingActionBar(), " Tracking Action Baris mismatched");
	}

	@Then("^Verify Schedules Action Bar$")
	public void verify_Schedules() throws Throwable {
		Assert.assertTrue(Home.schedulesActionBar(), " Schedules Action Baris mismatched");
	}

	@Then("^Verify Price/Book Action Bar$")
	public void verify_Price_Book() throws Throwable {
		Assert.assertTrue(Home.priceBookActionBar(), " Price/Book Action Baris mismatched");
	}

	@Then("^Verify Live Chat Action Bar$")
	public void verify_Live_Chat() throws Throwable {
		Assert.assertTrue(Home.liveChatActionBar(), " Live Chat Action n Baris mismatched");
	}

	@Then("^Verify More Action Bar$")
	public void verify_More() throws Throwable {
		Assert.assertTrue(Home.moreActionBar(), " More Action Baris mismatched");
	}

}
