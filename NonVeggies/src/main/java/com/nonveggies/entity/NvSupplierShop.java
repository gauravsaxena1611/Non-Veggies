package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvSupplierShop generated by hbm2java
 */
@Entity
@Table(name = "nv_supplier_shop", catalog = "NVPrestashop")
public class NvSupplierShop implements java.io.Serializable {

	private NvSupplierShopId id;

	public NvSupplierShop() {
	}

	public NvSupplierShop(NvSupplierShopId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idSupplier", column = @Column(name = "id_supplier", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)) })
	public NvSupplierShopId getId() {
		return this.id;
	}

	public void setId(NvSupplierShopId id) {
		this.id = id;
	}

}
