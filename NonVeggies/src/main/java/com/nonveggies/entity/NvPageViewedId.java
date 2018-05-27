package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvPageViewedId generated by hbm2java
 */
@Embeddable
public class NvPageViewedId implements java.io.Serializable {

	private int idPage;
	private int idDateRange;
	private int idShop;

	public NvPageViewedId() {
	}

	public NvPageViewedId(int idPage, int idDateRange, int idShop) {
		this.idPage = idPage;
		this.idDateRange = idDateRange;
		this.idShop = idShop;
	}

	@Column(name = "id_page", nullable = false)
	public int getIdPage() {
		return this.idPage;
	}

	public void setIdPage(int idPage) {
		this.idPage = idPage;
	}

	@Column(name = "id_date_range", nullable = false)
	public int getIdDateRange() {
		return this.idDateRange;
	}

	public void setIdDateRange(int idDateRange) {
		this.idDateRange = idDateRange;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvPageViewedId))
			return false;
		NvPageViewedId castOther = (NvPageViewedId) other;

		return (this.getIdPage() == castOther.getIdPage()) && (this.getIdDateRange() == castOther.getIdDateRange())
						&& (this.getIdShop() == castOther.getIdShop());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdPage();
		result = 37 * result + this.getIdDateRange();
		result = 37 * result + this.getIdShop();
		return result;
	}

}