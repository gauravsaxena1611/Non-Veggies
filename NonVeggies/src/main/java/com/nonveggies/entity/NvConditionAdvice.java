package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvConditionAdvice generated by hbm2java
 */
@Entity
@Table(name = "nv_condition_advice", catalog = "NVPrestashop")
public class NvConditionAdvice implements java.io.Serializable {

	private NvConditionAdviceId id;
	private boolean display;

	public NvConditionAdvice() {
	}

	public NvConditionAdvice(NvConditionAdviceId id, boolean display) {
		this.id = id;
		this.display = display;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idCondition", column = @Column(name = "id_condition", nullable = false)),
			@AttributeOverride(name = "idAdvice", column = @Column(name = "id_advice", nullable = false)) })
	public NvConditionAdviceId getId() {
		return this.id;
	}

	public void setId(NvConditionAdviceId id) {
		this.id = id;
	}

	@Column(name = "display", nullable = false)
	public boolean isDisplay() {
		return this.display;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}

}