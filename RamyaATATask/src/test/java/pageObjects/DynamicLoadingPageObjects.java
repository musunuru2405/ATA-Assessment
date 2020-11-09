package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browserControl.WebConnector;

/**
 * This class contains page objects for Dynamics loading page
 * @author Ramya
 *
 */
public class DynamicLoadingPageObjects extends WebConnector{
	
	//****************************** Properties *****************************//
	
	private String startbutton = "//div[@id='start']/button";
	private String loadingBarDisplayed = "//div[@id='loading']";
	private String helloWorldElement = "//div[@id='finish']";
	 
	//********************************* Public methods ****************************//
	
	/**
	 * Find and return start button web element
	 * @return
	 */
	public WebElement getStartButton() {		
		return driver.findElement(By.xpath(startbutton));
	}
	
	/**
	 * Find and return Loading bar web element
	 * @return
	 */
	public WebElement getLoadingBarDisplayed() {
		return driver.findElement(By.xpath(loadingBarDisplayed));
	}
		
	/**
	 * Find and return hello world web element
	 * @return
	 */
	public WebElement getHelloWorldElement() {
		return driver.findElement(By.xpath(helloWorldElement));
	}

}
