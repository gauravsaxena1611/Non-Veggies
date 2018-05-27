package com.nonveggies.common;

public class ExceptionDTO {
	
	private int errorCode;
	private Exception exception;
	private String errorDetail;
	
	public ExceptionDTO(int errorCode, String errorDetail){
		this.errorCode = errorCode;
		this.errorDetail = errorDetail;
	}
	
	public ExceptionDTO(int errorCode, String errorDetail, Exception exception ){
		this.errorCode = errorCode;
		this.exception = exception;
		this.errorDetail = errorDetail;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	public Exception getErrorDescription() {
		return exception;
	}
	public String getErrorDetail() {
		return errorDetail;
	}

}
