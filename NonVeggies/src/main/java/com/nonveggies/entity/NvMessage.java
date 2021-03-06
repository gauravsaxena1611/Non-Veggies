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
 * NvMessage generated by hbm2java
 */
@Entity
@Table(name = "nv_message", catalog = "NVPrestashop")
public class NvMessage implements java.io.Serializable {

	private Integer idMessage;
	private Integer idCart;
	private int idCustomer;
	private Integer idEmployee;
	private int idOrder;
	private String message;
	private boolean private_;
	private Date dateAdd;

	public NvMessage() {
	}

	public NvMessage(int idCustomer, int idOrder, String message, boolean private_, Date dateAdd) {
		this.idCustomer = idCustomer;
		this.idOrder = idOrder;
		this.message = message;
		this.private_ = private_;
		this.dateAdd = dateAdd;
	}

	public NvMessage(Integer idCart, int idCustomer, Integer idEmployee, int idOrder, String message, boolean private_, Date dateAdd) {
		this.idCart = idCart;
		this.idCustomer = idCustomer;
		this.idEmployee = idEmployee;
		this.idOrder = idOrder;
		this.message = message;
		this.private_ = private_;
		this.dateAdd = dateAdd;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_message", unique = true, nullable = false)
	public Integer getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(Integer idMessage) {
		this.idMessage = idMessage;
	}

	@Column(name = "id_cart")
	public Integer getIdCart() {
		return this.idCart;
	}

	public void setIdCart(Integer idCart) {
		this.idCart = idCart;
	}

	@Column(name = "id_customer", nullable = false)
	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	@Column(name = "id_employee")
	public Integer getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	@Column(name = "id_order", nullable = false)
	public int getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	@Column(name = "message", nullable = false, length = 65535)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "private", nullable = false)
	public boolean isPrivate_() {
		return this.private_;
	}

	public void setPrivate_(boolean private_) {
		this.private_ = private_;
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
