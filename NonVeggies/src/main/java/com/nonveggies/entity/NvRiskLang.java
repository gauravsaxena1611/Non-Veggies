package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvRiskLang generated by hbm2java
 */
@Entity
@Table(name = "nv_risk_lang", catalog = "NVPrestashop")
public class NvRiskLang implements java.io.Serializable {

	private NvRiskLangId id;
	private String name;

	public NvRiskLang() {
	}

	public NvRiskLang(NvRiskLangId id, String name) {
		this.id = id;
		this.name = name;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idRisk", column = @Column(name = "id_risk", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)) })
	public NvRiskLangId getId() {
		return this.id;
	}

	public void setId(NvRiskLangId id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
