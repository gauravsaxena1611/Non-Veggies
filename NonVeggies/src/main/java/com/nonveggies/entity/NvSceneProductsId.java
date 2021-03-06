package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvSceneProductsId generated by hbm2java
 */
@Embeddable
public class NvSceneProductsId implements java.io.Serializable {

	private int idScene;
	private int idProduct;
	private int XAxis;
	private int YAxis;

	public NvSceneProductsId() {
	}

	public NvSceneProductsId(int idScene, int idProduct, int XAxis, int YAxis) {
		this.idScene = idScene;
		this.idProduct = idProduct;
		this.XAxis = XAxis;
		this.YAxis = YAxis;
	}

	@Column(name = "id_scene", nullable = false)
	public int getIdScene() {
		return this.idScene;
	}

	public void setIdScene(int idScene) {
		this.idScene = idScene;
	}

	@Column(name = "id_product", nullable = false)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "x_axis", nullable = false)
	public int getXAxis() {
		return this.XAxis;
	}

	public void setXAxis(int XAxis) {
		this.XAxis = XAxis;
	}

	@Column(name = "y_axis", nullable = false)
	public int getYAxis() {
		return this.YAxis;
	}

	public void setYAxis(int YAxis) {
		this.YAxis = YAxis;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvSceneProductsId))
			return false;
		NvSceneProductsId castOther = (NvSceneProductsId) other;

		return (this.getIdScene() == castOther.getIdScene()) && (this.getIdProduct() == castOther.getIdProduct()) && (this.getXAxis() == castOther.getXAxis())
						&& (this.getYAxis() == castOther.getYAxis());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdScene();
		result = 37 * result + this.getIdProduct();
		result = 37 * result + this.getXAxis();
		result = 37 * result + this.getYAxis();
		return result;
	}

}
