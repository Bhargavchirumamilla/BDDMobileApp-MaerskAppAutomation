package com.maersk.apps.runner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;
import com.maersk.apps.config.config;
import com.maersk.apps.launcher.TestHarness;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

/**
 * Cucumber Runner
 * 
 * @author Bhargav Chirumamilla Maersk, Created by Bhargav Chirumamilla on
 *         12/06/2020 Copyright (c) 2020 Maersk. All rights reserved.
 * 
 */

@CucumberOptions(features = { "resources/Feature" },

		glue = { "com.maersk.apps.stepdefinition" },

		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:TestResults/cucumber-reports/TestAutomation.html",
				"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt" }, monochrome = true, dryRun = false, tags = { "@SanityTest" })

public class CucumberTest extends TestHarness {

	private static TestNGCucumberRunner testRunner;

	@Before
	public void beforeScenario(Scenario scenario) {
		Reporter.assignAuthor("Bhargav Chirumamilla");
	}

	@BeforeClass
	private void launchTest() {

		testRunner = new TestNGCucumberRunner(CucumberTest.class);

	}

	@Test(description = "Apps", dataProvider = "Feature")
	public void login(CucumberFeatureWrapper cFeature) {
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	@DataProvider(name = "Feature")
	public Object[][] getFeatures() {
		return testRunner.provideFeatures();
	}

	@AfterClass
	public static void report() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/extentconfig.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", System.getProperty("os.name"));
		Reporter.setSystemInfo("Language", config.getLanguage());
		Reporter.setSystemInfo("Platform", config.getPlatform());
		Reporter.setSystemInfo("BuildVersion", config.getBuildVersion());
		Reporter.setSystemInfo("Language", config.getLanguage());
		testRunner.finish();
	}

}
