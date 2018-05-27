package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * NvGroupReduction generated by hbm2java
 */
@Entity
@Table(name = "nv_group_reduction", catalog = "NVPrestashop", uniqueConstraints = @UniqueConstraint(columnNames = { "id_group", "id_category" }))
public class NvGroupReduction implements java.io.Serializable {

	private Integer idGroupReduction;
	private int idGroup;
	private int idCategory;
	private BigDecimal reduction;

	public NvGroupReduction() {
	}

	public NvGroupReduction(int idGroup, int idCategory, BigDecimal reduction) {
		this.idGroup = idGroup;
		this.idCategory = idCategory;
		this.reduction = reduction;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_group_reduction", unique = true, nullable = false)
	public Integer getIdGroupReduction() {
		return this.idGroupReduction;
	}

	public void setIdGroupReduction(Integer idGroupReduction) {
		this.idGroupReduction = idGroupReduction;
	}

	@Column(name = "id_group", nullable = false)
	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	@Column(name = "id_category", nullable = false)
	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	@Column(name = "reduction", nullable = false, precision = 4, scale = 3)
	public BigDecimal getReduction() {
		return this.reduction;
	}

	public void setReduction(BigDecimal reduction) {
		this.reduction = reduction;
	}

}