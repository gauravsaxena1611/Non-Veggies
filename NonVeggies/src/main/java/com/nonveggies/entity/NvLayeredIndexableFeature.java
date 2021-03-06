package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvLayeredIndexableFeature generated by hbm2java
 */
@Entity
@Table(name = "nv_layered_indexable_feature", catalog = "NVPrestashop")
public class NvLayeredIndexableFeature implements java.io.Serializable {

	private int idFeature;
	private boolean indexable;

	public NvLayeredIndexableFeature() {
	}

	public NvLayeredIndexableFeature(int idFeature, boolean indexable) {
		this.idFeature = idFeature;
		this.indexable = indexable;
	}

	@Id
	@Column(name = "id_feature", unique = true, nullable = false)
	public int getIdFeature() {
		return this.idFeature;
	}

	public void setIdFeature(int idFeature) {
		this.idFeature = idFeature;
	}

	@Column(name = "indexable", nullable = false)
	public boolean isIndexable() {
		return this.indexable;
	}

	public void setIndexable(boolean indexable) {
		this.indexable = indexable;
	}

}
