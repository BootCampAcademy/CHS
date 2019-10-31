package com.nationwide.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	private WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();	
		
	}
	@Test
	public void homePageSearchTest() throws InterruptedException {
		driver.get("http://35.189.120.170/");
		
		WebElement search1 = driver.findElement(By.id("id"));
		search1.sendKeys("1");
		
		WebElement search2 = driver.findElement(By.id("name"));
		search2.sendKeys("CURRY HOUSE");
		
		WebElement search3 = driver.findElement(By.id("position"));
		search3.sendKeys("6");
		
		WebElement search4 = driver.findElement(By.id("url"));
		search4.sendKeys("TEST URL");
		
		WebElement search5 = driver.findElement(By.id("postCode"));
		search5.sendKeys("SN4 59J");
		
		WebElement search6 = driver.findElement(By.name("submit"));
		search6.click();
		Thread.sleep(3000);

}
	@After
	public void tearDown() {
		driver.quit();
		}
}