package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NvSmartyCache generated by hbm2java
 */
@Entity
@Table(name = "nv_smarty_cache", catalog = "NVPrestashop")
public class NvSmartyCache implements java.io.Serializable {

	private String idSmartyCache;
	private String name;
	private String cacheId;
	private Date modified;
	private String content;

	public NvSmartyCache() {
	}

	public NvSmartyCache(String idSmartyCache, String name, Date modified, String content) {
		this.idSmartyCache = idSmartyCache;
		this.name = name;
		this.modified = modified;
		this.content = content;
	}

	public NvSmartyCache(String idSmartyCache, String name, String cacheId, Date modified, String content) {
		this.idSmartyCache = idSmartyCache;
		this.name = name;
		this.cacheId = cacheId;
		this.modified = modified;
		this.content = content;
	}

	@Id
	@Column(name = "id_smarty_cache", unique = true, nullable = false, length = 40)
	public String getIdSmartyCache() {
		return this.idSmartyCache;
	}

	public void setIdSmartyCache(String idSmartyCache) {
		this.idSmartyCache = idSmartyCache;
	}

	@Column(name = "name", nullable = false, length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "cache_id", length = 254)
	public String getCacheId() {
		return this.cacheId;
	}

	public void setCacheId(String cacheId) {
		this.cacheId = cacheId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified", nullable = false, length = 0)
	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Column(name = "content", nullable = false)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
