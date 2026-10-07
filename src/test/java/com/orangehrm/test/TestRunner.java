package com.orangehrm.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/Login.feature",
    glue = {"com.orangehrm.test"},
    		plugin = {"pretty", "html:target/cucumber-reports/report.html"},
    monochrome = true
)
public class TestRunner {

}




