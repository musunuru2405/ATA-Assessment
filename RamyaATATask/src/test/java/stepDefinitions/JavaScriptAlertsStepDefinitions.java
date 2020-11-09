package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.JavaScriptAlertsPageObjects;

/**
 * This class contains all the step definitions to handle Java Script alerts
 * @author Ramya
 *
 */
public class JavaScriptAlertsStepDefinitions extends WebConnector {
	
	//*********************************** Properties *********************************//
	
	JavaScriptAlertsPageObjects jsAlertsPageObjects = new JavaScriptAlertsPageObjects();
	
	
	//******************************** Step definitions *********************************//
	
	@When("I click on Java script Confirm button")
	public void i_click_on_java_script_confirm_button() {
	    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(jsAlertsPageObjects.getJSConfirmButton())).click();
	}
		
	@When("I click {string} button on java script confirm alert")
	@When("I click {string} button on java script prompt alert")
	public void i_click_button_on_java_script_confirm_alert(String buttonType) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.alertIsPresent());
		if (buttonType.equalsIgnoreCase("ok") || buttonType.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}
	}
	
	@Then("I should see {string} in the result")
	public void i_should_see_in_the_result(String expText) {
	    new WebDriverWait(driver, 20).until(ExpectedConditions.textToBePresentInElement(jsAlertsPageObjects.getJSResultElement(), expText));
	    Assert.assertEquals(expText, jsAlertsPageObjects.getJSResultText().trim());
	}
	
	@Then("I should see {string} text on the js alert")
	public void i_should_see_text_on_the_alert(String expText) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.alertIsPresent());
		String actText = driver.switchTo().alert().getText();
		Assert.assertTrue("JS alert do not have expected text", actText.contains(expText));
	}
	
	@When("I click on Java script Alert button")
	public void i_click_on_java_script_alert_button() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(jsAlertsPageObjects.getJSAlertButton())).click();
	}
	
	@When("I click on Java script Prompt button")
	public void i_click_on_java_script_prompt_button() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(jsAlertsPageObjects.getJSPromptButton())).click();
	}
	
	@When("I enter {string} in the js prompt")
	public void i_enter_in_the_js_prompt(String text) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys(text);
	}

}
