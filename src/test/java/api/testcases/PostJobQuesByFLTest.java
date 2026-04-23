package api.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.payload.JobFLQuesAns;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class PostJobQuesByFLTest {

	@Test
	public static void postJobQues() {
		
		JobFLQuesAns payload = new JobFLQuesAns();
		payload.setMessage("This is first ques");
		
		Response jobQues =  userEndPoints.postJobQues(TokenStore.getToken("GCLI03572832T"), "2114496", payload);
		jobQues.then().log().all();
		Assert.assertEquals(jobQues.getStatusCode(), 201);
		 
		String messageDetails = jobQues.getBody().asString();
		Assert.assertEquals(messageDetails.contains("This is first ques?"),true, "Question is not posted successfully");
		
	}
	
}
