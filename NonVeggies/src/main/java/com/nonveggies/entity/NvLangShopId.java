package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvLangShopId generated by hbm2java
 */
@Embeddable
public class NvLangShopId implements java.io.Serializable {

	private int idLang;
	private int idShop;

	public NvLangShopId() {
	}

	public NvLangShopId(int idLang, int idShop) {
		this.idLang = idLang;
		this.idShop = idShop;
	}

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvLangShopId))
			return false;
		NvLangShopId castOther = (NvLangShopId) other;

		return (this.getIdLang() == castOther.getIdLang()) && (this.getIdShop() == castOther.getIdShop());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdLang();
		result = 37 * result + this.getIdShop();
		return result;
	}

}
