package io.swagger.client.model;

public class DetailsResponse {

	private String name;
	private String value;
	
	public DetailsResponse(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public DetailsResponse(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}	
}
