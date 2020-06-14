@SanityTest
Feature: Schedules Screen : Point-to-Point Schedules 

# TestCase- Navigate to Schedules Tab Bar Verify Header

Scenario: Navigate to Schedules Tab Bar 
	Given Tap Schedules Tab Bar 
	When User In Schedules Tab Bar With Header 
	Then Verify Notifiaction Icon and Logout Button 
	
	#TestCase- Verify theree Slots for Schedules
Scenario: Verify theree Slots for Schedules 
	When Verify point-to-point 
	Then verify portcalls 
	Then Verify Vessels 
	And User default in point-to-point Schedules 
	
	#TestCase- Verify Previous search should be disable.
Scenario: Verify -User install app first- Previous search should be disable. 
	When User Install App first time Previous search should be disable in Schedules Screen 
	Then Verify Search for Schedules Tittle while Install App First 
	
	#TestCase- Verify Search should be disable, When User Didn't Select From/TO
Scenario: Verify Without Selecting From and to Search Button is disable 
	When Without Selecting From and to,Search Button is disable 
	
	#TestCase- Validation-label:From (City, Country/Region) 	
Scenario: Verify-Validation-label:From (City, Country/Region) 
	Given Validation-label- From (City, Country/Region) Title 
	Then  verify (City, Country/Region) PlaceHolder 
	And   Verify From (City, Country/Region) > icon for textfield 
	
	#TestCase-	Verify Haulage under From City Country/Region Textfield 
Scenario: Verify Haulage under From City Country/Region Textfield 
	Then Verify Merchant CY under Haulage with iCon 
	Then Verify Select Carrier SD with iCon 
	# Dev need to Provide Attribute Value for Merchant CY and Carrier SD Default 
	#So as of now it is Toggle comment for this 2 testcases  
	#When Verify Merchant CY Default select under Haulage 
	#Then Carrier SD Should not be deafult 
	And Select Carrier SD and Verify it is selected 
	And Once Again Select Merchant CY and Verify it is selected 
	
	#TestCase- Validation-label:To (City, Country/Region) 		
Scenario: Verify-Validation-label:To (City, Country/Region) 
	Given Validation-label- To (City, Country/Region) 
	Then  verify To (City, Country/Region) PlaceHolder 
	And   Verify TO (City, Country/Region) > icon for textfield 
	
	#TestCase-	Verify Haulage under To City Country/Region Textfield	
Scenario: Verify Haulage under To City Country/Region Textfield 
	Then Verify Merchant CY under Haulage with iCon 
	Then Verify Select Carrier SD with iCon 
	# Dev need to Provide Attribute Value for Merchant CY and Carrier SD Default
	#So as of now it is Toggle comment for this 2 testcases  
	#When Verify Merchant CY Default select under Haulage 
	#Then Carrier SD Should not be deafult 
	And Select Carrier SD and Verify it is selected 
	And Once Again Select Merchant CY and Verify it is selected 
	
	#TestCase-	Verify Advanced Search with icon chevron Down
Scenario: Verify Advanced Search with icon chevron Down 
	When Bottom of the screen Advanced search tittle with icon chevron Down 
	Then select Advanced Search 
	Then Verify icon chevron Up 
	And Swipe Down 
	
	#TestCase-	Verify Date Under Adavance Search 
Scenario: Verify Date Under Adavance Search 
	Given Date Label 
	Then By Default Earliest Departure is Enabled with calender icon 
	Then Select Latest Arrival with calender icon 
	
	#	TestCase-	Select Date Under Calender for iOS -Picker and Android Calender
Scenario: Select Month-Date-Year in Calender 
	Given Select any Date Under Calender for iOS -Picker and Android Calender 
	
	#	TestCase-Weeks Select Date	
Scenario: Upto 2 Weeks after selected date 
	When Verify Secound Week 
	Then Verify fourth Week 
	Then Verify six Week 
	Then Verify eight Week 
	And Select any Week and it is selected 
	
	#	TestCase-Container Type 
