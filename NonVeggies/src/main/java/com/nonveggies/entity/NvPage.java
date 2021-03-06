package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvPage generated by hbm2java
 */
@Entity
@Table(name = "nv_page", catalog = "NVPrestashop")
public class NvPage implements java.io.Serializable {

	private Integer idPage;
	private int idPageType;
	private Integer idObject;

	public NvPage() {
	}

	public NvPage(int idPageType) {
		this.idPageType = idPageType;
	}

	public NvPage(int idPageType, Integer idObject) {
		this.idPageType = idPageType;
		this.idObject = idObject;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_page", unique = true, nullable = false)
	public Integer getIdPage() {
		return this.idPage;
	}

	public void setIdPage(Integer idPage) {
		this.idPage = idPage;
	}

	@Column(name = "id_page_type", nullable = false)
	public int getIdPageType() {
		return this.idPageType;
	}

	public void setIdPageType(int idPageType) {
		this.idPageType = idPageType;
	}

	@Column(name = "id_object")
	public Integer getIdObject() {
		return this.idObject;
	}

	public void setIdObject(Integer idObject) {
		this.idObject = idObject;
	}

}
