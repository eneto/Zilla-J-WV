package com.zuora.zilla.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class AmenderPlan {

	private String id;
	private String name;
	private String description;
	private String productName;
	private String amendmentType;
	private String amendmentId;
	private String uom;
	private String quantity;
	private List<AmenderCharge> amenderCharges;
	private String effectiveDate;

	@JsonProperty("ID")
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

	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("ProductName")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@JsonProperty("AmendmentType")
	public String getAmendmentType() {
		return amendmentType;
	}

	public void setAmendmentType(String amendmentType) {
		this.amendmentType = amendmentType;
	}

	@JsonProperty("AmendmentId")
	public String getAmendmentId() {
		return amendmentId;
	}

	public void setAmendmentId(String amendmentId) {
		this.amendmentId = amendmentId;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@JsonProperty("amender_charges")
	public List<AmenderCharge> getAmenderCharges() {
		return amenderCharges;
	}

	public void setAmenderCharges(List<AmenderCharge> amenderCharges) {
		this.amenderCharges = amenderCharges;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	
}
