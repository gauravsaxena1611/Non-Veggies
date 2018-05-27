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
import javax.persistence.UniqueConstraint;

/**
 * NvProductDownload generated by hbm2java
 */
@Entity
@Table(name = "nv_product_download", catalog = "NVPrestashop", uniqueConstraints = @UniqueConstraint(columnNames = "id_product"))
public class NvProductDownload implements java.io.Serializable {

	private Integer idProductDownload;
	private int idProduct;
	private String displayFilename;
	private String filename;
	private Date dateAdd;
	private Date dateExpiration;
	private Integer nbDaysAccessible;
	private Integer nbDownloadable;
	private boolean active;
	private boolean isShareable;

	public NvProductDownload() {
	}

	public NvProductDownload(int idProduct, Date dateAdd, boolean active, boolean isShareable) {
		this.idProduct = idProduct;
		this.dateAdd = dateAdd;
		this.active = active;
		this.isShareable = isShareable;
	}

	public NvProductDownload(int idProduct, String displayFilename, String filename, Date dateAdd, Date dateExpiration, Integer nbDaysAccessible,
					Integer nbDownloadable, boolean active, boolean isShareable) {
		this.idProduct = idProduct;
		this.displayFilename = displayFilename;
		this.filename = filename;
		this.dateAdd = dateAdd;
		this.dateExpiration = dateExpiration;
		this.nbDaysAccessible = nbDaysAccessible;
		this.nbDownloadable = nbDownloadable;
		this.active = active;
		this.isShareable = isShareable;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_product_download", unique = true, nullable = false)
	public Integer getIdProductDownload() {
		return this.idProductDownload;
	}

	public void setIdProductDownload(Integer idProductDownload) {
		this.idProductDownload = idProductDownload;
	}

	@Column(name = "id_product", unique = true, nullable = false)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "display_filename")
	public String getDisplayFilename() {
		return this.displayFilename;
	}

	public void setDisplayFilename(String displayFilename) {
		this.displayFilename = displayFilename;
	}

	@Column(name = "filename")
	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
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
	@Column(name = "date_expiration", length = 0)
	public Date getDateExpiration() {
		return this.dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	@Column(name = "nb_days_accessible")
	public Integer getNbDaysAccessible() {
		return this.nbDaysAccessible;
	}

	public void setNbDaysAccessible(Integer nbDaysAccessible) {
		this.nbDaysAccessible = nbDaysAccessible;
	}

	@Column(name = "nb_downloadable")
	public Integer getNbDownloadable() {
		return this.nbDownloadable;
	}

	public void setNbDownloadable(Integer nbDownloadable) {
		this.nbDownloadable = nbDownloadable;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "is_shareable", nullable = false)
	public boolean isIsShareable() {
		return this.isShareable;
	}

	public void setIsShareable(boolean isShareable) {
		this.isShareable = isShareable;
	}

}
