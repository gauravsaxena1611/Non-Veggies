package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NvProductShop generated by hbm2java
 */
@Entity
@Table(name = "nv_product_shop", catalog = "NVPrestashop")
public class NvProductShop implements java.io.Serializable {

	private NvProductShopId id;
	private Integer idCategoryDefault;
	private int idTaxRulesGroup;
	private boolean onSale;
	private boolean onlineOnly;
	private BigDecimal ecotax;
	private int minimalQuantity;
	private BigDecimal price;
	private BigDecimal wholesalePrice;
	private String unity;
	private BigDecimal unitPriceRatio;
	private BigDecimal additionalShippingCost;
	private byte customizable;
	private byte uploadableFiles;
	private byte textFields;
	private boolean active;
	private String redirectType;
	private int idProductRedirected;
	private boolean availableForOrder;
	private Date availableDate;
	private String condition;
	private boolean showPrice;
	private boolean indexed;
	private String visibility;
	private Integer cacheDefaultAttribute;
	private boolean advancedStockManagement;
	private Date dateAdd;
	private Date dateUpd;
	private int packStockType;

	public NvProductShop() {
	}

	public NvProductShop(NvProductShopId id, int idTaxRulesGroup, boolean onSale, boolean onlineOnly, BigDecimal ecotax, int minimalQuantity, BigDecimal price,
					BigDecimal wholesalePrice, BigDecimal unitPriceRatio, BigDecimal additionalShippingCost, byte customizable, byte uploadableFiles,
					byte textFields, boolean active, String redirectType, int idProductRedirected, boolean availableForOrder, Date availableDate,
					String condition, boolean showPrice, boolean indexed, String visibility, boolean advancedStockManagement, Date dateAdd, Date dateUpd,
					int packStockType) {
		this.id = id;
		this.idTaxRulesGroup = idTaxRulesGroup;
		this.onSale = onSale;
		this.onlineOnly = onlineOnly;
		this.ecotax = ecotax;
		this.minimalQuantity = minimalQuantity;
		this.price = price;
		this.wholesalePrice = wholesalePrice;
		this.unitPriceRatio = unitPriceRatio;
		this.additionalShippingCost = additionalShippingCost;
		this.customizable = customizable;
		this.uploadableFiles = uploadableFiles;
		this.textFields = textFields;
		this.active = active;
		this.redirectType = redirectType;
		this.idProductRedirected = idProductRedirected;
		this.availableForOrder = availableForOrder;
		this.availableDate = availableDate;
		this.condition = condition;
		this.showPrice = showPrice;
		this.indexed = indexed;
		this.visibility = visibility;
		this.advancedStockManagement = advancedStockManagement;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
		this.packStockType = packStockType;
	}

	public NvProductShop(NvProductShopId id, Integer idCategoryDefault, int idTaxRulesGroup, boolean onSale, boolean onlineOnly, BigDecimal ecotax,
					int minimalQuantity, BigDecimal price, BigDecimal wholesalePrice, String unity, BigDecimal unitPriceRatio,
					BigDecimal additionalShippingCost, byte customizable, byte uploadableFiles, byte textFields, boolean active, String redirectType,
					int idProductRedirected, boolean availableForOrder, Date availableDate, String condition, boolean showPrice, boolean indexed,
					String visibility, Integer cacheDefaultAttribute, boolean advancedStockManagement, Date dateAdd, Date dateUpd, int packStockType) {
		this.id = id;
		this.idCategoryDefault = idCategoryDefault;
		this.idTaxRulesGroup = idTaxRulesGroup;
		this.onSale = onSale;
		this.onlineOnly = onlineOnly;
		this.ecotax = ecotax;
		this.minimalQuantity = minimalQuantity;
		this.price = price;
		this.wholesalePrice = wholesalePrice;
		this.unity = unity;
		this.unitPriceRatio = unitPriceRatio;
		this.additionalShippingCost = additionalShippingCost;
		this.customizable = customizable;
		this.uploadableFiles = uploadableFiles;
		this.textFields = textFields;
		this.active = active;
		this.redirectType = redirectType;
		this.idProductRedirected = idProductRedirected;
		this.availableForOrder = availableForOrder;
		this.availableDate = availableDate;
		this.condition = condition;
		this.showPrice = showPrice;
		this.indexed = indexed;
		this.visibility = visibility;
		this.cacheDefaultAttribute = cacheDefaultAttribute;
		this.advancedStockManagement = advancedStockManagement;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
		this.packStockType = packStockType;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idProduct", column = @Column(name = "id_product", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)) })
	public NvProductShopId getId() {
		return this.id;
	}

	public void setId(NvProductShopId id) {
		this.id = id;
	}

	@Column(name = "id_category_default")
	public Integer getIdCategoryDefault() {
		return this.idCategoryDefault;
	}

	public void setIdCategoryDefault(Integer idCategoryDefault) {
		this.idCategoryDefault = idCategoryDefault;
	}

	@Column(name = "id_tax_rules_group", nullable = false)
	public int getIdTaxRulesGroup() {
		return this.idTaxRulesGroup;
	}

	public void setIdTaxRulesGroup(int idTaxRulesGroup) {
		this.idTaxRulesGroup = idTaxRulesGroup;
	}

	@Column(name = "on_sale", nullable = false)
	public boolean isOnSale() {
		return this.onSale;
	}

	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}

