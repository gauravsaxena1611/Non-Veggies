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
 * NvTabModulePreference generated by hbm2java
 */
@Entity
@Table(name = "nv_tab_module_preference", catalog = "NVPrestashop", uniqueConstraints = @UniqueConstraint(columnNames = { "id_employee", "id_tab", "module" }))
public class NvTabModulePreference implements java.io.Serializable {

	private Integer idTabModulePreference;
	private int idEmployee;
	private int idTab;
	private String module;

	public NvTabModulePreference() {
	}

	public NvTabModulePreference(int idEmployee, int idTab, String module) {
		this.idEmployee = idEmployee;
		this.idTab = idTab;
		this.module = module;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_tab_module_preference", unique = true, nullable = false)
	public Integer getIdTabModulePreference() {
		return this.idTabModulePreference;
	}

	public void setIdTabModulePreference(Integer idTabModulePreference) {
		this.idTabModulePreference = idTabModulePreference;
	}

	@Column(name = "id_employee", nullable = false)
	public int getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	@Column(name = "id_tab", nullable = false)
	public int getIdTab() {
		return this.idTab;
	}

	public void setIdTab(int idTab) {
		this.idTab = idTab;
	}

	@Column(name = "module", nullable = false)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
