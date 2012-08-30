package com.zuora.zilla.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class SummaryAccount {

	private Boolean success;
	private String error;

	private String name;
	private String balance;
	private String lastPaymentAmount;
	private String lastPaymentDate;
	private String lastInvoiceDate;
	
	private SummaryContact contactSummary;
	private List<PaymentDetail> paymentMethodSummaries;

	@JsonProperty("success")
	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@JsonProperty("error")
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("Balance")
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@JsonProperty("LastPaymentAmount")
	public String getLastPaymentAmount() {
		return lastPaymentAmount;
	}

	public void setLastPaymentAmount(String lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
	}

	@JsonProperty("LastPaymentDate")
	public String getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(String lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	@JsonProperty("LastInvoiceDate")
	public String getLastInvoiceDate() {
		return lastInvoiceDate;
	}

	public void setLastInvoiceDate(String lastInvoiceDate) {
		this.lastInvoiceDate = lastInvoiceDate;
	}

	@JsonProperty("contactSummary")
	public SummaryContact getContactSummary() {
		return contactSummary;
	}

	public void setContactSummary(SummaryContact contactSummary) {
		this.contactSummary = contactSummary;
	}

	@JsonProperty("paymentMethodSummaries")
	public List<PaymentDetail> getPaymentMethodSummaries() {
		return paymentMethodSummaries;
	}

	public void setPaymentMethodSummaries(List<PaymentDetail> paymentMethodSummaries) {
		this.paymentMethodSummaries = paymentMethodSummaries;
	}

}
