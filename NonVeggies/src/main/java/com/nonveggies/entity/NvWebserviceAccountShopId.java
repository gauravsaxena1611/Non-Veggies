package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvWebserviceAccountShopId generated by hbm2java
 */
@Embeddable
public class NvWebserviceAccountShopId implements java.io.Serializable {

	private int idWebserviceAccount;
	private int idShop;

	public NvWebserviceAccountShopId() {
	}

	public NvWebserviceAccountShopId(int idWebserviceAccount, int idShop) {
		this.idWebserviceAccount = idWebserviceAccount;
		this.idShop = idShop;
	}

	@Column(name = "id_webservice_account", nullable = false)
	public int getIdWebserviceAccount() {
		return this.idWebserviceAccount;
	}

	public void setIdWebserviceAccount(int idWebserviceAccount) {
		this.idWebserviceAccount = idWebserviceAccount;
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
		if (!(other instanceof NvWebserviceAccountShopId))
			return false;
		NvWebserviceAccountShopId castOther = (NvWebserviceAccountShopId) other;

		return (this.getIdWebserviceAccount() == castOther.getIdWebserviceAccount()) && (this.getIdShop() == castOther.getIdShop());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdWebserviceAccount();
		result = 37 * result + this.getIdShop();
		return result;
	}

}