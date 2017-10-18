package com.thl.search.ui.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",tags= "@Search")

public class TestRunner  
{
	
	/*public static WebDriver driver;
	public  void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://booking.britz.co.nz/search");
		driver.manage().window().maximize();
	}*/
	

}
