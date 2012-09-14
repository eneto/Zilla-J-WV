package com.zuora.zilla.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.codehaus.jackson.annotate.JsonProperty;

public class CatalogRatePlan implements java.io.Serializable  {

	private String id;
	private String name = "";
	private String productName;
	private String description = "";
	private Boolean quantifiable;
	private String uom = "";
	private ArrayList<CatalogCharge> charges;

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

	@JsonProperty("productName")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("quantifiable")
	public Boolean getQuantifiable() {
		return quantifiable;
	}

	public void setQuantifiable(Boolean quantifiable) {
		this.quantifiable = quantifiable;
	}

	@JsonProperty("Uom")
	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	@JsonProperty("charges")
	public ArrayList<CatalogCharge> getCharges() {
		return charges;
	}

	public void setCharges(ArrayList<CatalogCharge> charges) {
		this.charges = charges;
	}
}
