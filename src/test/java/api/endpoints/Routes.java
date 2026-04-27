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
 	
 	//URL for unviewed freelancer Job Invitations
	public static String unviewedFLJobInvitations_url = base_url + "/freelancer/job/invitations";
	
	//URL for Get Freelancer Jobs list/Quote
	public static String getFLJobs_url = base_url + "/freelancer/jobs";
	
	//URL for Get pending job acceptance
	public static String pendingJobAcceptance_url = base_url + "/freelancer/jobs/pendingaccept";
	
	//URL for posting job question by Freelancer
	public static String postFLJobQues_url = base_url + "/jobs/{jobid}/qna";
	
	//URL for Get  Project All Question and Answers
	public static String getProjQnA_url = base_url + "/jobs/{jobid}/qna/all";
	
	//URL for Get Job details
	public static String getJobDetails_url = base_url + "/jobs/{jobid}/summary";
	
	//URL for get Job List 
	public static String getJobList_url = base_url + "/search/job?category={category}&budgetType={budgetType}&period={period}";
	
	//URL for Sending invitation for job
	public static String sendJobInvite_url = base_url + "/employer/jobs/{jobid}/invitations";
	
	//URL for quote for employer posted job
	public static String quoteForEmpJob_url = base_url + "/employer/jobs/{jobid}/quotes/filter";
	
	//URL for List of freelancer templates
	public static String getFLTemplates_url = base_url + "/freelancer/alltemplates";
	
	//URL for Get Applications for a Job
	public static String getJobApplicationslist_url = base_url + "/jobs/applications/{jobId}";
	
	
}
