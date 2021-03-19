package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleDelete {
	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI="https://reqres.in";
		
		Response delete = RestAssured.given().pathParam("page", "2").when().delete("api/users/{page}");
		
		System.out.println(delete.getBody().asString());
		
		System.out.println(delete.getStatusCode());
		
		
		
	}

}
