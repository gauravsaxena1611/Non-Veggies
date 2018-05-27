package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvAdviceLang generated by hbm2java
 */
@Entity
@Table(name = "nv_advice_lang", catalog = "NVPrestashop")
public class NvAdviceLang implements java.io.Serializable {

	private NvAdviceLangId id;
	private String html;

	public NvAdviceLang() {
	}

	public NvAdviceLang(NvAdviceLangId id) {
		this.id = id;
	}

	public NvAdviceLang(NvAdviceLangId id, String html) {
		this.id = id;
		this.html = html;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idAdvice", column = @Column(name = "id_advice", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)) })
	public NvAdviceLangId getId() {
		return this.id;
	}

	public void setId(NvAdviceLangId id) {
		this.id = id;
	}

	@Column(name = "html", length = 65535)
	public String getHtml() {
		return this.html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

}
