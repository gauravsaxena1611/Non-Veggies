package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvLoyaltyState generated by hbm2java
 */
@Entity
@Table(name = "nv_loyalty_state", catalog = "NVPrestashop")
public class NvLoyaltyState implements java.io.Serializable {

	private Integer idLoyaltyState;
	private Integer idOrderState;

	public NvLoyaltyState() {
	}

	public NvLoyaltyState(Integer idOrderState) {
		this.idOrderState = idOrderState;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_loyalty_state", unique = true, nullable = false)
	public Integer getIdLoyaltyState() {
		return this.idLoyaltyState;
	}

	public void setIdLoyaltyState(Integer idLoyaltyState) {
		this.idLoyaltyState = idLoyaltyState;
	}

	@Column(name = "id_order_state")
	public Integer getIdOrderState() {
		return this.idOrderState;
	}

	public void setIdOrderState(Integer idOrderState) {
		this.idOrderState = idOrderState;
	}

}
