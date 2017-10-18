package com.thl.britz.booking.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BookingSearchCampersPage {
	
	public static WebDriver driver; 
	
	//@FindBy(css="input.name=pickupDate")
//	public WebElement pickupDate = driver.findElement(By.cssSelector("input[name=pickupDate]"));
	
	//@FindBy(css = " ")
	//public WebElement dropOffDate;
	
	
	/*	public void initialsetup()
	{
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");  
		driver = new ChromeDriver();
		
	}*/
	
	/*public void search() throws InterruptedException
	{
						
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
	*/

}
