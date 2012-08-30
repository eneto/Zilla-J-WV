package com.zuora.zilla.model;

import java.util.Vector;

import org.codehaus.jackson.annotate.JsonProperty;

public class CatalogProduct {

	private String id;
	private String name = "";
	private String description = "";
	private Vector<CatalogRatePlan> ratePlans;

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

	@JsonProperty("ratePlans")
	public Vector<CatalogRatePlan> getRatePlans() {
		return ratePlans;
	}

	public void setRatePlans(Vector<CatalogRatePlan> ratePlans) {
		this.ratePlans = ratePlans;
	}
}
