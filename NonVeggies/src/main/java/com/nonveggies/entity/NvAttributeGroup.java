package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvAttributeGroup generated by hbm2java
 */
@Entity
@Table(name = "nv_attribute_group", catalog = "NVPrestashop")
public class NvAttributeGroup implements java.io.Serializable {

	private Integer idAttributeGroup;
	private boolean isColorGroup;
	private String groupType;
	private int position;

	public NvAttributeGroup() {
	}

	public NvAttributeGroup(boolean isColorGroup, String groupType, int position) {
		this.isColorGroup = isColorGroup;
		this.groupType = groupType;
		this.position = position;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_attribute_group", unique = true, nullable = false)
	public Integer getIdAttributeGroup() {
		return this.idAttributeGroup;
	}

	public void setIdAttributeGroup(Integer idAttributeGroup) {
		this.idAttributeGroup = idAttributeGroup;
	}

	@Column(name = "is_color_group", nullable = false)
	public boolean isIsColorGroup() {
		return this.isColorGroup;
	}

	public void setIsColorGroup(boolean isColorGroup) {
		this.isColorGroup = isColorGroup;
	}

	@Column(name = "group_type", nullable = false, length = 7)
	public String getGroupType() {
		return this.groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	@Column(name = "position", nullable = false)
	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}