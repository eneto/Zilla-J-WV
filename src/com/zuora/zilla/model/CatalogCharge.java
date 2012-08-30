package com.zuora.zilla.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class CatalogCharge {

	private String id;
	private String name = "";
	private String description = "";
	private String chargeModel = "";
	private String uom = "";
	private String chargeType = "";

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

	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("ChargeModel")
	public String getChargeModel() {
		return chargeModel;
	}

	public void setChargeModel(String chargeModel) {
		this.chargeModel = chargeModel;
	}

	@JsonProperty("Uom")
	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	@JsonProperty("ChargeType")
	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
}
