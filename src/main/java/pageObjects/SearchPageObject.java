package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BasePage;

public class SearchPageObject extends BasePage {
	WebDriver driver;
	WebDriverWait explicitWait;

	public SearchPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void clickToSearchLink() {
		System.out.println(OS_NAME);
		clickToElementByCss("");
	}

}
