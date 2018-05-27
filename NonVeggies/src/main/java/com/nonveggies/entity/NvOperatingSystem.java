package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvOperatingSystem generated by hbm2java
 */
@Entity
@Table(name = "nv_operating_system", catalog = "NVPrestashop")
public class NvOperatingSystem implements java.io.Serializable {

	private Integer idOperatingSystem;
	private String name;

	public NvOperatingSystem() {
	}

	public NvOperatingSystem(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_operating_system", unique = true, nullable = false)
	public Integer getIdOperatingSystem() {
		return this.idOperatingSystem;
	}

	public void setIdOperatingSystem(Integer idOperatingSystem) {
		this.idOperatingSystem = idOperatingSystem;
	}

	@Column(name = "name", length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
