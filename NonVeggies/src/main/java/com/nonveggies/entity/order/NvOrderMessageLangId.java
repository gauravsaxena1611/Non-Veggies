package com.nonveggies.entity.order;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvOrderMessageLangId generated by hbm2java
 */
@Embeddable
public class NvOrderMessageLangId implements java.io.Serializable {

	private int idOrderMessage;
	private int idLang;

	public NvOrderMessageLangId() {
	}

	public NvOrderMessageLangId(int idOrderMessage, int idLang) {
		this.idOrderMessage = idOrderMessage;
		this.idLang = idLang;
	}

	@Column(name = "id_order_message", nullable = false)
	public int getIdOrderMessage() {
		return this.idOrderMessage;
	}

	public void setIdOrderMessage(int idOrderMessage) {
		this.idOrderMessage = idOrderMessage;
	}

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvOrderMessageLangId))
			return false;
		NvOrderMessageLangId castOther = (NvOrderMessageLangId) other;

		return (this.getIdOrderMessage() == castOther.getIdOrderMessage()) && (this.getIdLang() == castOther.getIdLang());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdOrderMessage();
		result = 37 * result + this.getIdLang();
		return result;
	}

}
