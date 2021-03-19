package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class SampleRest2 {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://reqres.in/";
		Response post = RestAssured.given().body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}")
				.when().post("api/users");
		
		int code = post.getStatusCode();
		System.out.println(code);
		
		String body = post.getBody().asString();
		System.out.println(body);

	}

}
