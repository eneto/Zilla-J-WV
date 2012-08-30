package com.zuora.zilla.model;

import java.util.Vector;

import org.codehaus.jackson.annotate.JsonProperty;

public class CatalogGroup {

	private String name = "";
	private Vector<CatalogProduct> products;
	
	public CatalogGroup() {
		this.name = "";
	}

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("products")
	public Vector<CatalogProduct> getProducts() {
		return products;
	}

	public void setProducts(Vector<CatalogProduct> products) {
		this.products = products;
	}
}
