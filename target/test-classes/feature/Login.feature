Feature: I want to test the login feature of the application

Background: Given User is on the Login page

Scenario: Gets the Title of the page
					When User gets the title of the page
					Then The page title should be "Helix - Laboratory Information System"
					
Scenario: Login with Valid Credentials
					When user enters the username as "Khushdeep.Gupta@technossus.com"
					And user enters the password as "kzF>Uk3"
					And user clicks on the "Login" button
					When User gets the title of the page
					Then The page title should be "Helix - Laboratory Information System"