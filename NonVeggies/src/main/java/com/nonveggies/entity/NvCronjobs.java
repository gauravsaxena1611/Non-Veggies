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
 * NvCronjobs generated by hbm2java
 */
@Entity
@Table(name = "nv_cronjobs", catalog = "NVPrestashop")
public class NvCronjobs implements java.io.Serializable {

	private Integer idCronjob;
	private Integer idModule;
	private String description;
	private String task;
	private Integer hour;
	private Integer day;
	private Integer month;
	private Integer dayOfWeek;
	private Date updatedAt;
	private boolean oneShot;
	private Boolean active;
	private Integer idShop;
	private Integer idShopGroup;

	public NvCronjobs() {
	}

	public NvCronjobs(boolean oneShot) {
		this.oneShot = oneShot;
	}

	public NvCronjobs(Integer idModule, String description, String task, Integer hour, Integer day, Integer month, Integer dayOfWeek, Date updatedAt,
					boolean oneShot, Boolean active, Integer idShop, Integer idShopGroup) {
		this.idModule = idModule;
		this.description = description;
		this.task = task;
		this.hour = hour;
		this.day = day;
		this.month = month;
		this.dayOfWeek = dayOfWeek;
		this.updatedAt = updatedAt;
		this.oneShot = oneShot;
		this.active = active;
		this.idShop = idShop;
		this.idShopGroup = idShopGroup;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_cronjob", unique = true, nullable = false)
	public Integer getIdCronjob() {
		return this.idCronjob;
	}

	public void setIdCronjob(Integer idCronjob) {
		this.idCronjob = idCronjob;
	}

	@Column(name = "id_module")
	public Integer getIdModule() {
		return this.idModule;
	}

	public void setIdModule(Integer idModule) {
		this.idModule = idModule;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "task", length = 65535)
	public String getTask() {
		return this.task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Column(name = "hour")
	public Integer getHour() {
		return this.hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	@Column(name = "day")
	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	@Column(name = "month")
	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@Column(name = "day_of_week")
	public Integer getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(Integer dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 0)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "one_shot", nullable = false)
	public boolean isOneShot() {
		return this.oneShot;
	}

	public void setOneShot(boolean oneShot) {
		this.oneShot = oneShot;
	}

	@Column(name = "active")
	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Column(name = "id_shop")
	public Integer getIdShop() {
		return this.idShop;
	}

	public void setIdShop(Integer idShop) {
		this.idShop = idShop;
	}

	@Column(name = "id_shop_group")
	public Integer getIdShopGroup() {
		return this.idShopGroup;
	}

	public void setIdShopGroup(Integer idShopGroup) {
		this.idShopGroup = idShopGroup;
	}

}
