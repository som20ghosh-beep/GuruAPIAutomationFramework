package api.testcases;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class GetEmpInfoTest {

	@Test
	public void getEmpInfoTest() {
	
	Response empInfo = userEndPoints.getEmpInformation(TokenStore.getToken("GCLI03572832T"), "1407242");
	empInfo.then().log().all();
	
	}
}
