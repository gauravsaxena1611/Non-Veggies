package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * NvLoyaltyStateLang generated by hbm2java
 */
@Entity
@Table(name = "nv_loyalty_state_lang", catalog = "NVPrestashop", uniqueConstraints = @UniqueConstraint(columnNames = { "id_loyalty_state", "id_lang" }))
public class NvLoyaltyStateLang implements java.io.Serializable {

	private NvLoyaltyStateLangId id;

	public NvLoyaltyStateLang() {
	}

	public NvLoyaltyStateLang(NvLoyaltyStateLangId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idLoyaltyState", column = @Column(name = "id_loyalty_state", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)),
			@AttributeOverride(name = "name", column = @Column(name = "name", nullable = false, length = 64)) })
	public NvLoyaltyStateLangId getId() {
		return this.id;
	}

	public void setId(NvLoyaltyStateLangId id) {
		this.id = id;
	}

}
