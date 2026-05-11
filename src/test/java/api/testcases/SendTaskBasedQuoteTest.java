package api.testcases;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.payload.SendTaskBasedQuotePayload;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class SendTaskBasedQuoteTest {

	@Test
	public static void sendTaskBasedQuoteTest()
	{
		//String tokenFL = TokenStore
		SendTaskBasedQuotePayload payload = new SendTaskBasedQuotePayload();
		payload.setAutoAcceptDate("2026-05-12T00:00:00.000Z");
		payload.setBillingEndDate(null);
		payload.setIsPremium(false);
		payload.setPrivateTransactions(false);
		payload.setSafePayAmount(0);
		payload.setSafePayRequired(false);
		payload.setScopeOfWork("test");
		payload.setSelectedFeeStructure("flAll");
		payload.setShareContactInformation(false);
		
		
		Response taskPayload =  userEndPoints.sendTaskBasedQuote(TokenStore.getToken("GCLI03572832T"), payload, 2114551);
		taskPayload.then().log().all();
		
		ResponseValidator.validateStatus(taskPayload, 201);
		ResponseValidator.validateFieldEquals(taskPayload, "Data.ScopeOfWork", "test");
		ResponseValidator.validateFieldNotNull(taskPayload,"Data.ProposalId" );
		
		
		
		
	}
}
