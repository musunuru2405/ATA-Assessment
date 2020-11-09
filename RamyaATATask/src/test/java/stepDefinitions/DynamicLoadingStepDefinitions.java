package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DynamicLoadingPageObjects;

/**
 * This class contains step definitions for Dynamic Loading page
 * @author Ramya
 *
 */
public class DynamicLoadingStepDefinitions extends WebConnector{
	
	//********************************** Properties **********************************//
	
	DynamicLoadingPageObjects dynamicPageObjects = new DynamicLoadingPageObjects();

	
	//********************************** Step definitions *****************************//
	
	
	@When("I click on {string} link")
	public void i_click_on_link(String linktext) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.linkText(linktext))).click();
	}
	
	@When("I click the dynamic loading start button")
	public void i_click_the_dynamic_loading_start_button() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(dynamicPageObjects.getStartButton())).click();
	}
	
	@Then("I should see loading bar")
	public void i_should_see_loading_bar() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(dynamicPageObjects.getLoadingBarDisplayed()));
	    Assert.assertTrue("Element not displayed on the page", dynamicPageObjects.getLoadingBarDisplayed().isDisplayed());
	}
	
	@Then("I should see {string} text displayed after dynamic loading is completed")
	public void i_should_see_text_displayed_after_loading_is_completed(String expText) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOf(dynamicPageObjects.getLoadingBarDisplayed()));
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(dynamicPageObjects.getHelloWorldElement()));
		
		Assert.assertFalse("Loading bar displayed when Hello World is shown.", dynamicPageObjects.getLoadingBarDisplayed().isDisplayed());
		Assert.assertTrue("Text not present in element.", dynamicPageObjects.getHelloWorldElement().getText().contains(expText));		
	}
	
	@When("I should see Hello World element is hidden")
	public void i_should_see_hello_world_element_is_hidden() {
	    Assert.assertFalse("Hello world element is displayed", dynamicPageObjects.getHelloWorldElement().isDisplayed());
	}
}
