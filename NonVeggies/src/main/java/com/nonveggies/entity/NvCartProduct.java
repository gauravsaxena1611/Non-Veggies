package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NvCartProduct generated by hbm2java
 */
@Entity
@Table(name = "nv_cart_product", catalog = "NVPrestashop")
public class NvCartProduct implements java.io.Serializable {

	private NvCartProductId id;
	private int idShop;
	private int quantity;
	private Date dateAdd;

	public NvCartProduct() {
	}

	public NvCartProduct(NvCartProductId id, int idShop, int quantity, Date dateAdd) {
		this.id = id;
		this.idShop = idShop;
		this.quantity = quantity;
		this.dateAdd = dateAdd;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idCart", column = @Column(name = "id_cart", nullable = false)),
			@AttributeOverride(name = "idProduct", column = @Column(name = "id_product", nullable = false)),
			@AttributeOverride(name = "idProductAttribute", column = @Column(name = "id_product_attribute", nullable = false)),
			@AttributeOverride(name = "idAddressDelivery", column = @Column(name = "id_address_delivery", nullable = false)) })
	public NvCartProductId getId() {
		return this.id;
	}

	public void setId(NvCartProductId id) {
		this.id = id;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_add", nullable = false, length = 0)
	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

}
