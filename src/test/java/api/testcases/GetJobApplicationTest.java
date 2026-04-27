package api.testcases;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.listener.ResponseValidationFailureListener;
import io.restassured.response.Response;

public class GetJobApplicationTest {

	@Test
	public static void getJObapplication() {
		 Response jobApplication = userEndPoints.getJobApplicationList(TokenStore.getToken("GCLI03572832T"), 2114496);
		 jobApplication.then().log().all();
		 
		 ResponseValidator.validateBodyNotEmpty(jobApplication);
		 ResponseValidator.validateTotalCount(jobApplication, 401);
		 ResponseValidator.validateFieldNotNull(jobApplication, "Data[0].ProposalID");
		 
	}
}
