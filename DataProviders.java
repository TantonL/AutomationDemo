package org;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{"https://learn.letskodeit.com/p/practice", "notvalid@notvalid.com", "We couldn't find an account with that email address"},
			{"https://learn.letskodeit.com/p/practice", "valid@valid.com",  "Reset password email sent. Check your inbox"}
		};
	}

}
