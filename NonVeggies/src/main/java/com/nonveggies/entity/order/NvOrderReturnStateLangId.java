package com.nonveggies.entity.order;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvOrderReturnStateLangId generated by hbm2java
 */
@Embeddable
public class NvOrderReturnStateLangId implements java.io.Serializable {

	private int idOrderReturnState;
	private int idLang;

	public NvOrderReturnStateLangId() {
	}

	public NvOrderReturnStateLangId(int idOrderReturnState, int idLang) {
		this.idOrderReturnState = idOrderReturnState;
		this.idLang = idLang;
	}

	@Column(name = "id_order_return_state", nullable = false)
	public int getIdOrderReturnState() {
		return this.idOrderReturnState;
	}

	public void setIdOrderReturnState(int idOrderReturnState) {
		this.idOrderReturnState = idOrderReturnState;
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
		if (!(other instanceof NvOrderReturnStateLangId))
			return false;
		NvOrderReturnStateLangId castOther = (NvOrderReturnStateLangId) other;

		return (this.getIdOrderReturnState() == castOther.getIdOrderReturnState()) && (this.getIdLang() == castOther.getIdLang());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdOrderReturnState();
		result = 37 * result + this.getIdLang();
		return result;
	}

}