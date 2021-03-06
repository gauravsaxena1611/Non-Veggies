package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvCarrier generated by hbm2java
 */
@Entity
@Table(name = "nv_carrier", catalog = "NVPrestashop")
public class NvCarrier implements java.io.Serializable {

	private Integer idCarrier;
	private int idReference;
	private Integer idTaxRulesGroup;
	private String name;
	private String url;
	private boolean active;
	private boolean deleted;
	private boolean shippingHandling;
	private boolean rangeBehavior;
	private boolean isModule;
	private boolean isFree;
	private boolean shippingExternal;
	private boolean needRange;
	private String externalModuleName;
	private int shippingMethod;
	private int position;
	private Integer maxWidth;
	private Integer maxHeight;
	private Integer maxDepth;
	private BigDecimal maxWeight;
	private Integer grade;

	public NvCarrier() {
	}

	public NvCarrier(int idReference, String name, boolean active, boolean deleted, boolean shippingHandling, boolean rangeBehavior, boolean isModule,
					boolean isFree, boolean shippingExternal, boolean needRange, int shippingMethod, int position) {
		this.idReference = idReference;
		this.name = name;
		this.active = active;
		this.deleted = deleted;
		this.shippingHandling = shippingHandling;
		this.rangeBehavior = rangeBehavior;
		this.isModule = isModule;
		this.isFree = isFree;
		this.shippingExternal = shippingExternal;
		this.needRange = needRange;
		this.shippingMethod = shippingMethod;
		this.position = position;
	}

	public NvCarrier(int idReference, Integer idTaxRulesGroup, String name, String url, boolean active, boolean deleted, boolean shippingHandling,
					boolean rangeBehavior, boolean isModule, boolean isFree, boolean shippingExternal, boolean needRange, String externalModuleName,
					int shippingMethod, int position, Integer maxWidth, Integer maxHeight, Integer maxDepth, BigDecimal maxWeight, Integer grade) {
		this.idReference = idReference;
		this.idTaxRulesGroup = idTaxRulesGroup;
		this.name = name;
		this.url = url;
		this.active = active;
		this.deleted = deleted;
		this.shippingHandling = shippingHandling;
		this.rangeBehavior = rangeBehavior;
		this.isModule = isModule;
		this.isFree = isFree;
		this.shippingExternal = shippingExternal;
		this.needRange = needRange;
		this.externalModuleName = externalModuleName;
		this.shippingMethod = shippingMethod;
		this.position = position;
		this.maxWidth = maxWidth;
		this.maxHeight = maxHeight;
		this.maxDepth = maxDepth;
		this.maxWeight = maxWeight;
		this.grade = grade;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_carrier", unique = true, nullable = false)
	public Integer getIdCarrier() {
		return this.idCarrier;
	}

	public void setIdCarrier(Integer idCarrier) {
		this.idCarrier = idCarrier;
	}

	@Column(name = "id_reference", nullable = false)
	public int getIdReference() {
		return this.idReference;
	}

	public void setIdReference(int idReference) {
		this.idReference = idReference;
	}

	@Column(name = "id_tax_rules_group")
	public Integer getIdTaxRulesGroup() {
		return this.idTaxRulesGroup;
	}

	public void setIdTaxRulesGroup(Integer idTaxRulesGroup) {
		this.idTaxRulesGroup = idTaxRulesGroup;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "deleted", nullable = false)
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Column(name = "shipping_handling", nullable = false)
	public boolean isShippingHandling() {
		return this.shippingHandling;
	}

	public void setShippingHandling(boolean shippingHandling) {
		this.shippingHandling = shippingHandling;
	}

	@Column(name = "range_behavior", nullable = false)
	public boolean isRangeBehavior() {
		return this.rangeBehavior;
	}

	public void setRangeBehavior(boolean rangeBehavior) {
		this.rangeBehavior = rangeBehavior;
	}

	@Column(name = "is_module", nullable = false)
	public boolean isIsModule() {
		return this.isModule;
	}

	public void setIsModule(boolean isModule) {
		this.isModule = isModule;
	}

	@Column(name = "is_free", nullable = false)
	public boolean isIsFree() {
		return this.isFree;
	}

	public void setIsFree(boolean isFree) {
		this.isFree = isFree;
	}

	@Column(name = "shipping_external", nullable = false)
	public boolean isShippingExternal() {
		return this.shippingExternal;
	}

	public void setShippingExternal(boolean shippingExternal) {
		this.shippingExternal = shippingExternal;
	}

	@Column(name = "need_range", nullable = false)
	public boolean isNeedRange() {
		return this.needRange;
	}

	public void setNeedRange(boolean needRange) {
		this.needRange = needRange;
	}

	@Column(name = "external_module_name", length = 64)
	public String getExternalModuleName() {
		return this.externalModuleName;
	}

	public void setExternalModuleName(String externalModuleName) {
		this.externalModuleName = externalModuleName;
	}

	@Column(name = "shipping_method", nullable = false)
	public int getShippingMethod() {
		return this.shippingMethod;
	}

	public void setShippingMethod(int shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	@Column(name = "position", nullable = false)
	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Column(name = "max_width")
	public Integer getMaxWidth() {
		return this.maxWidth;
	}

	public void setMaxWidth(Integer maxWidth) {
		this.maxWidth = maxWidth;
	}

	@Column(name = "max_height")
	public Integer getMaxHeight() {
		return this.maxHeight;
	}

	public void setMaxHeight(Integer maxHeight) {
		this.maxHeight = maxHeight;
	}

	@Column(name = "max_depth")
	public Integer getMaxDepth() {
		return this.maxDepth;
	}

	public void setMaxDepth(Integer maxDepth) {
		this.maxDepth = maxDepth;
	}

	@Column(name = "max_weight", precision = 20, scale = 6)
	public BigDecimal getMaxWeight() {
		return this.maxWeight;
	}

	public void setMaxWeight(BigDecimal maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Column(name = "grade")
	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

}
