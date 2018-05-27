package com.nonveggies.android.dto;

import java.util.Date;

public class AndroidBaseDTO {
	
	private Date dataCreationDate;
	private Date dataLastModifiedDate;
	
	
	public Date getDataCreationDate() {
		return dataCreationDate;
	}
	public void setDataCreationDate(Date dataCreationDate) {
		this.dataCreationDate = dataCreationDate;
	}
	public Date getDataLastModifiedDate() {
		return dataLastModifiedDate;
	}
	public void setDataLastModifiedDate(Date dataLastModifiedDate) {
		this.dataLastModifiedDate = dataLastModifiedDate;
	}
	
}
