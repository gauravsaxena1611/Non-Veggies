package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvCarrierLang generated by hbm2java
 */
@Entity
@Table(name = "nv_carrier_lang", catalog = "NVPrestashop")
public class NvCarrierLang implements java.io.Serializable {

	private NvCarrierLangId id;
	private String delay;

	public NvCarrierLang() {
	}

	public NvCarrierLang(NvCarrierLangId id) {
		this.id = id;
	}

	public NvCarrierLang(NvCarrierLangId id, String delay) {
		this.id = id;
		this.delay = delay;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)),
			@AttributeOverride(name = "idCarrier", column = @Column(name = "id_carrier", nullable = false)) })
	public NvCarrierLangId getId() {
		return this.id;
	}

	public void setId(NvCarrierLangId id) {
		this.id = id;
	}

	@Column(name = "delay", length = 128)
	public String getDelay() {
		return this.delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

}
