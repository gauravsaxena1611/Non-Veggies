package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NvSupplyOrderReceiptHistory generated by hbm2java
 */
@Entity
@Table(name = "nv_supply_order_receipt_history", catalog = "NVPrestashop")
public class NvSupplyOrderReceiptHistory implements java.io.Serializable {

	private Integer idSupplyOrderReceiptHistory;
	private int idSupplyOrderDetail;
	private int idEmployee;
	private String employeeLastname;
	private String employeeFirstname;
	private int idSupplyOrderState;
	private int quantity;
	private Date dateAdd;

	public NvSupplyOrderReceiptHistory() {
	}

	public NvSupplyOrderReceiptHistory(int idSupplyOrderDetail, int idEmployee, int idSupplyOrderState, int quantity, Date dateAdd) {
		this.idSupplyOrderDetail = idSupplyOrderDetail;
		this.idEmployee = idEmployee;
		this.idSupplyOrderState = idSupplyOrderState;
		this.quantity = quantity;
		this.dateAdd = dateAdd;
	}

	public NvSupplyOrderReceiptHistory(int idSupplyOrderDetail, int idEmployee, String employeeLastname, String employeeFirstname, int idSupplyOrderState,
					int quantity, Date dateAdd) {
		this.idSupplyOrderDetail = idSupplyOrderDetail;
		this.idEmployee = idEmployee;
		this.employeeLastname = employeeLastname;
		this.employeeFirstname = employeeFirstname;
		this.idSupplyOrderState = idSupplyOrderState;
		this.quantity = quantity;
		this.dateAdd = dateAdd;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_supply_order_receipt_history", unique = true, nullable = false)
	public Integer getIdSupplyOrderReceiptHistory() {
		return this.idSupplyOrderReceiptHistory;
	}

	public void setIdSupplyOrderReceiptHistory(Integer idSupplyOrderReceiptHistory) {
		this.idSupplyOrderReceiptHistory = idSupplyOrderReceiptHistory;
	}

	@Column(name = "id_supply_order_detail", nullable = false)
	public int getIdSupplyOrderDetail() {
		return this.idSupplyOrderDetail;
	}

	public void setIdSupplyOrderDetail(int idSupplyOrderDetail) {
		this.idSupplyOrderDetail = idSupplyOrderDetail;
	}

	@Column(name = "id_employee", nullable = false)
	public int getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	@Column(name = "employee_lastname", length = 32)
	public String getEmployeeLastname() {
		return this.employeeLastname;
	}

	public void setEmployeeLastname(String employeeLastname) {
		this.employeeLastname = employeeLastname;
	}

	@Column(name = "employee_firstname", length = 32)
	public String getEmployeeFirstname() {
		return this.employeeFirstname;
	}

	public void setEmployeeFirstname(String employeeFirstname) {
		this.employeeFirstname = employeeFirstname;
	}

	@Column(name = "id_supply_order_state", nullable = false)
	public int getIdSupplyOrderState() {
		return this.idSupplyOrderState;
	}

	public void setIdSupplyOrderState(int idSupplyOrderState) {
		this.idSupplyOrderState = idSupplyOrderState;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_add", nullable = false, length = 0)
	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

}
