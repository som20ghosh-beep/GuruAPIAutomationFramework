package api.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.payload.authentication;
import api.utilities.DataProviders;
import api.utilities.ReadExcelFile;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class AuthenticationTestDD {

	@Test(dataProvider = "userCredentialData",  dataProviderClass = DataProviders.class)
	public void getAccessTokenTest(String grant_type, String client_id, String client_secret) 
	{
		
		authentication	userPayload = new authentication();
		userPayload.setGrant_type(grant_type);
		userPayload.setClient_id(client_id);
		userPayload.setClient_secret(client_secret);	
		
	Response authToken =  userEndPoints.getAccessToken(userPayload);
	
	//Log response
	authToken.then().log().all();
	//validation status code
	Assert.assertEquals(authToken.getStatusCode(),	200);
	
	// ✅ Extract token
    String token = authToken.jsonPath().getString("access_token");

    // ✅ Store token mapped to user
    TokenStore.setToken(client_id, token);

    System.out.println("Stored token for: one " + client_id );
	
	
	}
	
	
	
}
