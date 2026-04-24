package api.testcases;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.listener.ResponseValidationFailureListener;
import io.restassured.response.Response;

public class SendJobInviteTest {

	@Test
	public static void sendJobInviteTest()
	{
		 Response jobInvite = userEndPoints.sendJobInvite(TokenStore.getToken("GCLI06976585T"), 2114496);
		 jobInvite.then().log().all();
		 ResponseValidator.validateStatus(jobInvite, 200);
		 ResponseValidator.validateBodyNotEmpty(jobInvite);
		 ResponseValidator.validateFieldEquals(jobInvite, "JobId", 2114496);
	}
}
