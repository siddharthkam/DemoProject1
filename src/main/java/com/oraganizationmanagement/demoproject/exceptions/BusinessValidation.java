package com.oraganizationmanagement.demoproject.exceptions;

public class BusinessValidation {
	
	private String errorCode;
	private String errormsg;
	  
	
	
	public BusinessValidation(String errorCode, String errormsg) {
		super();
		this.errorCode = errorCode;
		this.errormsg = errormsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	

}
