package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvSupplierLangId generated by hbm2java
 */
@Embeddable
public class NvSupplierLangId implements java.io.Serializable {

	private int idSupplier;
	private int idLang;

	public NvSupplierLangId() {
	}

	public NvSupplierLangId(int idSupplier, int idLang) {
		this.idSupplier = idSupplier;
		this.idLang = idLang;
	}

	@Column(name = "id_supplier", nullable = false)
	public int getIdSupplier() {
		return this.idSupplier;
	}

	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
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
		if (!(other instanceof NvSupplierLangId))
			return false;
		NvSupplierLangId castOther = (NvSupplierLangId) other;

		return (this.getIdSupplier() == castOther.getIdSupplier()) && (this.getIdLang() == castOther.getIdLang());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdSupplier();
		result = 37 * result + this.getIdLang();
		return result;
	}

}