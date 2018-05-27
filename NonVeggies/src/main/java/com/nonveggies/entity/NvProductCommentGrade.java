package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvProductCommentGrade generated by hbm2java
 */
@Entity
@Table(name = "nv_product_comment_grade", catalog = "NVPrestashop")
public class NvProductCommentGrade implements java.io.Serializable {

	private NvProductCommentGradeId id;
	private int grade;

	public NvProductCommentGrade() {
	}

	public NvProductCommentGrade(NvProductCommentGradeId id, int grade) {
		this.id = id;
		this.grade = grade;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idProductComment", column = @Column(name = "id_product_comment", nullable = false)),
			@AttributeOverride(name = "idProductCommentCriterion", column = @Column(name = "id_product_comment_criterion", nullable = false)) })
	public NvProductCommentGradeId getId() {
		return this.id;
	}

	public void setId(NvProductCommentGradeId id) {
		this.id = id;
	}

	@Column(name = "grade", nullable = false)
	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
