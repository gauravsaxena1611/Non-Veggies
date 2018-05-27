package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvAreaSlotId generated by hbm2java
 */
@Embeddable
public class NvAreaSlotId implements java.io.Serializable {

	private int idArea;
	private int idSlot;

	public NvAreaSlotId() {
	}

	public NvAreaSlotId(int idArea, int idSlot) {
		this.idArea = idArea;
		this.idSlot = idSlot;
	}

	@Column(name = "id_area", nullable = false)
	public int getIdArea() {
		return this.idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	@Column(name = "id_slot", nullable = false)
	public int getIdSlot() {
		return this.idSlot;
	}

	public void setIdSlot(int idSlot) {
		this.idSlot = idSlot;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvAreaSlotId))
			return false;
		NvAreaSlotId castOther = (NvAreaSlotId) other;

		return (this.getIdArea() == castOther.getIdArea()) && (this.getIdSlot() == castOther.getIdSlot());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdArea();
		result = 37 * result + this.getIdSlot();
		return result;
	}

}
