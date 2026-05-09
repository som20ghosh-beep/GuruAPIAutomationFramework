package api.testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.payload.HourlyQuotePayload;
import api.payload.HourlyQuotePayload.TeamMembers;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class SendHourlyQuoteTest {

	@Test
	public static void sendHourlyQuoteTest()
	{
		
		HourlyQuotePayload payload = new HourlyQuotePayload();
		payload.AutoAcceptDate = "2026-05-05T00:00:00.000Z";
		payload.IsPremium = false;
		payload.PrivateTransactions = false;
		payload.SafePayRequired = false;
		payload.ScopeOfWork = "<p>Testing</p>";
		payload.SelectedFeeStructure = "flAll";
		
		HourlyQuotePayload.TeamMembers teamMember = new HourlyQuotePayload.TeamMembers();
		teamMember.setTeamMemberId(3488668);
		teamMember.setHoursPerWeek("40");
		teamMember.setRatePerHour("40");
		teamMember.setBillingEndDate(null);
		
		List<HourlyQuotePayload.TeamMembers> teamMembersList = new ArrayList<>();
		teamMembersList.add(teamMember);
		payload.setTeamMembers(teamMembersList);
		
		Response hourlyQuote = userEndPoints.sendHourlyQuote(TokenStore.getToken("GCLI03572832T"), payload, 2114554);
		hourlyQuote.then().log().all();
		
		ResponseValidator.validateStatus(hourlyQuote, 201);
		ResponseValidator.validateFieldNotNull(hourlyQuote, "Data.TeamMembers[0].TeamMemberId");
		ResponseValidator.validateFieldEquals(hourlyQuote, "Data.TeamMembers[0].HoursPerWeek", 40);
		ResponseValidator.validateBodyNotEmpty(hourlyQuote);
	}
}
