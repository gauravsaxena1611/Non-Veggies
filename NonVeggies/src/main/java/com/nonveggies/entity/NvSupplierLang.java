package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvSupplierLang generated by hbm2java
 */
@Entity
@Table(name = "nv_supplier_lang", catalog = "NVPrestashop")
public class NvSupplierLang implements java.io.Serializable {

	private NvSupplierLangId id;
	private String description;
	private String metaTitle;
	private String metaKeywords;
	private String metaDescription;

	public NvSupplierLang() {
	}

	public NvSupplierLang(NvSupplierLangId id) {
		this.id = id;
	}

	public NvSupplierLang(NvSupplierLangId id, String description, String metaTitle, String metaKeywords, String metaDescription) {
		this.id = id;
		this.description = description;
		this.metaTitle = metaTitle;
		this.metaKeywords = metaKeywords;
		this.metaDescription = metaDescription;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idSupplier", column = @Column(name = "id_supplier", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)) })
	public NvSupplierLangId getId() {
		return this.id;
	}

	public void setId(NvSupplierLangId id) {
		this.id = id;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "meta_title", length = 128)
	public String getMetaTitle() {
		return this.metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	@Column(name = "meta_keywords")
	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	@Column(name = "meta_description")
	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

}