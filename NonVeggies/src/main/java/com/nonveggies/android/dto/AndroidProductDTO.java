package com.nonveggies.android.dto;

public class AndroidProductDTO extends AndroidBaseDTO{
	
	private long id;
	private String productName;
	private String shortName;
	private StringBuffer productDescription;
	private int listingPrice;
	private int sellingPrice;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public StringBuffer getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(StringBuffer productDescription) {
		this.productDescription = productDescription;
	}
	public int getListingPrice() {
		return listingPrice;
	}
	public void setListingPrice(int listingPrice) {
		this.listingPrice = listingPrice;
	}
	public int getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	

	
}
