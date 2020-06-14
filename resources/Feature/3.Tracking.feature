@SanityTest
Feature: Tracking Screen 

# TestCase- Navigate to Default -Tracking Screen and Verify Start Tracking Section
Scenario: Verify Start Tracking 
	Given User navigated To Tracking Page By Default 
	When Verify Login Button 
	
	# TestCase- Action Bar With Icon 
Scenario: Verify Action Bar With Icons 
	When Verify Tracking Action Bar 
	Then Verify Schedules Action Bar 
	Then Verify Price/Book Action Bar 
	Then Verify Live Chat Action Bar 
	And Verify More Action Bar