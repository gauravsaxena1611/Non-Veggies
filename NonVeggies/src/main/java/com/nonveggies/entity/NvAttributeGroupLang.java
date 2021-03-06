package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvAttributeGroupLang generated by hbm2java
 */
@Entity
@Table(name = "nv_attribute_group_lang", catalog = "NVPrestashop")
public class NvAttributeGroupLang implements java.io.Serializable {

	private NvAttributeGroupLangId id;
	private String name;
	private String publicName;

	public NvAttributeGroupLang() {
	}

	public NvAttributeGroupLang(NvAttributeGroupLangId id, String name, String publicName) {
		this.id = id;
		this.name = name;
		this.publicName = publicName;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idAttributeGroup", column = @Column(name = "id_attribute_group", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)) })
	public NvAttributeGroupLangId getId() {
		return this.id;
	}

	public void setId(NvAttributeGroupLangId id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 128)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "public_name", nullable = false, length = 64)
	public String getPublicName() {
		return this.publicName;
	}

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

}