Scenario: Verify Container Type 
	Given By Default 40 Dry Standard Continer with continer icon and >icon 
	
	#	TestCase-Change Container Type	
Scenario: Change  Container Type 
	When Tap Container Type feild,User navigated to Container Type Header 
	Then Verify Two Sections All,Temperature Controlled 
	
	#TestCase-Verify All type of Container Regular Sized Cargo/Reefer Equipment/Odd Sized Cargo
Scenario: Verify All type of Container 
	When Verify Regular Sized Cargo with 20' Dry Standard,40' Dry Standard, 40'Dry High & 45'Dry High with Container iCons 
	Then Verify Reefer Equipment with 20'Reefer Standard, 40' Reefer High with Container iCons 
	Then Verify Odd Sized Cargo with 20'Open Top, 40'open Top, 40'Open Top High, 40'Flat Standard & 40' Flat High with Container iCons 
	And Swipe Down 
	Then Verify Shippers Own with 20'Flat, 20'tank and 40'tank 
	And Verify ?Help Text 
	And Swipe Up 
	
	#TestCase-Verify Temperature Controlled type	
Scenario: Verify Temperature Controlled 
	When Verify Regular Equipment with 20'Reefer Standard & 40' Reefer High with Container iCons 
	Then Select 40' Reefer High Equipment 
	And User Automatically Navigated to Point-to-Point Schedules 
	Then Verify container is same 40' Reefer High Equipment under container Type section 
	
	#TestCase-Change Any Container type 
Scenario: Change Container type for Regular Sized Cargo Under All Type Container 
	When Tap Container Type feild,User navigated to Container Type Header 
	Then Select Regular Sized Cargo,with 20' Dry Standard 
	And User Automatically Navigated to Point-to-Point Schedules 
	Then Verify container is same 20' Dry Standard under container Type section 
	
	#TestCase-Select From City,Country/Region, Verify Search Bar
Scenario: Select From City, Country/Region 
	When Swipe Up 
	Given Select From City,Country Region text field 
	When Verify Search Icon on Right Side for Android and Left side for iOS 
	Then Verify Search for a departure city PlaceHolder 
	And Tap Cancel for iOS Only,User Automatically Navigated to Point-to-Point Schedules 
	Then iOS Select City,Country Region Feild in Android it should be in search page 
	And Verify Recent Searches Tittle 
	And User install app first- Recent searches cities should be disable. 
	
	#TestCase-	Type any city half of word example:GU,MH,AP,DL,KA
Scenario Outline: Type any city half of word and Verify 
	When Type any city half of word "<Half Word>" 
	Examples: 
		|Half Word|
		|GU|
		
   #TestCase-	Verify Validation message	
Scenario: Verify Validation message Please enter 3 or more characters 
	Then  Validation message Please Enter 3 or More Characters 
	
	#TestCase-	Verify X ICON	
Scenario: Verify X icon 
	And  Verify X icon and Tap 
	
	#TestCase- Enter Invalid City Example:Andama,karnt,veloc
Scenario Outline: Type any city half of word and Verify 
	When Search for Invalid City "<InValid City>" 
	Examples: 
		|InValid City|
		|Andama|
		
   #TestCase-	Verify Validation message 		
Scenario: Validation Message cities that match your Search 
	And   Verify There are no cities that match your Search 
	
	#TestCase-	Provide Valid City EX: Mumbai,Gujarat,Chennai
Scenario Outline: Search for Mumbai 
	When Search for valid City "<Valid City>" 
	Examples: 
		|Valid City|
		|Mumbai|
		
	#TestCase- 	Select Top Result and City
Scenario: Search Bar From (City,Country/Region) Section 
	Then    Verify country Should be India 
	Then    Verify Top Results and Select 
	And    User Automatically Navigated to Point-to-Point Schedules 
	Then    Verify City Name is Mumbai,MAHARASHTRA 
	
	#TestCase- 	Select To City, Country/Region
