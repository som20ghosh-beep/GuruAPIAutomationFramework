package api.testcases;

import org.testng.annotations.Test;

import api.endpoints.userEndPoints;
import api.utilities.ResponseValidator;
import api.utilities.TokenStore;
import io.restassured.response.Response;

public class GetFLTemplate {
	
	@Test
	public static void getflTemplate() {
		 Response fltemplate = userEndPoints.getFLTemplates(TokenStore.getToken("GCLI03572832T"));
		 
		 fltemplate.then().log().all();
		 ResponseValidator.validateStatus(fltemplate, 200);
		 ResponseValidator.validateBodyNotEmpty(fltemplate);
		 ResponseValidator.validateFieldNotNull(fltemplate, "TemplateName");
		
	}
}
