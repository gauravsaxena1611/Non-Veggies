package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvShopGroup generated by hbm2java
 */
@Entity
@Table(name = "nv_shop_group", catalog = "NVPrestashop")
public class NvShopGroup implements java.io.Serializable {

	private Integer idShopGroup;
	private String name;
	private boolean shareCustomer;
	private boolean shareOrder;
	private boolean shareStock;
	private boolean active;
	private boolean deleted;

	public NvShopGroup() {
	}

	public NvShopGroup(String name, boolean shareCustomer, boolean shareOrder, boolean shareStock, boolean active, boolean deleted) {
		this.name = name;
		this.shareCustomer = shareCustomer;
		this.shareOrder = shareOrder;
		this.shareStock = shareStock;
		this.active = active;
		this.deleted = deleted;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_shop_group", unique = true, nullable = false)
	public Integer getIdShopGroup() {
		return this.idShopGroup;
	}

	public void setIdShopGroup(Integer idShopGroup) {
		this.idShopGroup = idShopGroup;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "share_customer", nullable = false)
	public boolean isShareCustomer() {
		return this.shareCustomer;
	}

	public void setShareCustomer(boolean shareCustomer) {
		this.shareCustomer = shareCustomer;
	}

	@Column(name = "share_order", nullable = false)
	public boolean isShareOrder() {
		return this.shareOrder;
	}

	public void setShareOrder(boolean shareOrder) {
		this.shareOrder = shareOrder;
	}

	@Column(name = "share_stock", nullable = false)
	public boolean isShareStock() {
		return this.shareStock;
	}

	public void setShareStock(boolean shareStock) {
		this.shareStock = shareStock;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "deleted", nullable = false)
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
