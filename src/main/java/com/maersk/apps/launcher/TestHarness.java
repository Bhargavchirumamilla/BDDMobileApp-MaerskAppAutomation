
package com.maersk.apps.launcher;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Properties;

import org.apache.log4j.Logger;

import org.testng.ITestContext;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maersk.apps.config.config;
import com.maersk.apps.helper.LoggerHelper;
import com.maersk.utilities.BaseDeviceView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class TestHarness {

	/**
	 * Android & iOS TestHarness
	 * 
	 * 
	 * @author Bhargav Chirumamilla Maersk, Created by Bhargav Chirumamilla on
	 *         12/06/2020 Copyright (c) 2020 Maersk. All rights reserved.
	 * 
	 */

	DeviceWrapper deviceSetup;

	public static AppiumDriver<MobileElement> testdriver;
	public static AndroidDriver<MobileElement> Androiddriver;
	public static IOSDriver<MobileElement> iOSdriver;
	LoadConfigurations loadL18n;
	public static Properties configProperties;
	LoadConfigurations load;
	public static ExtentReports extent;
	private static ExtentHtmlReporter htmlReporter;
	Logger log = LoggerHelper.getLogger(TestHarness.class);

	/**
	 * @param configFileName
	 *            to pass app configuration properties
	 * @return Android driver & iOS driver instance
	 * @throws InterruptedException
	 * @throws IOException
	 * 
	 * 
	 */

	@BeforeSuite

	@Parameters({ "configFileName" })
	public AppiumDriver<MobileElement> setupDriver(String configFileName) throws IOException, InterruptedException {
		loadconfigurations(configFileName);
		loadLanguageProperties();
		deleteScreenshots("Screenshots");
		deleteScreenshots("screenshotsFailedTests");

		if (!config.getPlatform().equalsIgnoreCase("iOS")) {
			BaseDeviceView.getAttributeType = "name";
			testdriver = DeviceWrapper.StartAndroidDriver();
			log.info("Setup of Android Test Environment is started");
		} else {

			testdriver = DeviceWrapper.StartiOSDriver();
			log.info("Setup of iOS Test Environment is started");
			if (isElementDisplayed(BaseDeviceView.getAttributeType = "value")) {
				BaseDeviceView.getAttributeType = "value";
			} else {
				BaseDeviceView.getAttributeType = "label";
			}

		}
		log.info("The driver instance is " + testdriver.toString());
		return testdriver;

	}

	/**
	 * @param fileName
	 *            to create file for Extent test results
	 * 
	 */
	public static ExtentReports createTestResult(String fileName) {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/TestResults/" + fileName);

		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(fileName);
		htmlReporter.start();
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extentconfig.xml");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		return extent;

	}

	private void loadconfigurations(String configFileName) {

		log.info("Method called for loading config file.");
		load = new LoadConfigurations();
		load.LoadConfigurationsProperties(configFileName);

	}

	public void loadLanguageProperties() {
		loadL18n = new LoadConfigurations();
		if (config.getLanguage().equalsIgnoreCase("ES")) {
			configProperties = loadL18n.loadL18nProperties("base_es.properties");
		} else if (config.getLanguage().equalsIgnoreCase("FR")) {
			configProperties = loadL18n.loadL18nProperties("base_fr.properties");
		} else if (config.getLanguage().equalsIgnoreCase("POR")) {
			configProperties = loadL18n.loadL18nProperties("base_pr.properties");
		} else if (config.getLanguage().equalsIgnoreCase("CH")) {
			configProperties = loadL18n.loadL18nProperties("base_ch.properties");
		} else if (config.getLanguage().equalsIgnoreCase("JP")) {
			configProperties = loadL18n.loadL18nProperties("base_jp.properties");
		} else {
            configProperties = loadL18n.loadL18nProperties("base_en.properties");
		}

	}

	@AfterSuite
	public void stopTest(ITestContext context) throws InterruptedException {
		String reportPath = System.getProperty("user.dir") + "/TestResults/cucumber-reports/" + "TestAutomation.html";
		log.info("Report Path Location:  " + reportPath);
		DeviceWrapper.stopAppiumServer();
		testdriver.quit();

	}

	private boolean isElementDisplayed(String string) {
		return false;
	}

	public void deleteScreenshots(String fileName) throws IOException {

		File file = new File(System.getProperty("user.dir") + "/" + fileName + "/");
		String[] myFiles;
		if (file.isDirectory()) {
			myFiles = file.list();
			for (int i = 0; i < myFiles.length; i++) {
				File myFile = new File(file, myFiles[i]);
				myFile.delete();
			}

		}

	}
	
	public static Timestamp getCurrentTime() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Current timestamp is: " + timestamp);
		return timestamp;
	}
	
	public void openApp() throws InterruptedException {
		if (config.getPlatform().equalsIgnoreCase("iOS")) {
			String bundileID = config.getBundleID();
            testdriver.activateApp(bundileID);
			log.info("Launching iOS App");
			Thread.sleep(2);

		} else {
			String apppackage = config.getAppPackage();
            testdriver.activateApp(apppackage);
			log.info("Launching Android App");
			Thread.sleep(3);

		}
		
		

}
	
}
