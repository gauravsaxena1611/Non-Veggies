package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvSceneLangId generated by hbm2java
 */
@Embeddable
public class NvSceneLangId implements java.io.Serializable {

	private int idScene;
	private int idLang;

	public NvSceneLangId() {
	}

	public NvSceneLangId(int idScene, int idLang) {
		this.idScene = idScene;
		this.idLang = idLang;
	}

	@Column(name = "id_scene", nullable = false)
	public int getIdScene() {
		return this.idScene;
	}

	public void setIdScene(int idScene) {
		this.idScene = idScene;
	}

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvSceneLangId))
			return false;
		NvSceneLangId castOther = (NvSceneLangId) other;

		return (this.getIdScene() == castOther.getIdScene()) && (this.getIdLang() == castOther.getIdLang());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdScene();
		result = 37 * result + this.getIdLang();
		return result;
	}

}