package api.testcases;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.payload.authentication;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class GetAlerts {

	@Test
	public void getFLAlerts() {
		
		Response FLAlertResponse = userEndPoints.getFLAlerts(TokenStore.getToken("GCLI03572832T"));
		FLAlertResponse.then().log().all();
	}
	
}
