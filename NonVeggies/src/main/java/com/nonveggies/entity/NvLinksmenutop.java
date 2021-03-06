package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvLinksmenutop generated by hbm2java
 */
@Entity
@Table(name = "nv_linksmenutop", catalog = "NVPrestashop")
public class NvLinksmenutop implements java.io.Serializable {

	private Integer idLinksmenutop;
	private int idShop;
	private boolean newWindow;

	public NvLinksmenutop() {
	}

	public NvLinksmenutop(int idShop, boolean newWindow) {
		this.idShop = idShop;
		this.newWindow = newWindow;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_linksmenutop", unique = true, nullable = false)
	public Integer getIdLinksmenutop() {
		return this.idLinksmenutop;
	}

	public void setIdLinksmenutop(Integer idLinksmenutop) {
		this.idLinksmenutop = idLinksmenutop;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "new_window", nullable = false)
	public boolean isNewWindow() {
		return this.newWindow;
	}

	public void setNewWindow(boolean newWindow) {
		this.newWindow = newWindow;
	}

}
