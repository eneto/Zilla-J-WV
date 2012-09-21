package com.zuora.zilla.model;

import java.util.ArrayList;

public class CatalogModel {
	public boolean success;
	public String error;
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	ArrayList<CatalogGroup> catalogGroups;

	public ArrayList<CatalogGroup> getCatalogGroups() {
		return catalogGroups;
	}

	public void setCatalogGroups(ArrayList<CatalogGroup> catalogGroups) {
		this.catalogGroups = catalogGroups;
	}
}
