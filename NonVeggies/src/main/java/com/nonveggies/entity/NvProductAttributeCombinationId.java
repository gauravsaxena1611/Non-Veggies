package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvProductAttributeCombinationId generated by hbm2java
 */
@Embeddable
public class NvProductAttributeCombinationId implements java.io.Serializable {

	private int idAttribute;
	private int idProductAttribute;

	public NvProductAttributeCombinationId() {
	}

	public NvProductAttributeCombinationId(int idAttribute, int idProductAttribute) {
		this.idAttribute = idAttribute;
		this.idProductAttribute = idProductAttribute;
	}

	@Column(name = "id_attribute", nullable = false)
	public int getIdAttribute() {
		return this.idAttribute;
	}

	public void setIdAttribute(int idAttribute) {
		this.idAttribute = idAttribute;
	}

	@Column(name = "id_product_attribute", nullable = false)
	public int getIdProductAttribute() {
		return this.idProductAttribute;
	}

	public void setIdProductAttribute(int idProductAttribute) {
		this.idProductAttribute = idProductAttribute;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvProductAttributeCombinationId))
			return false;
		NvProductAttributeCombinationId castOther = (NvProductAttributeCombinationId) other;

		return (this.getIdAttribute() == castOther.getIdAttribute()) && (this.getIdProductAttribute() == castOther.getIdProductAttribute());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdAttribute();
		result = 37 * result + this.getIdProductAttribute();
		return result;
	}

}