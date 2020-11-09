package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browserControl.WebConnector;

public class JavaScriptAlertsPageObjects extends WebConnector {

	//*************************** Properties *********************************//
	
	private String jsConfirmButton = "//button[@onclick='jsConfirm()']";
	private String jsAlertButton = "//button[@onclick='jsAlert()']";
	private String jsPromptButton = "//button[@onclick='jsPrompt()']";
	private String jsResult = "//p[@id='result']";
	
	
	//************************** Public methods ****************************//
	
	/**
	 * Find and return JS confirmation button web element
	 * @return
	 */
	public WebElement getJSConfirmButton() {
		return driver.findElement(By.xpath(jsConfirmButton));
	}
	
	/**
	 * Find and return JS alert button web element
	 * @return
	 */
	public WebElement getJSAlertButton() {
		return driver.findElement(By.xpath(jsAlertButton));
	}
	
	/**
	 * Find and return JS prompt button
	 * @return
	 */
	public WebElement getJSPromptButton() {
		return driver.findElement(By.xpath(jsPromptButton));
	}
	
	/**
	 * Find and return JS result text
	 * @return
	 */
	public String getJSResultText() {
		return driver.findElement(By.xpath(jsResult)).getText();
	}
	
	/**
	 * Find and return JS result element
	 * @return
	 */
	public WebElement getJSResultElement() {
		return driver.findElement(By.xpath(jsResult));
	}
}
