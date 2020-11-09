package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserControl.WebConnector;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.gson.annotations.Until;

/**
 * This class contians step definitions for basic authentication
 * @author Ramya
 *
 */
public class BasicAuthStepDefinitions extends WebConnector {
	
	/**
	 * Navigate to the given authentication url
	 * @param username
	 * @param password
	 * @throws InterruptedException
	 */
	@When("I authenticate the user with username {string} and password {string}")
	public void i_authenticate_the_user_with_username_and_password(String username, String password) throws InterruptedException {
		
		String url = baseurl.replace("https://", "https://" + username + ":" + password + "@");
		
		driver.get(url + "/basic_auth");
		Thread.sleep(2000);			
	}

	/**
	 * Click on cancel button on authenticate popup
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	@When("I click on the Cancel button")
	public void i_click_on_the_cancel_button() throws AWTException, InterruptedException {
		//driver.switchTo( ).alert( ).dismiss();
		Robot rb =new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	}

}
