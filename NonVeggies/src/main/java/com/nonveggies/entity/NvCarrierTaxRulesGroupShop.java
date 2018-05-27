package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvCarrierTaxRulesGroupShop generated by hbm2java
 */
@Entity
@Table(name = "nv_carrier_tax_rules_group_shop", catalog = "NVPrestashop")
public class NvCarrierTaxRulesGroupShop implements java.io.Serializable {

	private NvCarrierTaxRulesGroupShopId id;

	public NvCarrierTaxRulesGroupShop() {
	}

	public NvCarrierTaxRulesGroupShop(NvCarrierTaxRulesGroupShopId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idCarrier", column = @Column(name = "id_carrier", nullable = false)),
			@AttributeOverride(name = "idTaxRulesGroup", column = @Column(name = "id_tax_rules_group", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)) })
	public NvCarrierTaxRulesGroupShopId getId() {
		return this.id;
	}

	public void setId(NvCarrierTaxRulesGroupShopId id) {
		this.id = id;
	}

}
