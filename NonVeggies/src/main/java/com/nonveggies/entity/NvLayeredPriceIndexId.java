package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvLayeredPriceIndexId generated by hbm2java
 */
@Embeddable
public class NvLayeredPriceIndexId implements java.io.Serializable {

	private int idProduct;
	private int idCurrency;
	private int idShop;

	public NvLayeredPriceIndexId() {
	}

	public NvLayeredPriceIndexId(int idProduct, int idCurrency, int idShop) {
		this.idProduct = idProduct;
		this.idCurrency = idCurrency;
		this.idShop = idShop;
	}

	@Column(name = "id_product", nullable = false)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "id_currency", nullable = false)
	public int getIdCurrency() {
		return this.idCurrency;
	}

	public void setIdCurrency(int idCurrency) {
		this.idCurrency = idCurrency;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvLayeredPriceIndexId))
			return false;
		NvLayeredPriceIndexId castOther = (NvLayeredPriceIndexId) other;

		return (this.getIdProduct() == castOther.getIdProduct()) && (this.getIdCurrency() == castOther.getIdCurrency())
						&& (this.getIdShop() == castOther.getIdShop());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdProduct();
		result = 37 * result + this.getIdCurrency();
		result = 37 * result + this.getIdShop();
		return result;
	}

}
