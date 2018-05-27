package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvPageViewed generated by hbm2java
 */
@Entity
@Table(name = "nv_page_viewed", catalog = "NVPrestashop")
public class NvPageViewed implements java.io.Serializable {

	private NvPageViewedId id;
	private int idShopGroup;
	private int counter;

	public NvPageViewed() {
	}

	public NvPageViewed(NvPageViewedId id, int idShopGroup, int counter) {
		this.id = id;
		this.idShopGroup = idShopGroup;
		this.counter = counter;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idPage", column = @Column(name = "id_page", nullable = false)),
			@AttributeOverride(name = "idDateRange", column = @Column(name = "id_date_range", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)) })
	public NvPageViewedId getId() {
		return this.id;
	}

	public void setId(NvPageViewedId id) {
		this.id = id;
	}

	@Column(name = "id_shop_group", nullable = false)
	public int getIdShopGroup() {
		return this.idShopGroup;
	}

	public void setIdShopGroup(int idShopGroup) {
		this.idShopGroup = idShopGroup;
	}

	@Column(name = "counter", nullable = false)
	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}