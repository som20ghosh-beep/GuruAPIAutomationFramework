package api.testcases;

import org.testng.Assert;

import api.endpoints.userEndPoints;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class AllProjectQnA {

	
	public static void allProjQnA() {
		
		Response projQnAList = userEndPoints.getAllProjectQnA(TokenStore.getToken("GCLI03572832T"), 2114496);
		projQnAList.then().log().all();
		
		Assert.assertEquals(projQnAList.statusCode(), 200, "API status code is not 200");
		Assert.assertNotEquals(projQnAList.statusCode(), 400, "API status code is 400");
		
		
	}
	
}
