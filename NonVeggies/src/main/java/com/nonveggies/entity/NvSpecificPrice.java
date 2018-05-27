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
import javax.persistence.UniqueConstraint;

/**
 * NvSpecificPrice generated by hbm2java
 */
@Entity
@Table(name = "nv_specific_price", catalog = "NVPrestashop", uniqueConstraints = @UniqueConstraint(columnNames = { "id_cart", "id_product", "id_shop",
		"id_shop_group", "id_currency", "id_country", "id_group", "id_customer", "id_product_attribute", "from_quantity", "id_specific_price_rule", "from",
		"to" }))
public class NvSpecificPrice implements java.io.Serializable {

	private Integer idSpecificPrice;
	private int idSpecificPriceRule;
	private int idCart;
	private int idProduct;
	private int idShop;
	private int idShopGroup;
	private int idCurrency;
	private int idCountry;
	private int idGroup;
	private int idCustomer;
	private int idProductAttribute;
	private BigDecimal price;
	private int fromQuantity;
	private BigDecimal reduction;
	private boolean reductionTax;
	private String reductionType;
	private Date from;
	private Date to;

	public NvSpecificPrice() {
	}

	public NvSpecificPrice(int idSpecificPriceRule, int idCart, int idProduct, int idShop, int idShopGroup, int idCurrency, int idCountry, int idGroup,
					int idCustomer, int idProductAttribute, BigDecimal price, int fromQuantity, BigDecimal reduction, boolean reductionTax,
					String reductionType, Date from, Date to) {
		this.idSpecificPriceRule = idSpecificPriceRule;
		this.idCart = idCart;
		this.idProduct = idProduct;
		this.idShop = idShop;
		this.idShopGroup = idShopGroup;
		this.idCurrency = idCurrency;
		this.idCountry = idCountry;
		this.idGroup = idGroup;
		this.idCustomer = idCustomer;
		this.idProductAttribute = idProductAttribute;
		this.price = price;
		this.fromQuantity = fromQuantity;
		this.reduction = reduction;
		this.reductionTax = reductionTax;
		this.reductionType = reductionType;
		this.from = from;
		this.to = to;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_specific_price", unique = true, nullable = false)
	public Integer getIdSpecificPrice() {
		return this.idSpecificPrice;
	}

	public void setIdSpecificPrice(Integer idSpecificPrice) {
		this.idSpecificPrice = idSpecificPrice;
	}

	@Column(name = "id_specific_price_rule", nullable = false)
	public int getIdSpecificPriceRule() {
		return this.idSpecificPriceRule;
	}

	public void setIdSpecificPriceRule(int idSpecificPriceRule) {
		this.idSpecificPriceRule = idSpecificPriceRule;
	}

	@Column(name = "id_cart", nullable = false)
	public int getIdCart() {
		return this.idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}

	@Column(name = "id_product", nullable = false)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "id_shop_group", nullable = false)
	public int getIdShopGroup() {
		return this.idShopGroup;
	}

	public void setIdShopGroup(int idShopGroup) {
		this.idShopGroup = idShopGroup;
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

	@Column(name = "id_customer", nullable = false)
	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	@Column(name = "id_product_attribute", nullable = false)
	public int getIdProductAttribute() {
		return this.idProductAttribute;
	}

	public void setIdProductAttribute(int idProductAttribute) {
		this.idProductAttribute = idProductAttribute;
	}

	@Column(name = "price", nullable = false, precision = 20, scale = 6)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "from_quantity", nullable = false)
	public int getFromQuantity() {
		return this.fromQuantity;
	}

	public void setFromQuantity(int fromQuantity) {
		this.fromQuantity = fromQuantity;
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
