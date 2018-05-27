package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvAddressFormat generated by hbm2java
 */
@Entity
@Table(name = "nv_address_format", catalog = "NVPrestashop")
public class NvAddressFormat implements java.io.Serializable {

	private int idCountry;
	private String format;

	public NvAddressFormat() {
	}

	public NvAddressFormat(int idCountry, String format) {
		this.idCountry = idCountry;
		this.format = format;
	}

	@Id
	@Column(name = "id_country", unique = true, nullable = false)
	public int getIdCountry() {
		return this.idCountry;
	}

	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}

	@Column(name = "format", nullable = false)
	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
