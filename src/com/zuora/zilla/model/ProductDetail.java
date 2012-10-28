package com.zuora.zilla.model;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonProperty;

public class ProductDetail {
	private boolean success;
	private String error;

	private String group;
	private String level;

	private String productName;
	private String upgradeGroup;
	private String upgradeLevel;
	private String description;
	
	private ArrayList<CatalogRatePlan> frequencyPlans;
	private ArrayList<CatalogRatePlan> additionalFeatures;


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
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUpgradeGroup() {
		return upgradeGroup;
	}
	public void setUpgradeGroup(String upgradeGroup) {
		this.upgradeGroup = upgradeGroup;
	}
	public String getUpgradeLevel() {
		return upgradeLevel;
	}
	public void setUpgradeLevel(String upgradeLevel) {
		this.upgradeLevel = upgradeLevel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<CatalogRatePlan> getFrequencyPlans() {
		return frequencyPlans;
	}
	public void setFrequencyPlans(ArrayList<CatalogRatePlan> frequencyPlans) {
		this.frequencyPlans = frequencyPlans;
	}
	public ArrayList<CatalogRatePlan> getAdditionalFeatures() {
		return additionalFeatures;
	}
	public void setAdditionalFeatures(ArrayList<CatalogRatePlan> additionalFeatures) {
		this.additionalFeatures = additionalFeatures;
	}



}
