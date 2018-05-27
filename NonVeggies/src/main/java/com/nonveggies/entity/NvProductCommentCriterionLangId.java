package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvProductCommentCriterionLangId generated by hbm2java
 */
@Embeddable
public class NvProductCommentCriterionLangId implements java.io.Serializable {

	private int idProductCommentCriterion;
	private int idLang;

	public NvProductCommentCriterionLangId() {
	}

	public NvProductCommentCriterionLangId(int idProductCommentCriterion, int idLang) {
		this.idProductCommentCriterion = idProductCommentCriterion;
		this.idLang = idLang;
	}

	@Column(name = "id_product_comment_criterion", nullable = false)
	public int getIdProductCommentCriterion() {
		return this.idProductCommentCriterion;
	}

	public void setIdProductCommentCriterion(int idProductCommentCriterion) {
		this.idProductCommentCriterion = idProductCommentCriterion;
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
		if (!(other instanceof NvProductCommentCriterionLangId))
			return false;
		NvProductCommentCriterionLangId castOther = (NvProductCommentCriterionLangId) other;

		return (this.getIdProductCommentCriterion() == castOther.getIdProductCommentCriterion()) && (this.getIdLang() == castOther.getIdLang());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdProductCommentCriterion();
		result = 37 * result + this.getIdLang();
		return result;
	}

}
