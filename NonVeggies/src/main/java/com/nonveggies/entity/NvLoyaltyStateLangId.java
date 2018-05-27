package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvLoyaltyStateLangId generated by hbm2java
 */
@Embeddable
public class NvLoyaltyStateLangId implements java.io.Serializable {

	private int idLoyaltyState;
	private int idLang;
	private String name;

	public NvLoyaltyStateLangId() {
	}

	public NvLoyaltyStateLangId(int idLoyaltyState, int idLang, String name) {
		this.idLoyaltyState = idLoyaltyState;
		this.idLang = idLang;
		this.name = name;
	}

	@Column(name = "id_loyalty_state", nullable = false)
	public int getIdLoyaltyState() {
		return this.idLoyaltyState;
	}

	public void setIdLoyaltyState(int idLoyaltyState) {
		this.idLoyaltyState = idLoyaltyState;
	}

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvLoyaltyStateLangId))
			return false;
		NvLoyaltyStateLangId castOther = (NvLoyaltyStateLangId) other;

		return (this.getIdLoyaltyState() == castOther.getIdLoyaltyState())
						&& (this.getIdLang() == castOther.getIdLang())
						&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null && this.getName().equals(
										castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdLoyaltyState();
		result = 37 * result + this.getIdLang();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}
