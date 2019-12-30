package com.fantasyapp.app.ws.mobileappws.ui.model.response;

public enum ErrorMessages {

	MISSING_REQUIRED_FIELD("Missing required field. Please check documentation for required fields"),
	RECORD_ALREADY_EXISTS("Record already exists"),
	INTERNAL_SERVER_ERROR("Internal Server Error"),
	NO_RECORD_FOUND("Record with provided id is not found"),
	AUTHENTICATION_FAILED("Authentication failed"),
	COULD_NOT_UPDATE_RECORD("Could not update record"),
	COULD_NOT_DELETE_RECORD("Couldnt no delete record"),
	EMAIL_ADDRESS_NOT_VERIFIED("Email address could not be verified");
	
	private String errorMessage;
	
	ErrorMessages(String errorMessage){
		this.errorMessage=errorMessage;
	}
	
	public String getErrorMessage(){
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}
	
}