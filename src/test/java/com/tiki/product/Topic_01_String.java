package com.tiki.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Topic_01_String {
	WebDriver driver;
	Actions action;
	String emailAddress = "automationfc.vn@gmail.com";
	String emailAddressLocator = "input#email";
	String filePath = "E:\\Project\\eclipse-selenium-maven\\uploadFiles\\Beach.jpg";
	
	@Test
	public void TC_01() {
		driver = new FirefoxDriver();

		clickToElement("E:\\Project\\eclipse-selenium-maven\\uploadFiles\\Beach.jpg");
		
		clickToElement("E:\\Project\\eclipse-selenium-maven\\uploadFiles\\Beach.jpg");
	}

	public void clickToElement(String cssLocator) {
		driver.findElement(By.cssSelector(cssLocator)).click();
	}
}
