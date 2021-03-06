package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvTaxRulesGroupShopId generated by hbm2java
 */
@Embeddable
public class NvTaxRulesGroupShopId implements java.io.Serializable {

	private int idTaxRulesGroup;
	private int idShop;

	public NvTaxRulesGroupShopId() {
	}

	public NvTaxRulesGroupShopId(int idTaxRulesGroup, int idShop) {
		this.idTaxRulesGroup = idTaxRulesGroup;
		this.idShop = idShop;
	}

	@Column(name = "id_tax_rules_group", nullable = false)
	public int getIdTaxRulesGroup() {
		return this.idTaxRulesGroup;
	}

	public void setIdTaxRulesGroup(int idTaxRulesGroup) {
		this.idTaxRulesGroup = idTaxRulesGroup;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvTaxRulesGroupShopId))
			return false;
		NvTaxRulesGroupShopId castOther = (NvTaxRulesGroupShopId) other;

		return (this.getIdTaxRulesGroup() == castOther.getIdTaxRulesGroup()) && (this.getIdShop() == castOther.getIdShop());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdTaxRulesGroup();
		result = 37 * result + this.getIdShop();
		return result;
	}

}
