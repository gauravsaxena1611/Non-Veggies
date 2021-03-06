package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvGroupShopId generated by hbm2java
 */
@Embeddable
public class NvGroupShopId implements java.io.Serializable {

	private int idGroup;
	private int idShop;

	public NvGroupShopId() {
	}

	public NvGroupShopId(int idGroup, int idShop) {
		this.idGroup = idGroup;
		this.idShop = idShop;
	}

	@Column(name = "id_group", nullable = false)
	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
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
		if (!(other instanceof NvGroupShopId))
			return false;
		NvGroupShopId castOther = (NvGroupShopId) other;

		return (this.getIdGroup() == castOther.getIdGroup()) && (this.getIdShop() == castOther.getIdShop());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdGroup();
		result = 37 * result + this.getIdShop();
		return result;
	}

}
