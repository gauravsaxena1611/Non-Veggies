package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvImageLangId generated by hbm2java
 */
@Embeddable
public class NvImageLangId implements java.io.Serializable {

	private int idImage;
	private int idLang;

	public NvImageLangId() {
	}

	public NvImageLangId(int idImage, int idLang) {
		this.idImage = idImage;
		this.idLang = idLang;
	}

	@Column(name = "id_image", nullable = false)
	public int getIdImage() {
		return this.idImage;
	}

	public void setIdImage(int idImage) {
		this.idImage = idImage;
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
		if (!(other instanceof NvImageLangId))
			return false;
		NvImageLangId castOther = (NvImageLangId) other;

		return (this.getIdImage() == castOther.getIdImage()) && (this.getIdLang() == castOther.getIdLang());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdImage();
		result = 37 * result + this.getIdLang();
		return result;
	}

}
