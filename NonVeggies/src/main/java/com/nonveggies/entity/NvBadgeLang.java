package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvBadgeLang generated by hbm2java
 */
@Entity
@Table(name = "nv_badge_lang", catalog = "NVPrestashop")
public class NvBadgeLang implements java.io.Serializable {

	private NvBadgeLangId id;
	private String name;
	private String description;
	private String groupName;

	public NvBadgeLang() {
	}

	public NvBadgeLang(NvBadgeLangId id) {
		this.id = id;
	}

	public NvBadgeLang(NvBadgeLangId id, String name, String description, String groupName) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.groupName = groupName;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idBadge", column = @Column(name = "id_badge", nullable = false)),
			@AttributeOverride(name = "idLang", column = @Column(name = "id_lang", nullable = false)) })
	public NvBadgeLangId getId() {
		return this.id;
	}

	public void setId(NvBadgeLangId id) {
		this.id = id;
	}

	@Column(name = "name", length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "group_name")
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}