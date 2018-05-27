package com.nonveggies.entity.order;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvOrderReturnDetail generated by hbm2java
 */
@Entity
@Table(name = "nv_order_return_detail", catalog = "NVPrestashop")
public class NvOrderReturnDetail implements java.io.Serializable {

	private NvOrderReturnDetailId id;
	private int productQuantity;

	public NvOrderReturnDetail() {
	}

	public NvOrderReturnDetail(NvOrderReturnDetailId id, int productQuantity) {
		this.id = id;
		this.productQuantity = productQuantity;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idOrderReturn", column = @Column(name = "id_order_return", nullable = false)),
			@AttributeOverride(name = "idOrderDetail", column = @Column(name = "id_order_detail", nullable = false)),
			@AttributeOverride(name = "idCustomization", column = @Column(name = "id_customization", nullable = false)) })
	public NvOrderReturnDetailId getId() {
		return this.id;
	}

	public void setId(NvOrderReturnDetailId id) {
		this.id = id;
	}

	@Column(name = "product_quantity", nullable = false)
	public int getProductQuantity() {
		return this.productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

}