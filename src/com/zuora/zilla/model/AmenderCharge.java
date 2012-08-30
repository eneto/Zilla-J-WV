package com.zuora.zilla.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This class represents an amendment charge.
 * @author Mickael Pham <mickael.pham@zuora.com>
 */
public class AmenderCharge {

	private String id;
	private String name;
	private String productRatePlanChargeId;
	private String chargeModel;
	private String quantity;
	private String uom;

	@JsonProperty("Id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("ProductRatePlanChargeId")
	public String getProductRatePlanChargeId() {
		return productRatePlanChargeId;
	}

	public void setProductRatePlanChargeId(String productRatePlanChargeId) {
		this.productRatePlanChargeId = productRatePlanChargeId;
	}

	@JsonProperty("ChargeModel")
	public String getChargeModel() {
		return chargeModel;
	}

	public void setChargeModel(String chargeModel) {
		this.chargeModel = chargeModel;
	}

	@JsonProperty("Quantity")
	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@JsonProperty("Uom")
	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

}
