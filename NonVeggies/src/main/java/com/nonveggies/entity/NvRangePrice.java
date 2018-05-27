package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * NvRangePrice generated by hbm2java
 */
@Entity
@Table(name = "nv_range_price", catalog = "NVPrestashop", uniqueConstraints = @UniqueConstraint(columnNames = { "id_carrier", "delimiter1", "delimiter2" }))
public class NvRangePrice implements java.io.Serializable {

	private Integer idRangePrice;
	private int idCarrier;
	private BigDecimal delimiter1;
	private BigDecimal delimiter2;

	public NvRangePrice() {
	}

	public NvRangePrice(int idCarrier, BigDecimal delimiter1, BigDecimal delimiter2) {
		this.idCarrier = idCarrier;
		this.delimiter1 = delimiter1;
		this.delimiter2 = delimiter2;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_range_price", unique = true, nullable = false)
	public Integer getIdRangePrice() {
		return this.idRangePrice;
	}

	public void setIdRangePrice(Integer idRangePrice) {
		this.idRangePrice = idRangePrice;
	}

	@Column(name = "id_carrier", nullable = false)
	public int getIdCarrier() {
		return this.idCarrier;
	}

	public void setIdCarrier(int idCarrier) {
		this.idCarrier = idCarrier;
	}

	@Column(name = "delimiter1", nullable = false, precision = 20, scale = 6)
	public BigDecimal getDelimiter1() {
		return this.delimiter1;
	}

	public void setDelimiter1(BigDecimal delimiter1) {
		this.delimiter1 = delimiter1;
	}

	@Column(name = "delimiter2", nullable = false, precision = 20, scale = 6)
	public BigDecimal getDelimiter2() {
		return this.delimiter2;
	}

	public void setDelimiter2(BigDecimal delimiter2) {
		this.delimiter2 = delimiter2;
	}

}