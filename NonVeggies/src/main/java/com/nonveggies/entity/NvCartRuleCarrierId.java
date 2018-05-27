package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvCartRuleCarrierId generated by hbm2java
 */
@Embeddable
public class NvCartRuleCarrierId implements java.io.Serializable {

	private int idCartRule;
	private int idCarrier;

	public NvCartRuleCarrierId() {
	}

	public NvCartRuleCarrierId(int idCartRule, int idCarrier) {
		this.idCartRule = idCartRule;
		this.idCarrier = idCarrier;
	}

	@Column(name = "id_cart_rule", nullable = false)
	public int getIdCartRule() {
		return this.idCartRule;
	}

	public void setIdCartRule(int idCartRule) {
		this.idCartRule = idCartRule;
	}

	@Column(name = "id_carrier", nullable = false)
	public int getIdCarrier() {
		return this.idCarrier;
	}

	public void setIdCarrier(int idCarrier) {
		this.idCarrier = idCarrier;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvCartRuleCarrierId))
			return false;
		NvCartRuleCarrierId castOther = (NvCartRuleCarrierId) other;

		return (this.getIdCartRule() == castOther.getIdCartRule()) && (this.getIdCarrier() == castOther.getIdCarrier());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCartRule();
		result = 37 * result + this.getIdCarrier();
		return result;
	}

}