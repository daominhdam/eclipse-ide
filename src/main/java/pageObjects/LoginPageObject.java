package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BasePage;

public class LoginPageObject extends BasePage {
	WebDriver driver;
	WebDriverWait explicitWait;

	public LoginPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void clickToLoginButton() {
		System.out.println(OS_NAME);
		clickToElementByCss("");
	}

}
