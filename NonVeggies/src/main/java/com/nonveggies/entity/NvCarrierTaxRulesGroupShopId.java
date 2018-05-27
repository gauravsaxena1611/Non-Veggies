package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvCarrierTaxRulesGroupShopId generated by hbm2java
 */
@Embeddable
public class NvCarrierTaxRulesGroupShopId implements java.io.Serializable {

	private int idCarrier;
	private int idTaxRulesGroup;
	private int idShop;

	public NvCarrierTaxRulesGroupShopId() {
	}

	public NvCarrierTaxRulesGroupShopId(int idCarrier, int idTaxRulesGroup, int idShop) {
		this.idCarrier = idCarrier;
		this.idTaxRulesGroup = idTaxRulesGroup;
		this.idShop = idShop;
	}

	@Column(name = "id_carrier", nullable = false)
	public int getIdCarrier() {
		return this.idCarrier;
	}

	public void setIdCarrier(int idCarrier) {
		this.idCarrier = idCarrier;
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
		if (!(other instanceof NvCarrierTaxRulesGroupShopId))
			return false;
		NvCarrierTaxRulesGroupShopId castOther = (NvCarrierTaxRulesGroupShopId) other;

		return (this.getIdCarrier() == castOther.getIdCarrier()) && (this.getIdTaxRulesGroup() == castOther.getIdTaxRulesGroup())
						&& (this.getIdShop() == castOther.getIdShop());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCarrier();
		result = 37 * result + this.getIdTaxRulesGroup();
		result = 37 * result + this.getIdShop();
		return result;
	}

}
