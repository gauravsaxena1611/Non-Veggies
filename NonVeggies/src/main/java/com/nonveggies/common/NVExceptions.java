package com.nonveggies.common;

public enum NVExceptions {
	
	DATABASE_ERROR(300,"Database Error"), 
	DATABASE_CONNECTION_ERROR(301, "Database Connection Error");
	
	private int errorId;
	private String errorDesc;
	
	NVExceptions(int errorId, String errorDesc){
		this.errorId=errorId;
		this.errorDesc=	errorDesc;
	}
	
	public String getErrorDescription(){
		return this.errorDesc;
	}
	
	public int getError(){
		return this.errorId;
	}
	
}
