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
 * NvCart generated by hbm2java
 */
@Entity
@Table(name = "nv_cart", catalog = "NVPrestashop")
public class NvCart implements java.io.Serializable {

	private Integer idCart;
	private int idShopGroup;
	private int idShop;
	private int idCarrier;
	private String deliveryOption;
	private int idLang;
	private int idAddressDelivery;
	private int idAddressInvoice;
	private int idCurrency;
	private int idCustomer;
	private int idGuest;
	private String secureKey;
	private boolean recyclable;
	private boolean gift;
	private String giftMessage;
	private boolean mobileTheme;
	private boolean allowSeperatedPackage;
	private Date dateAdd;
	private Date dateUpd;

	public NvCart() {
	}

	public NvCart(int idShopGroup, int idShop, int idCarrier, String deliveryOption, int idLang, int idAddressDelivery, int idAddressInvoice, int idCurrency,
					int idCustomer, int idGuest, String secureKey, boolean recyclable, boolean gift, boolean mobileTheme, boolean allowSeperatedPackage,
					Date dateAdd, Date dateUpd) {
		this.idShopGroup = idShopGroup;
		this.idShop = idShop;
		this.idCarrier = idCarrier;
		this.deliveryOption = deliveryOption;
		this.idLang = idLang;
		this.idAddressDelivery = idAddressDelivery;
		this.idAddressInvoice = idAddressInvoice;
		this.idCurrency = idCurrency;
		this.idCustomer = idCustomer;
		this.idGuest = idGuest;
		this.secureKey = secureKey;
		this.recyclable = recyclable;
		this.gift = gift;
		this.mobileTheme = mobileTheme;
		this.allowSeperatedPackage = allowSeperatedPackage;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
	}

	public NvCart(int idShopGroup, int idShop, int idCarrier, String deliveryOption, int idLang, int idAddressDelivery, int idAddressInvoice, int idCurrency,
					int idCustomer, int idGuest, String secureKey, boolean recyclable, boolean gift, String giftMessage, boolean mobileTheme,
					boolean allowSeperatedPackage, Date dateAdd, Date dateUpd) {
		this.idShopGroup = idShopGroup;
		this.idShop = idShop;
		this.idCarrier = idCarrier;
		this.deliveryOption = deliveryOption;
		this.idLang = idLang;
		this.idAddressDelivery = idAddressDelivery;
		this.idAddressInvoice = idAddressInvoice;
		this.idCurrency = idCurrency;
		this.idCustomer = idCustomer;
		this.idGuest = idGuest;
		this.secureKey = secureKey;
		this.recyclable = recyclable;
		this.gift = gift;
		this.giftMessage = giftMessage;
		this.mobileTheme = mobileTheme;
		this.allowSeperatedPackage = allowSeperatedPackage;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_cart", unique = true, nullable = false)
	public Integer getIdCart() {
		return this.idCart;
	}

	public void setIdCart(Integer idCart) {
		this.idCart = idCart;
	}

	@Column(name = "id_shop_group", nullable = false)
	public int getIdShopGroup() {
		return this.idShopGroup;
	}

	public void setIdShopGroup(int idShopGroup) {
		this.idShopGroup = idShopGroup;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "id_carrier", nullable = false)
	public int getIdCarrier() {
		return this.idCarrier;
	}

	public void setIdCarrier(int idCarrier) {
		this.idCarrier = idCarrier;
	}

	@Column(name = "delivery_option", nullable = false, length = 65535)
	public String getDeliveryOption() {
		return this.deliveryOption;
	}

	public void setDeliveryOption(String deliveryOption) {
		this.deliveryOption = deliveryOption;
	}

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	@Column(name = "id_address_delivery", nullable = false)
	public int getIdAddressDelivery() {
		return this.idAddressDelivery;
	}

	public void setIdAddressDelivery(int idAddressDelivery) {
		this.idAddressDelivery = idAddressDelivery;
	}

	@Column(name = "id_address_invoice", nullable = false)
	public int getIdAddressInvoice() {
		return this.idAddressInvoice;
	}

	public void setIdAddressInvoice(int idAddressInvoice) {
		this.idAddressInvoice = idAddressInvoice;
	}

	@Column(name = "id_currency", nullable = false)
	public int getIdCurrency() {
		return this.idCurrency;
	}

	public void setIdCurrency(int idCurrency) {
		this.idCurrency = idCurrency;
	}

	@Column(name = "id_customer", nullable = false)
	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	@Column(name = "id_guest", nullable = false)
	public int getIdGuest() {
		return this.idGuest;
	}

	public void setIdGuest(int idGuest) {
		this.idGuest = idGuest;
	}

	@Column(name = "secure_key", nullable = false, length = 32)
	public String getSecureKey() {
		return this.secureKey;
	}

	public void setSecureKey(String secureKey) {
		this.secureKey = secureKey;
	}

	@Column(name = "recyclable", nullable = false)
	public boolean isRecyclable() {
		return this.recyclable;
	}

	public void setRecyclable(boolean recyclable) {
		this.recyclable = recyclable;
	}

	@Column(name = "gift", nullable = false)
	public boolean isGift() {
		return this.gift;
	}

	public void setGift(boolean gift) {
		this.gift = gift;
	}

	@Column(name = "gift_message", length = 65535)
	public String getGiftMessage() {
		return this.giftMessage;
	}

	public void setGiftMessage(String giftMessage) {
		this.giftMessage = giftMessage;
	}

	@Column(name = "mobile_theme", nullable = false)
	public boolean isMobileTheme() {
		return this.mobileTheme;
	}

	public void setMobileTheme(boolean mobileTheme) {
		this.mobileTheme = mobileTheme;
	}

	@Column(name = "allow_seperated_package", nullable = false)
	public boolean isAllowSeperatedPackage() {
		return this.allowSeperatedPackage;
	}

	public void setAllowSeperatedPackage(boolean allowSeperatedPackage) {
		this.allowSeperatedPackage = allowSeperatedPackage;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_add", nullable = false, length = 0)
	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_upd", nullable = false, length = 0)
	public Date getDateUpd() {
		return this.dateUpd;
	}

	public void setDateUpd(Date dateUpd) {
		this.dateUpd = dateUpd;
	}

}