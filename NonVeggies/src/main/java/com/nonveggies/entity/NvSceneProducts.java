package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvSceneProducts generated by hbm2java
 */
@Entity
@Table(name = "nv_scene_products", catalog = "NVPrestashop")
public class NvSceneProducts implements java.io.Serializable {

	private NvSceneProductsId id;
	private int zoneWidth;
	private int zoneHeight;

	public NvSceneProducts() {
	}

	public NvSceneProducts(NvSceneProductsId id, int zoneWidth, int zoneHeight) {
		this.id = id;
		this.zoneWidth = zoneWidth;
		this.zoneHeight = zoneHeight;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idScene", column = @Column(name = "id_scene", nullable = false)),
			@AttributeOverride(name = "idProduct", column = @Column(name = "id_product", nullable = false)),
			@AttributeOverride(name = "XAxis", column = @Column(name = "x_axis", nullable = false)),
			@AttributeOverride(name = "YAxis", column = @Column(name = "y_axis", nullable = false)) })
	public NvSceneProductsId getId() {
		return this.id;
	}

	public void setId(NvSceneProductsId id) {
		this.id = id;
	}

	@Column(name = "zone_width", nullable = false)
	public int getZoneWidth() {
		return this.zoneWidth;
	}

	public void setZoneWidth(int zoneWidth) {
		this.zoneWidth = zoneWidth;
	}

	@Column(name = "zone_height", nullable = false)
	public int getZoneHeight() {
		return this.zoneHeight;
	}

	public void setZoneHeight(int zoneHeight) {
		this.zoneHeight = zoneHeight;
	}

}