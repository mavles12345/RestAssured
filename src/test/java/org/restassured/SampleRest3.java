package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class SampleRest3 {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://reqres.in/";
		Response put = RestAssured.given().pathParam("page", "2")
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}").when()
				.put("api/users/{page}");
		String body = put.getBody().asString();
		
		System.out.println(body);

	}

}
