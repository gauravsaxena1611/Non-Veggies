package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvStock generated by hbm2java
 */
@Entity
@Table(name = "nv_stock", catalog = "NVPrestashop")
public class NvStock implements java.io.Serializable {

	private Integer idStock;
	private int idWarehouse;
	private int idProduct;
	private int idProductAttribute;
	private String reference;
	private String ean13;
	private String upc;
	private int physicalQuantity;
	private int usableQuantity;
	private BigDecimal priceTe;

	public NvStock() {
	}

	public NvStock(int idWarehouse, int idProduct, int idProductAttribute, String reference, int physicalQuantity, int usableQuantity) {
		this.idWarehouse = idWarehouse;
		this.idProduct = idProduct;
		this.idProductAttribute = idProductAttribute;
		this.reference = reference;
		this.physicalQuantity = physicalQuantity;
		this.usableQuantity = usableQuantity;
	}

	public NvStock(int idWarehouse, int idProduct, int idProductAttribute, String reference, String ean13, String upc, int physicalQuantity,
					int usableQuantity, BigDecimal priceTe) {
		this.idWarehouse = idWarehouse;
		this.idProduct = idProduct;
		this.idProductAttribute = idProductAttribute;
		this.reference = reference;
		this.ean13 = ean13;
		this.upc = upc;
		this.physicalQuantity = physicalQuantity;
		this.usableQuantity = usableQuantity;
		this.priceTe = priceTe;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_stock", unique = true, nullable = false)
	public Integer getIdStock() {
		return this.idStock;
	}

	public void setIdStock(Integer idStock) {
		this.idStock = idStock;
	}

	@Column(name = "id_warehouse", nullable = false)
	public int getIdWarehouse() {
		return this.idWarehouse;
	}

	public void setIdWarehouse(int idWarehouse) {
		this.idWarehouse = idWarehouse;
	}

	@Column(name = "id_product", nullable = false)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "id_product_attribute", nullable = false)
	public int getIdProductAttribute() {
		return this.idProductAttribute;
	}

	public void setIdProductAttribute(int idProductAttribute) {
		this.idProductAttribute = idProductAttribute;
	}

	@Column(name = "reference", nullable = false, length = 32)
	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Column(name = "ean13", length = 13)
	public String getEan13() {
		return this.ean13;
	}

	public void setEan13(String ean13) {
		this.ean13 = ean13;
	}

	@Column(name = "upc", length = 12)
	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	@Column(name = "physical_quantity", nullable = false)
	public int getPhysicalQuantity() {
		return this.physicalQuantity;
	}

	public void setPhysicalQuantity(int physicalQuantity) {
		this.physicalQuantity = physicalQuantity;
	}

	@Column(name = "usable_quantity", nullable = false)
	public int getUsableQuantity() {
		return this.usableQuantity;
	}

	public void setUsableQuantity(int usableQuantity) {
		this.usableQuantity = usableQuantity;
	}

	@Column(name = "price_te", precision = 20, scale = 6)
	public BigDecimal getPriceTe() {
		return this.priceTe;
	}

	public void setPriceTe(BigDecimal priceTe) {
		this.priceTe = priceTe;
	}

}
