package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvQuickAccessLang generated by hbm2java
 */
@Entity
@Table(name = "nv_quick_access_lang", catalog = "NVPrestashop")
public class NvQuickAccessLang implements java.io.Serializable {

	private NvQuickAccessLangId id;
	private String name;

	public NvQuickAccessLang() {
	}

	public NvQuickAccessLang(NvQuickAccessLangId id, String name) {
		this.id = id;
		this.name = name;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idQuickAccess", column = @Column(name = "id_quick_access", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)) })
	public NvQuickAccessLangId getId() {
		return this.id;
	}

	public void setId(NvQuickAccessLangId id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
