package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * NvStockMvt generated by hbm2java
 */
@Entity
@Table(name = "nv_stock_mvt", catalog = "NVPrestashop")
public class NvStockMvt implements java.io.Serializable {

	private Long idStockMvt;
	private int idStock;
	private Integer idOrder;
	private Integer idSupplyOrder;
	private int idStockMvtReason;
	private int idEmployee;
	private String employeeLastname;
	private String employeeFirstname;
	private int physicalQuantity;
	private Date dateAdd;
	private boolean sign;
	private BigDecimal priceTe;
	private BigDecimal lastWa;
	private BigDecimal currentWa;
	private Long referer;

	public NvStockMvt() {
	}

	public NvStockMvt(int idStock, int idStockMvtReason, int idEmployee, int physicalQuantity, Date dateAdd, boolean sign) {
		this.idStock = idStock;
		this.idStockMvtReason = idStockMvtReason;
		this.idEmployee = idEmployee;
		this.physicalQuantity = physicalQuantity;
		this.dateAdd = dateAdd;
		this.sign = sign;
	}

	public NvStockMvt(int idStock, Integer idOrder, Integer idSupplyOrder, int idStockMvtReason, int idEmployee, String employeeLastname,
					String employeeFirstname, int physicalQuantity, Date dateAdd, boolean sign, BigDecimal priceTe, BigDecimal lastWa, BigDecimal currentWa,
					Long referer) {
		this.idStock = idStock;
		this.idOrder = idOrder;
		this.idSupplyOrder = idSupplyOrder;
		this.idStockMvtReason = idStockMvtReason;
		this.idEmployee = idEmployee;
		this.employeeLastname = employeeLastname;
		this.employeeFirstname = employeeFirstname;
		this.physicalQuantity = physicalQuantity;
		this.dateAdd = dateAdd;
		this.sign = sign;
		this.priceTe = priceTe;
		this.lastWa = lastWa;
		this.currentWa = currentWa;
		this.referer = referer;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_stock_mvt", unique = true, nullable = false)
	public Long getIdStockMvt() {
		return this.idStockMvt;
	}

	public void setIdStockMvt(Long idStockMvt) {
		this.idStockMvt = idStockMvt;
	}

	@Column(name = "id_stock", nullable = false)
	public int getIdStock() {
		return this.idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	@Column(name = "id_order")
	public Integer getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	@Column(name = "id_supply_order")
	public Integer getIdSupplyOrder() {
		return this.idSupplyOrder;
	}

	public void setIdSupplyOrder(Integer idSupplyOrder) {
		this.idSupplyOrder = idSupplyOrder;
	}

	@Column(name = "id_stock_mvt_reason", nullable = false)
	public int getIdStockMvtReason() {
		return this.idStockMvtReason;
	}

	public void setIdStockMvtReason(int idStockMvtReason) {
		this.idStockMvtReason = idStockMvtReason;
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

	@Column(name = "physical_quantity", nullable = false)
	public int getPhysicalQuantity() {
		return this.physicalQuantity;
	}

	public void setPhysicalQuantity(int physicalQuantity) {
		this.physicalQuantity = physicalQuantity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_add", nullable = false, length = 0)
	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	@Column(name = "sign", nullable = false)
	public boolean isSign() {
		return this.sign;
	}

	public void setSign(boolean sign) {
		this.sign = sign;
	}

	@Column(name = "price_te", precision = 20, scale = 6)
	public BigDecimal getPriceTe() {
		return this.priceTe;
	}

	public void setPriceTe(BigDecimal priceTe) {
		this.priceTe = priceTe;
	}

	@Column(name = "last_wa", precision = 20, scale = 6)
	public BigDecimal getLastWa() {
		return this.lastWa;
	}

	public void setLastWa(BigDecimal lastWa) {
		this.lastWa = lastWa;
	}

	@Column(name = "current_wa", precision = 20, scale = 6)
	public BigDecimal getCurrentWa() {
		return this.currentWa;
	}

	public void setCurrentWa(BigDecimal currentWa) {
		this.currentWa = currentWa;
	}

	@Column(name = "referer")
	public Long getReferer() {
		return this.referer;
	}

	public void setReferer(Long referer) {
		this.referer = referer;
	}

}