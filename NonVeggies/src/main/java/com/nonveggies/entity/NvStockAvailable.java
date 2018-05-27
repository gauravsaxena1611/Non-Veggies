package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * NvStockAvailable generated by hbm2java
 */
@Entity
@Table(name = "nv_stock_available", catalog = "NVPrestashop", uniqueConstraints = @UniqueConstraint(columnNames = { "id_product", "id_product_attribute",
		"id_shop", "id_shop_group" }))
public class NvStockAvailable implements java.io.Serializable {

	private Integer idStockAvailable;
	private int idProduct;
	private int idProductAttribute;
	private int idShop;
	private int idShopGroup;
	private int quantity;
	private boolean dependsOnStock;
	private boolean outOfStock;

	public NvStockAvailable() {
	}

	public NvStockAvailable(int idProduct, int idProductAttribute, int idShop, int idShopGroup, int quantity, boolean dependsOnStock, boolean outOfStock) {
		this.idProduct = idProduct;
		this.idProductAttribute = idProductAttribute;
		this.idShop = idShop;
		this.idShopGroup = idShopGroup;
		this.quantity = quantity;
		this.dependsOnStock = dependsOnStock;
		this.outOfStock = outOfStock;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_stock_available", unique = true, nullable = false)
	public Integer getIdStockAvailable() {
		return this.idStockAvailable;
	}

	public void setIdStockAvailable(Integer idStockAvailable) {
		this.idStockAvailable = idStockAvailable;
	}

	@Column(name = "id_product", nullable = false)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "id_product_attribute", nullable = false)
	public int getIdProductAttribute() {
		return this.idProductAttribute;
	}

	public void setIdProductAttribute(int idProductAttribute) {
		this.idProductAttribute = idProductAttribute;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "id_shop_group", nullable = false)
	public int getIdShopGroup() {
		return this.idShopGroup;
	}

	public void setIdShopGroup(int idShopGroup) {
		this.idShopGroup = idShopGroup;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "depends_on_stock", nullable = false)
	public boolean isDependsOnStock() {
		return this.dependsOnStock;
	}

	public void setDependsOnStock(boolean dependsOnStock) {
		this.dependsOnStock = dependsOnStock;
	}

	@Column(name = "out_of_stock", nullable = false)
	public boolean isOutOfStock() {
		return this.outOfStock;
	}

	public void setOutOfStock(boolean outOfStock) {
		this.outOfStock = outOfStock;
	}

}
