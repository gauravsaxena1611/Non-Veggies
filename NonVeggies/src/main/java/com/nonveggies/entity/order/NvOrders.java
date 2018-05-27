package com.nonveggies.entity.order;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * NvOrders generated by hbm2java
 */
@Entity
@Table(name = "nv_orders", catalog = "NVPrestashop")
public class NvOrders implements java.io.Serializable {

	private static final long serialVersionUID = -6898147237608454282L;
	
	private Integer idOrder;
	private String reference;
	private int idShopGroup;
	private int idShop;
	private int idCarrier;
	private int idLang;
	private int idCustomer;
	private int idCart;
	private int idCurrency;
	private int idAddressDelivery;
	private int idAddressInvoice;
	private int currentState;
	private String secureKey;
	private String payment;
	private BigDecimal conversionRate;
	private String module;
	private boolean recyclable;
	private boolean gift;
	private String giftMessage;
	private boolean mobileTheme;
	private String shippingNumber;
	private BigDecimal totalDiscounts;
	private BigDecimal totalDiscountsTaxIncl;
	private BigDecimal totalDiscountsTaxExcl;
	private BigDecimal totalPaid;
	private BigDecimal totalPaidTaxIncl;
	private BigDecimal totalPaidTaxExcl;
	private BigDecimal totalPaidReal;
	private BigDecimal totalProducts;
	private BigDecimal totalProductsWt;
	private BigDecimal totalShipping;
	private BigDecimal totalShippingTaxIncl;
	private BigDecimal totalShippingTaxExcl;
	private BigDecimal carrierTaxRate;
	private BigDecimal totalWrapping;
	private BigDecimal totalWrappingTaxIncl;
	private BigDecimal totalWrappingTaxExcl;
	private boolean roundMode;
	private boolean roundType;
	private int invoiceNumber;
	private int deliveryNumber;
	private Date invoiceDate;
	private int valid;
	private Date dateAdd;
	private Date dateUpd;
	private Date deliveryDate;
	private String slotName;
	private Integer idDeliveryBoy;
	private String orderComment;

	public NvOrders() {
	}

	public NvOrders(int idShopGroup, int idShop, int idCarrier, int idLang, int idCustomer, int idCart, int idCurrency, int idAddressDelivery,
					int idAddressInvoice, int currentState, String secureKey, String payment, BigDecimal conversionRate, boolean recyclable, boolean gift,
					boolean mobileTheme, BigDecimal totalDiscounts, BigDecimal totalDiscountsTaxIncl, BigDecimal totalDiscountsTaxExcl, BigDecimal totalPaid,
					BigDecimal totalPaidTaxIncl, BigDecimal totalPaidTaxExcl, BigDecimal totalPaidReal, BigDecimal totalProducts, BigDecimal totalProductsWt,
					BigDecimal totalShipping, BigDecimal totalShippingTaxIncl, BigDecimal totalShippingTaxExcl, BigDecimal carrierTaxRate,
					BigDecimal totalWrapping, BigDecimal totalWrappingTaxIncl, BigDecimal totalWrappingTaxExcl, boolean roundMode, boolean roundType,
					int invoiceNumber, int deliveryNumber, Date invoiceDate, int valid, Date dateAdd, Date dateUpd, Date deliveryDate, String slotName) {
		this.idShopGroup = idShopGroup;
		this.idShop = idShop;
		this.idCarrier = idCarrier;
		this.idLang = idLang;
		this.idCustomer = idCustomer;
		this.idCart = idCart;
		this.idCurrency = idCurrency;
		this.idAddressDelivery = idAddressDelivery;
		this.idAddressInvoice = idAddressInvoice;
		this.currentState = currentState;
		this.secureKey = secureKey;
		this.payment = payment;
		this.conversionRate = conversionRate;
		this.recyclable = recyclable;
		this.gift = gift;
		this.mobileTheme = mobileTheme;
		this.totalDiscounts = totalDiscounts;
		this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
		this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
		this.totalPaid = totalPaid;
		this.totalPaidTaxIncl = totalPaidTaxIncl;
		this.totalPaidTaxExcl = totalPaidTaxExcl;
		this.totalPaidReal = totalPaidReal;
		this.totalProducts = totalProducts;
		this.totalProductsWt = totalProductsWt;
		this.totalShipping = totalShipping;
		this.totalShippingTaxIncl = totalShippingTaxIncl;
		this.totalShippingTaxExcl = totalShippingTaxExcl;
		this.carrierTaxRate = carrierTaxRate;
		this.totalWrapping = totalWrapping;
		this.totalWrappingTaxIncl = totalWrappingTaxIncl;
		this.totalWrappingTaxExcl = totalWrappingTaxExcl;
		this.roundMode = roundMode;
		this.roundType = roundType;
		this.invoiceNumber = invoiceNumber;
		this.deliveryNumber = deliveryNumber;
		this.invoiceDate = invoiceDate;
		this.valid = valid;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
		this.deliveryDate = deliveryDate;
		this.slotName = slotName;
	}

