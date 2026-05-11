package api.payload;

public class SendTaskBasedQuotePayload {

	
		/*
		 {
  "AutoAcceptDate": "2026-05-11T00:00:00.000Z",
  "BillingEndDate": null,
   "IsPremium": false,
   "PrivateTransactions": false,
  "SafePayAmount": 0,
  "SafePayRequired": false,
  "ScopeOfWork": "test",
  "SelectedFeeStructure": "flAll",
  "ShareContactInformation": false
  
}
		 */
		
		public String AutoAcceptDate;
		public String BillingEndDate;
		public boolean IsPremium;
		public boolean PrivateTransactions;
		public int SafePayAmount;
		public boolean SafePayRequired;
		public String ScopeOfWork;
		public String SelectedFeeStructure;
		public boolean ShareContactInformation;
		
		
		public String getAutoAcceptDate() {
			return AutoAcceptDate;
		}
		public void setAutoAcceptDate(String autoAcceptDate) {
			this.AutoAcceptDate = autoAcceptDate;
		}
		public String getBillingEndDate() {
			return BillingEndDate;
		}
		public void setBillingEndDate(String billingEndDate) {
			this.BillingEndDate = billingEndDate;
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
		public int getSafePayAmount() {
			return SafePayAmount;
		}
		public void setSafePayAmount(int safePayAmount) {
			this.SafePayAmount = safePayAmount;
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
		
		
		
		
	
}
