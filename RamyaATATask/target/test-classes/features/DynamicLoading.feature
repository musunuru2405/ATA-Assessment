Feature: As a user of the system I must be able to see my message after I press the start button and the loading stops

Background:
   Given I navigate to "/dynamic_loading"
   
	@RegressionTest @DynamicLoadingTest
Scenario: Checking for the Element rendered after the fact
  When I click on "Example 2: Element rendered after the fact" link
    And I click the dynamic loading start button
  Then I should see loading bar
    And I should see "Hello World!" text displayed after dynamic loading is completed
  
  
	@RegressionTest @DynamicLoadingTest
Scenario: Checking for the Element on page that is hidden
  When I click on "Example 1: Element on page that is hidden" link
    And I should see Hello World element is hidden
    And I click the dynamic loading start button
  Then I should see loading bar
    And I should see "Hello World!" text displayed after dynamic loading is completed