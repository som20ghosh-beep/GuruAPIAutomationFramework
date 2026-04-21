package api.testcases;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class FLJobsQuotesTest {

	@Test
	public void getFLJobsQuotes() {
		 
		
		Response flJobs = userEndPoints.getFLJobs(TokenStore.getToken("GCLI03572832T"));
		flJobs.then().log().all();
		
		Assert.assertEquals(flJobs.statusCode(), 200, "Expected status code 200, but got " + flJobs.statusCode());
		List<Integer> jobIds = flJobs.jsonPath().getList("Data.JobId");
		Assert.assertNotNull(jobIds, "Job ID list is null — check JSON path");

		List<Integer> expectedJobIds = Arrays.asList(2112339, 2098890, 2114491); // Replace with actual expected job IDs
		Assert.assertTrue(jobIds.containsAll(expectedJobIds), "Not all expected job IDs are present in the response");
	}
}
