package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvCartRuleCombinationId generated by hbm2java
 */
@Embeddable
public class NvCartRuleCombinationId implements java.io.Serializable {

	private int idCartRule1;
	private int idCartRule2;

	public NvCartRuleCombinationId() {
	}

	public NvCartRuleCombinationId(int idCartRule1, int idCartRule2) {
		this.idCartRule1 = idCartRule1;
		this.idCartRule2 = idCartRule2;
	}

	@Column(name = "id_cart_rule_1", nullable = false)
	public int getIdCartRule1() {
		return this.idCartRule1;
	}

	public void setIdCartRule1(int idCartRule1) {
		this.idCartRule1 = idCartRule1;
	}

	@Column(name = "id_cart_rule_2", nullable = false)
	public int getIdCartRule2() {
		return this.idCartRule2;
	}

	public void setIdCartRule2(int idCartRule2) {
		this.idCartRule2 = idCartRule2;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvCartRuleCombinationId))
			return false;
		NvCartRuleCombinationId castOther = (NvCartRuleCombinationId) other;

		return (this.getIdCartRule1() == castOther.getIdCartRule1()) && (this.getIdCartRule2() == castOther.getIdCartRule2());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCartRule1();
		result = 37 * result + this.getIdCartRule2();
		return result;
	}

}
