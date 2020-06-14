package com.maersk.apps.stepdefinition;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.maersk.apps.config.config;
import com.maersk.apps.helper.LoggerHelper;
import com.maersk.apps.launcher.TestHarness;
import com.maersk.apps.pageobjects.SchedulesTabScreen;
import com.maersk.utilities.TestData.getValidCalenderDateMonthYear;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SchedulesTab extends TestHarness {

	private SchedulesTabScreen pointToPoint;
	protected static org.apache.log4j.Logger log = LoggerHelper.getLogger(SchedulesTab.class);

	@Given("^Tap Schedules Tab Bar$")
	public void tap_Schedules_Tab_Bar() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.tap_SchedulesTabBar(0), "Schedules Tab Bar is mismatched");

	}

	@When("^User In Schedules Tab Bar With Header$")
	public void user_In_Schedules_Tab_Bar_With_Header() throws Throwable {
		Assert.assertEquals(pointToPoint.txtSchedules(0), configProperties.getProperty("header"),
				"Schedules Text mismatched");
	}

	@Then("^Verify Notifiaction Icon and Logout Button$")
	public void verify_Notifiaction_Icon_and_Logout_Button() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.notificationBar(0), "Notifiaction Icon is mismatched");
		softAssert.assertTrue(pointToPoint.notificationBar(1), "Logout Button is mismatched");
		softAssert.assertAll();

	}
	
			
			
	@When("^Verify point-to-point$")
	public void verify_point_to_point() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.txtPointToPoint(), configProperties.getProperty("schedules.Point"),
				"Point to Point Text mismatched");
	}

	@Then("^verify portcalls$")
	public void verify_portcalls() throws Throwable {
		Assert.assertEquals(pointToPoint.txtPortCalls(), configProperties.getProperty("schedules.Port"), "PortCalls Text mismatched");

	}

	@Then("^Verify Vessels$")
	public void verify_Vessels() throws Throwable {
		Assert.assertEquals(pointToPoint.txtVessels(), configProperties.getProperty("schedules.Vessels"), "Vessels Text mismatched");
	}

	@Then("^User default in point-to-point Schedules$")
	public void user_default_in_point_to_point_Schedules() throws Throwable {
		Assert.assertEquals(pointToPoint.defaultPointToPoint(), configProperties.getProperty("standard.value.true"),
				"Default in point-to-point  mismatched");
	}

	@When("^User Install App first time Previous search should be disable in Schedules Screen$")
	public void user_Install_App_first_time_Previous_search_should_be_disable_in_Schedules_Screen() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.previousSearchHistory(), "Previous search should be disable is mismatched");

	}

	@Then("^Verify Search for Schedules Tittle while Install App First$")
	public void verify_Search_for_Schedules_Tittle_while_Install_App_First() throws Throwable {
		Assert.assertEquals(pointToPoint.txtSearchforSchedules(), configProperties.getProperty("search.schedules"),
				" Search for Schedules Tittle while Install App First is mismatched");

	}

	@When("^Without Selecting From and to,Search Button is disable$")
	public void without_Selecting_From_and_to_Search_Button_is_disable() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.defaultPointToPoint(), configProperties.getProperty("standard.value.true"),
				"Default in point-to-point  mismatched");
	}

	@Given("^Validation-label- From \\(City, Country/Region\\) Title$")
	public void validation_label_From_City_Country_Region_Title() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.txtfrom_CityCountry_Region_Label(), configProperties.getProperty("from.city"),
				"City,Country/Region Text is mismatched");
	}

	@Then("^verify \\(City, Country/Region\\) PlaceHolder$")
	public void verify_City_Country_Region_PlaceHolder() throws Throwable {
		Assert.assertEquals(pointToPoint.txtfrom_CityCountry_Region_PlaceHolder(), configProperties.getProperty("from.city.placeholder"),
				"City,Country/Region is Place Holder mismatched");
	}

	@And("^Verify From \\(City, Country/Region\\) > icon for textfield$")
	public void verify_From_City_Country_Region_icon_for_textfield() throws Throwable {
		Assert.assertTrue(pointToPoint.fromCity_Country_textfieldIcon(),
				"From City Country Textfield > Icon is mismatched");
	}

	@Then("^Verify Merchant CY under Haulage with iCon$")
	public void verify_Merchant_CY_under_Haulage_with_iCon() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(pointToPoint.txtHaulage(), configProperties.getProperty("schedules.haulage"),
				"Haulage Tittle is  mismatched");
		softAssert.assertEquals(pointToPoint.txtMerchantCY(), configProperties.getProperty("merchant.cy"),
				"Merchant CY is  mismatched");
		softAssert.assertTrue(pointToPoint.merchantIcon(), "Merchant CY Icon is mismatched");
		softAssert.assertAll();
	}

	@Then("^Verify Select Carrier SD with iCon$")
	public void verify_Select_Carrier_SD_with_iCon() throws Throwable {
		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(pointToPoint.txtcarrierSD(), configProperties.getProperty("carrier.sd"),
				"Carrier SD is  mismatched");
		softAssert.assertTrue(pointToPoint.carrierSDIcon(), "Carrier SDIcon is mismatched");
		softAssert.assertAll();
	}

	@When("^Verify Merchant CY Default select under Haulage$")
	public void verify_Merchant_CY_Default_select_under_Haulage() throws Throwable {
		Assert.assertEquals(pointToPoint.defaultMerchantCY(), configProperties.getProperty("standard.value.true"),
				"Default Merchant CY Icon is mismatched");
	}

	@Then("^Carrier SD Should not be deafult$")
	public void carrier_SD_Should_not_be_deafult() throws Throwable {
		Assert.assertEquals(pointToPoint.carrierSD_Selected(), configProperties.getProperty("standard.value.false"),
				"Carrier SD Should not be deafult is mismatched");

	}

	@Then("^Select Carrier SD and Verify it is selected$")
	public void select_Carrier_SD_and_Verify_it_is_selected() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.tap_carrierSD(), "Select Carrier SD is  mismatched");
		/*softAssert.assertEquals(pointToPoint.carrierSD_Selected(), configProperties.getProperty("standard.value.true"),
				"Carrier SD Should  be Selected is mismatched");*/
		softAssert.assertAll();
	}

	@And("^Once Again Select Merchant CY and Verify it is selected$")
	public void once_Again_Select_Merchant() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.tap_merchantCY(), "Select Merchant CY is  mismatched");
		/*softAssert.assertEquals(pointToPoint.defaultMerchantCY(), configProperties.getProperty("standard.value.true"),
				"Merchant CY be Selectet is mismatched");*/
		softAssert.assertAll();
	}

	@Given("^Validation-label- To \\(City, Country/Region\\)$")
	public void validation_label_To_City_Country_Region() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.toCityCountryRegionLabel(), configProperties.getProperty("to.city"),
				"To City Country_Region Label is mismatched");
		;
	}

	@Then("^verify To \\(City, Country/Region\\) PlaceHolder$")
	public void verify_To_City_Country_Region_PlaceHolder() throws Throwable {
		Assert.assertEquals(pointToPoint.toCityCountryRegionPlaceHolder(), configProperties.getProperty("to.city.placeholder"),
				"To City Country_Region PlaceHolder is mismatched");
	}

	@And("^Verify TO \\(City, Country/Region\\) > icon for textfield$")
	public void verify_TO_City_Country_Region_icon_for_textfield() throws Throwable {
		Assert.assertTrue(pointToPoint.toCityCountryRegionIcon(), "To City Country_Region Icon is  mismatched");

	}

	@When("^Bottom of the screen Advanced search tittle with icon chevron Down$")
	public void bottom_of_the_screen_Advanced_search_tittle_with_icon_chevron_Down() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.advanceSearch(), "Advance Search is mismatched");
		softAssert.assertTrue(pointToPoint.advances_search_chevron(), "icon chevron is  mismatched");
		softAssert.assertAll();
	}

	@Then("^select Advanced Search$")
	public void select_Advanced_Search() throws Throwable {
		Assert.assertTrue(pointToPoint.tap_advanceSearch(), "Tap Advance Search is mismatched");
	}

	@Then("^Verify icon chevron Up$")
	public void verify_icon_chevron_Up() throws Throwable {
		Assert.assertTrue(pointToPoint.advances_search_chevron(), "icon chevron is  mismatched");
	}

	@Given("^Date Label$")
	public void date_Label() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.date_label(), configProperties.getProperty("date.label"), "Date Label is mismatched");
	}

	@Then("^By Default Earliest Departure is Enabled with calender icon$")
	public void by_Default_Earliest_Departure_is_Enabled_with_calender_icon() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(pointToPoint.earliest_departure(),configProperties.getProperty("ED"),
				"Earliest Departure is mismatched");
		softAssert.assertTrue(pointToPoint.depatureIcon(), "Earliest Departure Calender Icon is  mismatched");
		softAssert.assertAll();

	}

	@Then("^Select Latest Arrival with calender icon$")
	public void select_Latest_Arrival_with_calender_icon() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(pointToPoint.latestArrival(), configProperties.getProperty("LA"),
				"Latest Arrival is mismatched");
		softAssert.assertTrue(pointToPoint.arrivalIcon(), "Latest Arrival Calender Icon is  mismatched");
		softAssert.assertAll();
	}

	@Given("^Select any Date Under Calender for iOS -Picker and Android Calender$")
	public void select_any_Date_Under_Calender_for_iOS_Picker_and_Android_Calender() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.select_CalenderDateMonthYear(config.getPlatform(),
				getValidCalenderDateMonthYear.Calender_Date_Month_Year, 4));
	}

	@When("^Verify Secound Week$")
	public void verify_Secound_Week() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.twoweek(), configProperties.getProperty("two.week"), "Secound Week is mismatched");
	}

	@Then("^Verify fourth Week$")
	public void verify_fourth_Week() throws Throwable {
		Assert.assertEquals(pointToPoint.fouthweek(), configProperties.getProperty("four.week"), "fourth weekis mismatched");

	}

	@Then("^Verify six Week$")
	public void verify_six_Week() throws Throwable {
		Assert.assertEquals(pointToPoint.sixWeek(), configProperties.getProperty("six.week"), "six week is mismatched");

	}

	@Then("^Verify eight Week$")
	public void verify_eight_Week() throws Throwable {
		Assert.assertEquals(pointToPoint.eightWeek(), configProperties.getProperty("eight.week"), "eight is mismatched");

	}

	@Then("^Select any Week and it is selected$")
	public void select_any_Week() throws Throwable {
		Assert.assertEquals(pointToPoint.defaulttwoweek(), configProperties.getProperty("standard.value.true"),
				"Default in 2nd week  mimatched");
	}

	@Given("^By Default (\\d+) Dry Standard Continer with continer icon and >icon$")
	public void by_Default_Dry_Standard_Continer_with_continer_icon_and_icon(int arg1) throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(pointToPoint.contaner_type_label(), configProperties.getProperty("container.label"),
				"contaner type label is mismatched");
		softAssert.assertEquals(pointToPoint.defaultContainer(), configProperties.getProperty("standard.container"),
				"Default 40 Dry Standard Continer is mismatched");
		softAssert.assertAll();
	}

	@When("^Tap Container Type feild,User navigated to Container Type Header$")
	public void tap_Container_Type_feild() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.tapContainer(), configProperties.getProperty("header.container"),
				"Tap Container is mismatched");
	}

	@Then("^Verify Two Sections All,Temperature Controlled$")
	public void verify_Two_Sections_All_Temperature_Controlled() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(pointToPoint.all(), configProperties.getProperty("all.container"), "All is mismatched");
		softAssert.assertEquals(pointToPoint.temperatureControlled(), configProperties.getProperty("temperature"),
				"Temperature Controlled is mismatched");
		softAssert.assertAll();
	}

	@When("^Verify Regular Sized Cargo with (\\d+)' Dry Standard,(\\d+)' Dry Standard, (\\d+)'Dry High & (\\d+)'Dry High with Container iCons$")
	public void verify_Regular_Sized_Cargo_with_Dry_Standard_Dry_Standard_Dry_High_Dry_High_with_Container_iCons(
			int arg1, int arg2, int arg3, int arg4) throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.cargoLogos(0), "20 dry Standard Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoLogos(1), "40 dry Standard Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoLogos(2), "40 dry High Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoLogos(3), "45 dry High Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(0), "20 dry Standard Cargo Name is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(1), "40 dry Standard Cargo Name is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(2), "40 dry High Cargo Name is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(3), "45 dry High Cargo Name is  mismatched");
		softAssert.assertAll();
	}

	@Then("^Verify Reefer Equipment with (\\d+)'Reefer Standard, (\\d+)' Reefer High with Container iCons$")
	public void verify_Reefer_Equipment_with_Reefer_Standard_Reefer_High_with_Container_iCons(int arg1, int arg2)
			throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.cargoLogos(4), "20 Reefer Standard Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoLogos(5), "40 Refer High Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(4), "20 Reefer Standard  Cargo Name is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(5), "40 Refer High Cargo Name is  mismatched");
		softAssert.assertAll();

	}

	@Then("^Verify Odd Sized Cargo with (\\d+)'Open Top, (\\d+)'open Top, (\\d+)'Open Top High, (\\d+)'Flat Standard & (\\d+)' Flat High with Container iCons$")
	public void verify_Odd_Sized_Cargo_with_Open_Top_open_Top_Open_Top_High_Flat_Standard_Flat_High_with_Container_iCons(
			int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.cargoLogos(5), "20 Open Top Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoLogos(6), "40 Open Top Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(5), "20 Open Top  Cargo Name is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(6), "40 Open Top Cargo Name is  mismatched");
		softAssert.assertAll();

	}

	@Then("^Verify Shippers Own with (\\d+)'Flat, (\\d+)'tank and (\\d+)'tank$")
	public void verify_Shippers_Own_with_Flat_tank_and_tank(int arg1, int arg2, int arg3) throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.cargoLogos(3), "20 Flat Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoLogos(4), "40 Tank Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoLogos(5), "40 Tank Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(3), "20 Flat Cargo Name is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(4), "40 Tank Cargo Name is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(5), "40 Tank Name is  mismatched");

		softAssert.assertAll();
	}

	@Then("^Verify \\?Help Text$")
	public void verify_Help_Text() throws Throwable {
		Assert.assertEquals(pointToPoint.help(), configProperties.getProperty("help"), "Help Text is mismatched");
	}

	@When("^Verify Regular Equipment with (\\d+)'Reefer Standard & (\\d+)' Reefer High with Container iCons$")
	public void verify_Regular_Equipment_with_Reefer_Standard_Reefer_High_with_Container_iCons(int arg1, int arg2)
			throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(pointToPoint.taptemperatureControlled(), configProperties.getProperty("header.container"),
				"Tap Temperature Container is mismatched");
		softAssert.assertTrue(pointToPoint.cargoLogos(0), "20 Reefer Standard Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoLogos(1), "40 Reefer Hight Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(0), "20 Reefer Standard Cargo Logo is  mismatched");
		softAssert.assertTrue(pointToPoint.cargoName(1), "40 Reefer Hight Cargo Logo is  mismatched");

		softAssert.assertAll();
	}

	@Then("^Select (\\d+)' Reefer High Equipment$")
	public void select_Reefer_High_Equipment(int arg1) throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		Assert.assertEquals(pointToPoint.tap40ReeferHighEquipment(1), configProperties.getProperty("reefer.container"),
				"Tap 40 Reefer High Equipment is mismatched");
		softAssert.assertAll();
	}

	@And("^User Automatically Navigated to Point-to-Point Schedules$")
	public void user_Automatically_Navigated_to_Point_to_Point_Schedules() throws Throwable {
		Assert.assertEquals(pointToPoint.txtSchedules(0), configProperties.getProperty("header"), "Schedules Text mimatched");
	}

	@Then("^Verify container is same (\\d+)' Reefer High Equipment under container Type section$")
	public void verify_container_is_same_Reefer_High_Equipment_under_container_Type_section(int arg1) throws Throwable {
		// Already Verifed in Select 40' Reefer High Equipment
	}

	@Then("^Swipe Down$")
	public void swipe_Down() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		pointToPoint.swipeUp();
	}

	@Then("^Select Regular Sized Cargo,with (\\d+)' Dry Standard$")
	public void select_Regular_Sized_Cargo_with_Dry_Standard(int arg1) throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(pointToPoint.all(), configProperties.getProperty("all.container"), "All is mismatched");
		softAssert.assertEquals(pointToPoint.tap40ReeferHighEquipment(0), configProperties.getProperty("20Drystandard"),
				"Tap 20's Dry Standard is mismatched");
		softAssert.assertAll();
	}

	@Then("^Verify container is same (\\d+)' Dry Standard under container Type section$")
	public void verify_container_is_same_Dry_Standard_under_container_Type_section(int arg1) throws Throwable {
		// Already Verifed in Select 20's Dry Standard
	}

	@When("^Swipe Up$")
	public void swipe_Up() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		pointToPoint.swipeDown();
		pointToPoint.swipeDown();
	}

	@Given("^Select From City,Country Region text field$")
	public void select_City_Country_Region_Feild() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.tap_from_CityCountry_Region_PlaceHolder(), configProperties.getProperty("search.header"),
				"Select City,Country Region Feild is mismatched");
	}

	@When("^Verify Search Icon on Right Side for Android and Left side for iOS$")
	public void user_Navigated_to_Search_Bar_with_Search_Icon() throws Throwable {
		Assert.assertTrue(pointToPoint.clear(), "Search Clear Icon is  mismatched");

	}

	@Then("^Verify Search for a departure city PlaceHolder$")
	public void verify_Search_for_a_departure_city() throws Throwable {
		Assert.assertEquals(pointToPoint.searchBar(), configProperties.getProperty("search.placeholder"),
				"Search for a departure city PlaceHolder is mismatched");
	}
	@Then("^Verify Search for a destination city PlaceHolder$")
	public void verify_Search_for_a_destination_city_PlaceHolder() throws Throwable {
		Assert.assertEquals(pointToPoint.searchBar(), configProperties.getProperty("search.placeholder.destination"),
				"Search for a departure city PlaceHolder is mismatched");
	}

	@And("^Tap Cancel for iOS Only,User Automatically Navigated to Point-to-Point Schedules$")
	public void tap_Cancel_for_iOS_Only() throws Throwable {
		Assert.assertTrue(pointToPoint.cancel(), "Search iOS Cancel is mismatched");
	}

	@Then("^iOS Select City,Country Region Feild in Android it should be in search page$")
	public void ios_Select_City_Country_Region_Feild_in_Android_it_should_be_in_search_page() throws Throwable {
		if (config.getPlatform().equalsIgnoreCase("iOS")) {
			
			Assert.assertEquals(pointToPoint.tap_from_CityCountry_Region_PlaceHolder(),
					configProperties.getProperty("search.header"), "Select City,Country Region Feild is mismatched");
		} else {
			log.info("Already User in search bar not requried for " + config.getPlatform());
		}
	}

	@Then("^Verify Recent Searches Tittle$")
	public void verify_Recent_Searches_Tittle() throws Throwable {
		Assert.assertTrue(pointToPoint.recentSearches(), "Search : Recent Searches is mismatched");
	}

	@Then("^User install app first- Recent searches cities should be disable\\.$")
	public void user_install_app_first_Recent_searches_cities_should_be_disable() throws Throwable {
		Assert.assertTrue(pointToPoint.recentSearch_CitiesFirstTime(),
				"User install app first- Recent searches cities should be disable is mismatched");
	}

	@When("^Type any city half of word \"([^\"]*)\"$")
	public void type_any_city_half_of_word(String arg1) throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.invalidCity(arg1), "Type any city half of the word is mismatched");
	}

	@Then("^Validation message Please Enter (\\d+) or More Characters$")
	public void validation_message_Please_Enter_or_More_Characters(int arg1) throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.pleaseEnter3characters(), configProperties.getProperty("validation.3more.characters"),
				"Please Enter 3 characters  is mismatched");
	}

	@Given("^Verify X icon and Tap$")
	public void verify_X_icon_and_Tap() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.clear(), "Search X Icon is  mismatched");
	}

	@When("^Search for Invalid City \"([^\"]*)\"$")
	public void search_for_Invalid_City(String arg1) throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.invalidCity(arg1), "Search for Invalid City is mismatched");
	}

	@And("^Verify There are no cities that match your Search$")
	public void verify_There_are_no_cities_that_match_your_Search() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.pleaseModifySearch(), configProperties.getProperty("validation.no.cities"),
				"There are no cities that match your search criteria. Please modify your search criteria and try again.is mismatched");

	}

	@When("^Search for valid City \"([^\"]*)\"$")
	public void search_for_valid_City(String arg1) throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.invalidCity(arg1), "Search for valid City is mismatched");
	}

	@Then("^Verify country Should be India$")
	public void verify_country_Should_be_India() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.contryName(), "Search : Country Should be India is mismatched");
	}

	@Then("^Verify Top Results and Select$")
	public void verify_Top_Results_and_Select() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.cityName(), "Search : City Name in Top Result is mismatched");
		pointToPoint.SelectCity_inSearch();
		softAssert.assertAll();
	}

	@Then("^Verify City Name is Mumbai,MAHARASHTRA$")
	public void verify_City_Name_is_Mumbai_MAHARASHTRA() throws Throwable {
		Assert.assertEquals(pointToPoint.txtfrom_CityCountry_Region_PlaceHolder(), configProperties.getProperty("Mumbai"),
				"City,Name is Mumbai,MAHARASHTRA is mismatched");
	}

	@Given("^Select To City,Country Region text field$")
	public void select_To_City_Country_Region_text_field() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
      Assert.assertEquals(pointToPoint.tap_to_CityCountry_Region_PlaceHolder(), configProperties.getProperty("search.header.to"),
				"Select City,Country Region Feild is mismatched");
	}

	@Then("^Verify City Name is Guntur\\.AndhraPradesh$")
	public void verify_City_Name_is_Guntur_AndhraPradesh() throws Throwable {
		Assert.assertEquals(pointToPoint.toCityCountryRegionPlaceHolder(), configProperties.getProperty("Guntur"),
				"City,Name is Guntur/AndhraPradesh is mismatched");
	}

	@Then("^Search is enabled after selecting From and To$")
	public void search_is_enabled_after_selecting_From_and_To() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertEquals(pointToPoint.defaultPointToPoint(), configProperties.getProperty("standard.value.true"),
				"Search is enabled after selecting From and To is mismatched");
		
	}

	@Then("^Tap Search$")
	public void tap_Search() throws Throwable {
		pointToPoint.tapSearch_Button();
	}

	@When("^verify From City with Navigation Icon$")
	public void verify_From_City_with_Navigation_Icon() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.mapNavigationIcon_From(), "Map Navigation From Icon is mismatched");
	}

	@Then("^verify to City with Navigation Icon$")
	public void verify_tO_City_with_Navigation_Icon() throws Throwable {
		Assert.assertTrue(pointToPoint.mapNavigationIcon_To(), "Map Navigation To Icon is mismatched");
	}

	@Then("^verify Earliest Departure With Date$")
	public void verify_Earliest_Departure_With_Date() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.dateLabel(), "Date Label is mismatched");
		softAssert.assertTrue(pointToPoint.pointDate(), "Point Date is mismatched");
		softAssert.assertAll();

	}

	@Then("^Verify Number of Weeks$")
	public void verify_Number_of_Weeks() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.weekLabel(), "Date week is mismatched");
		softAssert.assertTrue(pointToPoint.pointweek(), "Point week is mismatched");
		softAssert.assertAll();

	}

	@Then("^Verify Container Type$")
	public void verify_Containert_Type() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(pointToPoint.containerLabel(), "Container Label is mismatched");
		softAssert.assertTrue(pointToPoint.pointcontainer(), "Point Container is mismatched");
		softAssert.assertAll();

	}

	@Then("^Verify CY$")
	public void verify_CY() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(pointToPoint.txtfrom_CityCountry_Region_PlaceHolder(), configProperties.getProperty("MI"),
				"City,Country/Region is Place Holder mismatched");
		softAssert.assertEquals(pointToPoint.toCityCountryRegionPlaceHolder(), configProperties.getProperty("GN"),
				"To City Country_Region PlaceHolder is mismatched");
		softAssert.assertAll();
	}

	@When("^Verify (\\d+) sailings for for this city$")
	public void verify_sailings_for_for_this_city(int arg1) throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.recentSearches(), "sailings for for this city");
	}

	@Then("^User Couldn't find any schedules matching your search\\.$")
	public void user_Couldn_t_find_any_schedules_matching_your_search() throws Throwable {
		Assert.assertEquals(pointToPoint.pleaseModifySearch(), configProperties.getProperty("findany.schedules"),
				"Couldn't find any schedules matching your search is mismatched");
	}

	@Then("^Navigate Back <-$")
	public void navigate_Back() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		pointToPoint.navigate_Back();
	}

	@Given("^Tap Previous Searches$")
	public void tap_Previous_Searches() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		pointToPoint.tap_PreviousSearch_history();
	}

	@Then("^verify From \\(City,Country/Region\\) and To \\(City,Country/Region\\)$")
 public void verify_From_City_Country_Region_and_To_City_Country_Region() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(pointToPoint.txtfrom_CityCountry_Region_PlaceHolder(), configProperties.getProperty("Mumbai"),
				"City,Country/Region is Place Holder mismatched");
		softAssert.assertEquals(pointToPoint.toCityCountryRegionPlaceHolder(), configProperties.getProperty("Guntur"),
				"To City Country_Region PlaceHolder is mismatched");
		softAssert.assertAll();
	}

	@When("^Verify Previous Searches Header$")
	public void verify_Previous_Searches_Header() throws Throwable {
		Assert.assertEquals(pointToPoint.previousSearch_Header(), configProperties.getProperty(""),
				"Previous Searches Header is mismatched");

	}

	@When("^Change Merchant CY to Carrier SD for From \\(City,Country/Region\\)$")
	public void change_Merchant_CY_to_Carrier_SD_for_From_City_Country_Region() throws Throwable {
		pointToPoint = new SchedulesTabScreen(testdriver);
		Assert.assertTrue(pointToPoint.tap_carrierSD(), "From Select Carrier SD is  mismatched");
	}

	@Then("^Change Merchant CY to Carrier SD for To \\(City,Country/Region\\)$")
	public void change_Merchant_CY_to_Carrier_SD_for_To_City_Country_Region() throws Throwable {
		Assert.assertTrue(pointToPoint.tap_carrierSD_TO(), "To : Select Carrier SD is  mismatched");

	}

	@And("^Verify SD$")
	public void verify_SD() throws Throwable {
		Assert.assertTrue(pointToPoint.from_HaulageType(), "SD Huge is  mismatched");

	}

}
