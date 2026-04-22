package api.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class GetEmployerJobs {

	String jobDetails;
	@Test
	public void getEmployerJobsTest() {
		
		
		// Implement the test logic to get employer jobs using the appropriate endpoint and token
		// You can use the userEndPoints class to make the API call and validate the response
		Response empJobDetails = userEndPoints.getEmployerJobs(TokenStore.getToken("GCLI06976585T"));
		empJobDetails.then().log().all();
		
		Assert.assertEquals(empJobDetails.getStatusCode(), 200);
		jobDetails = empJobDetails.getBody().asString();
		
		Assert.assertEquals(jobDetails.contains("2114490"),true, "Job ID 2114490 is not present in the response");
		
	}
}
