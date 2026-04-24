package api.testcases;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class getJobListTest {

	@Test
	public static void getJobList() {
		Response jobList = userEndPoints.getJobList(TokenStore.getToken("GCLI03572832T"), "design-art", "all", "all");
		jobList.then().log().all();
		
		ResponseValidator.validateBodyNotEmpty(jobList);
		ResponseValidator.validateStatus(jobList, 200);
	}
}
