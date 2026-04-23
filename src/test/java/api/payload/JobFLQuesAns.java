package api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JobFLQuesAns {

	   private String Message; 
	
	   @JsonProperty("Message")
	public void setMessage(String message) {
		this.Message = message;
	}
	
	public String getMessage() {
		return Message;
	}
}
