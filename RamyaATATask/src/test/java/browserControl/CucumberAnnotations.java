package browserControl;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * This class contains cucumber annotations
 * @author Ramya
 *
 */
public class CucumberAnnotations extends WebConnector {
	
	/**
	 * Setup method to open the browser before each scenario	
	 */
	@Before
	public void setup() {
		openBrowser();		
	}
	
	/**
	 * Tear down method to close the browser after each scenario
	 */
	@After
	public void teardown() {
		closeBrowser();
	}

	}

