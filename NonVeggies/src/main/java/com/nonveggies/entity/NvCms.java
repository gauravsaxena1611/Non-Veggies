package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvCms generated by hbm2java
 */
@Entity
@Table(name = "nv_cms", catalog = "NVPrestashop")
public class NvCms implements java.io.Serializable {

	private Integer idCms;
	private int idCmsCategory;
	private int position;
	private boolean active;
	private boolean indexation;

	public NvCms() {
	}

	public NvCms(int idCmsCategory, int position, boolean active, boolean indexation) {
		this.idCmsCategory = idCmsCategory;
		this.position = position;
		this.active = active;
		this.indexation = indexation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_cms", unique = true, nullable = false)
	public Integer getIdCms() {
		return this.idCms;
	}

	public void setIdCms(Integer idCms) {
		this.idCms = idCms;
	}

	@Column(name = "id_cms_category", nullable = false)
	public int getIdCmsCategory() {
		return this.idCmsCategory;
	}

	public void setIdCmsCategory(int idCmsCategory) {
		this.idCmsCategory = idCmsCategory;
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

	@Column(name = "indexation", nullable = false)
	public boolean isIndexation() {
		return this.indexation;
	}

	public void setIndexation(boolean indexation) {
		this.indexation = indexation;
	}

}
