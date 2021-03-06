package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvCarrierGroup generated by hbm2java
 */
@Entity
@Table(name = "nv_carrier_group", catalog = "NVPrestashop")
public class NvCarrierGroup implements java.io.Serializable {

	private NvCarrierGroupId id;

	public NvCarrierGroup() {
	}

	public NvCarrierGroup(NvCarrierGroupId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idCarrier", column = @Column(name = "id_carrier", nullable = false)),
			@AttributeOverride(name = "idGroup", column = @Column(name = "id_group", nullable = false)) })
	public NvCarrierGroupId getId() {
		return this.id;
	}

	public void setId(NvCarrierGroupId id) {
		this.id = id;
	}

}
