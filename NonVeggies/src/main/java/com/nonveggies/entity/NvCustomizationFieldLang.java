package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvCustomizationFieldLang generated by hbm2java
 */
@Entity
@Table(name = "nv_customization_field_lang", catalog = "NVPrestashop")
public class NvCustomizationFieldLang implements java.io.Serializable {

	private NvCustomizationFieldLangId id;
	private String name;

	public NvCustomizationFieldLang() {
	}

	public NvCustomizationFieldLang(NvCustomizationFieldLangId id, String name) {
		this.id = id;
		this.name = name;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idCustomizationField", column = @Column(name = "id_customization_field", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)) })
	public NvCustomizationFieldLangId getId() {
		return this.id;
	}

	public void setId(NvCustomizationFieldLangId id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
