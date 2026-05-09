package api.payload;

import java.util.List;

public class HourlyQuotePayload {

	/*
	 {
  "AutoAcceptDate": "2026-05-02T00:00:00.000Z",
  "IsPremium": false,
  "PrivateTransactions": false,
  "SafePayRequired": false,
  "ScopeOfWork": "<p>https://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulivehttps://www.guru.com/freelancers/som-gurulive</p>",
  "SelectedFeeStructure": "flAll",
  "ShareContactInformation": false,
  "TeamMembers": [
    {
      "TeamMemberId": 3488668,
      "HoursPerWeek": "40",
      "RatePerHour": "40",
      "BillingEndDate": null
    }
  ]
}
 */
	
	public String AutoAcceptDate;
	public boolean IsPremium;
	public boolean PrivateTransactions;
	public boolean SafePayRequired;
	public String ScopeOfWork;
	public String SelectedFeeStructure;
	public boolean ShareContactInformation;
	public List<TeamMembers> TeamMembers;
	
	public String getAutoAcceptDate() {
		return AutoAcceptDate;
	}
	public void setAutoAcceptDate(String autoAcceptDate) {
		this.AutoAcceptDate = autoAcceptDate;
	}
	public boolean isIsPremium() {
		return IsPremium;
	}
	public void setIsPremium(boolean isPremium) {
		this.IsPremium = isPremium;
	}
	public boolean isPrivateTransactions() {
		return PrivateTransactions;
	}
	public void setPrivateTransactions(boolean privateTransactions) {
		this.PrivateTransactions = privateTransactions;
	}
	public boolean isSafePayRequired() {
		return SafePayRequired;
	}
	public void setSafePayRequired(boolean safePayRequired) {
		this.SafePayRequired = safePayRequired;
	}
	public String getScopeOfWork() {
		return ScopeOfWork;
	}
	public void setScopeOfWork(String scopeOfWork) {
		this.ScopeOfWork = scopeOfWork;
	}
	public String getSelectedFeeStructure() {
		return SelectedFeeStructure;
	}
	public void setSelectedFeeStructure(String selectedFeeStructure) {
		this.SelectedFeeStructure = selectedFeeStructure;
	}
	public boolean isShareContactInformation() {
		return ShareContactInformation;
	}
	public void setShareContactInformation(boolean shareContactInformation) {
		this.ShareContactInformation = shareContactInformation;
	}
	
	public void setTeamMembers(List<TeamMembers> teamMembersList) {
		this.TeamMembers = teamMembersList;
		// TODO Auto-generated method stub
		
	}
	
	public static class TeamMembers {
		
		public	int TeamMemberId;
		public String HoursPerWeek;
		public String RatePerHour;
		public String BillingEndDate;
		
		public int getTeamMemberId() {
			return TeamMemberId;
		}
		public void setTeamMemberId(int teamMemberId) {
			this.TeamMemberId = teamMemberId;
		}
		public String getHoursPerWeek() {
			return HoursPerWeek;
		}
		public void setHoursPerWeek(String hoursPerWeek) {
			this.HoursPerWeek = hoursPerWeek;
		}
		public String getRatePerHour() {
			return RatePerHour;
		}
		public void setRatePerHour(String ratePerHour) {
			this.RatePerHour = ratePerHour;
		}
		public String getBillingEndDate() {
			return BillingEndDate;
		}
		public void setBillingEndDate(String billingEndDate) {
			this.BillingEndDate = billingEndDate;
		}
	}



	
	
	
}
