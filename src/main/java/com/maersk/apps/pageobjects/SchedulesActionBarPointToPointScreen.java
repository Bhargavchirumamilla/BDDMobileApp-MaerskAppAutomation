package com.maersk.apps.pageobjects;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maersk.apps.config.config;
import com.maersk.utilities.BaseDeviceView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SchedulesActionBarPointToPointScreen extends BaseDeviceView {

	AppiumDriver<MobileElement> driver;
	private static String platform = config.getPlatform();

	public SchedulesActionBarPointToPointScreen(AppiumDriver<MobileElement> driver) {
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
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='Schedules']")
	MobileElement schedulesTabBar;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Schedules']")
	List<MobileElement> schedulesTabBarHeader;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/icon")
	List<MobileElement> notificationBar;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='Point-to-Point']/android.widget.FrameLayout/android.widget.TextView")
	MobileElement pointToPoint;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_search")
	MobileElement SEARCH_Button;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='Port Calls']/android.widget.FrameLayout/android.widget.TextView")
	MobileElement portCalls;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='Vessels']/android.widget.FrameLayout/android.widget.TextView")
	MobileElement vessels;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/search_history")
	MobileElement previousSearch_history;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Previous Searches']")
	MobileElement previousSearch_Header;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/blue_header")
	MobileElement searchforSchedules_Tittle;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_search")
	MobileElement searchButton;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/textView2")
	MobileElement from_CityCountry_Region_Label;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_from")
	MobileElement from_CityCountry_Region_PlaceHolder;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/from_city_button")
	MobileElement textfieldIcon;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Haulage']")
	List<MobileElement> haulage;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_from_haulage_merchant")
	MobileElement merchantCY;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/mearchant_icon")
	MobileElement merchantIcon;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_from_haulage_carrier")
	MobileElement carrierSD;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_to_haulage_carrier")
	MobileElement carrierSD_TO;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/carrier_icon")
	MobileElement carrierSDIcon;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/textView")
	MobileElement toCityCountryRegionLabel;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_to")
	MobileElement toCityCountryRegionPlaceHolder;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/to_city_button")
	MobileElement toCityCountryRegionIcon;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Advanced search']")
	MobileElement advanceSearch;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/advances_search_chevron")
	MobileElement advances_search_chevron;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/date_label")
	MobileElement date_label;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/erliest_departure_icon")
	MobileElement depatureIcon;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_earliest_departure")
	MobileElement earliest_departure;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_latest_arrival")
	MobileElement latestArrival;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/latest_arrival_icon")
	MobileElement arrivalIcon;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/date_field")
	MobileElement dateField;

	@FindBy(className = "XCUIElementTypePickerWheel")
	MobileElement picker;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "android:id/button1")
	MobileElement done;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.view.View")
	List<MobileElement> androidCalender;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_weeks_two")
	MobileElement twoweek;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Search From']")
	MobileElement searchFrom;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Search To']")
	MobileElement searchTo;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_weeks_four")
	MobileElement fouthweek;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_weeks_six")
	MobileElement sixWeek;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_weeks_eight")
	MobileElement eightWeek;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/contaner_type_label")
	MobileElement contaner_type_label;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_container")
	MobileElement defaultContainer;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='Temperature controlled']/android.widget.FrameLayout/android.widget.TextView")
	MobileElement tap_Temperaturecontrolled;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView")
	MobileElement headerContainerType;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='All']/android.widget.FrameLayout/android.widget.TextView")
	MobileElement all;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.ǃ[@content-desc='Temperature controlled']//android.widget.TextView")
	MobileElement temperatureControlled;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/container_icon")
	List<MobileElement> cargoLogos;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/container")
	List<MobileElement> containerName;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/container_help")
	MobileElement help;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(accessibility = "Clear")
	MobileElement clear;

	@iOSFindBy(id = "need ipa file to identify locators")
	MobileElement cancel;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/search")
	MobileElement searchBar;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/header")
	MobileElement recentSearches;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(accessibility = "Navigate up")
	MobileElement navigateBack;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(xpath = "//android.widget.TextView[2]")
	MobileElement recentSearches_Cities;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/empty")
	MobileElement modifySearch;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/header")
	MobileElement contryName;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/text")
	MobileElement cityName;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/to_haulage_type")
	MobileElement to_HaulageType;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_date_label")
	MobileElement dateLabel;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_date")
	MobileElement pointDate;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_weeks_label")
	MobileElement weekLabel;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_weeks")
	MobileElement pointweek;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/from_haulage_type")
	MobileElement from_HaulageType;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_container_label")
	MobileElement containerLabel;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/point_to_point_container")
	MobileElement pointcontainer;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/circle_dep")
	MobileElement mapNavigationIcon_From;

	@iOSFindBy(id = "need ipa file to identify locators")
	@AndroidFindBy(id = "com.maersk.trackandtrace.maerskline:id/circle_arr")
	MobileElement mapNavigationIcon_To;

	public boolean select_CalenderDateMonthYear(String platformName, String calenderDateMonthYear, int index)
			throws InterruptedException {
		boolean flag = true;
		try {
			tap(dateField);
			switch (platformName) {
			case "iOS":
				picker.sendKeys(calenderDateMonthYear);

				break;

			case "Android":
				tap(androidCalender.get(index));

				break;

			default:

				break;
			}
			tap(done);
		} catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException ex) {
			log.error("User,Unable to Select Calender Under Earliest Departure/Latest Arrival", ex);
			flag = false;
		}
		return flag;
	}

	public boolean previousSearchHistory() throws InterruptedException {
		try {
			verify_element_Enabled(previousSearch_history);
			return false;
		} catch (Exception Ex) {
			return true;
		} finally {
			verify_element_Enabled(searchforSchedules_Tittle);
		}
	}

	public boolean contryName() throws InterruptedException {
		visibilityOf(contryName, 7);
		return verify_element_Enabled(contryName);
	}

	public boolean cityName() throws InterruptedException {
		return verify_element_Enabled(cityName);
	}

	public String searchBar() throws InterruptedException {
		return verify_text(searchBar);
	}

	public String help() throws InterruptedException {
		return verify_text(help);
	}

	public boolean clear() throws InterruptedException {
		return verify_element_Enabled(clear);
	}

	public boolean recentSearches() throws InterruptedException {
		return verify_element_Enabled(modifySearch);
	}

	public boolean cargoLogos(int index) throws InterruptedException {
		return verify_element_Enabled(cargoLogos.get(index));
	}

	public boolean cargoName(int index) throws InterruptedException {
		return verify_element_Enabled(containerName.get(index));
	}

	public String tap40ReeferHighEquipment(int index) throws InterruptedException {
		tap(containerName.get(index));
		return verify_text(defaultContainer);
	}

	public String all() throws InterruptedException {
		tap(all);
		return verify_text(all);
	}

	public String temperatureControlled() throws InterruptedException {
		return verify_text(temperatureControlled);
	}

	public String previousSearch_Header() throws InterruptedException {
		return verify_text(previousSearch_Header);
	}

	public String tapContainer() throws InterruptedException {
		tap(defaultContainer);
		return verify_text(headerContainerType);
	}

	public String taptemperatureControlled() throws InterruptedException {
		tap(temperatureControlled);
		return verify_text(headerContainerType);
	}

	public String contaner_type_label() throws InterruptedException {
		return verify_text(contaner_type_label);
	}

	public String defaultContainer() throws InterruptedException {
		return verify_text(defaultContainer);
	}

	public String twoweek() throws InterruptedException {
		return verify_text(twoweek);
	}

	public String fouthweek() throws InterruptedException {
		return verify_text(fouthweek);
	}

	public String sixWeek() throws InterruptedException {
		return verify_text(sixWeek);
	}

	public String eightWeek() throws InterruptedException {
		return verify_text(eightWeek);
	}

	public String defaulttwoweek() throws InterruptedException {
		tap(twoweek);
		return verify_text_selected(twoweek);
	}

	public String date_label() throws InterruptedException {
		return verify_text(date_label);
	}

	public String earliest_departure() throws InterruptedException {
		return verify_text_newLine(earliest_departure);
	}

	public boolean depatureIcon() throws InterruptedException {
		return verify_element_Enabled(depatureIcon);
	}

	public String latestArrival() throws InterruptedException {
		return verify_text_newLine(latestArrival);
	}

	public boolean arrivalIcon() throws InterruptedException {
		return verify_element_Enabled(arrivalIcon);
	}

	public boolean tap_advanceSearch() throws InterruptedException {
		tap(advances_search_chevron);
		return verify_element_Enabled(advances_search_chevron);
	}

	public boolean advanceSearch() throws InterruptedException {
		return verify_element_Enabled(advanceSearch);
	}

	public boolean advances_search_chevron() throws InterruptedException {
		return verify_element_Enabled(advances_search_chevron);
	}

	public String toCityCountryRegionLabel() throws InterruptedException {
		return verify_text(toCityCountryRegionLabel);
	}

	public String toCityCountryRegionPlaceHolder() throws InterruptedException {
		return verify_text(toCityCountryRegionPlaceHolder);
	}

	public boolean toCityCountryRegionIcon() throws InterruptedException {
		return verify_element_Enabled(toCityCountryRegionIcon);
	}

	public boolean tap_carrierSD() throws InterruptedException {
		tap(carrierSD);
		return verify_element_Enabled(carrierSD);
	}

	public boolean tap_carrierSD_TO() throws InterruptedException {
		tap(carrierSD_TO);
		return verify_element_Enabled(carrierSD_TO);
	}

	public boolean tap_merchantCY() throws InterruptedException {
		tap(merchantCY);
		return verify_element_Enabled(merchantCY);
	}

	public String txtHaulage() throws InterruptedException {
		return verify_text(haulage.get(0));
	}

	public String txtMerchantCY() throws InterruptedException {
		return verify_text_newLine(merchantCY);
	}

	public boolean merchantIcon() throws InterruptedException {
		return verify_element_Enabled(merchantIcon);
	}

	public String defaultMerchantCY() throws InterruptedException {
		return verify_text_selected(merchantCY);
	}

	public String carrierSD_Selected() throws InterruptedException {
		return verify_text_selected(carrierSD);
	}

	public String txtcarrierSD() throws InterruptedException {
		return verify_text_newLine(carrierSD);
	}

	public boolean carrierSDIcon() throws InterruptedException {
		return verify_element_Enabled(carrierSDIcon);
	}

	public String txtfrom_CityCountry_Region_Label() throws InterruptedException {
		return verify_text(from_CityCountry_Region_Label);
	}

	public String txtfrom_CityCountry_Region_PlaceHolder() throws InterruptedException {
		return verify_text(from_CityCountry_Region_PlaceHolder);
	}

	public boolean fromCity_Country_textfieldIcon() throws InterruptedException {
		return verify_element_Enabled(textfieldIcon);
	}

	public String txtPointToPoint() throws InterruptedException {
		return verify_text(pointToPoint);
	}

	public String txtPortCalls() throws InterruptedException {
		return verify_text(portCalls);
	}

	public String txtVessels() throws InterruptedException {
		return verify_text(vessels);
	}

	public String defaultPointToPoint() throws InterruptedException {
		return verify_text_selected(pointToPoint);
	}

	public boolean tap_SchedulesTabBar(int index) throws InterruptedException {
		tap(schedulesTabBar);
		return verify_element_Enabled(schedulesTabBarHeader.get(index));
	}

	public String txtSchedules(int index) throws InterruptedException {
		return verify_text(schedulesTabBarHeader.get(index));
	}

	public boolean notificationBar(int index) throws InterruptedException {
		return verify_element_Enabled(notificationBar.get(index));
	}

	public boolean LogOut(int index) throws InterruptedException {
		return verify_element_Enabled(notificationBar.get(index));
	}

	public String txtSearchforSchedules() throws InterruptedException {
		return verify_text(searchforSchedules_Tittle);
	}

	public String search_Disable() throws InterruptedException {
		return verify_text_selected(searchButton);
	}

	public String tap_from_CityCountry_Region_PlaceHolder() throws InterruptedException {
		tap(from_CityCountry_Region_PlaceHolder);
		return verify_text(searchFrom);
	}

	public String tap_to_CityCountry_Region_PlaceHolder() throws InterruptedException {
		tap(toCityCountryRegionPlaceHolder);
		return verify_text(searchTo);
	}

	public boolean cancel() throws InterruptedException {
		if (platform.equalsIgnoreCase("iOS")) {
			tap(cancel);
			return verify_element_Enabled(schedulesTabBar);
		} else {
			try {

				verify_element_Enabled(cancel);

				return false;
			} catch (Exception Ex) {
				log.info("Cancel Button should not be there in Android Platfrom");
				return true;

			}
		}

	}

	public boolean recentSearch_CitiesFirstTime() throws InterruptedException {

		try {
			verify_element_Enabled(recentSearches_Cities);
			return false;
		} catch (Exception Ex) {
			return true;

		}
	}

	public boolean invalidCity(String product) throws InterruptedException {
		clearTextBoxWithTip(searchBar);
		searchBar.sendKeys((product));
		return true;

	}

	public String pleaseEnter3characters() throws InterruptedException {
		return verify_text(pointToPoint);
	}

	public String pleaseModifySearch() throws InterruptedException {
		return verify_text(modifySearch);
	}

	public void SelectCity_inSearch() {
		tap(cityName);
	}

	public void tapSearch_Button() {
		tap(SEARCH_Button);
	}

	public boolean mapNavigationIcon_From() throws InterruptedException {
		return verify_element_Enabled(mapNavigationIcon_From);
	}

	public boolean mapNavigationIcon_To() throws InterruptedException {
		return verify_element_Enabled(mapNavigationIcon_To);
	}

	public boolean from_HaulageType() throws InterruptedException {
		return verify_element_Enabled(from_HaulageType);
	}

	public boolean to_HaulageType() throws InterruptedException {
		return verify_element_Enabled(to_HaulageType);
	}

	public boolean dateLabel() throws InterruptedException {
		return verify_element_Enabled(dateLabel);
	}

	public boolean pointDate() throws InterruptedException {
		return verify_element_Enabled(pointDate);
	}

	public boolean weekLabel() throws InterruptedException {
		return verify_element_Enabled(weekLabel);
	}

	public boolean pointweek() throws InterruptedException {
		return verify_element_Enabled(pointweek);
	}

	public boolean containerLabel() throws InterruptedException {
		return verify_element_Enabled(containerLabel);
	}

	public boolean pointcontainer() throws InterruptedException {
		return verify_element_Enabled(pointcontainer);
	}

	public void navigate_Back() {
		tap(navigateBack);
	}

	public void tap_PreviousSearch_history() {
		tap(previousSearch_history);
	}

}
