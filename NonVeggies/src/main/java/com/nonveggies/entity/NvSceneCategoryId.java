package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvSceneCategoryId generated by hbm2java
 */
@Embeddable
public class NvSceneCategoryId implements java.io.Serializable {

	private int idScene;
	private int idCategory;

	public NvSceneCategoryId() {
	}

	public NvSceneCategoryId(int idScene, int idCategory) {
		this.idScene = idScene;
		this.idCategory = idCategory;
	}

	@Column(name = "id_scene", nullable = false)
	public int getIdScene() {
		return this.idScene;
	}

	public void setIdScene(int idScene) {
		this.idScene = idScene;
	}

	@Column(name = "id_category", nullable = false)
	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvSceneCategoryId))
			return false;
		NvSceneCategoryId castOther = (NvSceneCategoryId) other;

		return (this.getIdScene() == castOther.getIdScene()) && (this.getIdCategory() == castOther.getIdCategory());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdScene();
		result = 37 * result + this.getIdCategory();
		return result;
	}

}
