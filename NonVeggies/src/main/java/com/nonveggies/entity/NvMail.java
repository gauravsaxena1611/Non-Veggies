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
 * NvMail generated by hbm2java
 */
@Entity
@Table(name = "nv_mail", catalog = "NVPrestashop")
public class NvMail implements java.io.Serializable {

	private Integer idMail;
	private String recipient;
	private String template;
	private String subject;
	private int idLang;
	private Date dateAdd;

	public NvMail() {
	}

	public NvMail(String recipient, String template, String subject, int idLang, Date dateAdd) {
		this.recipient = recipient;
		this.template = template;
		this.subject = subject;
		this.idLang = idLang;
		this.dateAdd = dateAdd;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_mail", unique = true, nullable = false)
	public Integer getIdMail() {
		return this.idMail;
	}

	public void setIdMail(Integer idMail) {
		this.idMail = idMail;
	}

	@Column(name = "recipient", nullable = false, length = 126)
	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	@Column(name = "template", nullable = false, length = 62)
	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	@Column(name = "subject", nullable = false, length = 254)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
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
