package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "link-below-button")
	WebElement forgotPasswordLink;

	// Actions
	public void clickForgotPassword() {
		forgotPasswordLink.click();
	}

}
