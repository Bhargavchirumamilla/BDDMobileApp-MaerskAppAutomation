@SanityTest
Feature: Previous Searches : Point-to-Point Schedules 

# TestCase - Verify Previous Searches (City, Country/Region)
Scenario: Verify Previous Searches 
	Given  Tap Previous Searches 
	When Verify Previous Searches Header 
	Then verify From (City,Country/Region) and To (City,Country/Region) 
	
	# TestCase - Navigation Icon,CY,Earliest Departure With Date,Number of Weeks and Container Type 
Scenario: Verify Previous Searches -Navigation Icon,CY,Earliest Departure With Date,Number of Weeks and Container Type 
	When    verify From City with Navigation Icon 
	Then    verify to City with Navigation Icon 
	Then     Verify CY 
	Then    verify Earliest Departure With Date 
	Then    Verify Number of Weeks 
	Then    Verify Container Type 
	
	# TestCase -  Navigate back from Previous Searches to point-to-point 
Scenario: Navigate Back <- from Previous Searches Screen 
	Then  Navigate Back <- 
	And   Verify point-to-point 
	