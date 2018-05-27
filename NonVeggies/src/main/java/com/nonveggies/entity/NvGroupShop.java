package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvGroupShop generated by hbm2java
 */
@Entity
@Table(name = "nv_group_shop", catalog = "NVPrestashop")
public class NvGroupShop implements java.io.Serializable {

	private NvGroupShopId id;

	public NvGroupShop() {
	}

	public NvGroupShop(NvGroupShopId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idGroup", column = @Column(name = "id_group", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)) })
	public NvGroupShopId getId() {
		return this.id;
	}

	public void setId(NvGroupShopId id) {
		this.id = id;
	}

}
