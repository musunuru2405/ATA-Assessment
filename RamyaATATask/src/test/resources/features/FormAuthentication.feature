Feature: As a user of the system I must be able to sign in with valid credentials without issues

Background:
   Given I navigate to "/basic_auth"
   
	@RegressionTest @FormAuthenticationTest
Scenario: Checking by entering the right credentials
  When I authenticate the user with username "admin" and password "admin"
  Then I should see "Congratulations! You must have the proper credentials." text on the page
  
	@RegressionTest @FormAuthenticationTest
Scenario: Checking by entering the random credentials
  When I authenticate the user with username "Max" and password "John"
  Then I should not see "Congratulations! You must have the proper credentials." text on the page  
  
	@RegressionTest @FormAuthenticationTest
Scenario: Checking by leaving the credentials blank
  When I authenticate the user with username "" and password ""
  Then I should not see "Congratulations! You must have the proper credentials." text on the page 
  
	@RegressionTest @FormAuthenticationTest
Scenario: Checking by clicking the cancel button without entering anything
  When I click on the Cancel button
  Then I should see "Not authorized" text on the page
   