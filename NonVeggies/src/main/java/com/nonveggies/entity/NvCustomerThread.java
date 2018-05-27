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
 * NvCustomerThread generated by hbm2java
 */
@Entity
@Table(name = "nv_customer_thread", catalog = "NVPrestashop")
public class NvCustomerThread implements java.io.Serializable {

	private Integer idCustomerThread;
	private int idShop;
	private int idLang;
	private int idContact;
	private Integer idCustomer;
	private Integer idOrder;
	private Integer idProduct;
	private String status;
	private String email;
	private String token;
	private Date dateAdd;
	private Date dateUpd;

	public NvCustomerThread() {
	}

	public NvCustomerThread(int idShop, int idLang, int idContact, String status, String email, Date dateAdd, Date dateUpd) {
		this.idShop = idShop;
		this.idLang = idLang;
		this.idContact = idContact;
		this.status = status;
		this.email = email;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
	}

	public NvCustomerThread(int idShop, int idLang, int idContact, Integer idCustomer, Integer idOrder, Integer idProduct, String status, String email,
					String token, Date dateAdd, Date dateUpd) {
		this.idShop = idShop;
		this.idLang = idLang;
		this.idContact = idContact;
		this.idCustomer = idCustomer;
		this.idOrder = idOrder;
		this.idProduct = idProduct;
		this.status = status;
		this.email = email;
		this.token = token;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_customer_thread", unique = true, nullable = false)
	public Integer getIdCustomerThread() {
		return this.idCustomerThread;
	}

	public void setIdCustomerThread(Integer idCustomerThread) {
		this.idCustomerThread = idCustomerThread;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	@Column(name = "id_contact", nullable = false)
	public int getIdContact() {
		return this.idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	@Column(name = "id_customer")
	public Integer getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	@Column(name = "id_order")
	public Integer getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	@Column(name = "id_product")
	public Integer getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "status", nullable = false, length = 8)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "email", nullable = false, length = 128)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "token", length = 12)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_add", nullable = false, length = 0)
	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_upd", nullable = false, length = 0)
	public Date getDateUpd() {
		return this.dateUpd;
	}

	public void setDateUpd(Date dateUpd) {
		this.dateUpd = dateUpd;
	}

}