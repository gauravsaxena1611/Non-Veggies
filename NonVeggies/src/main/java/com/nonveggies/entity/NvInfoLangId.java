package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvInfoLangId generated by hbm2java
 */
@Embeddable
public class NvInfoLangId implements java.io.Serializable {

	private int idInfo;
	private int idLang;

	public NvInfoLangId() {
	}

	public NvInfoLangId(int idInfo, int idLang) {
		this.idInfo = idInfo;
		this.idLang = idLang;
	}

	@Column(name = "id_info", nullable = false)
	public int getIdInfo() {
		return this.idInfo;
	}

	public void setIdInfo(int idInfo) {
		this.idInfo = idInfo;
	}

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvInfoLangId))
			return false;
		NvInfoLangId castOther = (NvInfoLangId) other;

		return (this.getIdInfo() == castOther.getIdInfo()) && (this.getIdLang() == castOther.getIdLang());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdInfo();
		result = 37 * result + this.getIdLang();
		return result;
	}

}
