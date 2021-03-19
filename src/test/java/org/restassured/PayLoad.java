package org.restassured;

public class PayLoad {

	public static String createUser() {

		return "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}";

	}

	public static String updateUser() {

		return "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}";

	}

	public static String createissue() {
	
		return"{\r\n" + 
				"    \"fields\": {\r\n" + 
				"       \"project\":\r\n" + 
				"       {\r\n" + 
				"          \"key\": \"WAL\"\r\n" + 
				"       },\r\n" + 
				"       \"summary\": \"create issue.\",\r\n" + 
				"       \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n" + 
				"       \"issuetype\": {\r\n" + 
				"          \"name\": \"Bug\"\r\n" + 
				"       }\r\n" + 
				"   }\r\n" + 
				"}\r\n" + 
				"}";

}
	
public static String assigningissue() {
	return"{{\r\n" + 
			"   \"fields\": {\r\n" + 
			"       \"assignee\":{\"name\":\"charlie\"}\r\n" + 
			"   }\r\n" + 
			"}}";

}



}