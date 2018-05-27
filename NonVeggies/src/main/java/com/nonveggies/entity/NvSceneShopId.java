package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvSceneShopId generated by hbm2java
 */
@Embeddable
public class NvSceneShopId implements java.io.Serializable {

	private int idScene;
	private int idShop;

	public NvSceneShopId() {
	}

	public NvSceneShopId(int idScene, int idShop) {
		this.idScene = idScene;
		this.idShop = idShop;
	}

	@Column(name = "id_scene", nullable = false)
	public int getIdScene() {
		return this.idScene;
	}

	public void setIdScene(int idScene) {
		this.idScene = idScene;
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
		if (!(other instanceof NvSceneShopId))
			return false;
		NvSceneShopId castOther = (NvSceneShopId) other;

		return (this.getIdScene() == castOther.getIdScene()) && (this.getIdShop() == castOther.getIdShop());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdScene();
		result = 37 * result + this.getIdShop();
		return result;
	}

}
