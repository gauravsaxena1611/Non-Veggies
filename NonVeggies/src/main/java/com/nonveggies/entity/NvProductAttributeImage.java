package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvProductAttributeImage generated by hbm2java
 */
@Entity
@Table(name = "nv_product_attribute_image", catalog = "NVPrestashop")
public class NvProductAttributeImage implements java.io.Serializable {

	private NvProductAttributeImageId id;

	public NvProductAttributeImage() {
	}

	public NvProductAttributeImage(NvProductAttributeImageId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idProductAttribute", column = @Column(name = "id_product_attribute", nullable = false)),
			@AttributeOverride(name = "idImage", column = @Column(name = "id_image", nullable = false)) })
	public NvProductAttributeImageId getId() {
		return this.id;
	}

	public void setId(NvProductAttributeImageId id) {
		this.id = id;
	}

}
