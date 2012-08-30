package com.zuora.zilla.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class CartItem {

	private Integer itemId;
	private String ratePlanId;
	private String ratePlanName;
	private String productName;
	private String uom;
	private String quantity;

	@JsonProperty("itemId")
	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	
	@JsonProperty("ratePlanId")
	public String getRatePlanId() {
		return ratePlanId;
	}

	public void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	@JsonProperty("ratePlanName")
	public String getRatePlanName() {
		return ratePlanName;
	}

	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}

	@JsonProperty("ProductName")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@JsonProperty("uom")
	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	@JsonProperty("quantity")
	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
