package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvCountryShopId generated by hbm2java
 */
@Embeddable
public class NvCountryShopId implements java.io.Serializable {

	private int idCountry;
	private int idShop;

	public NvCountryShopId() {
	}

	public NvCountryShopId(int idCountry, int idShop) {
		this.idCountry = idCountry;
		this.idShop = idShop;
	}

	@Column(name = "id_country", nullable = false)
	public int getIdCountry() {
		return this.idCountry;
	}

	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
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
		if (!(other instanceof NvCountryShopId))
			return false;
		NvCountryShopId castOther = (NvCountryShopId) other;

		return (this.getIdCountry() == castOther.getIdCountry()) && (this.getIdShop() == castOther.getIdShop());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCountry();
		result = 37 * result + this.getIdShop();
		return result;
	}

}
