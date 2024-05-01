package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	private WebDriver driver;
	protected final String OS_NAME = "Windows 11"; 

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToElementByCss(String cssLocator) {
		driver.findElement(By.cssSelector(cssLocator)).click();
	}

}
