package com.maersk.apps.config;

/**
 * Apps Config
 * 
 * @author Bhargav Chirumamilla Maersk, Created by Bhargav Chirumamilla on
 *         12/06/2020 Copyright (c) 2020 Maersk . All rights reserved.
 * 
 */

public class config {
	private static String automationName;
	private static String platform;
	private static String language;
	private static int port;
	private static String appiumPath;
	private static String appiumlogfilepath;
	private static String androidDeviceName;
	private static String iphoneDeviceName;
	private static String implictwaittime;
	private static String nodePath;
	private static String appFilePath;
	private static String buildVersion;
	private static String appPackage;
	private static String bundileID;
	private static String deviceUDID;
	private static String mobileVersion;

	

	public static String getBuildVersion() {
		return buildVersion;
	}

	public static void setBuildVersion(String buildVersion) {
		config.buildVersion = buildVersion;
	}

	public static String getAppFilePath() {
		return appFilePath;
	}

	public static void setAppFilePath(String appFilePath) {
		config.appFilePath = appFilePath;
	}

	public static String getNodePath() {
		return nodePath;
	}

	public static void setNodePath(String nodePath) {
		config.nodePath = nodePath;
	}

	public static String getAutomationName() {
		return automationName;
	}

	public static void setAutomationName(String automationName) {
		config.automationName = automationName;
	}

	public static String getPlatform() {
		return platform;
	}

	public static void setPlatform(String platform) {
		config.platform = platform;
	}

	public static String getLanguage() {
		return language;
	}

	public static void setLanguage(String language) {
		config.language = language;
	}

	public static int getPort() {
		return port;
	}

	public static void setPort(int port) {
		config.port = port;
	}

	public static String getAppiumPath() {
		return appiumPath;
	}

	public static void setAppiumPath(String appiumPath) {
		config.appiumPath = appiumPath;
	}

	public static String getAppiumlogfilepath() {
		return appiumlogfilepath;
	}

	public static void setAppiumlogfilepath(String appiumlogfilepath) {
		config.appiumlogfilepath = appiumlogfilepath;
	}

	public static String getAndroidDeviceName() {
		return androidDeviceName;
	}

	public static void setAndroidDeviceName(String androidDeviceName) {
		config.androidDeviceName = androidDeviceName;
	}

	public static String getIphoneDeviceName() {
		return iphoneDeviceName;
	}

	public static void setIphoneDeviceName(String iphoneDeviceName) {
		config.iphoneDeviceName = iphoneDeviceName;
	}

	public static String getImplictwaittime() {
		return implictwaittime;
	}

	public static void setImplictwaittime(String implictwaittime) {
		config.implictwaittime = implictwaittime;
	}

	public static String getAppPackage() {
		return appPackage;
	}

	public static void setAppPackage(String appPackage) {
		config.appPackage = appPackage;
	}

	public static String getBundleID() {
		return bundileID;
	}

	public static void setgetBundleID(String bundileID) {
		config.bundileID = bundileID;
	}

	public static String getDeviceUDID() {
		return deviceUDID;
	}

	public static void setdDeviceUDID(String deviceUDID) {
		config.deviceUDID = deviceUDID;
	}

	public static String getMobileVersion() {
		return mobileVersion;
	}

	public static void setMobileVersion(String buildVersion) {
		config.buildVersion = mobileVersion;
	}

}
