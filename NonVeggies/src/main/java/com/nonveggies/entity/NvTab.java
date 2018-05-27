package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvTab generated by hbm2java
 */
@Entity
@Table(name = "nv_tab", catalog = "NVPrestashop")
public class NvTab implements java.io.Serializable {

	private Integer idTab;
	private int idParent;
	private String className;
	private String module;
	private int position;
	private boolean active;
	private boolean hideHostMode;

	public NvTab() {
	}

	public NvTab(int idParent, String className, int position, boolean active, boolean hideHostMode) {
		this.idParent = idParent;
		this.className = className;
		this.position = position;
		this.active = active;
		this.hideHostMode = hideHostMode;
	}

	public NvTab(int idParent, String className, String module, int position, boolean active, boolean hideHostMode) {
		this.idParent = idParent;
		this.className = className;
		this.module = module;
		this.position = position;
		this.active = active;
		this.hideHostMode = hideHostMode;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_tab", unique = true, nullable = false)
	public Integer getIdTab() {
		return this.idTab;
	}

	public void setIdTab(Integer idTab) {
		this.idTab = idTab;
	}

	@Column(name = "id_parent", nullable = false)
	public int getIdParent() {
		return this.idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	@Column(name = "class_name", nullable = false, length = 64)
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Column(name = "module", length = 64)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "position", nullable = false)
	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "hide_host_mode", nullable = false)
	public boolean isHideHostMode() {
		return this.hideHostMode;
	}

	public void setHideHostMode(boolean hideHostMode) {
		this.hideHostMode = hideHostMode;
	}

}