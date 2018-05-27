package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvFeatureValueLang generated by hbm2java
 */
@Entity
@Table(name = "nv_feature_value_lang", catalog = "NVPrestashop")
public class NvFeatureValueLang implements java.io.Serializable {

	private NvFeatureValueLangId id;
	private String value;

	public NvFeatureValueLang() {
	}

	public NvFeatureValueLang(NvFeatureValueLangId id) {
		this.id = id;
	}

	public NvFeatureValueLang(NvFeatureValueLangId id, String value) {
		this.id = id;
		this.value = value;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idFeatureValue", column = @Column(name = "id_feature_value", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)) })
	public NvFeatureValueLangId getId() {
		return this.id;
	}

	public void setId(NvFeatureValueLangId id) {
		this.id = id;
	}

	@Column(name = "value")
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}