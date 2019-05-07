package org;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class APIRequests {

	private String productSearchEndpoint = "https://api.mercadolibre.com/sites/MLA/search?q=";
	private String productDetailEndpoint = "https://api.mercadolibre.com/items/";
	
	public String productSearch(String product) {
		Response productResponse = get(productSearchEndpoint + product);
		String result = productResponse.getBody().prettyPrint();
		return result;
	}
	
	public Response productDetailSearch(String product) {
		Response productDetailResponse = get(productDetailEndpoint + product);
		return productDetailResponse;
	}
	
	public String productDetailSearchToString(String product) {
		Response productDetailResponse = get(productDetailEndpoint + product);
		return productDetailResponse.getBody().asString();
	}
}
