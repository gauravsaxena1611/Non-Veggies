package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvConditionId generated by hbm2java
 */
@Embeddable
public class NvConditionId implements java.io.Serializable {

	private int idCondition;
	private int idPsCondition;

	public NvConditionId() {
	}

	public NvConditionId(int idCondition, int idPsCondition) {
		this.idCondition = idCondition;
		this.idPsCondition = idPsCondition;
	}

	@Column(name = "id_condition", nullable = false)
	public int getIdCondition() {
		return this.idCondition;
	}

	public void setIdCondition(int idCondition) {
		this.idCondition = idCondition;
	}

	@Column(name = "id_ps_condition", nullable = false)
	public int getIdPsCondition() {
		return this.idPsCondition;
	}

	public void setIdPsCondition(int idPsCondition) {
		this.idPsCondition = idPsCondition;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvConditionId))
			return false;
		NvConditionId castOther = (NvConditionId) other;

		return (this.getIdCondition() == castOther.getIdCondition()) && (this.getIdPsCondition() == castOther.getIdPsCondition());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCondition();
		result = 37 * result + this.getIdPsCondition();
		return result;
	}

}
