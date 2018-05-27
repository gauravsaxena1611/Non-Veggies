package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvCarrierGroupId generated by hbm2java
 */
@Embeddable
public class NvCarrierGroupId implements java.io.Serializable {

	private int idCarrier;
	private int idGroup;

	public NvCarrierGroupId() {
	}

	public NvCarrierGroupId(int idCarrier, int idGroup) {
		this.idCarrier = idCarrier;
		this.idGroup = idGroup;
	}

	@Column(name = "id_carrier", nullable = false)
	public int getIdCarrier() {
		return this.idCarrier;
	}

	public void setIdCarrier(int idCarrier) {
		this.idCarrier = idCarrier;
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
		if (!(other instanceof NvCarrierGroupId))
			return false;
		NvCarrierGroupId castOther = (NvCarrierGroupId) other;

		return (this.getIdCarrier() == castOther.getIdCarrier()) && (this.getIdGroup() == castOther.getIdGroup());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCarrier();
		result = 37 * result + this.getIdGroup();
		return result;
	}

}