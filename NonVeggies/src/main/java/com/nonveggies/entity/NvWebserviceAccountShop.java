package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NvWebserviceAccountShop generated by hbm2java
 */
@Entity
@Table(name = "nv_webservice_account_shop", catalog = "NVPrestashop")
public class NvWebserviceAccountShop implements java.io.Serializable {

	private NvWebserviceAccountShopId id;

	public NvWebserviceAccountShop() {
	}

	public NvWebserviceAccountShop(NvWebserviceAccountShopId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idWebserviceAccount", column = @Column(name = "id_webservice_account", nullable = false)),
			@AttributeOverride(name = "idShop", column = @Column(name = "id_shop", nullable = false)) })
	public NvWebserviceAccountShopId getId() {
		return this.id;
	}

	public void setId(NvWebserviceAccountShopId id) {
		this.id = id;
	}

}
