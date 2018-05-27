package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvRisk generated by hbm2java
 */
@Entity
@Table(name = "nv_risk", catalog = "NVPrestashop")
public class NvRisk implements java.io.Serializable {

	private Integer idRisk;
	private byte percent;
	private String color;

	public NvRisk() {
	}

	public NvRisk(byte percent) {
		this.percent = percent;
	}

	public NvRisk(byte percent, String color) {
		this.percent = percent;
		this.color = color;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_risk", unique = true, nullable = false)
	public Integer getIdRisk() {
		return this.idRisk;
	}

	public void setIdRisk(Integer idRisk) {
		this.idRisk = idRisk;
	}

	@Column(name = "percent", nullable = false)
	public byte getPercent() {
		return this.percent;
	}

	public void setPercent(byte percent) {
		this.percent = percent;
	}

	@Column(name = "color", length = 32)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
