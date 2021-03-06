package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvSmartyLazyCacheId generated by hbm2java
 */
@Embeddable
public class NvSmartyLazyCacheId implements java.io.Serializable {

	private String templateHash;
	private String cacheId;
	private String compileId;

	public NvSmartyLazyCacheId() {
	}

	public NvSmartyLazyCacheId(String templateHash, String cacheId, String compileId) {
		this.templateHash = templateHash;
		this.cacheId = cacheId;
		this.compileId = compileId;
	}

	@Column(name = "template_hash", nullable = false, length = 32)
	public String getTemplateHash() {
		return this.templateHash;
	}

	public void setTemplateHash(String templateHash) {
		this.templateHash = templateHash;
	}

	@Column(name = "cache_id", nullable = false)
	public String getCacheId() {
		return this.cacheId;
	}

	public void setCacheId(String cacheId) {
		this.cacheId = cacheId;
	}

	@Column(name = "compile_id", nullable = false, length = 32)
	public String getCompileId() {
		return this.compileId;
	}

	public void setCompileId(String compileId) {
		this.compileId = compileId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvSmartyLazyCacheId))
			return false;
		NvSmartyLazyCacheId castOther = (NvSmartyLazyCacheId) other;

		return ((this.getTemplateHash() == castOther.getTemplateHash()) || (this.getTemplateHash() != null && castOther.getTemplateHash() != null && this
						.getTemplateHash().equals(castOther.getTemplateHash())))
						&& ((this.getCacheId() == castOther.getCacheId()) || (this.getCacheId() != null && castOther.getCacheId() != null && this.getCacheId()
										.equals(castOther.getCacheId())))
						&& ((this.getCompileId() == castOther.getCompileId()) || (this.getCompileId() != null && castOther.getCompileId() != null && this
										.getCompileId().equals(castOther.getCompileId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTemplateHash() == null ? 0 : this.getTemplateHash().hashCode());
		result = 37 * result + (getCacheId() == null ? 0 : this.getCacheId().hashCode());
		result = 37 * result + (getCompileId() == null ? 0 : this.getCompileId().hashCode());
		return result;
	}

}
