package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvCartRuleCountryId generated by hbm2java
 */
@Embeddable
public class NvCartRuleCountryId implements java.io.Serializable {

	private int idCartRule;
	private int idCountry;

	public NvCartRuleCountryId() {
	}

	public NvCartRuleCountryId(int idCartRule, int idCountry) {
		this.idCartRule = idCartRule;
		this.idCountry = idCountry;
	}

	@Column(name = "id_cart_rule", nullable = false)
	public int getIdCartRule() {
		return this.idCartRule;
	}

	public void setIdCartRule(int idCartRule) {
		this.idCartRule = idCartRule;
	}

	@Column(name = "id_country", nullable = false)
	public int getIdCountry() {
		return this.idCountry;
	}

	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvCartRuleCountryId))
			return false;
		NvCartRuleCountryId castOther = (NvCartRuleCountryId) other;

		return (this.getIdCartRule() == castOther.getIdCartRule()) && (this.getIdCountry() == castOther.getIdCountry());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCartRule();
		result = 37 * result + this.getIdCountry();
		return result;
	}

}
