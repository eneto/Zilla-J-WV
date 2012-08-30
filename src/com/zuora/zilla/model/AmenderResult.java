package com.zuora.zilla.model;

import java.util.Calendar;

public class AmenderResult {

	private boolean success;
	private String error;

	private double invoiceAmount;
	private Calendar effectiveDate;
	private String productName;
	private String ratePlanName;
	private double newQuantity;
	private double oldQuantity;
	
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
	public double getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public Calendar getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Calendar effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getRatePlanName() {
		return ratePlanName;
	}
	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}
	public double getNewQuantity() {
		return newQuantity;
	}
	public void setNewQuantity(double newQuantity) {
		this.newQuantity = newQuantity;
	}
	public double getOldQuantity() {
		return oldQuantity;
	}
	public void setOldQuantity(double oldQuantity) {
		this.oldQuantity = oldQuantity;
	}


}
