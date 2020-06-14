package com.maersk.apps.stepdefinition;

import org.testng.Assert;

import com.maersk.apps.config.config;
import com.maersk.apps.helper.LoggerHelper;
import com.maersk.apps.launcher.TestHarness;
import com.maersk.apps.pageobjects.LanguageSelectionScreen;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LanguageSelection extends TestHarness {
	private LanguageSelectionScreen Language;

	protected static org.apache.log4j.Logger log = LoggerHelper.getLogger(Splash.class);

	@When("^Verify Select Language in Header Title$")
	public void user_In_Language_Selection_Screen() throws Throwable {
		Language = new LanguageSelectionScreen(testdriver);
		Assert.assertTrue(Language.selectLanguageToolBar(), "Language Selection Tools Bar is mismatched");
	}

	@And("^Verify Ok/Continue Button Bottom of the screen$")
	public void verify_Ok_Continue_Button_Bottom_of_the_screen() throws Throwable {
		Language = new LanguageSelectionScreen(testdriver);
		Assert.assertTrue(Language.okorContinue(), "Ok/Continue Button is mismatched");
	}

	@Given("^English Language Selected Automatically by Default With TickIcon$")
	public void english_Language_Selected_Automatically_by_Default_With_TickIcon() throws Throwable {
		Language = new LanguageSelectionScreen(testdriver);
		Assert.assertTrue(Language.checkButton(), "Check Button is mismatched");
	}

	@Then("^Select any Language$")
	public void select_any_Language() throws Throwable {
		Assert.assertTrue(Language.languageSelection((config.getLanguage())), "Select Language Is Mismatched");

	}

	@And("^Select Ok/Continue Button Bottom of the screen$")
	public void select_Ok_Continue_Button_Bottom_of_the_screen() throws Throwable {
         Assert.assertEquals(Language.txt_okorContinue(), configProperties.getProperty("terms.accept"),
				"Ok/Continue Button Text mismatched");

	}

}
