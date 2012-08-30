package com.zuora.zilla.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class PaymentDetail {

	private String id;
	private String cardHolderName;
	private String maskedNumber;
	private Integer expirationYear;
	private Integer expirationMonth;
	private String cardType;
	private Boolean defaultCard;

	@JsonProperty("Id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("CardHolderName")
	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	@JsonProperty("MaskedNumber")
	public String getMaskedNumber() {
		return maskedNumber;
	}

	public void setMaskedNumber(String maskedNumber) {
		this.maskedNumber = maskedNumber;
	}

	@JsonProperty("ExpirationYear")
	public Integer getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(Integer expirationYear) {
		this.expirationYear = expirationYear;
	}

	@JsonProperty("ExpirationMonth")
	public Integer getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(Integer expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	@JsonProperty("CardType")
	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@JsonProperty("isDefault")
	public Boolean isDefaultCard() {
		return defaultCard;
	}

	public void setDefaultCard(Boolean defaultCard) {
		this.defaultCard = defaultCard;
	}
}
