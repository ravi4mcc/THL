/*
 * Step Definition file -- Test class to implement the
 *  search functionality in https://booking.britz.co.nz/search
 */
package com.thl.search.ui.test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.thl.search.ui.test.TestRunner;

/**
 * @author karre
 *
 */
public class SearchFunctionality extends TestRunner {

	public static WebDriver driver;
	public static WebDriverWait wait;

	@Given("^User is on Search Campers Page$")
	public void openSearchCampersPage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://booking.britz.co.nz/search");
		driver.manage().window().maximize();
	}

	/**
	 * Method to enter the search input details
	 * 
	 * @throws Throwable
	 */
	@When("^User enters input details to search Campers$")
	public void enterSearchDetails() throws Throwable {

		List<WebElement> dropDownList;
		driver.findElement(By.cssSelector("input[name=pickupDate]")).clear();
		driver.findElement(By.cssSelector("input[name=pickupDate]")).sendKeys("15/11/2017");
		driver.findElement(By.cssSelector("input[name=dropoffDate]")).clear();
		driver.findElement(By.cssSelector("input[name=dropoffDate]")).sendKeys("29/11/2017");
		driver.findElement(By.cssSelector("span[id=select-pickupLocation]")).click();

		dropDownList = driver.findElements(By.cssSelector("div.dropdown ul li a"));
		dropDownList.get(0).click();

		dropDownList = driver.findElements(By.cssSelector("div.dropdown ul li a"));
		dropDownList.get(3).click();

		dropDownList = driver.findElements(By.cssSelector("div.dropdown ul li a"));
		dropDownList.get(7).click();

		driver.findElement(By.cssSelector("span[id=select-adults]")).click();
		dropDownList = driver.findElements(By.cssSelector("div.dropdown ul li a"));
		dropDownList.get(278).click();

		driver.findElement(By.cssSelector("span[id=select-children]")).click();
		dropDownList = driver.findElements(By.cssSelector("div.dropdown ul li a"));
		dropDownList.get(284).click();

		driver.findElement(By.cssSelector("button[type=submit]")).click();

	}

	/**
	 * Method to display the search results
	 * 
	 * @throws InterruptedException
	 */
	@Then("^Search is completed and the Campers search results are displayed successfully$")
	public void searchResultsDisplay() throws InterruptedException {
		List<WebElement> list;

		// To verify Average Day price
		wait = new WebDriverWait(driver, 20);
		list = wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[style='display:flex;']")));
		Assert.assertTrue(list.get(0).isDisplayed());

		// To verify Search Campers page Title
		String actualTitle = driver.findElement(By.cssSelector("span[class='title']")).getText();
		String expectedTitle = "Search Campers";
		Assert.assertEquals(actualTitle, expectedTitle);

		// To verify Britz image
		wait = new WebDriverWait(driver, 10);
		WebElement imgBritz = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[style='background-image:url(images/b-logo.jpg);']")));
		Assert.assertTrue(imgBritz.isDisplayed());

		// To verify Contact Us Button
		WebElement buttonContactUs = driver.findElement(By.cssSelector("span[id=contactUs]"));
		Assert.assertTrue(buttonContactUs.isDisplayed());

		// To verify Text message
		list = driver.findElements(By.cssSelector("div.col-xs-10 span"));
		String actualMessage = list.get(0).getText();
		String expectedMessage = "Check out our affordable & wide range of Britz campervans";
		Assert.assertEquals(actualMessage, expectedMessage);

		// To verify Date
		String actualDate = driver.findElement(By.cssSelector("h4.thl-sub-section-heading")).getText();
		String expectedDate = "15 Nov 2017 to 29 Nov 2017 (15 days)";
		Assert.assertEquals(actualDate, expectedDate);

	}
	/*
	 * TODO The below scenarios can be implemented for more test coverage
	 */

	@Given("^User is on Search Campers results Page$")
	public void user_is_on_Search_Campers_results_Page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^User clicks on Price Match URL link$")
	public void user_clicks_on_Price_Match_URL_link() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("^new page should open for Price Match URL$")
	public void new_page_should_open_for_Price_Match_URL() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Given("^User on Search Campers results Page$")
	public void user_on_Search_Campers_results_Page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^User clicks on select button$")
	public void user_clicks_on_select_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("^navigate to new a page with selected campervan price details$")
	public void navigate_to_new_a_page_with_selected_campervan_price_details() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();

	}

}