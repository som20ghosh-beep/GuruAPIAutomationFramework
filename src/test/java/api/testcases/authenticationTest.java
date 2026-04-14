package api.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.payload.authentication;
import io.restassured.response.Response;

public class authenticationTest {

	authentication userPayload;
	public static  Logger logger;
	
	@BeforeClass
	public void setAuthCredentials() {
		userPayload = new authentication();
		userPayload.setGrant_type("client_credentials");
		userPayload.setClient_id("GCLI03572832T");
		userPayload.setClient_secret("D7B3D6A4-068F-4BD2-96A3-C4149CFB6F79");
	
	//obtain logger
		logger = LogManager.getLogger("GuruAPIFramework");
	
	}
	
	@Test
	public void getAccessTokenTest() 
	{
	Response authToken =  userEndPoints.getAccessToken(userPayload);
	
	//Log response
	authToken.then().log().all();
	//validation status code
	Assert.assertEquals(authToken.getStatusCode(),	200);
	
	//log
	logger.info("Access token retrieved successfully with status code: " + authToken.getStatusCode());
	}
	
	
	
}
