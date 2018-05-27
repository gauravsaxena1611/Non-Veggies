package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvInfoLang generated by hbm2java
 */
@Entity
@Table(name = "nv_info_lang", catalog = "NVPrestashop")
public class NvInfoLang implements java.io.Serializable {

	private NvInfoLangId id;
	private String text;

	public NvInfoLang() {
	}

	public NvInfoLang(NvInfoLangId id, String text) {
		this.id = id;
		this.text = text;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idInfo", column = @Column(name = "id_info", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)) })
	public NvInfoLangId getId() {
		return this.id;
	}

	public void setId(NvInfoLangId id) {
		this.id = id;
	}

	@Column(name = "text", nullable = false, length = 65535)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
