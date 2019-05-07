package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPageFactory {
	WebDriver driver;

	public ResetPasswordPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Web elements
	@FindBy(id = "user_email")
	WebElement emailField;

	@FindBy(name = "commit")
	WebElement sendInstructionsButton;

	
	// Actions
	public void enterEmail(String str) {
		emailField.sendKeys(str);
	}

	public void clickSendInstructionsButton() {
		sendInstructionsButton.click();
	}

}
