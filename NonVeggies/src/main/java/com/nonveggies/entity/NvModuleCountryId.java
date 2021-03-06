package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvModuleCountryId generated by hbm2java
 */
@Embeddable
public class NvModuleCountryId implements java.io.Serializable {

	private int idModule;
	private int idShop;
	private int idCountry;

	public NvModuleCountryId() {
	}

	public NvModuleCountryId(int idModule, int idShop, int idCountry) {
		this.idModule = idModule;
		this.idShop = idShop;
		this.idCountry = idCountry;
	}

	@Column(name = "id_module", nullable = false)
	public int getIdModule() {
		return this.idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "id_country", nullable = false)
	public int getIdCountry() {
		return this.idCountry;
	}

	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvModuleCountryId))
			return false;
		NvModuleCountryId castOther = (NvModuleCountryId) other;

		return (this.getIdModule() == castOther.getIdModule()) && (this.getIdShop() == castOther.getIdShop())
						&& (this.getIdCountry() == castOther.getIdCountry());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdModule();
		result = 37 * result + this.getIdShop();
		result = 37 * result + this.getIdCountry();
		return result;
	}

}
