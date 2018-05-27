package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * NvModule generated by hbm2java
 */
@Entity
@Table(name = "nv_module", catalog = "NVPrestashop")
public class NvModule implements java.io.Serializable {

	private Integer idModule;
	private String version;
	private String name;
	private boolean active;

	public NvModule() {
	}

	public NvModule(String name, boolean active) {
		this.name = name;
		this.active = active;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_module", unique = true, nullable = false)
	public Integer getIdModule() {
		return this.idModule;
	}

	public void setIdModule(Integer idModule) {
		this.idModule = idModule;
	}

//	@Version
	@Column(name = "version", nullable = false, length = 8)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}