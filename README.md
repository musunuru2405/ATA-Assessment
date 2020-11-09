# ATA-Assessment
Automation Test Analyst Assessment on Test Website

The Framework contains BDD automation tests for Form Authorisation, Dynamic Loading and Javascript Alerts in the Test Website.


# Pre-requisites
- Install <a href="https://www.java.com/en/download/win10.jsp" target="_blank">Java</a> and set path
- Download <a href="https://maven.apache.org/download.cgi" target="_blank">Maven</a> and <a href="https://maven.apache.org/install.html" target="_blank">Install</a>
- Download <a href="https://www.eclipse.org/downloads/packages" target="_blank">Eclipse</a> for Java Developers and setup
- Add Maven and Cucumber Eclipse Plugins from Eclipse marketplace
- Familiarise yourself with writing <a href="https://cucumber.io/docs/gherkin" target="_blank">Gherkin Syntax</a> and <a href="https://cucumber.io/docs/cucumber/step-definitions" target="_blank">Step Definitions</a>
- Google Chrome version 86

# Setting up RamyaATATask Project
- Clone <a href="https://github.com/musunuru2405/ATA-Assessment.git" target="_blank">ATA-Assessment</a> repository
- Open Eclipse and create a workspace
- Import `RamyaATATask` project into the workspace

# Running test scenarios
There are two options available to run the features
## 1. Run scenarios using TestRunner.java
	- Navigate to `src/test/java/com/RamyaATATask/TestRunner.java` in Eclipse.
	- Right click on the class and select `Run as -> JUnit Test`.
	This will run the features in default chrome browser. 
## 2. Run scenarios from CLI  
Navigate to the project directory in terminal and run following commands 
### Run scenarios with default values. i.e default chrome browser and default url
`mvn clean test -Dcucumber.options="src/test/resources/features" -Dcucumber.filter.tags="@RegressionTest"` (this will run the features & Scenarios that are tagged with @RegressionTest in chrome browser.)
### Run Basic Authentication scenarios
`mvn clean test -Dcucumber.options="src/test/resources/features -Dcucumber.filter.tags="@FormAuthenticationTest"`
### Run Dynamic Loading scenarios
`mvn clean test -Dcucumber.options="src/test/resources/features -Dcucumber.filter.tags="@DynamicLoadingTest"`
### Run JavaScript Alert scenarios
`mvn clean test -Dcucumber.options="src/test/resources/features -Dcucumber.filter.tags="@JavaScriptAlertTest"`

# Improvements
I feel the following improvements can be made to the existing framework.
1. The existing framework can be extended to run the tests with different browsers using BrowserStack or similar.
2. Currently the framework is using xpath for locators, additional capabilities can be added to handle different types of locators.
3. Thirdparty reporting tools can be added for enhanced reporting.

# Comments
The form authentication link opens a window for the sign in, it caused issues while automating as the alert commands were not recognising the window. I have used an alternative method with the help of url authentication. 





