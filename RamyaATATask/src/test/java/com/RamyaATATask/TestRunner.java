package com.RamyaATATask;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"} 
				, tags = "@RegressionTest" 
				, features = "src/test/resources/features"
				, glue = {"browserControl", "stepDefinitions"})

/**
 * Runner class to run the cucumber scenarios 
 * @author Ramya
 *
 */
public class TestRunner {

}