Scenario: Select To City, Country/Region 
	Given  Select To City,Country Region text field 
	When   Verify Search Icon on Right Side for Android and Left side for iOS 
	Then    Verify Search for a destination city PlaceHolder 
	And    Tap Cancel for iOS Only,User Automatically Navigated to Point-to-Point Schedules 
	Then   iOS Select City,Country Region Feild in Android it should be in search page 
	And    Verify Recent Searches Tittle 
	And     User install app first- Recent searches cities should be disable. 
	
	#TestCase-	Type any city half of word example:GU,MH,AP,DL,KA Under TO(City,Country/Region) Section
Scenario Outline: Type any city half of word and Verify for TO(City,Country/Region) Section 
	When Type any city half of word "<Half Word>" 
	Examples: 
		|Half Word|
		|GU|
		
		#TestCase-	Validation message Please Enter 3 or More Characters Under TO(City,Country/Region) Section	
Scenario: Verify : Validation message Please enter 3 or more characters Verify for TO(City,Country/Region) Section 
	Then  Validation message Please Enter 3 or More Characters 
	
	#TestCase-Verify X icon Under TO(City,Country/Region) Section	
Scenario: Verify X icon Verify for TO(City,Country/Region) Section 
	And  Verify X icon and Tap 
	
	#TestCase-Invalid City Under TO(City,Country/Region) Section
Scenario Outline: Type any city half of word and Verify for TO(City,Country/Region) Section 
	When Search for Invalid City "<InValid City>" 
	Examples: 
		|InValid City|
		|Andama|
		
		#TestCase -Validation message  Under TO(City,Country/Region) Section	
Scenario: Validation Message cities that match your Search Verify for TO(City,Country/Region) Section 
	And   Verify There are no cities that match your Search 
	
	#TestCase-	Provide Valid City EX:Gujarat,Guntur
Scenario Outline: Search for Guntur 
	When Search for valid City "<Valid City>" 
	Examples: 
		|Valid City|
		|Guntur|
		
   #TestCase-	 Search Bar Section for TO(City,Country/Region) Section	
Scenario: Search Bar Section for TO(City,Country/Region) Section 
	Then    Verify country Should be India 
	Then    Verify Top Results and Select 
	And     User Automatically Navigated to Point-to-Point Schedules 
	Then    Verify City Name is Guntur.AndhraPradesh 
	
	#TestCase Tap Search after selecting From and To (City,Country/Region) Section, it should Enabled
Scenario: Tap Search after selecting From and To (City,Country/Region) Section 
    And    Swipe Down 
	Then    Search is enabled after selecting From and To 
	And     Tap Search 
	
	#TestCase Sailings Section	
Scenario: verify Sailings 
	When    verify From City with Navigation Icon 
	Then    verify to City with Navigation Icon 
	Then     Verify CY 
	Then    verify Earliest Departure With Date 
	Then    Verify Number of Weeks 
	Then    Verify Container Type 
	
	#TestCase Zero Sailings Section
Scenario: 0 sailings 
	When    Verify 0 sailings for for this city 
	Then  User Couldn't find any schedules matching your search. 
	Then  Navigate Back <- 
	And    Verify point-to-point 
	
	# TestCase- Change Merchant CY to Carrier SD
Scenario: Change Merchant CY to Carrier SD 
    And Swipe Up 
	When Change Merchant CY to Carrier SD for From (City,Country/Region) 
	Then Change Merchant CY to Carrier SD for To (City,Country/Region) 
	And Swipe Down 
	Then Tap Search 
	And Verify SD 
	
	#TestCase Zero Sailings Sectionafter changing Merchant CY to Carrier SD
Scenario: 0 sailings 
	When  Verify 0 sailings for for this city 
	Then  User Couldn't find any schedules matching your search. 
	Then  Navigate Back <- 
	And   Verify point-to-point 
	
	
	
	
	
	