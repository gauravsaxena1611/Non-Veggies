package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvAttributeLangId generated by hbm2java
 */
@Embeddable
public class NvAttributeLangId implements java.io.Serializable {

	private int idAttribute;
	private int idLang;

	public NvAttributeLangId() {
	}

	public NvAttributeLangId(int idAttribute, int idLang) {
		this.idAttribute = idAttribute;
		this.idLang = idLang;
	}

	@Column(name = "id_attribute", nullable = false)
	public int getIdAttribute() {
		return this.idAttribute;
	}

	public void setIdAttribute(int idAttribute) {
		this.idAttribute = idAttribute;
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
		if (!(other instanceof NvAttributeLangId))
			return false;
		NvAttributeLangId castOther = (NvAttributeLangId) other;

		return (this.getIdAttribute() == castOther.getIdAttribute()) && (this.getIdLang() == castOther.getIdLang());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdAttribute();
		result = 37 * result + this.getIdLang();
		return result;
	}

}
