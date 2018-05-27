package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvCartCartRuleId generated by hbm2java
 */
@Embeddable
public class NvCartCartRuleId implements java.io.Serializable {

	private int idCart;
	private int idCartRule;

	public NvCartCartRuleId() {
	}

	public NvCartCartRuleId(int idCart, int idCartRule) {
		this.idCart = idCart;
		this.idCartRule = idCartRule;
	}

	@Column(name = "id_cart", nullable = false)
	public int getIdCart() {
		return this.idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}

	@Column(name = "id_cart_rule", nullable = false)
	public int getIdCartRule() {
		return this.idCartRule;
	}

	public void setIdCartRule(int idCartRule) {
		this.idCartRule = idCartRule;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvCartCartRuleId))
			return false;
		NvCartCartRuleId castOther = (NvCartCartRuleId) other;

		return (this.getIdCart() == castOther.getIdCart()) && (this.getIdCartRule() == castOther.getIdCartRule());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCart();
		result = 37 * result + this.getIdCartRule();
		return result;
	}

}
