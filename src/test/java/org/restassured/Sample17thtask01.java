package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Sample17thtask01 {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://jackmavles.atlassian.net";
		
		Response post = RestAssured.given().headers("Content-Type","application/json").auth().preemptive().basic("jackmavles@gmail.com", "1mSm18oLFUp3g1FysSLpC7CA").body(PayLoad.createissue()).when().post("rest/api/2/issue");
		
		System.out.println(post.getBody().asPrettyString());
		System.out.println(post.getStatusCode());
		
		RestAssured.given().headers("Content-Type","application/json").auth().preemptive().basic("jackmavles@gmail.com", "1mSm18oLFUp3g1FysSLpC7CA");
		
	}

}
