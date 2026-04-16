package api.endpoints;

public class Routes {

	/*
	 Authenticate and Get Access Token PUT/POST
	 = https://qa.guru.com/api/v1/oauth/token/access
	
	 */
	
	public static String base_url = "https://qa.guru.com/api/v1";
	
	//Authenticate and Get Access Token & Get Access Token using Refresh Token

	public static String accessToken_url=base_url + "/oauth/token/access";
	
	public static String getAlerts_url = base_url + "/alerts";
	
	//URL for Get Employer Information
 	public static String getEmployerInfo_url = base_url + "/employer/details/{companyId}";
 	
 	//URL for Get Employer Jobs
 	public static String getEmployerJobs_url = base_url + "/employer/jobs";
	
}
