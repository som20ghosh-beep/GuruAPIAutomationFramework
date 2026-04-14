package api.payload;

public class authentication {
	//POJO - Plain Old Java object

	/*
 "grant_type": "client_credentials",
 "client_id": "GCLI03572832T",
 "client_secret":"D7B3D6A4-068F-4BD2-96A3-C4149CFB6F79"
	 */

	String grant_type;
	String client_id;
	String client_secret;


	public String getGrant_type() {
		return grant_type;
	}
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_secret() {
		return client_secret;
	}
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}






}
