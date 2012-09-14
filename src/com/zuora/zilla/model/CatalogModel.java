package com.zuora.zilla.model;

import java.util.ArrayList;

public class CatalogModel implements java.io.Serializable {
	 ArrayList<CatalogGroup> catalogGroups;

	public ArrayList<CatalogGroup> getCatalogGroups() {
		return catalogGroups;
	}

	public void setCatalogGroups(ArrayList<CatalogGroup> catalogGroups) {
		this.catalogGroups = catalogGroups;
	}
}
