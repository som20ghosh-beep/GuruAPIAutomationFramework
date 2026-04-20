package api.testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class FLJobPendingAccept {

	@Test
	public static void getPendingAccept() {
	
		Response pendingJob = userEndPoints.getPendingJobAcceptance(TokenStore.getToken("GCLI03572832T"));
		pendingJob.then().log().all();
		
		Assert.assertEquals(pendingJob.statusCode(), 200);
		List<Integer> jobIds = pendingJob.jsonPath().getList("Data.JobId");
		Assert.assertNotNull(jobIds, "Job ID list is null — check JSON path");
		
	}
}
