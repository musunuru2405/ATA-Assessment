package stepDefinitions;

import org.junit.Assert;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;

/**
 * This class contains step definitions for assertions
 * @author Ramya
 *
 */
public class AssertStepDefinitions extends WebConnector {
	
	@Then("I should see {string} text on the page")
	public void i_should_see_text_on_the_page(String expText) {
	    String pageSource = driver.getPageSource();
	    Assert.assertTrue("Text not found on the page", pageSource.contains(expText));
	}
	
	@Then("I should not see {string} text on the page")
	public void i_should_not_see_text_on_the_page(String expText) {
	    String pageSource = driver.getPageSource();
	    Assert.assertFalse("Text found on the page", pageSource.contains(expText));
	}

}
