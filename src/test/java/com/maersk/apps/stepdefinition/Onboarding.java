package com.maersk.apps.stepdefinition;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.maersk.apps.config.config;
import com.maersk.apps.helper.LoggerHelper;
import com.maersk.apps.launcher.TestHarness;
import com.maersk.apps.pageobjects.OnBoardingScreen;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Onboarding extends TestHarness {

	private OnBoardingScreen Onboarding;
	protected static org.apache.log4j.Logger log = LoggerHelper.getLogger(Onboarding.class);

	@Given("^User navigated To Terms&Conditions screen from Country Section Screen$")
	public void user_navigated_To_Terms_Conditions_screen_from_Country_Section_Screen() throws Throwable {
		Onboarding = new OnBoardingScreen(testdriver);
		Assert.assertEquals(Onboarding.txt_usageoftheMaerskapplication(), configProperties.getProperty("terms.use"),
				"Usage of the Maersk Text mismatched");

	}

	@When("^Verify Terms & Conditions In Header$")
	public void verify_Terms_Conditions_In_Header() throws Throwable {
		Assert.assertTrue(Onboarding.termsConditionsHeader(), "Terms Conditions Header is mismatched");
	}

	@Then("^Verify Accepting the terms and Conditions of use Text$")
	public void verify_Accepting_the_terms_and_Conditions_of_use_Text() throws Throwable {
		Assert.assertEquals(Onboarding.txt_headerTermsConditions(0), configProperties.getProperty("terms.header"),
				"Header of Terms & Conditions Text mismatched");
		

	}

	@Then("^Select View Terms & Conditions Button$")
	public void select_View_Terms_Conditions_Button() throws Throwable {
		Onboarding = new OnBoardingScreen(testdriver);
		Onboarding.tap_view_termsConditions();
	}

	@Then("^Web View -Verify User Navigated to terms of use screen$")
	public void verify_User_Navigated_to_terms_of_use_screen() throws Throwable {
		Assert.assertTrue(Onboarding.webView_termsConditions(), "Web view Terms Conditions Header is mismatched");
	}

	@And("^Verify Header of Terms & Conditions$")
	public void verify_Header_of_Terms_Conditions() throws Throwable {
		Assert.assertTrue(Onboarding.termsConditionsHeader(),
				"Accepting the terms and Conditions Text mismatched");
		
	}

	@Then("^Accept Terms & Conditions$")
	public void accept_Terms_Conditions() throws Throwable {
		Onboarding.tap_accept_termsConditions();
	}

	@When("^Verify Existing Customer$")
	public void verify_Existing_Customer() throws Throwable {
		Onboarding = new OnBoardingScreen(testdriver);
		Assert.assertTrue(Onboarding.existing_customer_button(), "Existing Customer is mismatched");

	}

	@Then("^Third Pary Agent$")
	public void third_Pary_Agent() throws Throwable {
		Assert.assertTrue(Onboarding.third_party_agent_button(), "Third Pary Agent is mismatched");
	}

	@Then("^Trucker$")
	public void trucker() throws Throwable {
		Assert.assertTrue(Onboarding.trucker_button(), "Trucker is mismatched");
	}

	@And("^None Of the Above$")
	public void none_Of_the_Above() throws Throwable {
		Assert.assertTrue(Onboarding.none_of_the_above_button(), "None Of the Above is mismatched");
	}

	@And("^Select None Of the Above$")
	public void select_None_Of_the_Above() throws Throwable {
		Onboarding.tap_none_of_the_above_button();
	}

	@When("^User have New New Price and Book Feature Image$")
	public void user_have_New_New_Price_and_Book_Feature_Image() throws Throwable {
		Onboarding = new OnBoardingScreen(testdriver);
		Assert.assertTrue(Onboarding.newPriceImage(), "Book Feature Image is Broken");
	}

	@And("^Pagination bottom of the screen$")
	public void pagination_bottom_of_the_screen() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(Onboarding.pagination_1(), "Pagination is mismatched");
		softAssert.assertTrue(Onboarding.pagination_2(), "Pagination is mismatched");
		softAssert.assertAll();
	}

	@Then("^Swipe Right$")
	public void swipe_Right() throws Throwable {
		Onboarding.swipeRightToLeft();
	}
	
	@Then("^Select Got It$")
	public void select_Got_It() throws Throwable {
		Onboarding.tapGotIt();
	}

	@Then("^User have Check Spot offer and Book it right away Image$")
	public void user_have_Check_Spot_offer_and_Book_it_right_away_Image() throws Throwable {
		Assert.assertTrue(Onboarding.offermage(), "Check Spot offer and Book it right away Image is broken");
	}

	@Then("^Swipe Left$")
	public void swipe_Left() throws Throwable {
		Onboarding.swipeLeftToRight();
	}

	@And("^Verify User in New New Price and Book Feature Screen$")
	public void verify_User_in_New_New_Price_and_Book_Feature_Screen() throws Throwable {
		Assert.assertTrue(Onboarding.newPriceImage(), "After Swipe Left Book Feature Image is Broken");
	}

	@Then("^Swipe Right and Select Got It$")
	public void swipe_Right_and_Select_Got_It() throws Throwable {
		Onboarding.swipeRightToLeft();
		Assert.assertTrue(Onboarding.tapGotIt(), "Got It is Mismatched");
	}

	@When("^Select Allow in alert$")
	public void select_Allow_in_alert() throws Throwable {
		Onboarding = new OnBoardingScreen(testdriver);
		if (config.getPlatform().equalsIgnoreCase("iOS")) {
			Onboarding.acceptAlerts();
		} else {
			log.info("No Alert for" + config.getPlatform());
		}
	}

}
