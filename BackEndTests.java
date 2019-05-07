package org;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class BackEndTests {
	
	@Test
	public void requestTest() {
		APIRequests api = new APIRequests(); 
		Response result = api.productDetailSearch("MLA782267264");
		
	    JsonPath jsonPathEvaluator = result.jsonPath();
	    String title = jsonPathEvaluator.get("title");
	    Assert.assertEquals(title, "Duke 200");
	}

}
