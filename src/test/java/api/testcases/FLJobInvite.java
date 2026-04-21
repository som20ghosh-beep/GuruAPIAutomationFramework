package api.testcases;

import org.testng.Assert;

import api.endpoints.userEndPoints;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class FLJobInvite {

	
	public static void unviewedFLJobInvitationsTest()
	{
	
		Response FLJobInvite= userEndPoints.getUnviewedFLJobInvitations(TokenStore.getToken("GCLI03572832T"));
		FLJobInvite.then().log().all();
		 int statusCode = FLJobInvite.getStatusCode();
		 
		 Assert.assertTrue(statusCode==200 || statusCode==209, "Expected status code 200 or 209, but got: " + statusCode);
		
		
	}
}
