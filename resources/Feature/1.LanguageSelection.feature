@SanityTest
Feature: Language Selection 

#TestCase- Navigate to Language Selection  page from Splash Screen and Verify header
Scenario: Select Language - Header Title 
	When Verify Select Language in Header Title 
	
#TestCase- 	iOS-Continue & Android-Ok Button Bottom of the screen
Scenario: iOS-Continue & Android-Ok Button Bottom of the screen 
	And Verify Ok/Continue Button Bottom of the screen 
	
#TestCase- Select any Language En,FR,ES,POR,CH,JP	
Scenario: Select Language 
	Given English Language Selected Automatically by Default With TickIcon 
	Then Select any Language 
	And Select Ok/Continue Button Bottom of the screen 
	
	