package api.endpoints;
import static io.restassured.RestAssured.given;

import api.payload.authentication;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class userEndPoints {

	public static Response getAccessToken(authentication payload)
	{
		
	Response AuthToken = 	given()
		.accept(ContentType.JSON).contentType(ContentType.URLENC)
		.formParam("grant_type", payload.getGrant_type())
		.formParam("client_id", payload.getClient_id())
		.formParam("client_secret", payload.getClient_secret())
		
		.when()
		.post(Routes.accessToken_url);
	
	return AuthToken;
	}
}
