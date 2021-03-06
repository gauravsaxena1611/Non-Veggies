package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NvConnections generated by hbm2java
 */
@Entity
@Table(name = "nv_connections", catalog = "NVPrestashop")
public class NvConnections implements java.io.Serializable {

	private Integer idConnections;
	private int idShopGroup;
	private int idShop;
	private int idGuest;
	private int idPage;
	private Long ipAddress;
	private Date dateAdd;
	private String httpReferer;

	public NvConnections() {
	}

	public NvConnections(int idShopGroup, int idShop, int idGuest, int idPage, Date dateAdd) {
		this.idShopGroup = idShopGroup;
		this.idShop = idShop;
		this.idGuest = idGuest;
		this.idPage = idPage;
		this.dateAdd = dateAdd;
	}

	public NvConnections(int idShopGroup, int idShop, int idGuest, int idPage, Long ipAddress, Date dateAdd, String httpReferer) {
		this.idShopGroup = idShopGroup;
		this.idShop = idShop;
		this.idGuest = idGuest;
		this.idPage = idPage;
		this.ipAddress = ipAddress;
		this.dateAdd = dateAdd;
		this.httpReferer = httpReferer;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_connections", unique = true, nullable = false)
	public Integer getIdConnections() {
		return this.idConnections;
	}

	public void setIdConnections(Integer idConnections) {
		this.idConnections = idConnections;
	}

	@Column(name = "id_shop_group", nullable = false)
	public int getIdShopGroup() {
		return this.idShopGroup;
	}

	public void setIdShopGroup(int idShopGroup) {
		this.idShopGroup = idShopGroup;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "id_guest", nullable = false)
	public int getIdGuest() {
		return this.idGuest;
	}

	public void setIdGuest(int idGuest) {
		this.idGuest = idGuest;
	}

	@Column(name = "id_page", nullable = false)
	public int getIdPage() {
		return this.idPage;
	}

	public void setIdPage(int idPage) {
		this.idPage = idPage;
	}

	@Column(name = "ip_address")
	public Long getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(Long ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_add", nullable = false, length = 0)
	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	@Column(name = "http_referer")
	public String getHttpReferer() {
		return this.httpReferer;
	}

	public void setHttpReferer(String httpReferer) {
		this.httpReferer = httpReferer;
	}

}
