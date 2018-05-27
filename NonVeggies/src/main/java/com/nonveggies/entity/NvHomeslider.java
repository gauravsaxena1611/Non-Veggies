package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvHomeslider generated by hbm2java
 */
@Entity
@Table(name = "nv_homeslider", catalog = "NVPrestashop")
public class NvHomeslider implements java.io.Serializable {

	private NvHomesliderId id;

	public NvHomeslider() {
	}

	public NvHomeslider(NvHomesliderId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idHomesliderSlides", column = @Column(name = "id_homeslider_slides", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)) })
	public NvHomesliderId getId() {
		return this.id;
	}

	public void setId(NvHomesliderId id) {
		this.id = id;
	}

}
