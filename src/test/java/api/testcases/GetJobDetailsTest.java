package api.testcases;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class GetJobDetailsTest {

	@Test
	public static void getJobDetails() {
		
		Response jobDetails = userEndPoints.getJobdetails(TokenStore.getToken("GCLI06976585T"), 2114496);
		jobDetails.then().log().all();
		
		ResponseValidator.validateProjectName(jobDetails, "Data.JobTitle", "Access global talent pool");
		ResponseValidator.validateStatus(jobDetails, 200);
	}
	
}
