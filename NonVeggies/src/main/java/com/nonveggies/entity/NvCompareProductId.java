package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvCompareProductId generated by hbm2java
 */
@Embeddable
public class NvCompareProductId implements java.io.Serializable {

	private int idCompare;
	private int idProduct;

	public NvCompareProductId() {
	}

	public NvCompareProductId(int idCompare, int idProduct) {
		this.idCompare = idCompare;
		this.idProduct = idProduct;
	}

	@Column(name = "id_compare", nullable = false)
	public int getIdCompare() {
		return this.idCompare;
	}

	public void setIdCompare(int idCompare) {
		this.idCompare = idCompare;
	}

	@Column(name = "id_product", nullable = false)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvCompareProductId))
			return false;
		NvCompareProductId castOther = (NvCompareProductId) other;

		return (this.getIdCompare() == castOther.getIdCompare()) && (this.getIdProduct() == castOther.getIdProduct());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCompare();
		result = 37 * result + this.getIdProduct();
		return result;
	}

}
