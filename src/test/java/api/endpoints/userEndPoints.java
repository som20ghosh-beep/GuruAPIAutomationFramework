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
		//String tokenFL = TokenStore.getToken("GCLI03572832T"); // Retrieve token for the user "one"
		
		Response getFLAlerts = given()
				.accept(ContentType.JSON)
				.auth().oauth2(token)
				.when()
				.get(Routes.getAlerts_url);
		
		return getFLAlerts;
		
	}
	
	public static Response getEmpAlerts(String token)
	{
		//String tokenEmp = TokenStore.getToken("GCLI06976585T"); // Retrieve token for the user emp
		
		Response getEmpAlerts = given()
				.accept(ContentType.JSON)
				.auth().oauth2(token)
				.when()
				.get(Routes.getAlerts_url);
		
		return getEmpAlerts;
		
	}
	
	
	public static Response getEmpInformation(String token, String companyId)
	{
		//String tokenEmp = TokenStore.getToken("GCLI06976585T");
	
		Response getEmpInfo = given().accept(ContentType.JSON)
				.auth().oauth2(token).pathParam("companyId", companyId)
				.when()
				.get(Routes.getEmployerInfo_url);
		
		return getEmpInfo;
	
	}
	
	public static Response getEmployerJobs(String token)
	{
		//String tokenEmp = TokenStore.getToken("GCLI06976585T"); //Employer token
		
		Response EmpJobs  = given().accept(ContentType.JSON)
				.auth().oauth2(token)
				.when()
				.get(Routes.getEmployerJobs_url);
		
		return EmpJobs;
	}
	
	
}
