package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvProductCommentCriterionProductId generated by hbm2java
 */
@Embeddable
public class NvProductCommentCriterionProductId implements java.io.Serializable {

	private int idProduct;
	private int idProductCommentCriterion;

	public NvProductCommentCriterionProductId() {
	}

	public NvProductCommentCriterionProductId(int idProduct, int idProductCommentCriterion) {
		this.idProduct = idProduct;
		this.idProductCommentCriterion = idProductCommentCriterion;
	}

	@Column(name = "id_product", nullable = false)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "id_product_comment_criterion", nullable = false)
	public int getIdProductCommentCriterion() {
		return this.idProductCommentCriterion;
	}

	public void setIdProductCommentCriterion(int idProductCommentCriterion) {
		this.idProductCommentCriterion = idProductCommentCriterion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvProductCommentCriterionProductId))
			return false;
		NvProductCommentCriterionProductId castOther = (NvProductCommentCriterionProductId) other;

		return (this.getIdProduct() == castOther.getIdProduct()) && (this.getIdProductCommentCriterion() == castOther.getIdProductCommentCriterion());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdProduct();
		result = 37 * result + this.getIdProductCommentCriterion();
		return result;
	}

}
