package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvCmsLang generated by hbm2java
 */
@Entity
@Table(name = "nv_cms_lang", catalog = "NVPrestashop")
public class NvCmsLang implements java.io.Serializable {

	private NvCmsLangId id;
	private String metaTitle;
	private String metaDescription;
	private String metaKeywords;
	private String content;
	private String linkRewrite;

	public NvCmsLang() {
	}

	public NvCmsLang(NvCmsLangId id, String metaTitle, String linkRewrite) {
		this.id = id;
		this.metaTitle = metaTitle;
		this.linkRewrite = linkRewrite;
	}

	public NvCmsLang(NvCmsLangId id, String metaTitle, String metaDescription, String metaKeywords, String content, String linkRewrite) {
		this.id = id;
		this.metaTitle = metaTitle;
		this.metaDescription = metaDescription;
		this.metaKeywords = metaKeywords;
		this.content = content;
		this.linkRewrite = linkRewrite;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idCms", column = @Column(name = "id_cms", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)) })
	public NvCmsLangId getId() {
		return this.id;
	}

	public void setId(NvCmsLangId id) {
		this.id = id;
	}

	@Column(name = "meta_title", nullable = false, length = 128)
	public String getMetaTitle() {
		return this.metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	@Column(name = "meta_description")
	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	@Column(name = "meta_keywords")
	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "link_rewrite", nullable = false, length = 128)
	public String getLinkRewrite() {
		return this.linkRewrite;
	}

	public void setLinkRewrite(String linkRewrite) {
		this.linkRewrite = linkRewrite;
	}

}
