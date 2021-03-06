package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvWishlistProduct generated by hbm2java
 */
@Entity
@Table(name = "nv_wishlist_product", catalog = "NVPrestashop")
public class NvWishlistProduct implements java.io.Serializable {

	private Integer idWishlistProduct;
	private int idWishlist;
	private int idProduct;
	private int idProductAttribute;
	private int quantity;
	private int priority;

	public NvWishlistProduct() {
	}

	public NvWishlistProduct(int idWishlist, int idProduct, int idProductAttribute, int quantity, int priority) {
		this.idWishlist = idWishlist;
		this.idProduct = idProduct;
		this.idProductAttribute = idProductAttribute;
		this.quantity = quantity;
		this.priority = priority;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_wishlist_product", unique = true, nullable = false)
	public Integer getIdWishlistProduct() {
		return this.idWishlistProduct;
	}

	public void setIdWishlistProduct(Integer idWishlistProduct) {
		this.idWishlistProduct = idWishlistProduct;
	}

	@Column(name = "id_wishlist", nullable = false)
	public int getIdWishlist() {
		return this.idWishlist;
	}

	public void setIdWishlist(int idWishlist) {
		this.idWishlist = idWishlist;
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

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "priority", nullable = false)
	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

}
