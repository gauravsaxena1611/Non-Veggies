package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvGenderLangId generated by hbm2java
 */
@Embeddable
public class NvGenderLangId implements java.io.Serializable {

	private int idGender;
	private int idLang;

	public NvGenderLangId() {
	}

	public NvGenderLangId(int idGender, int idLang) {
		this.idGender = idGender;
		this.idLang = idLang;
	}

	@Column(name = "id_gender", nullable = false)
	public int getIdGender() {
		return this.idGender;
	}

	public void setIdGender(int idGender) {
		this.idGender = idGender;
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
		if (!(other instanceof NvGenderLangId))
			return false;
		NvGenderLangId castOther = (NvGenderLangId) other;

		return (this.getIdGender() == castOther.getIdGender()) && (this.getIdLang() == castOther.getIdLang());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdGender();
		result = 37 * result + this.getIdLang();
		return result;
	}

}
