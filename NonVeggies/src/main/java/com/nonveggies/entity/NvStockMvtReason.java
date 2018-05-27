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
 * NvStockMvtReason generated by hbm2java
 */
@Entity
@Table(name = "nv_stock_mvt_reason", catalog = "NVPrestashop")
public class NvStockMvtReason implements java.io.Serializable {

	private Integer idStockMvtReason;
	private boolean sign;
	private Date dateAdd;
	private Date dateUpd;
	private boolean deleted;

	public NvStockMvtReason() {
	}

	public NvStockMvtReason(boolean sign, Date dateAdd, Date dateUpd, boolean deleted) {
		this.sign = sign;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
		this.deleted = deleted;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_stock_mvt_reason", unique = true, nullable = false)
	public Integer getIdStockMvtReason() {
		return this.idStockMvtReason;
	}

	public void setIdStockMvtReason(Integer idStockMvtReason) {
		this.idStockMvtReason = idStockMvtReason;
	}

	@Column(name = "sign", nullable = false)
	public boolean isSign() {
		return this.sign;
	}

	public void setSign(boolean sign) {
		this.sign = sign;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_add", nullable = false, length = 0)
	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_upd", nullable = false, length = 0)
	public Date getDateUpd() {
		return this.dateUpd;
	}

	public void setDateUpd(Date dateUpd) {
		this.dateUpd = dateUpd;
	}

	@Column(name = "deleted", nullable = false)
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}