package api.payload;

import java.util.List;

public class SaveQuoteTemplate {

	
	public String TemplateName;
	public String Content;
	public List<Integer> PortfolioIds;
	
	public String getTemplateName() {
		return TemplateName;
	}
	
	public void setTemplateName(String templateName) {
		TemplateName = templateName;
	}
	
	public String getContent() {
		return Content;
	}
	
	public void setContent(String content) {
		Content = content;
	}
	
	public List<Integer> getPortfolioIds() {
		return PortfolioIds;
	}
	
	public void setPortfolioIds(List<Integer> portfolioIds) {
		PortfolioIds = portfolioIds;
	}
	
}
