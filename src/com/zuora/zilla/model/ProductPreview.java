package com.zuora.zilla.model;


public class ProductPreview {
	private boolean success;
	private String error;

	private double previewAmount;

	private String baseDescription;
	
	private boolean discount;
	private String discountName;
	private String discountDescription;

	public boolean isSuccess() {
		return success;
	}
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
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
	public double getPreviewAmount() {
		return previewAmount;
	}
	public void setPreviewAmount(double previewAmount) {
		this.previewAmount = previewAmount;
	}
	public String getBaseDescription() {
		return baseDescription;
	}
	public void setBaseDescription(String baseDescription) {
		this.baseDescription = baseDescription;
	}
	public boolean isDiscount() {
		return discount;
	}
	public void setDiscount(boolean discount) {
		this.discount = discount;
	}
	public String getDiscountDescription() {
		return discountDescription;
	}
	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}
	
	
}
