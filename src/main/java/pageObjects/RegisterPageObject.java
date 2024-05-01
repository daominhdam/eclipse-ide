package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BasePage;

public class RegisterPageObject extends BasePage {
	WebDriver driver;
	WebDriverWait explicitWait;

	public RegisterPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void clickToRegisterButton() {
		System.out.println(OS_NAME);
		clickToElementByCss("");
	}

}
