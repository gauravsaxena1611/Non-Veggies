package com.nonveggies.android.dto;

import java.math.BigDecimal;
import java.util.Date;

public class AndroidOrderDTO extends AndroidBaseDTO{
	
	private long id;
	private long id_Status;
	private long id_Customer;
	private long id_DeliverySlots;
	private long id_DeliveryBoy;
	private BigDecimal total;
	private BigDecimal discount;
	private BigDecimal tax;
	private BigDecimal previousPendings;
	private BigDecimal finalAmount;
	private String customerComments;
	private String staffComments;
	private Date orderCreatedDate;
	private Date deliveryDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_Status() {
		return id_Status;
	}
	public void setId_Status(long id_Status) {
		this.id_Status = id_Status;
	}
	public long getId_Customer() {
		return id_Customer;
	}
	public void setId_Customer(long id_Customer) {
		this.id_Customer = id_Customer;
	}
	public long getId_DeliverySlots() {
		return id_DeliverySlots;
	}
	public void setId_DeliverySlots(long id_DeliverySlots) {
		this.id_DeliverySlots = id_DeliverySlots;
	}
	public long getId_DeliveryBoy() {
		return id_DeliveryBoy;
	}
	public void setId_DeliveryBoy(long id_DeliveryBoy) {
		this.id_DeliveryBoy = id_DeliveryBoy;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	public BigDecimal getPreviousPendings() {
		return previousPendings;
	}
	public void setPreviousPendings(BigDecimal previousPendings) {
		this.previousPendings = previousPendings;
	}
	public BigDecimal getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(BigDecimal finalAmount) {
		this.finalAmount = finalAmount;
	}
	public String getCustomerComments() {
		return customerComments;
	}
	public void setCustomerComments(String customerComments) {
		this.customerComments = customerComments;
	}
	public String getStaffComments() {
		return staffComments;
	}
	public void setStaffComments(String staffComments) {
		this.staffComments = staffComments;
	}
	public Date getOrderCreatedDate() {
		return orderCreatedDate;
	}
	public void setOrderCreatedDate(Date orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	

}
