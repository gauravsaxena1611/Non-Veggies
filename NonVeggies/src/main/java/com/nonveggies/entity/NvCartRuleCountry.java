package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvCartRuleCountry generated by hbm2java
 */
@Entity
@Table(name = "nv_cart_rule_country", catalog = "NVPrestashop")
public class NvCartRuleCountry implements java.io.Serializable {

	private NvCartRuleCountryId id;

	public NvCartRuleCountry() {
	}

	public NvCartRuleCountry(NvCartRuleCountryId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idCartRule", column = @Column(name = "id_cart_rule", nullable = false)),
			@AttributeOverride(name = "idCountry", column = @Column(name = "id_country", nullable = false)) })
	public NvCartRuleCountryId getId() {
		return this.id;
	}

	public void setId(NvCartRuleCountryId id) {
		this.id = id;
	}

}