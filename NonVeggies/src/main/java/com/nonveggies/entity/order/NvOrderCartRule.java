package com.nonveggies.entity.order;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvOrderCartRule generated by hbm2java
 */
@Entity
@Table(name = "nv_order_cart_rule", catalog = "NVPrestashop")
public class NvOrderCartRule implements java.io.Serializable {

	private Integer idOrderCartRule;
	private int idOrder;
	private int idCartRule;
	private Integer idOrderInvoice;
	private String name;
	private BigDecimal value;
	private BigDecimal valueTaxExcl;
	private boolean freeShipping;

	public NvOrderCartRule() {
	}

	public NvOrderCartRule(int idOrder, int idCartRule, String name, BigDecimal value, BigDecimal valueTaxExcl, boolean freeShipping) {
		this.idOrder = idOrder;
		this.idCartRule = idCartRule;
		this.name = name;
		this.value = value;
		this.valueTaxExcl = valueTaxExcl;
		this.freeShipping = freeShipping;
	}

	public NvOrderCartRule(int idOrder, int idCartRule, Integer idOrderInvoice, String name, BigDecimal value, BigDecimal valueTaxExcl, boolean freeShipping) {
		this.idOrder = idOrder;
		this.idCartRule = idCartRule;
		this.idOrderInvoice = idOrderInvoice;
		this.name = name;
		this.value = value;
		this.valueTaxExcl = valueTaxExcl;
		this.freeShipping = freeShipping;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_order_cart_rule", unique = true, nullable = false)
	public Integer getIdOrderCartRule() {
		return this.idOrderCartRule;
	}

	public void setIdOrderCartRule(Integer idOrderCartRule) {
		this.idOrderCartRule = idOrderCartRule;
	}

	@Column(name = "id_order", nullable = false)
	public int getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	@Column(name = "id_cart_rule", nullable = false)
	public int getIdCartRule() {
		return this.idCartRule;
	}

	public void setIdCartRule(int idCartRule) {
		this.idCartRule = idCartRule;
	}

	@Column(name = "id_order_invoice")
	public Integer getIdOrderInvoice() {
		return this.idOrderInvoice;
	}

	public void setIdOrderInvoice(Integer idOrderInvoice) {
		this.idOrderInvoice = idOrderInvoice;
	}

	@Column(name = "name", nullable = false, length = 254)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "value", nullable = false, precision = 17)
	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Column(name = "value_tax_excl", nullable = false, precision = 17)
	public BigDecimal getValueTaxExcl() {
		return this.valueTaxExcl;
	}

	public void setValueTaxExcl(BigDecimal valueTaxExcl) {
		this.valueTaxExcl = valueTaxExcl;
	}

	@Column(name = "free_shipping", nullable = false)
	public boolean isFreeShipping() {
		return this.freeShipping;
	}

	public void setFreeShipping(boolean freeShipping) {
		this.freeShipping = freeShipping;
	}

}