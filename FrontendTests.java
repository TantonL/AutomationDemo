package org;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrontendTests extends BaseTest{
	
	private PracticePageFactory practice;
	private LoginPageFactory login;
	private ResetPasswordPageFactory reset;
	
	
	@Test(dataProvider="inputs", dataProviderClass=DataProviders.class)
	void test7(String url, String email, String expectedMessage) throws Exception {
		// Open URL
		driver.get(url);

		practice = new PracticePageFactory(driver);
		// Go to the login page
		practice.clickLogin();

		login = new LoginPageFactory(driver);
		// Click on forgot password
		login.clickForgotPassword();

		Thread.sleep(3000);

		reset = new ResetPasswordPageFactory(driver);
		// Complete field with an email
		reset.enterEmail(email);
		//Click on Send me Instructions
		reset.clickSendInstructionsButton();
		
		//Verify that the error message is correctly displayed
		String message = driver.findElement(By.className("help-block")).getText();
		Assert.assertEquals(message, expectedMessage);
	}
	
}