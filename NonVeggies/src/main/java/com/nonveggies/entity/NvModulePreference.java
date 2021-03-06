package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * NvModulePreference generated by hbm2java
 */
@Entity
@Table(name = "nv_module_preference", catalog = "NVPrestashop", uniqueConstraints = @UniqueConstraint(columnNames = { "id_employee", "module" }))
public class NvModulePreference implements java.io.Serializable {

	private Integer idModulePreference;
	private int idEmployee;
	private String module;
	private Boolean interest;
	private Boolean favorite;

	public NvModulePreference() {
	}

	public NvModulePreference(int idEmployee, String module) {
		this.idEmployee = idEmployee;
		this.module = module;
	}

	public NvModulePreference(int idEmployee, String module, Boolean interest, Boolean favorite) {
		this.idEmployee = idEmployee;
		this.module = module;
		this.interest = interest;
		this.favorite = favorite;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_module_preference", unique = true, nullable = false)
	public Integer getIdModulePreference() {
		return this.idModulePreference;
	}

	public void setIdModulePreference(Integer idModulePreference) {
		this.idModulePreference = idModulePreference;
	}

	@Column(name = "id_employee", nullable = false)
	public int getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	@Column(name = "module", nullable = false)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "interest")
	public Boolean getInterest() {
		return this.interest;
	}

	public void setInterest(Boolean interest) {
		this.interest = interest;
	}

	@Column(name = "favorite")
	public Boolean getFavorite() {
		return this.favorite;
	}

	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}

}
