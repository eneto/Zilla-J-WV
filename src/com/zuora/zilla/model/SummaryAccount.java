package com.zuora.zilla.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class SummaryAccount {

	private Boolean success;
	private String error;

	private String name;
	private BigDecimal balance;
	private BigDecimal lastPaymentAmount;
	private Calendar lastPaymentDate;
	private Calendar lastInvoiceDate;
	
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

	@JsonProperty("contactSummary")
	public SummaryContact getContactSummary() {
		return contactSummary;
	}

	@JsonProperty("Balance")
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@JsonProperty("LastPaymentAmount")
	public BigDecimal getLastPaymentAmount() {
		return lastPaymentAmount;
	}

	public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
	}

	@JsonProperty("LastPaymentDate")
	public Calendar getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(Calendar lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	@JsonProperty("LastInvoiceDate")
	public Calendar getLastInvoiceDate() {
		return lastInvoiceDate;
	}

	public void setLastInvoiceDate(Calendar lastInvoiceDate) {
		this.lastInvoiceDate = lastInvoiceDate;
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
