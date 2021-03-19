package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample17thtask02 {
	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI="https://jackmavles.atlassian.net";
		Response put = RestAssured.given().headers("Content-Type","application/json").auth().preemptive().basic("jackmavles@gmail.com", "1mSm18oLFUp3g1FysSLpC7CA").body(PayLoad.assigningissue()).when().put("api/2/issue/QA-31");
	
		System.out.println(put.getBody().asPrettyString());
		System.out.println(put.getStatusCode());
		
	}

}
