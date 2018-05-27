package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvManufacturerLangId generated by hbm2java
 */
@Embeddable
public class NvManufacturerLangId implements java.io.Serializable {

	private int idManufacturer;
	private int idLang;

	public NvManufacturerLangId() {
	}

	public NvManufacturerLangId(int idManufacturer, int idLang) {
		this.idManufacturer = idManufacturer;
		this.idLang = idLang;
	}

	@Column(name = "id_manufacturer", nullable = false)
	public int getIdManufacturer() {
		return this.idManufacturer;
	}

	public void setIdManufacturer(int idManufacturer) {
		this.idManufacturer = idManufacturer;
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
		if (!(other instanceof NvManufacturerLangId))
			return false;
		NvManufacturerLangId castOther = (NvManufacturerLangId) other;

		return (this.getIdManufacturer() == castOther.getIdManufacturer()) && (this.getIdLang() == castOther.getIdLang());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdManufacturer();
		result = 37 * result + this.getIdLang();
		return result;
	}

}