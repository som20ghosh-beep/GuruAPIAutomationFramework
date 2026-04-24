package api.endpoints;
import static io.restassured.RestAssured.given;

import api.payload.JobFLQuesAns;
import api.payload.authentication;
import api.utilities.TokenStore;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class userEndPoints {

	public static Response getAccessToken(authentication payload)
	{
		
	Response AuthToken = 	given()
		.accept(ContentType.JSON).contentType(ContentType.URLENC)
		.formParam("grant_type", payload.getGrant_type())
		.formParam("client_id", payload.getClient_id())
		.formParam("client_secret", payload.getClient_secret())
		
		.when()
		.post(Routes.accessToken_url);
	
	return AuthToken;
	}
	
	public static Response getFLAlerts(String token)
	{
		//String tokenFL = TokenStore.getToken("GCLI03572832T"); // Retrieve token for the user "one"
		
		Response getFLAlerts = given()
				.accept(ContentType.JSON)
				.auth().oauth2(token)
				.when()
				.get(Routes.getAlerts_url);
		
		return getFLAlerts;
		
	}
	
	public static Response getEmpAlerts(String token)
	{
		//String tokenEmp = TokenStore.getToken("GCLI06976585T"); // Retrieve token for the user emp
		
		Response getEmpAlerts = given()
				.accept(ContentType.JSON)
				.auth().oauth2(token)
				.when()
				.get(Routes.getAlerts_url);
		
		return getEmpAlerts;
		
	}
	
	
	public static Response getEmpInformation(String token, String companyId)
	{
		//String tokenEmp = TokenStore.getToken("GCLI06976585T");
	
		Response getEmpInfo = given().accept(ContentType.JSON)
				.auth().oauth2(token).pathParam("companyId", companyId)
				.when()
				.get(Routes.getEmployerInfo_url);
		
		return getEmpInfo;
	
	}
	
	public static Response getEmployerJobs(String token)
	{
		//String tokenEmp = TokenStore.getToken("GCLI06976585T"); //Employer token
		
		Response EmpJobs  = given().accept(ContentType.JSON)
				.auth().oauth2(token)
				.when()
				.get(Routes.getEmployerJobs_url);
		
		return EmpJobs;
	}
	
	public static Response getUnviewedFLJobInvitations(String token)
	{
		Response unviewedFLJobInvite = given().accept(ContentType.JSON)
				.auth().oauth2(token)
				.when()
				.get(Routes.unviewedFLJobInvitations_url);
		return unviewedFLJobInvite;
	}
	
	public static Response getFLJobs(String token) {
		Response flJobs = given().accept(ContentType.JSON)
				.auth().oauth2(token)
				.when()
				.get(Routes.getFLJobs_url);
		return flJobs;
	}
	
	public static Response getPendingJobAcceptance(String token)
	{
		Response pendingJobAccept = given().accept(ContentType.JSON)
				.auth().oauth2(token)
				.when()
				.get(Routes.pendingJobAcceptance_url);
		
		return pendingJobAccept;
	}
	
	
	public static Response postJobQues(String token, String jobID, JobFLQuesAns payload)
	{
		Response postJobQues = given().log().all().contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().oauth2(token).pathParam("jobid", jobID)
				.body(payload)
				.when()
				.post(Routes.postFLJobQues_url);
		
		return postJobQues;
	}

	public static Response getAllProjectQnA(String token, int jobid)
	{
		Response allJobQnA = given().accept(ContentType.JSON)
		.auth().oauth2(token).pathParam("jobid", jobid)
		.when()
		.get(Routes.getProjQnA_url);
		
		return allJobQnA;
	}
	
	
	public static Response getJobdetails(String token, int jobid) {
		
		Response jobDetails = given().accept(ContentType.JSON).auth().oauth2(token).pathParam("jobid", jobid)
		.when()
		.get(Routes.getJobDetails_url);
		
		return jobDetails;
		
	}
	
	public static Response getJobList(String token, String category, String budgetType, String period) {
		Response jobList =  given().accept(ContentType.JSON).auth().oauth2(token)
		 .pathParam("category", category).pathParam("budgetType", budgetType).pathParam("period", period)
		 .when()
		 .get(Routes.getJobList_url);
		 return jobList;
	}
	
	
}
