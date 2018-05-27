package com.nonveggies.entity.order;

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
 * NvOrderCarrier generated by hbm2java
 */
@Entity
@Table(name = "nv_order_carrier", catalog = "NVPrestashop")
public class NvOrderCarrier implements java.io.Serializable {

	private Integer idOrderCarrier;
	private int idOrder;
	private int idCarrier;
	private Integer idOrderInvoice;
	private BigDecimal weight;
	private BigDecimal shippingCostTaxExcl;
	private BigDecimal shippingCostTaxIncl;
	private String trackingNumber;
	private Date dateAdd;

	public NvOrderCarrier() {
	}

	public NvOrderCarrier(int idOrder, int idCarrier, Date dateAdd) {
		this.idOrder = idOrder;
		this.idCarrier = idCarrier;
		this.dateAdd = dateAdd;
	}

	public NvOrderCarrier(int idOrder, int idCarrier, Integer idOrderInvoice, BigDecimal weight, BigDecimal shippingCostTaxExcl,
					BigDecimal shippingCostTaxIncl, String trackingNumber, Date dateAdd) {
		this.idOrder = idOrder;
		this.idCarrier = idCarrier;
		this.idOrderInvoice = idOrderInvoice;
		this.weight = weight;
		this.shippingCostTaxExcl = shippingCostTaxExcl;
		this.shippingCostTaxIncl = shippingCostTaxIncl;
		this.trackingNumber = trackingNumber;
		this.dateAdd = dateAdd;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_order_carrier", unique = true, nullable = false)
	public Integer getIdOrderCarrier() {
		return this.idOrderCarrier;
	}

	public void setIdOrderCarrier(Integer idOrderCarrier) {
		this.idOrderCarrier = idOrderCarrier;
	}

	@Column(name = "id_order", nullable = false)
	public int getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	@Column(name = "id_carrier", nullable = false)
	public int getIdCarrier() {
		return this.idCarrier;
	}

	public void setIdCarrier(int idCarrier) {
		this.idCarrier = idCarrier;
	}

	@Column(name = "id_order_invoice")
	public Integer getIdOrderInvoice() {
		return this.idOrderInvoice;
	}

	public void setIdOrderInvoice(Integer idOrderInvoice) {
		this.idOrderInvoice = idOrderInvoice;
	}

	@Column(name = "weight", precision = 20, scale = 6)
	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Column(name = "shipping_cost_tax_excl", precision = 20, scale = 6)
	public BigDecimal getShippingCostTaxExcl() {
		return this.shippingCostTaxExcl;
	}

	public void setShippingCostTaxExcl(BigDecimal shippingCostTaxExcl) {
		this.shippingCostTaxExcl = shippingCostTaxExcl;
	}

	@Column(name = "shipping_cost_tax_incl", precision = 20, scale = 6)
	public BigDecimal getShippingCostTaxIncl() {
		return this.shippingCostTaxIncl;
	}

	public void setShippingCostTaxIncl(BigDecimal shippingCostTaxIncl) {
		this.shippingCostTaxIncl = shippingCostTaxIncl;
	}

	@Column(name = "tracking_number", length = 64)
	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
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