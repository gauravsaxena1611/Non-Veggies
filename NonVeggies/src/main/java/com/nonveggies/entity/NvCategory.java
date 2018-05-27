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
 * NvCategory generated by hbm2java
 */
@Entity
@Table(name = "nv_category", catalog = "NVPrestashop")
public class NvCategory implements java.io.Serializable {

	private Integer idCategory;
	private int idParent;
	private int idShopDefault;
	private byte levelDepth;
	private int nleft;
	private int nright;
	private boolean active;
	private Date dateAdd;
	private Date dateUpd;
	private int position;
	private boolean isRootCategory;

	public NvCategory() {
	}

	public NvCategory(int idParent, int idShopDefault, byte levelDepth, int nleft, int nright, boolean active, Date dateAdd, Date dateUpd, int position,
					boolean isRootCategory) {
		this.idParent = idParent;
		this.idShopDefault = idShopDefault;
		this.levelDepth = levelDepth;
		this.nleft = nleft;
		this.nright = nright;
		this.active = active;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
		this.position = position;
		this.isRootCategory = isRootCategory;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_category", unique = true, nullable = false)
	public Integer getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	@Column(name = "id_parent", nullable = false)
	public int getIdParent() {
		return this.idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	@Column(name = "id_shop_default", nullable = false)
	public int getIdShopDefault() {
		return this.idShopDefault;
	}

	public void setIdShopDefault(int idShopDefault) {
		this.idShopDefault = idShopDefault;
	}

	@Column(name = "level_depth", nullable = false)
	public byte getLevelDepth() {
		return this.levelDepth;
	}

	public void setLevelDepth(byte levelDepth) {
		this.levelDepth = levelDepth;
	}

	@Column(name = "nleft", nullable = false)
	public int getNleft() {
		return this.nleft;
	}

	public void setNleft(int nleft) {
		this.nleft = nleft;
	}

	@Column(name = "nright", nullable = false)
	public int getNright() {
		return this.nright;
	}

	public void setNright(int nright) {
		this.nright = nright;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
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

	@Column(name = "position", nullable = false)
	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Column(name = "is_root_category", nullable = false)
	public boolean isIsRootCategory() {
		return this.isRootCategory;
	}

	public void setIsRootCategory(boolean isRootCategory) {
		this.isRootCategory = isRootCategory;
	}

}
