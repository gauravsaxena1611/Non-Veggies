package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvProductAttributeImageId generated by hbm2java
 */
@Embeddable
public class NvProductAttributeImageId implements java.io.Serializable {

	private int idProductAttribute;
	private int idImage;

	public NvProductAttributeImageId() {
	}

	public NvProductAttributeImageId(int idProductAttribute, int idImage) {
		this.idProductAttribute = idProductAttribute;
		this.idImage = idImage;
	}

	@Column(name = "id_product_attribute", nullable = false)
	public int getIdProductAttribute() {
		return this.idProductAttribute;
	}

	public void setIdProductAttribute(int idProductAttribute) {
		this.idProductAttribute = idProductAttribute;
	}

	@Column(name = "id_image", nullable = false)
	public int getIdImage() {
		return this.idImage;
	}

	public void setIdImage(int idImage) {
		this.idImage = idImage;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvProductAttributeImageId))
			return false;
		NvProductAttributeImageId castOther = (NvProductAttributeImageId) other;

		return (this.getIdProductAttribute() == castOther.getIdProductAttribute()) && (this.getIdImage() == castOther.getIdImage());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdProductAttribute();
		result = 37 * result + this.getIdImage();
		return result;
	}

}
