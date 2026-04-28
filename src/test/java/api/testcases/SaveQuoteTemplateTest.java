package api.testcases;

import java.util.Arrays;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.payload.SaveQuoteTemplate;
import api.utilities.FakeRandomData;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.listener.ResponseValidationFailureListener;
import io.restassured.response.Response;

public class SaveQuoteTemplateTest {

	@Test
	public static void saveQuoteTemplateTest()
	{
		
		SaveQuoteTemplate payload = new SaveQuoteTemplate();
		
		payload.setTemplateName(FakeRandomData.getTemplateName());
		payload.setContent(FakeRandomData.getContent());
		payload.setPortfolioIds(Arrays.asList(1335839, 1022147, 1337057));
		
		Response quoteTemplate =  userEndPoints.saveQuoteTemplate(TokenStore.getToken("GCLI03572832T"), payload);
		quoteTemplate.then().log().all();
		
		ResponseValidator.validateStatus(quoteTemplate, 200);
		ResponseValidator.validateBodyNotEmpty(quoteTemplate);
		
		
		}
}
