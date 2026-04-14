package api.endpoints;
import static io.restassured.RestAssured.given;

import api.payload.authentication;
import api.utilities.TokenStore;
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
	
	public static Response getFLAlerts(String token)
	{
		String tokenFL = TokenStore.getToken("GCLI03572832T"); // Retrieve token for the user "one"
		
		Response getFLAlerts = given()
				.accept(ContentType.JSON)
				.auth().oauth2(tokenFL)
				.when()
				.get(Routes.getAlerts_url);
		
		return getFLAlerts;
		
	}
}
