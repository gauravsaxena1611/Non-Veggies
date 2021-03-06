package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvPack generated by hbm2java
 */
@Entity
@Table(name = "nv_pack", catalog = "NVPrestashop")
public class NvPack implements java.io.Serializable {

	private NvPackId id;
	private int quantity;

	public NvPack() {
	}

	public NvPack(NvPackId id, int quantity) {
		this.id = id;
		this.quantity = quantity;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idProductPack", column = @Column(name = "id_product_pack", nullable = false)),
			@AttributeOverride(name = "idProductItem", column = @Column(name = "id_product_item", nullable = false)),
			@AttributeOverride(name = "idProductAttributeItem", column = @Column(name = "id_product_attribute_item", nullable = false)) })
	public NvPackId getId() {
		return this.id;
	}

	public void setId(NvPackId id) {
		this.id = id;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
