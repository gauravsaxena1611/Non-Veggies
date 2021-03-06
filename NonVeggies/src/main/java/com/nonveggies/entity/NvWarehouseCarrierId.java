package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvWarehouseCarrierId generated by hbm2java
 */
@Embeddable
public class NvWarehouseCarrierId implements java.io.Serializable {

	private int idWarehouse;
	private int idCarrier;

	public NvWarehouseCarrierId() {
	}

	public NvWarehouseCarrierId(int idWarehouse, int idCarrier) {
		this.idWarehouse = idWarehouse;
		this.idCarrier = idCarrier;
	}

	@Column(name = "id_warehouse", nullable = false)
	public int getIdWarehouse() {
		return this.idWarehouse;
	}

	public void setIdWarehouse(int idWarehouse) {
		this.idWarehouse = idWarehouse;
	}

	@Column(name = "id_carrier", nullable = false)
	public int getIdCarrier() {
		return this.idCarrier;
	}

	public void setIdCarrier(int idCarrier) {
		this.idCarrier = idCarrier;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvWarehouseCarrierId))
			return false;
		NvWarehouseCarrierId castOther = (NvWarehouseCarrierId) other;

		return (this.getIdWarehouse() == castOther.getIdWarehouse()) && (this.getIdCarrier() == castOther.getIdCarrier());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdWarehouse();
		result = 37 * result + this.getIdCarrier();
		return result;
	}

}
