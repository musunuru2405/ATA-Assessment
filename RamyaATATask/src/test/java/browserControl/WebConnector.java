package browserControl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebConnector {
	
	//**************************** Properties *******************************//
	public static WebDriver driver;
	public static String baseurl = "https://the-internet.herokuapp.com";
	
	//******************************** Public methods ***************************//
	
	/**
	 * Open Chrome browser
	 */
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "../RamyaATATask/src/test/java/drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * Close browser
	 */
	public static void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}		
	}

}
