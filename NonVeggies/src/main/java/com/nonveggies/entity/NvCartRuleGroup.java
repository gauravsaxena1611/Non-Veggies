package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvCartRuleGroup generated by hbm2java
 */
@Entity
@Table(name = "nv_cart_rule_group", catalog = "NVPrestashop")
public class NvCartRuleGroup implements java.io.Serializable {

	private NvCartRuleGroupId id;

	public NvCartRuleGroup() {
	}

	public NvCartRuleGroup(NvCartRuleGroupId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idCartRule", column = @Column(name = "id_cart_rule", nullable = false)),
			@AttributeOverride(name = "idGroup", column = @Column(name = "id_group", nullable = false)) })
	public NvCartRuleGroupId getId() {
		return this.id;
	}

	public void setId(NvCartRuleGroupId id) {
		this.id = id;
	}

}
