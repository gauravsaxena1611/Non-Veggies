package com.nonveggies.common;

public class ResponseDTO {
	
	private ExceptionDTO exceptionDTO;
	private Object response;
	
	public ExceptionDTO getExceptionDTO() {
		return exceptionDTO;
	}
	public void setExceptionDTO(ExceptionDTO exceptionDTO) {
		this.exceptionDTO = exceptionDTO;
	}
	
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
}
