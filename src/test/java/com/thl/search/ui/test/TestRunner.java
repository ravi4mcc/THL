package com.thl.search.ui.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*@CucumberOptions(
		strict = true,
		monochrome = true, 
		features = "src/test/Feature",
		glue = "SearchFunctionality",
		plugin = {"pretty", "html:target/cucumber-html-report" },
		tags={"@Search"})*/

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",tags= "@Search")

public class TestRunner  

{
	

	
	

}
