package com.tiki.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_04_Debug {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();

		driver.get("https://automationfc.vn/khoa-hoc/ide-sdet");

		String courseTitle = driver.getTitle();

		System.out.println(courseTitle);

		driver.quit();
	}
}
