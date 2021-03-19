package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleRest1 {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/";
		Response res = RestAssured.given().queryParam("page", "2").when().get("api/users");
		int statusCode = res.getStatusCode();
		System.out.println(statusCode);
		
		String string = res.getBody().asString();
		System.out.println(string);
	}

}
