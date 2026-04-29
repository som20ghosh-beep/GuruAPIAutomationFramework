package api.testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.payload.SendMilestoneQuotePayload;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class SendMilestoneQuoteTest {

	@Test
	public static void sendMilestoneQuoteTest()
	{
		SendMilestoneQuotePayload payload = new SendMilestoneQuotePayload();
		payload.AutoAcceptDate = "2026-04-30T00:00:00.000Z";
		payload.EffectiveDate = "flAll";
		payload.IsPremium = false;
		payload.PrivateTransactions = false;
		payload.SafePayRequired = false;
		payload.ShareContactInformation = false;
		payload.ScopeOfWork = "<p>Testing</p>";
		payload.AutopayDuration = 0;
		payload.Milestones = null;
		
		
		
		SendMilestoneQuotePayload.Milestone milestone = new SendMilestoneQuotePayload.Milestone();
		milestone.setMilestoneName("q2");
		milestone.setDueDate("2026-12-01");
		milestone.setAmount(111);
		milestone.setValidAmount(true);
		milestone.setDateClassString("g-input g-input--date g-input--small paddingBottomSmall");
		
		List<SendMilestoneQuotePayload.Milestone> milestonesList = new ArrayList<>();
		milestonesList.add(milestone);
		
		payload.setMilestones(milestonesList);
		
		Response milestoneQuote = userEndPoints.sendMilestoneQuote(TokenStore.getToken("GCLI03572832T"), payload, 2114515);
		milestoneQuote.then().log().all();
		
		ResponseValidator.validateStatus(milestoneQuote, 201);
		ResponseValidator.validateFieldNotNull(milestoneQuote, "Data.Milestones[0].MilestoneId");
	
	}
}
