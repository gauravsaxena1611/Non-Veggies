package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvLayeredIndexableAttributeLangValue generated by hbm2java
 */
@Entity
@Table(name = "nv_layered_indexable_attribute_lang_value", catalog = "NVPrestashop")
public class NvLayeredIndexableAttributeLangValue implements java.io.Serializable {

	private NvLayeredIndexableAttributeLangValueId id;
	private String urlName;
	private String metaTitle;

	public NvLayeredIndexableAttributeLangValue() {
	}

	public NvLayeredIndexableAttributeLangValue(NvLayeredIndexableAttributeLangValueId id) {
		this.id = id;
	}

	public NvLayeredIndexableAttributeLangValue(NvLayeredIndexableAttributeLangValueId id, String urlName, String metaTitle) {
		this.id = id;
		this.urlName = urlName;
		this.metaTitle = metaTitle;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idAttribute", column = @Column(name = "id_attribute", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)) })
	public NvLayeredIndexableAttributeLangValueId getId() {
		return this.id;
	}

	public void setId(NvLayeredIndexableAttributeLangValueId id) {
		this.id = id;
	}

	@Column(name = "url_name", length = 128)
	public String getUrlName() {
		return this.urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	@Column(name = "meta_title", length = 128)
	public String getMetaTitle() {
		return this.metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

}