	public NvOrders(String reference, int idShopGroup, int idShop, int idCarrier, int idLang, int idCustomer, int idCart, int idCurrency,
					int idAddressDelivery, int idAddressInvoice, int currentState, String secureKey, String payment, BigDecimal conversionRate, String module,
					boolean recyclable, boolean gift, String giftMessage, boolean mobileTheme, String shippingNumber, BigDecimal totalDiscounts,
					BigDecimal totalDiscountsTaxIncl, BigDecimal totalDiscountsTaxExcl, BigDecimal totalPaid, BigDecimal totalPaidTaxIncl,
					BigDecimal totalPaidTaxExcl, BigDecimal totalPaidReal, BigDecimal totalProducts, BigDecimal totalProductsWt, BigDecimal totalShipping,
					BigDecimal totalShippingTaxIncl, BigDecimal totalShippingTaxExcl, BigDecimal carrierTaxRate, BigDecimal totalWrapping,
					BigDecimal totalWrappingTaxIncl, BigDecimal totalWrappingTaxExcl, boolean roundMode, boolean roundType, int invoiceNumber,
					int deliveryNumber, Date invoiceDate, int valid, Date dateAdd, Date dateUpd, Date deliveryDate, String slotName, Integer idDeliveryBoy,
					String orderComment) {
		this.reference = reference;
		this.idShopGroup = idShopGroup;
		this.idShop = idShop;
		this.idCarrier = idCarrier;
		this.idLang = idLang;
		this.idCustomer = idCustomer;
		this.idCart = idCart;
		this.idCurrency = idCurrency;
		this.idAddressDelivery = idAddressDelivery;
		this.idAddressInvoice = idAddressInvoice;
		this.currentState = currentState;
		this.secureKey = secureKey;
		this.payment = payment;
		this.conversionRate = conversionRate;
		this.module = module;
		this.recyclable = recyclable;
		this.gift = gift;
		this.giftMessage = giftMessage;
		this.mobileTheme = mobileTheme;
		this.shippingNumber = shippingNumber;
		this.totalDiscounts = totalDiscounts;
		this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
		this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
		this.totalPaid = totalPaid;
		this.totalPaidTaxIncl = totalPaidTaxIncl;
		this.totalPaidTaxExcl = totalPaidTaxExcl;
		this.totalPaidReal = totalPaidReal;
		this.totalProducts = totalProducts;
		this.totalProductsWt = totalProductsWt;
		this.totalShipping = totalShipping;
		this.totalShippingTaxIncl = totalShippingTaxIncl;
		this.totalShippingTaxExcl = totalShippingTaxExcl;
		this.carrierTaxRate = carrierTaxRate;
		this.totalWrapping = totalWrapping;
		this.totalWrappingTaxIncl = totalWrappingTaxIncl;
		this.totalWrappingTaxExcl = totalWrappingTaxExcl;
		this.roundMode = roundMode;
		this.roundType = roundType;
		this.invoiceNumber = invoiceNumber;
		this.deliveryNumber = deliveryNumber;
		this.invoiceDate = invoiceDate;
		this.valid = valid;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
		this.deliveryDate = deliveryDate;
		this.slotName = slotName;
		this.idDeliveryBoy = idDeliveryBoy;
		this.orderComment = orderComment;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_order", unique = true, nullable = false)
	public Integer getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	@Column(name = "reference", length = 9)
	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
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

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	@Column(name = "id_customer", nullable = false)
	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	@Column(name = "id_cart", nullable = false)
	public int getIdCart() {
		return this.idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}

	@Column(name = "id_currency", nullable = false)
	public int getIdCurrency() {
		return this.idCurrency;
	}

	public void setIdCurrency(int idCurrency) {
		this.idCurrency = idCurrency;
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

	@Column(name = "current_state", nullable = false)
	public int getCurrentState() {
		return this.currentState;
	}

	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}

	@Column(name = "secure_key", nullable = false, length = 32)
	public String getSecureKey() {
		return this.secureKey;
	}

	public void setSecureKey(String secureKey) {
		this.secureKey = secureKey;
	}

	@Column(name = "payment", nullable = false)
	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Column(name = "conversion_rate", nullable = false, precision = 13, scale = 6)
	public BigDecimal getConversionRate() {
		return this.conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	@Column(name = "module")
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
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

	@Column(name = "shipping_number", length = 64)
	public String getShippingNumber() {
		return this.shippingNumber;
	}

	public void setShippingNumber(String shippingNumber) {
		this.shippingNumber = shippingNumber;
	}

	@Column(name = "total_discounts", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalDiscounts() {
		return this.totalDiscounts;
	}

	public void setTotalDiscounts(BigDecimal totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
	}

	@Column(name = "total_discounts_tax_incl", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalDiscountsTaxIncl() {
		return this.totalDiscountsTaxIncl;
	}

	public void setTotalDiscountsTaxIncl(BigDecimal totalDiscountsTaxIncl) {
		this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
	}

	@Column(name = "total_discounts_tax_excl", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalDiscountsTaxExcl() {
		return this.totalDiscountsTaxExcl;
	}

	public void setTotalDiscountsTaxExcl(BigDecimal totalDiscountsTaxExcl) {
		this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
	}

	@Column(name = "total_paid", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalPaid() {
		return this.totalPaid;
	}

	public void setTotalPaid(BigDecimal totalPaid) {
		this.totalPaid = totalPaid;
	}

	@Column(name = "total_paid_tax_incl", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalPaidTaxIncl() {
		return this.totalPaidTaxIncl;
	}

	public void setTotalPaidTaxIncl(BigDecimal totalPaidTaxIncl) {
		this.totalPaidTaxIncl = totalPaidTaxIncl;
	}

	@Column(name = "total_paid_tax_excl", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalPaidTaxExcl() {
		return this.totalPaidTaxExcl;
	}

	public void setTotalPaidTaxExcl(BigDecimal totalPaidTaxExcl) {
		this.totalPaidTaxExcl = totalPaidTaxExcl;
	}

	@Column(name = "total_paid_real", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalPaidReal() {
		return this.totalPaidReal;
	}

	public void setTotalPaidReal(BigDecimal totalPaidReal) {
		this.totalPaidReal = totalPaidReal;
	}

	@Column(name = "total_products", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalProducts() {
		return this.totalProducts;
	}

	public void setTotalProducts(BigDecimal totalProducts) {
		this.totalProducts = totalProducts;
	}

	@Column(name = "total_products_wt", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalProductsWt() {
		return this.totalProductsWt;
	}

	public void setTotalProductsWt(BigDecimal totalProductsWt) {
		this.totalProductsWt = totalProductsWt;
	}

	@Column(name = "total_shipping", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalShipping() {
		return this.totalShipping;
	}

	public void setTotalShipping(BigDecimal totalShipping) {
		this.totalShipping = totalShipping;
	}

	@Column(name = "total_shipping_tax_incl", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalShippingTaxIncl() {
		return this.totalShippingTaxIncl;
	}

	public void setTotalShippingTaxIncl(BigDecimal totalShippingTaxIncl) {
		this.totalShippingTaxIncl = totalShippingTaxIncl;
	}

	@Column(name = "total_shipping_tax_excl", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalShippingTaxExcl() {
		return this.totalShippingTaxExcl;
	}

	public void setTotalShippingTaxExcl(BigDecimal totalShippingTaxExcl) {
		this.totalShippingTaxExcl = totalShippingTaxExcl;
	}

	@Column(name = "carrier_tax_rate", nullable = false, precision = 10, scale = 3)
	public BigDecimal getCarrierTaxRate() {
		return this.carrierTaxRate;
	}

	public void setCarrierTaxRate(BigDecimal carrierTaxRate) {
		this.carrierTaxRate = carrierTaxRate;
	}

	@Column(name = "total_wrapping", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalWrapping() {
		return this.totalWrapping;
	}

	public void setTotalWrapping(BigDecimal totalWrapping) {
		this.totalWrapping = totalWrapping;
	}

	@Column(name = "total_wrapping_tax_incl", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalWrappingTaxIncl() {
		return this.totalWrappingTaxIncl;
	}

	public void setTotalWrappingTaxIncl(BigDecimal totalWrappingTaxIncl) {
		this.totalWrappingTaxIncl = totalWrappingTaxIncl;
	}

	@Column(name = "total_wrapping_tax_excl", nullable = false, precision = 20, scale = 6)
	public BigDecimal getTotalWrappingTaxExcl() {
		return this.totalWrappingTaxExcl;
	}

	public void setTotalWrappingTaxExcl(BigDecimal totalWrappingTaxExcl) {
		this.totalWrappingTaxExcl = totalWrappingTaxExcl;
	}

	@Column(name = "round_mode", nullable = false)
	public boolean isRoundMode() {
		return this.roundMode;
	}

	public void setRoundMode(boolean roundMode) {
		this.roundMode = roundMode;
	}

	@Column(name = "round_type", nullable = false)
	public boolean isRoundType() {
		return this.roundType;
	}

	public void setRoundType(boolean roundType) {
		this.roundType = roundType;
	}

	@Column(name = "invoice_number", nullable = false)
	public int getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@Column(name = "delivery_number", nullable = false)
	public int getDeliveryNumber() {
		return this.deliveryNumber;
	}

	public void setDeliveryNumber(int deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "invoice_date", nullable = false, length = 0)
	public Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	@Column(name = "valid", nullable = false)
	public int getValid() {
		return this.valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "delivery_date", nullable = false, length = 0)
	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Column(name = "slot_name", nullable = false, length = 20)
	public String getSlotName() {
		return this.slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

	@Column(name = "id_delivery_boy")
	public Integer getIdDeliveryBoy() {
		return this.idDeliveryBoy;
	}

	public void setIdDeliveryBoy(Integer idDeliveryBoy) {
		this.idDeliveryBoy = idDeliveryBoy;
	}

	@Column(name = "order_comment")
	public String getOrderComment() {
		return this.orderComment;
	}

	public void setOrderComment(String orderComment) {
		this.orderComment = orderComment;
	}

}
