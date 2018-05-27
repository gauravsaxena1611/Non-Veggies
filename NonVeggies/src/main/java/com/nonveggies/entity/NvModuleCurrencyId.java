package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvModuleCurrencyId generated by hbm2java
 */
@Embeddable
public class NvModuleCurrencyId implements java.io.Serializable {

	private int idModule;
	private int idShop;
	private int idCurrency;

	public NvModuleCurrencyId() {
	}

	public NvModuleCurrencyId(int idModule, int idShop, int idCurrency) {
		this.idModule = idModule;
		this.idShop = idShop;
		this.idCurrency = idCurrency;
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

	@Column(name = "id_currency", nullable = false)
	public int getIdCurrency() {
		return this.idCurrency;
	}

	public void setIdCurrency(int idCurrency) {
		this.idCurrency = idCurrency;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvModuleCurrencyId))
			return false;
		NvModuleCurrencyId castOther = (NvModuleCurrencyId) other;

		return (this.getIdModule() == castOther.getIdModule()) && (this.getIdShop() == castOther.getIdShop())
						&& (this.getIdCurrency() == castOther.getIdCurrency());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdModule();
		result = 37 * result + this.getIdShop();
		result = 37 * result + this.getIdCurrency();
		return result;
	}

}
