package api.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.listener.ResponseValidationFailureListener;
import io.restassured.response.Response;

public class AllProjectQnA {

	@Test
	public static void allProjQnA() {
		
		
		Response projQnAList = userEndPoints.getAllProjectQnA(TokenStore.getToken("GCLI03572832T"), 2114496);
		projQnAList.then().log().all();
		
		//String QnAdata = projQnAList.jsonPath().getString("Data.ProjectMessasges[0].Message");
		
		Object obj = projQnAList.jsonPath().get("Data");
		System.out.println("Data node: " + obj);

		Object list = projQnAList.jsonPath().get("Data.ProjectMessasges");
		System.out.println("List node: " + list);
		
		ResponseValidator.validateStatus(projQnAList, 200);
		ResponseValidator.validateTotalCount(projQnAList, 3);
		ResponseValidator.validateTotalCountNotZero(projQnAList);
		ResponseValidator.validateSenderIDNotNull(projQnAList, "Data.ProjectMessages[0].SenderID");
		//ResponseValidator.validateListNotEmpty(projQnAList, "Data.ProjectMessasges");
		//Assert.assertEquals(projQnAList.statusCode(), 200, "API status code is not 200");
		//Assert.assertNotEquals(projQnAList.statusCode(), 400, "API status code is 400");
		
		
	}
	
}
