package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvModuleGroupId generated by hbm2java
 */
@Embeddable
public class NvModuleGroupId implements java.io.Serializable {

	private int idModule;
	private int idShop;
	private int idGroup;

	public NvModuleGroupId() {
	}

	public NvModuleGroupId(int idModule, int idShop, int idGroup) {
		this.idModule = idModule;
		this.idShop = idShop;
		this.idGroup = idGroup;
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

	@Column(name = "id_group", nullable = false)
	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvModuleGroupId))
			return false;
		NvModuleGroupId castOther = (NvModuleGroupId) other;

		return (this.getIdModule() == castOther.getIdModule()) && (this.getIdShop() == castOther.getIdShop()) && (this.getIdGroup() == castOther.getIdGroup());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdModule();
		result = 37 * result + this.getIdShop();
		result = 37 * result + this.getIdGroup();
		return result;
	}

}