	@Column(name = "online_only", nullable = false)
	public boolean isOnlineOnly() {
		return this.onlineOnly;
	}

	public void setOnlineOnly(boolean onlineOnly) {
		this.onlineOnly = onlineOnly;
	}

	@Column(name = "ecotax", nullable = false, precision = 17, scale = 6)
	public BigDecimal getEcotax() {
		return this.ecotax;
	}

	public void setEcotax(BigDecimal ecotax) {
		this.ecotax = ecotax;
	}

	@Column(name = "minimal_quantity", nullable = false)
	public int getMinimalQuantity() {
		return this.minimalQuantity;
	}

	public void setMinimalQuantity(int minimalQuantity) {
		this.minimalQuantity = minimalQuantity;
	}

	@Column(name = "price", nullable = false, precision = 20, scale = 6)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "wholesale_price", nullable = false, precision = 20, scale = 6)
	public BigDecimal getWholesalePrice() {
		return this.wholesalePrice;
	}

	public void setWholesalePrice(BigDecimal wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	@Column(name = "unity")
	public String getUnity() {
		return this.unity;
	}

	public void setUnity(String unity) {
		this.unity = unity;
	}

	@Column(name = "unit_price_ratio", nullable = false, precision = 20, scale = 6)
	public BigDecimal getUnitPriceRatio() {
		return this.unitPriceRatio;
	}

	public void setUnitPriceRatio(BigDecimal unitPriceRatio) {
		this.unitPriceRatio = unitPriceRatio;
	}

	@Column(name = "additional_shipping_cost", nullable = false, precision = 20)
	public BigDecimal getAdditionalShippingCost() {
		return this.additionalShippingCost;
	}

	public void setAdditionalShippingCost(BigDecimal additionalShippingCost) {
		this.additionalShippingCost = additionalShippingCost;
	}

	@Column(name = "customizable", nullable = false)
	public byte getCustomizable() {
		return this.customizable;
	}

	public void setCustomizable(byte customizable) {
		this.customizable = customizable;
	}

	@Column(name = "uploadable_files", nullable = false)
	public byte getUploadableFiles() {
		return this.uploadableFiles;
	}

	public void setUploadableFiles(byte uploadableFiles) {
		this.uploadableFiles = uploadableFiles;
	}

	@Column(name = "text_fields", nullable = false)
	public byte getTextFields() {
		return this.textFields;
	}

	public void setTextFields(byte textFields) {
		this.textFields = textFields;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "redirect_type", nullable = false, length = 3)
	public String getRedirectType() {
		return this.redirectType;
	}

	public void setRedirectType(String redirectType) {
		this.redirectType = redirectType;
	}

	@Column(name = "id_product_redirected", nullable = false)
	public int getIdProductRedirected() {
		return this.idProductRedirected;
	}

	public void setIdProductRedirected(int idProductRedirected) {
		this.idProductRedirected = idProductRedirected;
	}

	@Column(name = "available_for_order", nullable = false)
	public boolean isAvailableForOrder() {
		return this.availableForOrder;
	}

	public void setAvailableForOrder(boolean availableForOrder) {
		this.availableForOrder = availableForOrder;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "available_date", nullable = false, length = 0)
	public Date getAvailableDate() {
		return this.availableDate;
	}

	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}

	@Column(name = "condition", nullable = false, length = 11)
	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Column(name = "show_price", nullable = false)
	public boolean isShowPrice() {
		return this.showPrice;
	}

	public void setShowPrice(boolean showPrice) {
		this.showPrice = showPrice;
	}

	@Column(name = "indexed", nullable = false)
	public boolean isIndexed() {
		return this.indexed;
	}

	public void setIndexed(boolean indexed) {
		this.indexed = indexed;
	}

	@Column(name = "visibility", nullable = false, length = 7)
	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	@Column(name = "cache_default_attribute")
	public Integer getCacheDefaultAttribute() {
		return this.cacheDefaultAttribute;
	}

	public void setCacheDefaultAttribute(Integer cacheDefaultAttribute) {
		this.cacheDefaultAttribute = cacheDefaultAttribute;
	}

	@Column(name = "advanced_stock_management", nullable = false)
	public boolean isAdvancedStockManagement() {
		return this.advancedStockManagement;
	}

	public void setAdvancedStockManagement(boolean advancedStockManagement) {
		this.advancedStockManagement = advancedStockManagement;
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

	@Column(name = "pack_stock_type", nullable = false)
	public int getPackStockType() {
		return this.packStockType;
	}

	public void setPackStockType(int packStockType) {
		this.packStockType = packStockType;
	}

}