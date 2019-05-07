package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePageFactory {
	WebDriver driver;

	public PracticePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Web elements
	@FindBy(xpath = "//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a")
	WebElement loginButtonBanner;

	// Actions
	public void clickLogin() {
		loginButtonBanner.click();
	}

}
