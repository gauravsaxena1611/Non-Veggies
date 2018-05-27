package com.nonveggies.order.dto;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDTO {
	
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

	public OrderDTO() {
	}

	public OrderDTO(int idShopGroup, int idShop, int idCarrier, int idLang, int idCustomer, int idCart, int idCurrency, int idAddressDelivery,
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

	public OrderDTO(String reference, int idShopGroup, int idShop, int idCarrier, int idLang, int idCustomer, int idCart, int idCurrency,
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

	public Integer getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getIdShopGroup() {
		return idShopGroup;
	}

	public void setIdShopGroup(int idShopGroup) {
		this.idShopGroup = idShopGroup;
	}

	public int getIdShop() {
		return idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	public int getIdCarrier() {
		return idCarrier;
	}

	public void setIdCarrier(int idCarrier) {
		this.idCarrier = idCarrier;
	}

	public int getIdLang() {
		return idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public int getIdCart() {
		return idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}

	public int getIdCurrency() {
		return idCurrency;
	}

	public void setIdCurrency(int idCurrency) {
		this.idCurrency = idCurrency;
	}

	public int getIdAddressDelivery() {
		return idAddressDelivery;
	}

	public void setIdAddressDelivery(int idAddressDelivery) {
		this.idAddressDelivery = idAddressDelivery;
	}

	public int getIdAddressInvoice() {
		return idAddressInvoice;
	}

	public void setIdAddressInvoice(int idAddressInvoice) {
		this.idAddressInvoice = idAddressInvoice;
	}

	public int getCurrentState() {
		return currentState;
	}

	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}

	public String getSecureKey() {
		return secureKey;
	}

	public void setSecureKey(String secureKey) {
		this.secureKey = secureKey;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public boolean isRecyclable() {
		return recyclable;
	}

	public void setRecyclable(boolean recyclable) {
		this.recyclable = recyclable;
	}

	public boolean isGift() {
		return gift;
	}

	public void setGift(boolean gift) {
		this.gift = gift;
	}

	public String getGiftMessage() {
		return giftMessage;
	}

	public void setGiftMessage(String giftMessage) {
		this.giftMessage = giftMessage;
	}

	public boolean isMobileTheme() {
		return mobileTheme;
	}

	public void setMobileTheme(boolean mobileTheme) {
		this.mobileTheme = mobileTheme;
	}

	public String getShippingNumber() {
		return shippingNumber;
	}

	public void setShippingNumber(String shippingNumber) {
		this.shippingNumber = shippingNumber;
	}

	public BigDecimal getTotalDiscounts() {
		return totalDiscounts;
	}

	public void setTotalDiscounts(BigDecimal totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
	}

	public BigDecimal getTotalDiscountsTaxIncl() {
		return totalDiscountsTaxIncl;
	}

	public void setTotalDiscountsTaxIncl(BigDecimal totalDiscountsTaxIncl) {
		this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
	}

	public BigDecimal getTotalDiscountsTaxExcl() {
		return totalDiscountsTaxExcl;
	}

	public void setTotalDiscountsTaxExcl(BigDecimal totalDiscountsTaxExcl) {
		this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
	}

	public BigDecimal getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(BigDecimal totalPaid) {
		this.totalPaid = totalPaid;
	}

	public BigDecimal getTotalPaidTaxIncl() {
		return totalPaidTaxIncl;
	}

	public void setTotalPaidTaxIncl(BigDecimal totalPaidTaxIncl) {
		this.totalPaidTaxIncl = totalPaidTaxIncl;
	}

	public BigDecimal getTotalPaidTaxExcl() {
		return totalPaidTaxExcl;
	}

	public void setTotalPaidTaxExcl(BigDecimal totalPaidTaxExcl) {
		this.totalPaidTaxExcl = totalPaidTaxExcl;
	}

	public BigDecimal getTotalPaidReal() {
		return totalPaidReal;
	}

	public void setTotalPaidReal(BigDecimal totalPaidReal) {
		this.totalPaidReal = totalPaidReal;
	}

	public BigDecimal getTotalProducts() {
		return totalProducts;
	}

	public void setTotalProducts(BigDecimal totalProducts) {
		this.totalProducts = totalProducts;
	}

	public BigDecimal getTotalProductsWt() {
		return totalProductsWt;
	}

	public void setTotalProductsWt(BigDecimal totalProductsWt) {
		this.totalProductsWt = totalProductsWt;
	}

	public BigDecimal getTotalShipping() {
		return totalShipping;
	}

	public void setTotalShipping(BigDecimal totalShipping) {
		this.totalShipping = totalShipping;
	}

	public BigDecimal getTotalShippingTaxIncl() {
		return totalShippingTaxIncl;
	}

	public void setTotalShippingTaxIncl(BigDecimal totalShippingTaxIncl) {
		this.totalShippingTaxIncl = totalShippingTaxIncl;
	}

	public BigDecimal getTotalShippingTaxExcl() {
		return totalShippingTaxExcl;
	}

	public void setTotalShippingTaxExcl(BigDecimal totalShippingTaxExcl) {
		this.totalShippingTaxExcl = totalShippingTaxExcl;
	}

	public BigDecimal getCarrierTaxRate() {
		return carrierTaxRate;
	}

	public void setCarrierTaxRate(BigDecimal carrierTaxRate) {
		this.carrierTaxRate = carrierTaxRate;
	}

	public BigDecimal getTotalWrapping() {
		return totalWrapping;
	}

	public void setTotalWrapping(BigDecimal totalWrapping) {
		this.totalWrapping = totalWrapping;
	}

	public BigDecimal getTotalWrappingTaxIncl() {
		return totalWrappingTaxIncl;
	}

	public void setTotalWrappingTaxIncl(BigDecimal totalWrappingTaxIncl) {
		this.totalWrappingTaxIncl = totalWrappingTaxIncl;
	}

	public BigDecimal getTotalWrappingTaxExcl() {
		return totalWrappingTaxExcl;
	}

	public void setTotalWrappingTaxExcl(BigDecimal totalWrappingTaxExcl) {
		this.totalWrappingTaxExcl = totalWrappingTaxExcl;
	}

	public boolean isRoundMode() {
		return roundMode;
	}

	public void setRoundMode(boolean roundMode) {
		this.roundMode = roundMode;
	}

	public boolean isRoundType() {
		return roundType;
	}

	public void setRoundType(boolean roundType) {
		this.roundType = roundType;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public int getDeliveryNumber() {
		return deliveryNumber;
	}

	public void setDeliveryNumber(int deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public Date getDateAdd() {
		return dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public Date getDateUpd() {
		return dateUpd;
	}

	public void setDateUpd(Date dateUpd) {
		this.dateUpd = dateUpd;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getSlotName() {
		return slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

	public Integer getIdDeliveryBoy() {
		return idDeliveryBoy;
	}

	public void setIdDeliveryBoy(Integer idDeliveryBoy) {
		this.idDeliveryBoy = idDeliveryBoy;
	}

	public String getOrderComment() {
		return orderComment;
	}

	public void setOrderComment(String orderComment) {
		this.orderComment = orderComment;
	}

}
