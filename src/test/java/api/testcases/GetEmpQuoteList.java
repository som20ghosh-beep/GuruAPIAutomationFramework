package api.testcases;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class GetEmpQuoteList {

	@Test
	public static void getEmpQuote() {
	Response empQuote = userEndPoints.quotesForEmpJob(TokenStore.getToken("GCLI06976585T"), 2114497);
	empQuote.then().log().all();
	
	ResponseValidator.validateBodyNotEmpty(empQuote);
	ResponseValidator.validateStatus(empQuote, 200);
	
	}
}
