package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NvMessageReaded generated by hbm2java
 */
@Entity
@Table(name = "nv_message_readed", catalog = "NVPrestashop")
public class NvMessageReaded implements java.io.Serializable {

	private NvMessageReadedId id;
	private Date dateAdd;

	public NvMessageReaded() {
	}

	public NvMessageReaded(NvMessageReadedId id, Date dateAdd) {
		this.id = id;
		this.dateAdd = dateAdd;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idMessage", column = @Column(name = "id_message", nullable = false)),
			@AttributeOverride(name = "idEmployee", column = @Column(name = "id_employee", nullable = false)) })
	public NvMessageReadedId getId() {
		return this.id;
	}

	public void setId(NvMessageReadedId id) {
		this.id = id;
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
