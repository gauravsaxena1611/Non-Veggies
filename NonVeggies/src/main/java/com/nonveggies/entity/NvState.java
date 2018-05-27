package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvState generated by hbm2java
 */
@Entity
@Table(name = "nv_state", catalog = "NVPrestashop")
public class NvState implements java.io.Serializable {

	private Integer idState;
	private int idCountry;
	private int idZone;
	private String name;
	private String isoCode;
	private short taxBehavior;
	private boolean active;

	public NvState() {
	}

	public NvState(int idCountry, int idZone, String name, String isoCode, short taxBehavior, boolean active) {
		this.idCountry = idCountry;
		this.idZone = idZone;
		this.name = name;
		this.isoCode = isoCode;
		this.taxBehavior = taxBehavior;
		this.active = active;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_state", unique = true, nullable = false)
	public Integer getIdState() {
		return this.idState;
	}

	public void setIdState(Integer idState) {
		this.idState = idState;
	}

	@Column(name = "id_country", nullable = false)
	public int getIdCountry() {
		return this.idCountry;
	}

	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}

	@Column(name = "id_zone", nullable = false)
	public int getIdZone() {
		return this.idZone;
	}

	public void setIdZone(int idZone) {
		this.idZone = idZone;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "iso_code", nullable = false, length = 7)
	public String getIsoCode() {
		return this.isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	@Column(name = "tax_behavior", nullable = false)
	public short getTaxBehavior() {
		return this.taxBehavior;
	}

	public void setTaxBehavior(short taxBehavior) {
		this.taxBehavior = taxBehavior;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}