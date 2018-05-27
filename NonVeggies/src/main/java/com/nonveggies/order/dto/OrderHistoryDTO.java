package com.nonveggies.order.dto;

import java.util.Date;

public class OrderHistoryDTO {

	private Integer idOrderHistory;
	private int idEmployee;
	private int idOrder;
	private int idOrderState;
	private Date dateAdd;

	public Integer getIdOrderHistory() {
		return idOrderHistory;
	}

	public void setIdOrderHistory(Integer idOrderHistory) {
		this.idOrderHistory = idOrderHistory;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public int getIdOrderState() {
		return idOrderState;
	}

	public void setIdOrderState(int idOrderState) {
		this.idOrderState = idOrderState;
	}

	public Date getDateAdd() {
		return dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

}
