package api.payload;

import java.util.List;

public class SendMilestoneQuotePayload {
  /*
   {
"SafePayRequired": true,
"AutopayDuration": 14,
"Milestones": [
{
"MilestoneName": "q1",
"DueDate": "2026-05-01",
      "Amount": "111",
      "ValidAmount": true,
      "dateClassString": "g-input g-input--date g-input--small paddingBottomSmall"
}
],
"PrivateTransactions": true,
"ScopeOfWork": "<p>Testing</p>",
"AutoAcceptDate": "2026-04-29T00:00:00.000Z",
"IsPremium": false,
"ShareContactInformation": false,
"EffectiveDate": "flAll"
}
   */

public boolean SafePayRequired;
public int AutopayDuration;
public List<Milestone> Milestones;
public boolean PrivateTransactions;
public String ScopeOfWork;
public String AutoAcceptDate;
public boolean IsPremium;
public boolean ShareContactInformation;
public String EffectiveDate;





	public boolean isSafePayRequired() {
	return SafePayRequired;
}





public void setSafePayRequired(boolean safePayRequired) {
	SafePayRequired = safePayRequired;
}





public int getAutopayDuration() {
	return AutopayDuration;
}





public void setAutopayDuration(int autopayDuration) {
	AutopayDuration = autopayDuration;
}





public List<Milestone> getMilestones() {
	return Milestones;
}





public void setMilestones(List<Milestone> milestones) {
	Milestones = milestones;
}





public boolean isPrivateTransactions() {
	return PrivateTransactions;
}





public void setPrivateTransactions(boolean privateTransactions) {
	PrivateTransactions = privateTransactions;
}





public String getScopeOfWork() {
	return ScopeOfWork;
}





public void setScopeOfWork(String scopeOfWork) {
	ScopeOfWork = scopeOfWork;
}





public String getAutoAcceptDate() {
	return AutoAcceptDate;
}





public void setAutoAcceptDate(String autoAcceptDate) {
	AutoAcceptDate = autoAcceptDate;
}





public boolean isIsPremium() {
	return IsPremium;
}





public void setIsPremium(boolean isPremium) {
	IsPremium = isPremium;
}





public boolean isShareContactInformation() {
	return ShareContactInformation;
}





public void setShareContactInformation(boolean shareContactInformation) {
	ShareContactInformation = shareContactInformation;
}





public String getEffectiveDate() {
	return EffectiveDate;
}





public void setEffectiveDate(String effectiveDate) {
	EffectiveDate = effectiveDate;
}





	public static class Milestone {

		private String MilestoneName;
		private String DueDate;
		private int Amount;
		private boolean ValidAmount;
		private String dateClassString;
		public String getMilestoneName() {
			return MilestoneName;
		}
		public void setMilestoneName(String milestoneName) {
			MilestoneName = milestoneName;
		}
		public String getDueDate() {
			return DueDate;
		}
		public void setDueDate(String dueDate) {
			DueDate = dueDate;
		}
		public int getAmount() {
			return Amount;
		}
		public void setAmount(int amount) {
			Amount = amount;
		}
		public boolean isValidAmount() {
			return ValidAmount;
		}
		public void setValidAmount(boolean validAmount) {
			ValidAmount = validAmount;
		}
		public String getDateClassString() {
			return dateClassString;
		}
		public void setDateClassString(String dateClassString) {
			this.dateClassString = dateClassString;
		}
		
		
	}
}
