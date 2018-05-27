package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvProductCommentCriterion generated by hbm2java
 */
@Entity
@Table(name = "nv_product_comment_criterion", catalog = "NVPrestashop")
public class NvProductCommentCriterion implements java.io.Serializable {

	private Integer idProductCommentCriterion;
	private boolean idProductCommentCriterionType;
	private boolean active;

	public NvProductCommentCriterion() {
	}

	public NvProductCommentCriterion(boolean idProductCommentCriterionType, boolean active) {
		this.idProductCommentCriterionType = idProductCommentCriterionType;
		this.active = active;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_product_comment_criterion", unique = true, nullable = false)
	public Integer getIdProductCommentCriterion() {
		return this.idProductCommentCriterion;
	}

	public void setIdProductCommentCriterion(Integer idProductCommentCriterion) {
		this.idProductCommentCriterion = idProductCommentCriterion;
	}

	@Column(name = "id_product_comment_criterion_type", nullable = false)
	public boolean isIdProductCommentCriterionType() {
		return this.idProductCommentCriterionType;
	}

	public void setIdProductCommentCriterionType(boolean idProductCommentCriterionType) {
		this.idProductCommentCriterionType = idProductCommentCriterionType;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
