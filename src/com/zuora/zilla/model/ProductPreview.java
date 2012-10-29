package com.zuora.zilla.model;

import java.util.ArrayList;

public class ProductPreview {
	private boolean success;
	private String error;

	private String previewAmount;

	private String baseDescription;
	
	private boolean discount;
	private String discountDescription;
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
	public String getPreviewAmount() {
		return previewAmount;
	}
	public void setPreviewAmount(String previewAmount) {
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
