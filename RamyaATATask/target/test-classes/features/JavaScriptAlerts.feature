Feature: As a user of the system I should be able to handle the Java script alerts

Background: 
		Given I navigate to "/javascript_alerts"

	@RegressionTest @JavaScriptAlertTest
Scenario: Check that 'You clicked: Ok' message is displayed when clicked OK on JS Confirm
   When I click on Java script Confirm button
   Then I should see "I am a JS Confirm" text on the js alert
     
	 When I click "ok" button on java script confirm alert
   Then I should see "You clicked: Ok" in the result
   
   
	@RegressionTest @JavaScriptAlertTest
Scenario: Check that 'You clicked: Cancel' message is displayed when clicked cancel on JS Confirm
   When I click on Java script Confirm button
   Then I should see "I am a JS Confirm" text on the js alert
     
	 When I click "cancel" button on java script confirm alert
   Then I should see "You clicked: Cancel" in the result
   
   
	@RegressionTest @JavaScriptAlertTest
Scenario: Check that 'You successfuly clicked an alert' message is displayed when clicked cancel on JS alert
   When I click on Java script Alert button
   Then I should see "I am a JS Alert" text on the js alert
     
	 When I click "ok" button on java script confirm alert
   Then I should see "You successfuly clicked an alert" in the result
   
	@RegressionTest @JavaScriptAlertTest
Scenario: Check that given text is displayed in result when clicked ok on JS prompt
	 When I click on Java script Prompt button
   Then I should see "I am a JS prompt" text on the js alert
   
   When I enter "QA Test" in the js prompt
     And I click "ok" button on java script prompt alert
   Then I should see "You entered: QA Test" in the result
   
   
	@RegressionTest @JavaScriptAlertTest
Scenario: Check that no text is displayed in result when clicked ok on JS prompt with empty field
	 When I click on Java script Prompt button
   Then I should see "I am a JS prompt" text on the js alert
   
   When I click "ok" button on java script prompt alert
   Then I should see "You entered:" in the result
   
   
	@RegressionTest @JavaScriptAlertTest
Scenario: Check that 'null' text is displayed in result when clicked cancel on JS prompt
	 When I click on Java script Prompt button
   Then I should see "I am a JS prompt" text on the js alert
   
   When I enter "QA Test" in the js prompt
     And I click "cancel" button on java script prompt alert
   Then I should see "You entered: null" in the result
   
   
	@RegressionTest @JavaScriptAlertTest
Scenario: Check that 'null' text is displayed in result when clicked cancel on JS prompt with empty field
	 When I click on Java script Prompt button
   Then I should see "I am a JS prompt" text on the js alert
   
   When I enter "QA Test" in the js prompt
     And I click "cancel" button on java script prompt alert
   Then I should see "You entered: null" in the result