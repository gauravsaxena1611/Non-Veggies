package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvProductGroupReductionCacheId generated by hbm2java
 */
@Embeddable
public class NvProductGroupReductionCacheId implements java.io.Serializable {

	private int idProduct;
	private int idGroup;

	public NvProductGroupReductionCacheId() {
	}

	public NvProductGroupReductionCacheId(int idProduct, int idGroup) {
		this.idProduct = idProduct;
		this.idGroup = idGroup;
	}

	@Column(name = "id_product", nullable = false)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "id_group", nullable = false)
	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvProductGroupReductionCacheId))
			return false;
		NvProductGroupReductionCacheId castOther = (NvProductGroupReductionCacheId) other;

		return (this.getIdProduct() == castOther.getIdProduct()) && (this.getIdGroup() == castOther.getIdGroup());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdProduct();
		result = 37 * result + this.getIdGroup();
		return result;
	}

}
