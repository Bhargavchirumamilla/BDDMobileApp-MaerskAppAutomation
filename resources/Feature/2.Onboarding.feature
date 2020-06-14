@SanityTest
Feature: OnBoarding Screen 

#TestCase- Navigate to OnBoarding Screen From Language Selection Screen and Verify Terms & Conditions 
Scenario: Verify Terms & Conditions 
	Given User navigated To Terms&Conditions screen from Country Section Screen 
	When Verify Terms & Conditions In Header 
	Then Verify Accepting the terms and Conditions of use Text 
	
	#TestCase- 	Verify Terms & Conditions  Web View
Scenario: Verify View Terms & Conditions 
	Then Select View Terms & Conditions Button 
	Then Web View -Verify User Navigated to terms of use screen 
	And Verify Header of Terms & Conditions 
	Then  Navigate Back <- 
	Then Accept Terms & Conditions 
	
	#TestCase- 	Enchance your Experience Screen
Scenario: Select None Of the Above under Enchance your Experience Screen 
	When Verify Existing Customer 
	Then Third Pary Agent 
	Then Trucker 
	And  None Of the Above 
	And  Select None Of the Above 
	
	#TestCase- New Price and Book Feature,Pagination swipe right and Swipe Left and select Got It 
Scenario: Verify New Price and Book Feature 
	When User have New New Price and Book Feature Image 
	And  Pagination bottom of the screen 
	Then Swipe Right 
	Then User have Check Spot offer and Book it right away Image 
	Then Swipe Left 
	And Verify User in New New Price and Book Feature Screen 
	Then Swipe Right 
	And Select Got It 
	
	#TestCase- Alert Notification for iOS
Scenario: Notifications Alert only for iOS 
	When Select Allow in alert 
	
	
	
	
	