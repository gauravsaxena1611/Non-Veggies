package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvManufacturerShop generated by hbm2java
 */
@Entity
@Table(name = "nv_manufacturer_shop", catalog = "NVPrestashop")
public class NvManufacturerShop implements java.io.Serializable {

	private NvManufacturerShopId id;

	public NvManufacturerShop() {
	}

	public NvManufacturerShop(NvManufacturerShopId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idManufacturer", column = @Column(name = "id_manufacturer", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)) })
	public NvManufacturerShopId getId() {
		return this.id;
	}

	public void setId(NvManufacturerShopId id) {
		this.id = id;
	}

}
