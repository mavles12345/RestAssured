package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleRestPL1 {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://reqres.in";

		Response post = RestAssured.given().body(PayLoad.createUser()).when().post("api/users");

		System.out.println(post.getStatusCode());
		System.out.println(post.getBody().asString());
		System.out.println(post.getBody().asPrettyString());
	}

}
