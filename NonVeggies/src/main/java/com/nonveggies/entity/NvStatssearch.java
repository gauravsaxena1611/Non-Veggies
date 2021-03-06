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
 * NvStatssearch generated by hbm2java
 */
@Entity
@Table(name = "nv_statssearch", catalog = "NVPrestashop")
public class NvStatssearch implements java.io.Serializable {

	private Integer idStatssearch;
	private int idShop;
	private int idShopGroup;
	private String keywords;
	private int results;
	private Date dateAdd;

	public NvStatssearch() {
	}

	public NvStatssearch(int idShop, int idShopGroup, String keywords, int results, Date dateAdd) {
		this.idShop = idShop;
		this.idShopGroup = idShopGroup;
		this.keywords = keywords;
		this.results = results;
		this.dateAdd = dateAdd;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_statssearch", unique = true, nullable = false)
	public Integer getIdStatssearch() {
		return this.idStatssearch;
	}

	public void setIdStatssearch(Integer idStatssearch) {
		this.idStatssearch = idStatssearch;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "id_shop_group", nullable = false)
	public int getIdShopGroup() {
		return this.idShopGroup;
	}

	public void setIdShopGroup(int idShopGroup) {
		this.idShopGroup = idShopGroup;
	}

	@Column(name = "keywords", nullable = false)
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Column(name = "results", nullable = false)
	public int getResults() {
		return this.results;
	}

	public void setResults(int results) {
		this.results = results;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_add", nullable = false, length = 0)
	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

}
