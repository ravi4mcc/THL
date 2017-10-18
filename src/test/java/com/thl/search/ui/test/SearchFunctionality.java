package com.thl.search.ui.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thl.britz.booking.pages.BookingSearchCampersPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import junit.framework.Assert;


public class SearchFunctionality extends AbstractTestNGCucumberTests {
	
	public static WebDriver driver; 
	
	
	@Given("^User is on Search Campers Page$")
	public void openSearchCampersPage()  {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");  
		driver = new ChromeDriver();
		driver.get("https://booking.britz.co.nz/search");
		driver.manage().window().maximize();
		
							
	}

	
	@When("^User enters input details to search Campers$")
	public void enterSearchDetails()  {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> list1;
		
		driver.findElement(By.cssSelector("input[name=pickupDate]")).clear();
		driver.findElement(By.cssSelector("input[name=pickupDate]")).sendKeys("15/11/2017");
		driver.findElement(By.cssSelector("input[name=dropoffDate]")).clear();
		driver.findElement(By.cssSelector("input[name=dropoffDate]")).sendKeys("29/11/2017");
		driver.findElement(By.cssSelector("span[id=select-pickupLocation]")).click();
		list1 = driver.findElements(By.cssSelector("div.dropdown ul li a"));
		list1.get(0).click();
		list1 = driver.findElements(By.cssSelector("div.dropdown ul li a"));
	    list1.get(3).click();
	    list1 = driver.findElements(By.cssSelector("div.dropdown ul li a"));
	    list1.get(7).click();
	    driver.findElement(By.cssSelector("span[id=select-adults]")).click();
	    list1 = driver.findElements(By.cssSelector("div.dropdown ul li a"));
	    list1.get(278).click();
	    driver.findElement(By.cssSelector("span[id=select-children]")).click();
	    list1 = driver.findElements(By.cssSelector("div.dropdown ul li a"));
	    list1.get(284).click();
		driver.findElement(By.cssSelector("button[type=submit]")).click();
				
	}

	
	@Then("^Search is completed and the Campers search results are displayed successfully$")
	public void signup_completed_and_profile_created_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		
		//String expectedMessage = "Check out our affordable & wide range of Britz campervans";
		
		//image verification
		if (driver.findElement(By.cssSelector("div[style='background-image:url(images/b-logo.jpg);']")).isDisplayed())
		{
			System.out.println("PASS");
		}
		
		//Button Exists
	//	if (driver.findElement(By.cssSelector("div[style='background-image:url(images/b-logo.jpg);']")).isDisplayed())
	//	{
	//		System.out.println("PASS");
 //		}
	
		//Text verification
		
		Assert.assertEquals(expected, actual);
	}

/*	@When("^User Logout from the Mobile Application$")
	public void user_Logout_from_the_Mobile_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Application home page should be displayed with Signup option$")
	public void application_home_page_should_be_displayed_with_Signup_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();*/
	
}
