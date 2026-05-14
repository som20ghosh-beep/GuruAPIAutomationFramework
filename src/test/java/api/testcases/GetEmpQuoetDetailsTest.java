package api.testcases;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class GetEmpQuoetDetailsTest {

	@Test
	public static void empQuoteDetails() {
	
		 Response quoteDetails =  userEndPoints.getEmpQuoteDetails(TokenStore.getToken("GCLI06976585T"), 2114517);
		 quoteDetails.then().log().all();
		 
		 ResponseValidator.validateBodyNotEmpty(quoteDetails);
		 ResponseValidator.validateStatus(quoteDetails, 200);
		 
		 
	}
}
