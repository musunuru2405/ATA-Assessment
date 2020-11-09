package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;

/**
 * This class contains step definitions for navigation
 * @author Ramya
 *
 */
public class NavigationStepDefinitions extends WebConnector {

	@Given("I navigate to {string}")
	public void i_navigate_to(String url) throws InterruptedException {
		driver.get(baseurl + url);
		Thread.sleep(2000);		
	}
}
