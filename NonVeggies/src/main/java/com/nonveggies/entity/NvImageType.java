package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvImageType generated by hbm2java
 */
@Entity
@Table(name = "nv_image_type", catalog = "NVPrestashop")
public class NvImageType implements java.io.Serializable {

	private Integer idImageType;
	private String name;
	private int width;
	private int height;
	private boolean products;
	private boolean categories;
	private boolean manufacturers;
	private boolean suppliers;
	private boolean scenes;
	private boolean stores;

	public NvImageType() {
	}

	public NvImageType(String name, int width, int height, boolean products, boolean categories, boolean manufacturers, boolean suppliers, boolean scenes,
					boolean stores) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.products = products;
		this.categories = categories;
		this.manufacturers = manufacturers;
		this.suppliers = suppliers;
		this.scenes = scenes;
		this.stores = stores;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_image_type", unique = true, nullable = false)
	public Integer getIdImageType() {
		return this.idImageType;
	}

	public void setIdImageType(Integer idImageType) {
		this.idImageType = idImageType;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "width", nullable = false)
	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Column(name = "height", nullable = false)
	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Column(name = "products", nullable = false)
	public boolean isProducts() {
		return this.products;
	}

	public void setProducts(boolean products) {
		this.products = products;
	}

	@Column(name = "categories", nullable = false)
	public boolean isCategories() {
		return this.categories;
	}

	public void setCategories(boolean categories) {
		this.categories = categories;
	}

	@Column(name = "manufacturers", nullable = false)
	public boolean isManufacturers() {
		return this.manufacturers;
	}

	public void setManufacturers(boolean manufacturers) {
		this.manufacturers = manufacturers;
	}

	@Column(name = "suppliers", nullable = false)
	public boolean isSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(boolean suppliers) {
		this.suppliers = suppliers;
	}

	@Column(name = "scenes", nullable = false)
	public boolean isScenes() {
		return this.scenes;
	}

	public void setScenes(boolean scenes) {
		this.scenes = scenes;
	}

	@Column(name = "stores", nullable = false)
	public boolean isStores() {
		return this.stores;
	}

	public void setStores(boolean stores) {
		this.stores = stores;
	}

}
