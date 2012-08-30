package com.zuora.zilla.model;

public class AmenderAmendment {

	private String id;
	private String subscriptionId;
	private String type;
	private String contractEffectiveDate;
	private String displayDate;
	private String ratePlanName;
	private String newQuantity;
	private String oldQuantity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContractEffectiveDate() {
		return contractEffectiveDate;
	}

	public void setContractEffectiveDate(String contractEffectiveDate) {
		this.contractEffectiveDate = contractEffectiveDate;
	}

	public String getDisplayDate() {
		return displayDate;
	}

	public void setDisplayDate(String displayDate) {
		this.displayDate = displayDate;
	}

	public String getRatePlanName() {
		return ratePlanName;
	}

	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}

	public String getNewQuantity() {
		return newQuantity;
	}

	public void setNewQuantity(String newQuantity) {
		this.newQuantity = newQuantity;
	}

	public String getOldQuantity() {
		return oldQuantity;
	}

	public void setOldQuantity(String oldQuantity) {
		this.oldQuantity = oldQuantity;
	}

}
