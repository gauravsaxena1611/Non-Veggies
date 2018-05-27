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
 * NvSpecificPriceRule generated by hbm2java
 */
@Entity
@Table(name = "nv_specific_price_rule", catalog = "NVPrestashop")
public class NvSpecificPriceRule implements java.io.Serializable {

	private Integer idSpecificPriceRule;
	private String name;
	private int idShop;
	private int idCurrency;
	private int idCountry;
	private int idGroup;
	private int fromQuantity;
	private BigDecimal price;
	private BigDecimal reduction;
	private boolean reductionTax;
	private String reductionType;
	private Date from;
	private Date to;

	public NvSpecificPriceRule() {
	}

	public NvSpecificPriceRule(String name, int idShop, int idCurrency, int idCountry, int idGroup, int fromQuantity, BigDecimal reduction,
					boolean reductionTax, String reductionType, Date from, Date to) {
		this.name = name;
		this.idShop = idShop;
		this.idCurrency = idCurrency;
		this.idCountry = idCountry;
		this.idGroup = idGroup;
		this.fromQuantity = fromQuantity;
		this.reduction = reduction;
		this.reductionTax = reductionTax;
		this.reductionType = reductionType;
		this.from = from;
		this.to = to;
	}

	public NvSpecificPriceRule(String name, int idShop, int idCurrency, int idCountry, int idGroup, int fromQuantity, BigDecimal price, BigDecimal reduction,
					boolean reductionTax, String reductionType, Date from, Date to) {
		this.name = name;
		this.idShop = idShop;
		this.idCurrency = idCurrency;
		this.idCountry = idCountry;
		this.idGroup = idGroup;
		this.fromQuantity = fromQuantity;
		this.price = price;
		this.reduction = reduction;
		this.reductionTax = reductionTax;
		this.reductionType = reductionType;
		this.from = from;
		this.to = to;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_specific_price_rule", unique = true, nullable = false)
	public Integer getIdSpecificPriceRule() {
		return this.idSpecificPriceRule;
	}

	public void setIdSpecificPriceRule(Integer idSpecificPriceRule) {
		this.idSpecificPriceRule = idSpecificPriceRule;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "id_currency", nullable = false)
	public int getIdCurrency() {
		return this.idCurrency;
	}

	public void setIdCurrency(int idCurrency) {
		this.idCurrency = idCurrency;
	}

	@Column(name = "id_country", nullable = false)
	public int getIdCountry() {
		return this.idCountry;
	}

	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}

	@Column(name = "id_group", nullable = false)
	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	@Column(name = "from_quantity", nullable = false)
	public int getFromQuantity() {
		return this.fromQuantity;
	}

	public void setFromQuantity(int fromQuantity) {
		this.fromQuantity = fromQuantity;
	}

	@Column(name = "price", precision = 20, scale = 6)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "reduction", nullable = false, precision = 20, scale = 6)
	public BigDecimal getReduction() {
		return this.reduction;
	}

	public void setReduction(BigDecimal reduction) {
		this.reduction = reduction;
	}

	@Column(name = "reduction_tax", nullable = false)
	public boolean isReductionTax() {
		return this.reductionTax;
	}

	public void setReductionTax(boolean reductionTax) {
		this.reductionTax = reductionTax;
	}

	@Column(name = "reduction_type", nullable = false, length = 10)
	public String getReductionType() {
		return this.reductionType;
	}

	public void setReductionType(String reductionType) {
		this.reductionType = reductionType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "from", nullable = false, length = 0)
	public Date getFrom() {
		return this.from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "to", nullable = false, length = 0)
	public Date getTo() {
		return this.to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

}