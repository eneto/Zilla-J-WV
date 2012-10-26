/**
 * PaymentMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class PaymentMethod  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String achAbaCode;

    private java.lang.String achAccountName;

    private java.lang.String achAccountNumber;

    private java.lang.String achAccountNumberMask;

    private java.lang.String achAccountType;

    private java.lang.String achBankName;

    private java.lang.Boolean active;

    private java.lang.String bankIdentificationNumber;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String creditCardAddress1;

    private java.lang.String creditCardAddress2;

    private java.lang.String creditCardCity;

    private java.lang.String creditCardCountry;

    private java.lang.Integer creditCardExpirationMonth;

    private java.lang.Integer creditCardExpirationYear;

    private java.lang.String creditCardHolderName;

    private java.lang.String creditCardMaskNumber;

    private java.lang.String creditCardNumber;

    private java.lang.String creditCardPostalCode;

    private java.lang.String creditCardSecurityCode;

    private java.lang.String creditCardState;

    private java.lang.String creditCardType;

    private java.lang.String deviceSessionId;

    private java.lang.String email;

    private com.zuora.api.object.GatewayOption[] gatewayOptionData;

    private java.lang.String IPAddress;

    private java.util.Calendar lastFailedSaleTransactionDate;

    private java.util.Calendar lastTransactionDateTime;

    private java.lang.String lastTransactionStatus;

    private java.lang.Short maxConsecutivePaymentFailures;

    private java.lang.String name;

    private java.lang.Integer numConsecutiveFailures;

    private java.lang.String paymentMethodStatus;

    private java.lang.Short paymentRetryWindow;

    private java.lang.String paypalBaid;

    private java.lang.String paypalEmail;

    private java.lang.String paypalPreapprovalKey;

    private java.lang.String paypalType;

    private java.lang.String phone;

    private java.lang.Boolean skipValidation;

    private java.lang.Integer totalNumberOfErrorPayments;

    private java.lang.Integer totalNumberOfProcessedPayments;

    private java.lang.String type;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    private java.lang.Boolean useDefaultRetryRule;

    public PaymentMethod() {
    }

    public PaymentMethod(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.lang.String achAbaCode,
           java.lang.String achAccountName,
           java.lang.String achAccountNumber,
           java.lang.String achAccountNumberMask,
           java.lang.String achAccountType,
           java.lang.String achBankName,
           java.lang.Boolean active,
           java.lang.String bankIdentificationNumber,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String creditCardAddress1,
           java.lang.String creditCardAddress2,
           java.lang.String creditCardCity,
           java.lang.String creditCardCountry,
           java.lang.Integer creditCardExpirationMonth,
           java.lang.Integer creditCardExpirationYear,
           java.lang.String creditCardHolderName,
           java.lang.String creditCardMaskNumber,
           java.lang.String creditCardNumber,
           java.lang.String creditCardPostalCode,
           java.lang.String creditCardSecurityCode,
           java.lang.String creditCardState,
           java.lang.String creditCardType,
           java.lang.String deviceSessionId,
           java.lang.String email,
           com.zuora.api.object.GatewayOption[] gatewayOptionData,
           java.lang.String IPAddress,
           java.util.Calendar lastFailedSaleTransactionDate,
           java.util.Calendar lastTransactionDateTime,
           java.lang.String lastTransactionStatus,
           java.lang.Short maxConsecutivePaymentFailures,
           java.lang.String name,
           java.lang.Integer numConsecutiveFailures,
           java.lang.String paymentMethodStatus,
           java.lang.Short paymentRetryWindow,
           java.lang.String paypalBaid,
           java.lang.String paypalEmail,
           java.lang.String paypalPreapprovalKey,
           java.lang.String paypalType,
           java.lang.String phone,
           java.lang.Boolean skipValidation,
           java.lang.Integer totalNumberOfErrorPayments,
           java.lang.Integer totalNumberOfProcessedPayments,
           java.lang.String type,
           java.lang.String updatedById,
           java.util.Calendar updatedDate,
           java.lang.Boolean useDefaultRetryRule) {
        super(
            fieldsToNull,
            id);
        this.accountId = accountId;
        this.achAbaCode = achAbaCode;
        this.achAccountName = achAccountName;
        this.achAccountNumber = achAccountNumber;
        this.achAccountNumberMask = achAccountNumberMask;
        this.achAccountType = achAccountType;
        this.achBankName = achBankName;
        this.active = active;
        this.bankIdentificationNumber = bankIdentificationNumber;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.creditCardAddress1 = creditCardAddress1;
        this.creditCardAddress2 = creditCardAddress2;
        this.creditCardCity = creditCardCity;
        this.creditCardCountry = creditCardCountry;
        this.creditCardExpirationMonth = creditCardExpirationMonth;
        this.creditCardExpirationYear = creditCardExpirationYear;
        this.creditCardHolderName = creditCardHolderName;
        this.creditCardMaskNumber = creditCardMaskNumber;
        this.creditCardNumber = creditCardNumber;
        this.creditCardPostalCode = creditCardPostalCode;
        this.creditCardSecurityCode = creditCardSecurityCode;
        this.creditCardState = creditCardState;
        this.creditCardType = creditCardType;
        this.deviceSessionId = deviceSessionId;
        this.email = email;
        this.gatewayOptionData = gatewayOptionData;
        this.IPAddress = IPAddress;
        this.lastFailedSaleTransactionDate = lastFailedSaleTransactionDate;
        this.lastTransactionDateTime = lastTransactionDateTime;
        this.lastTransactionStatus = lastTransactionStatus;
        this.maxConsecutivePaymentFailures = maxConsecutivePaymentFailures;
        this.name = name;
        this.numConsecutiveFailures = numConsecutiveFailures;
        this.paymentMethodStatus = paymentMethodStatus;
        this.paymentRetryWindow = paymentRetryWindow;
        this.paypalBaid = paypalBaid;
        this.paypalEmail = paypalEmail;
        this.paypalPreapprovalKey = paypalPreapprovalKey;
        this.paypalType = paypalType;
        this.phone = phone;
        this.skipValidation = skipValidation;
        this.totalNumberOfErrorPayments = totalNumberOfErrorPayments;
        this.totalNumberOfProcessedPayments = totalNumberOfProcessedPayments;
        this.type = type;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
        this.useDefaultRetryRule = useDefaultRetryRule;
    }


    /**
     * Gets the accountId value for this PaymentMethod.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PaymentMethod.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the achAbaCode value for this PaymentMethod.
     * 
     * @return achAbaCode
     */
    public java.lang.String getAchAbaCode() {
        return achAbaCode;
    }


    /**
     * Sets the achAbaCode value for this PaymentMethod.
     * 
     * @param achAbaCode
     */
    public void setAchAbaCode(java.lang.String achAbaCode) {
        this.achAbaCode = achAbaCode;
    }


    /**
     * Gets the achAccountName value for this PaymentMethod.
     * 
     * @return achAccountName
     */
    public java.lang.String getAchAccountName() {
        return achAccountName;
    }


    /**
     * Sets the achAccountName value for this PaymentMethod.
     * 
     * @param achAccountName
     */
    public void setAchAccountName(java.lang.String achAccountName) {
        this.achAccountName = achAccountName;
    }


    /**
     * Gets the achAccountNumber value for this PaymentMethod.
     * 
     * @return achAccountNumber
     */
    public java.lang.String getAchAccountNumber() {
        return achAccountNumber;
    }


    /**
     * Sets the achAccountNumber value for this PaymentMethod.
     * 
     * @param achAccountNumber
     */
    public void setAchAccountNumber(java.lang.String achAccountNumber) {
        this.achAccountNumber = achAccountNumber;
    }


    /**
     * Gets the achAccountNumberMask value for this PaymentMethod.
     * 
     * @return achAccountNumberMask
     */
    public java.lang.String getAchAccountNumberMask() {
        return achAccountNumberMask;
    }


    /**
     * Sets the achAccountNumberMask value for this PaymentMethod.
     * 
     * @param achAccountNumberMask
     */
    public void setAchAccountNumberMask(java.lang.String achAccountNumberMask) {
        this.achAccountNumberMask = achAccountNumberMask;
    }


    /**
     * Gets the achAccountType value for this PaymentMethod.
     * 
     * @return achAccountType
     */
    public java.lang.String getAchAccountType() {
        return achAccountType;
    }


    /**
     * Sets the achAccountType value for this PaymentMethod.
     * 
     * @param achAccountType
     */
    public void setAchAccountType(java.lang.String achAccountType) {
        this.achAccountType = achAccountType;
    }


    /**
     * Gets the achBankName value for this PaymentMethod.
     * 
     * @return achBankName
     */
    public java.lang.String getAchBankName() {
        return achBankName;
    }


    /**
     * Sets the achBankName value for this PaymentMethod.
     * 
     * @param achBankName
     */
    public void setAchBankName(java.lang.String achBankName) {
        this.achBankName = achBankName;
    }


    /**
     * Gets the active value for this PaymentMethod.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this PaymentMethod.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the bankIdentificationNumber value for this PaymentMethod.
     * 
     * @return bankIdentificationNumber
     */
    public java.lang.String getBankIdentificationNumber() {
        return bankIdentificationNumber;
    }


    /**
     * Sets the bankIdentificationNumber value for this PaymentMethod.
     * 
     * @param bankIdentificationNumber
     */
    public void setBankIdentificationNumber(java.lang.String bankIdentificationNumber) {
        this.bankIdentificationNumber = bankIdentificationNumber;
    }


    /**
     * Gets the createdById value for this PaymentMethod.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this PaymentMethod.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this PaymentMethod.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this PaymentMethod.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the creditCardAddress1 value for this PaymentMethod.
     * 
     * @return creditCardAddress1
     */
    public java.lang.String getCreditCardAddress1() {
        return creditCardAddress1;
    }


    /**
     * Sets the creditCardAddress1 value for this PaymentMethod.
     * 
     * @param creditCardAddress1
     */
    public void setCreditCardAddress1(java.lang.String creditCardAddress1) {
        this.creditCardAddress1 = creditCardAddress1;
    }


    /**
     * Gets the creditCardAddress2 value for this PaymentMethod.
     * 
     * @return creditCardAddress2
     */
    public java.lang.String getCreditCardAddress2() {
        return creditCardAddress2;
    }


    /**
     * Sets the creditCardAddress2 value for this PaymentMethod.
     * 
     * @param creditCardAddress2
     */
    public void setCreditCardAddress2(java.lang.String creditCardAddress2) {
        this.creditCardAddress2 = creditCardAddress2;
    }


    /**
     * Gets the creditCardCity value for this PaymentMethod.
     * 
     * @return creditCardCity
     */
    public java.lang.String getCreditCardCity() {
        return creditCardCity;
    }


    /**
     * Sets the creditCardCity value for this PaymentMethod.
     * 
     * @param creditCardCity
     */
    public void setCreditCardCity(java.lang.String creditCardCity) {
        this.creditCardCity = creditCardCity;
    }


    /**
     * Gets the creditCardCountry value for this PaymentMethod.
     * 
     * @return creditCardCountry
     */
    public java.lang.String getCreditCardCountry() {
        return creditCardCountry;
    }


    /**
     * Sets the creditCardCountry value for this PaymentMethod.
     * 
     * @param creditCardCountry
     */
    public void setCreditCardCountry(java.lang.String creditCardCountry) {
        this.creditCardCountry = creditCardCountry;
    }


    /**
     * Gets the creditCardExpirationMonth value for this PaymentMethod.
     * 
     * @return creditCardExpirationMonth
     */
    public java.lang.Integer getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }


    /**
     * Sets the creditCardExpirationMonth value for this PaymentMethod.
     * 
     * @param creditCardExpirationMonth
     */
    public void setCreditCardExpirationMonth(java.lang.Integer creditCardExpirationMonth) {
        this.creditCardExpirationMonth = creditCardExpirationMonth;
    }


    /**
     * Gets the creditCardExpirationYear value for this PaymentMethod.
     * 
     * @return creditCardExpirationYear
     */
    public java.lang.Integer getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }


    /**
     * Sets the creditCardExpirationYear value for this PaymentMethod.
     * 
     * @param creditCardExpirationYear
     */
    public void setCreditCardExpirationYear(java.lang.Integer creditCardExpirationYear) {
        this.creditCardExpirationYear = creditCardExpirationYear;
    }


    /**
     * Gets the creditCardHolderName value for this PaymentMethod.
     * 
     * @return creditCardHolderName
     */
    public java.lang.String getCreditCardHolderName() {
        return creditCardHolderName;
    }


    /**
     * Sets the creditCardHolderName value for this PaymentMethod.
     * 
     * @param creditCardHolderName
     */
    public void setCreditCardHolderName(java.lang.String creditCardHolderName) {
        this.creditCardHolderName = creditCardHolderName;
    }


    /**
     * Gets the creditCardMaskNumber value for this PaymentMethod.
     * 
     * @return creditCardMaskNumber
     */
    public java.lang.String getCreditCardMaskNumber() {
        return creditCardMaskNumber;
    }


    /**
     * Sets the creditCardMaskNumber value for this PaymentMethod.
     * 
     * @param creditCardMaskNumber
     */
    public void setCreditCardMaskNumber(java.lang.String creditCardMaskNumber) {
        this.creditCardMaskNumber = creditCardMaskNumber;
    }


    /**
     * Gets the creditCardNumber value for this PaymentMethod.
     * 
     * @return creditCardNumber
     */
    public java.lang.String getCreditCardNumber() {
        return creditCardNumber;
    }


    /**
     * Sets the creditCardNumber value for this PaymentMethod.
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(java.lang.String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    /**
     * Gets the creditCardPostalCode value for this PaymentMethod.
     * 
     * @return creditCardPostalCode
     */
    public java.lang.String getCreditCardPostalCode() {
        return creditCardPostalCode;
    }


    /**
     * Sets the creditCardPostalCode value for this PaymentMethod.
     * 
     * @param creditCardPostalCode
     */
    public void setCreditCardPostalCode(java.lang.String creditCardPostalCode) {
        this.creditCardPostalCode = creditCardPostalCode;
    }


    /**
     * Gets the creditCardSecurityCode value for this PaymentMethod.
     * 
     * @return creditCardSecurityCode
     */
    public java.lang.String getCreditCardSecurityCode() {
        return creditCardSecurityCode;
    }


    /**
     * Sets the creditCardSecurityCode value for this PaymentMethod.
     * 
     * @param creditCardSecurityCode
     */
    public void setCreditCardSecurityCode(java.lang.String creditCardSecurityCode) {
        this.creditCardSecurityCode = creditCardSecurityCode;
    }


    /**
     * Gets the creditCardState value for this PaymentMethod.
     * 
     * @return creditCardState
     */
    public java.lang.String getCreditCardState() {
        return creditCardState;
    }


    /**
     * Sets the creditCardState value for this PaymentMethod.
     * 
     * @param creditCardState
     */
    public void setCreditCardState(java.lang.String creditCardState) {
        this.creditCardState = creditCardState;
    }


    /**
     * Gets the creditCardType value for this PaymentMethod.
     * 
     * @return creditCardType
     */
    public java.lang.String getCreditCardType() {
        return creditCardType;
    }


    /**
     * Sets the creditCardType value for this PaymentMethod.
     * 
     * @param creditCardType
     */
    public void setCreditCardType(java.lang.String creditCardType) {
        this.creditCardType = creditCardType;
    }


    /**
     * Gets the deviceSessionId value for this PaymentMethod.
     * 
     * @return deviceSessionId
     */
    public java.lang.String getDeviceSessionId() {
        return deviceSessionId;
    }


    /**
     * Sets the deviceSessionId value for this PaymentMethod.
     * 
     * @param deviceSessionId
     */
    public void setDeviceSessionId(java.lang.String deviceSessionId) {
        this.deviceSessionId = deviceSessionId;
    }


    /**
     * Gets the email value for this PaymentMethod.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this PaymentMethod.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the gatewayOptionData value for this PaymentMethod.
     * 
     * @return gatewayOptionData
     */
    public com.zuora.api.object.GatewayOption[] getGatewayOptionData() {
        return gatewayOptionData;
    }


    /**
     * Sets the gatewayOptionData value for this PaymentMethod.
     * 
     * @param gatewayOptionData
     */
    public void setGatewayOptionData(com.zuora.api.object.GatewayOption[] gatewayOptionData) {
        this.gatewayOptionData = gatewayOptionData;
    }


    /**
     * Gets the IPAddress value for this PaymentMethod.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this PaymentMethod.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the lastFailedSaleTransactionDate value for this PaymentMethod.
     * 
     * @return lastFailedSaleTransactionDate
     */
    public java.util.Calendar getLastFailedSaleTransactionDate() {
        return lastFailedSaleTransactionDate;
    }


    /**
     * Sets the lastFailedSaleTransactionDate value for this PaymentMethod.
     * 
     * @param lastFailedSaleTransactionDate
     */
    public void setLastFailedSaleTransactionDate(java.util.Calendar lastFailedSaleTransactionDate) {
        this.lastFailedSaleTransactionDate = lastFailedSaleTransactionDate;
    }


    /**
     * Gets the lastTransactionDateTime value for this PaymentMethod.
     * 
     * @return lastTransactionDateTime
     */
    public java.util.Calendar getLastTransactionDateTime() {
        return lastTransactionDateTime;
    }


    /**
     * Sets the lastTransactionDateTime value for this PaymentMethod.
     * 
     * @param lastTransactionDateTime
     */
    public void setLastTransactionDateTime(java.util.Calendar lastTransactionDateTime) {
        this.lastTransactionDateTime = lastTransactionDateTime;
    }


    /**
     * Gets the lastTransactionStatus value for this PaymentMethod.
     * 
     * @return lastTransactionStatus
     */
    public java.lang.String getLastTransactionStatus() {
        return lastTransactionStatus;
    }


    /**
     * Sets the lastTransactionStatus value for this PaymentMethod.
     * 
     * @param lastTransactionStatus
     */
    public void setLastTransactionStatus(java.lang.String lastTransactionStatus) {
        this.lastTransactionStatus = lastTransactionStatus;
    }


    /**
     * Gets the maxConsecutivePaymentFailures value for this PaymentMethod.
     * 
     * @return maxConsecutivePaymentFailures
     */
    public java.lang.Short getMaxConsecutivePaymentFailures() {
        return maxConsecutivePaymentFailures;
    }


    /**
     * Sets the maxConsecutivePaymentFailures value for this PaymentMethod.
     * 
     * @param maxConsecutivePaymentFailures
     */
    public void setMaxConsecutivePaymentFailures(java.lang.Short maxConsecutivePaymentFailures) {
        this.maxConsecutivePaymentFailures = maxConsecutivePaymentFailures;
    }


    /**
     * Gets the name value for this PaymentMethod.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PaymentMethod.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numConsecutiveFailures value for this PaymentMethod.
     * 
     * @return numConsecutiveFailures
     */
    public java.lang.Integer getNumConsecutiveFailures() {
        return numConsecutiveFailures;
    }


    /**
     * Sets the numConsecutiveFailures value for this PaymentMethod.
     * 
     * @param numConsecutiveFailures
     */
    public void setNumConsecutiveFailures(java.lang.Integer numConsecutiveFailures) {
        this.numConsecutiveFailures = numConsecutiveFailures;
    }


    /**
     * Gets the paymentMethodStatus value for this PaymentMethod.
     * 
     * @return paymentMethodStatus
     */
    public java.lang.String getPaymentMethodStatus() {
        return paymentMethodStatus;
    }


    /**
     * Sets the paymentMethodStatus value for this PaymentMethod.
     * 
     * @param paymentMethodStatus
     */
    public void setPaymentMethodStatus(java.lang.String paymentMethodStatus) {
        this.paymentMethodStatus = paymentMethodStatus;
    }


    /**
     * Gets the paymentRetryWindow value for this PaymentMethod.
     * 
     * @return paymentRetryWindow
     */
    public java.lang.Short getPaymentRetryWindow() {
        return paymentRetryWindow;
    }


    /**
     * Sets the paymentRetryWindow value for this PaymentMethod.
     * 
     * @param paymentRetryWindow
     */
    public void setPaymentRetryWindow(java.lang.Short paymentRetryWindow) {
        this.paymentRetryWindow = paymentRetryWindow;
    }


    /**
     * Gets the paypalBaid value for this PaymentMethod.
     * 
     * @return paypalBaid
     */
    public java.lang.String getPaypalBaid() {
        return paypalBaid;
    }


    /**
     * Sets the paypalBaid value for this PaymentMethod.
     * 
     * @param paypalBaid
     */
    public void setPaypalBaid(java.lang.String paypalBaid) {
        this.paypalBaid = paypalBaid;
    }


    /**
     * Gets the paypalEmail value for this PaymentMethod.
     * 
     * @return paypalEmail
     */
    public java.lang.String getPaypalEmail() {
        return paypalEmail;
    }


    /**
     * Sets the paypalEmail value for this PaymentMethod.
     * 
     * @param paypalEmail
     */
    public void setPaypalEmail(java.lang.String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }


    /**
     * Gets the paypalPreapprovalKey value for this PaymentMethod.
     * 
     * @return paypalPreapprovalKey
     */
    public java.lang.String getPaypalPreapprovalKey() {
        return paypalPreapprovalKey;
    }


    /**
     * Sets the paypalPreapprovalKey value for this PaymentMethod.
     * 
     * @param paypalPreapprovalKey
     */
    public void setPaypalPreapprovalKey(java.lang.String paypalPreapprovalKey) {
        this.paypalPreapprovalKey = paypalPreapprovalKey;
    }


    /**
     * Gets the paypalType value for this PaymentMethod.
     * 
     * @return paypalType
     */
    public java.lang.String getPaypalType() {
        return paypalType;
    }


    /**
     * Sets the paypalType value for this PaymentMethod.
     * 
     * @param paypalType
     */
    public void setPaypalType(java.lang.String paypalType) {
        this.paypalType = paypalType;
    }


    /**
     * Gets the phone value for this PaymentMethod.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PaymentMethod.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the skipValidation value for this PaymentMethod.
     * 
     * @return skipValidation
     */
    public java.lang.Boolean getSkipValidation() {
        return skipValidation;
    }


    /**
     * Sets the skipValidation value for this PaymentMethod.
     * 
     * @param skipValidation
     */
    public void setSkipValidation(java.lang.Boolean skipValidation) {
        this.skipValidation = skipValidation;
    }


    /**
     * Gets the totalNumberOfErrorPayments value for this PaymentMethod.
     * 
     * @return totalNumberOfErrorPayments
     */
    public java.lang.Integer getTotalNumberOfErrorPayments() {
        return totalNumberOfErrorPayments;
    }


    /**
     * Sets the totalNumberOfErrorPayments value for this PaymentMethod.
     * 
     * @param totalNumberOfErrorPayments
     */
    public void setTotalNumberOfErrorPayments(java.lang.Integer totalNumberOfErrorPayments) {
        this.totalNumberOfErrorPayments = totalNumberOfErrorPayments;
    }


    /**
     * Gets the totalNumberOfProcessedPayments value for this PaymentMethod.
     * 
     * @return totalNumberOfProcessedPayments
     */
    public java.lang.Integer getTotalNumberOfProcessedPayments() {
        return totalNumberOfProcessedPayments;
    }


    /**
     * Sets the totalNumberOfProcessedPayments value for this PaymentMethod.
     * 
     * @param totalNumberOfProcessedPayments
     */
    public void setTotalNumberOfProcessedPayments(java.lang.Integer totalNumberOfProcessedPayments) {
        this.totalNumberOfProcessedPayments = totalNumberOfProcessedPayments;
    }


    /**
     * Gets the type value for this PaymentMethod.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this PaymentMethod.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the updatedById value for this PaymentMethod.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this PaymentMethod.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this PaymentMethod.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this PaymentMethod.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the useDefaultRetryRule value for this PaymentMethod.
     * 
     * @return useDefaultRetryRule
     */
    public java.lang.Boolean getUseDefaultRetryRule() {
        return useDefaultRetryRule;
    }


    /**
     * Sets the useDefaultRetryRule value for this PaymentMethod.
     * 
     * @param useDefaultRetryRule
     */
    public void setUseDefaultRetryRule(java.lang.Boolean useDefaultRetryRule) {
        this.useDefaultRetryRule = useDefaultRetryRule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMethod)) return false;
        PaymentMethod other = (PaymentMethod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.achAbaCode==null && other.getAchAbaCode()==null) || 
             (this.achAbaCode!=null &&
              this.achAbaCode.equals(other.getAchAbaCode()))) &&
            ((this.achAccountName==null && other.getAchAccountName()==null) || 
             (this.achAccountName!=null &&
              this.achAccountName.equals(other.getAchAccountName()))) &&
            ((this.achAccountNumber==null && other.getAchAccountNumber()==null) || 
             (this.achAccountNumber!=null &&
              this.achAccountNumber.equals(other.getAchAccountNumber()))) &&
            ((this.achAccountNumberMask==null && other.getAchAccountNumberMask()==null) || 
             (this.achAccountNumberMask!=null &&
              this.achAccountNumberMask.equals(other.getAchAccountNumberMask()))) &&
            ((this.achAccountType==null && other.getAchAccountType()==null) || 
             (this.achAccountType!=null &&
              this.achAccountType.equals(other.getAchAccountType()))) &&
            ((this.achBankName==null && other.getAchBankName()==null) || 
             (this.achBankName!=null &&
              this.achBankName.equals(other.getAchBankName()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.bankIdentificationNumber==null && other.getBankIdentificationNumber()==null) || 
             (this.bankIdentificationNumber!=null &&
              this.bankIdentificationNumber.equals(other.getBankIdentificationNumber()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.creditCardAddress1==null && other.getCreditCardAddress1()==null) || 
             (this.creditCardAddress1!=null &&
              this.creditCardAddress1.equals(other.getCreditCardAddress1()))) &&
            ((this.creditCardAddress2==null && other.getCreditCardAddress2()==null) || 
             (this.creditCardAddress2!=null &&
              this.creditCardAddress2.equals(other.getCreditCardAddress2()))) &&
            ((this.creditCardCity==null && other.getCreditCardCity()==null) || 
             (this.creditCardCity!=null &&
              this.creditCardCity.equals(other.getCreditCardCity()))) &&
            ((this.creditCardCountry==null && other.getCreditCardCountry()==null) || 
             (this.creditCardCountry!=null &&
              this.creditCardCountry.equals(other.getCreditCardCountry()))) &&
            ((this.creditCardExpirationMonth==null && other.getCreditCardExpirationMonth()==null) || 
             (this.creditCardExpirationMonth!=null &&
              this.creditCardExpirationMonth.equals(other.getCreditCardExpirationMonth()))) &&
            ((this.creditCardExpirationYear==null && other.getCreditCardExpirationYear()==null) || 
             (this.creditCardExpirationYear!=null &&
              this.creditCardExpirationYear.equals(other.getCreditCardExpirationYear()))) &&
            ((this.creditCardHolderName==null && other.getCreditCardHolderName()==null) || 
             (this.creditCardHolderName!=null &&
              this.creditCardHolderName.equals(other.getCreditCardHolderName()))) &&
            ((this.creditCardMaskNumber==null && other.getCreditCardMaskNumber()==null) || 
             (this.creditCardMaskNumber!=null &&
              this.creditCardMaskNumber.equals(other.getCreditCardMaskNumber()))) &&
            ((this.creditCardNumber==null && other.getCreditCardNumber()==null) || 
             (this.creditCardNumber!=null &&
              this.creditCardNumber.equals(other.getCreditCardNumber()))) &&
            ((this.creditCardPostalCode==null && other.getCreditCardPostalCode()==null) || 
             (this.creditCardPostalCode!=null &&
              this.creditCardPostalCode.equals(other.getCreditCardPostalCode()))) &&
            ((this.creditCardSecurityCode==null && other.getCreditCardSecurityCode()==null) || 
             (this.creditCardSecurityCode!=null &&
              this.creditCardSecurityCode.equals(other.getCreditCardSecurityCode()))) &&
            ((this.creditCardState==null && other.getCreditCardState()==null) || 
             (this.creditCardState!=null &&
              this.creditCardState.equals(other.getCreditCardState()))) &&
            ((this.creditCardType==null && other.getCreditCardType()==null) || 
             (this.creditCardType!=null &&
              this.creditCardType.equals(other.getCreditCardType()))) &&
            ((this.deviceSessionId==null && other.getDeviceSessionId()==null) || 
             (this.deviceSessionId!=null &&
              this.deviceSessionId.equals(other.getDeviceSessionId()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.gatewayOptionData==null && other.getGatewayOptionData()==null) || 
             (this.gatewayOptionData!=null &&
              java.util.Arrays.equals(this.gatewayOptionData, other.getGatewayOptionData()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress()))) &&
            ((this.lastFailedSaleTransactionDate==null && other.getLastFailedSaleTransactionDate()==null) || 
             (this.lastFailedSaleTransactionDate!=null &&
              this.lastFailedSaleTransactionDate.equals(other.getLastFailedSaleTransactionDate()))) &&
            ((this.lastTransactionDateTime==null && other.getLastTransactionDateTime()==null) || 
             (this.lastTransactionDateTime!=null &&
              this.lastTransactionDateTime.equals(other.getLastTransactionDateTime()))) &&
            ((this.lastTransactionStatus==null && other.getLastTransactionStatus()==null) || 
             (this.lastTransactionStatus!=null &&
              this.lastTransactionStatus.equals(other.getLastTransactionStatus()))) &&
            ((this.maxConsecutivePaymentFailures==null && other.getMaxConsecutivePaymentFailures()==null) || 
             (this.maxConsecutivePaymentFailures!=null &&
              this.maxConsecutivePaymentFailures.equals(other.getMaxConsecutivePaymentFailures()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.numConsecutiveFailures==null && other.getNumConsecutiveFailures()==null) || 
             (this.numConsecutiveFailures!=null &&
              this.numConsecutiveFailures.equals(other.getNumConsecutiveFailures()))) &&
            ((this.paymentMethodStatus==null && other.getPaymentMethodStatus()==null) || 
             (this.paymentMethodStatus!=null &&
              this.paymentMethodStatus.equals(other.getPaymentMethodStatus()))) &&
            ((this.paymentRetryWindow==null && other.getPaymentRetryWindow()==null) || 
             (this.paymentRetryWindow!=null &&
              this.paymentRetryWindow.equals(other.getPaymentRetryWindow()))) &&
            ((this.paypalBaid==null && other.getPaypalBaid()==null) || 
             (this.paypalBaid!=null &&
              this.paypalBaid.equals(other.getPaypalBaid()))) &&
            ((this.paypalEmail==null && other.getPaypalEmail()==null) || 
             (this.paypalEmail!=null &&
              this.paypalEmail.equals(other.getPaypalEmail()))) &&
            ((this.paypalPreapprovalKey==null && other.getPaypalPreapprovalKey()==null) || 
             (this.paypalPreapprovalKey!=null &&
              this.paypalPreapprovalKey.equals(other.getPaypalPreapprovalKey()))) &&
            ((this.paypalType==null && other.getPaypalType()==null) || 
             (this.paypalType!=null &&
              this.paypalType.equals(other.getPaypalType()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.skipValidation==null && other.getSkipValidation()==null) || 
             (this.skipValidation!=null &&
              this.skipValidation.equals(other.getSkipValidation()))) &&
            ((this.totalNumberOfErrorPayments==null && other.getTotalNumberOfErrorPayments()==null) || 
             (this.totalNumberOfErrorPayments!=null &&
              this.totalNumberOfErrorPayments.equals(other.getTotalNumberOfErrorPayments()))) &&
            ((this.totalNumberOfProcessedPayments==null && other.getTotalNumberOfProcessedPayments()==null) || 
             (this.totalNumberOfProcessedPayments!=null &&
              this.totalNumberOfProcessedPayments.equals(other.getTotalNumberOfProcessedPayments()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.updatedById==null && other.getUpdatedById()==null) || 
             (this.updatedById!=null &&
              this.updatedById.equals(other.getUpdatedById()))) &&
            ((this.updatedDate==null && other.getUpdatedDate()==null) || 
             (this.updatedDate!=null &&
              this.updatedDate.equals(other.getUpdatedDate()))) &&
            ((this.useDefaultRetryRule==null && other.getUseDefaultRetryRule()==null) || 
             (this.useDefaultRetryRule!=null &&
              this.useDefaultRetryRule.equals(other.getUseDefaultRetryRule())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAchAbaCode() != null) {
            _hashCode += getAchAbaCode().hashCode();
        }
        if (getAchAccountName() != null) {
            _hashCode += getAchAccountName().hashCode();
        }
        if (getAchAccountNumber() != null) {
            _hashCode += getAchAccountNumber().hashCode();
        }
        if (getAchAccountNumberMask() != null) {
            _hashCode += getAchAccountNumberMask().hashCode();
        }
        if (getAchAccountType() != null) {
            _hashCode += getAchAccountType().hashCode();
        }
        if (getAchBankName() != null) {
            _hashCode += getAchBankName().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getBankIdentificationNumber() != null) {
            _hashCode += getBankIdentificationNumber().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCreditCardAddress1() != null) {
            _hashCode += getCreditCardAddress1().hashCode();
        }
        if (getCreditCardAddress2() != null) {
            _hashCode += getCreditCardAddress2().hashCode();
        }
        if (getCreditCardCity() != null) {
            _hashCode += getCreditCardCity().hashCode();
        }
        if (getCreditCardCountry() != null) {
            _hashCode += getCreditCardCountry().hashCode();
        }
        if (getCreditCardExpirationMonth() != null) {
            _hashCode += getCreditCardExpirationMonth().hashCode();
        }
        if (getCreditCardExpirationYear() != null) {
            _hashCode += getCreditCardExpirationYear().hashCode();
        }
        if (getCreditCardHolderName() != null) {
            _hashCode += getCreditCardHolderName().hashCode();
        }
        if (getCreditCardMaskNumber() != null) {
            _hashCode += getCreditCardMaskNumber().hashCode();
        }
        if (getCreditCardNumber() != null) {
            _hashCode += getCreditCardNumber().hashCode();
        }
        if (getCreditCardPostalCode() != null) {
            _hashCode += getCreditCardPostalCode().hashCode();
        }
        if (getCreditCardSecurityCode() != null) {
            _hashCode += getCreditCardSecurityCode().hashCode();
        }
        if (getCreditCardState() != null) {
            _hashCode += getCreditCardState().hashCode();
        }
        if (getCreditCardType() != null) {
            _hashCode += getCreditCardType().hashCode();
        }
        if (getDeviceSessionId() != null) {
            _hashCode += getDeviceSessionId().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getGatewayOptionData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGatewayOptionData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGatewayOptionData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        if (getLastFailedSaleTransactionDate() != null) {
            _hashCode += getLastFailedSaleTransactionDate().hashCode();
        }
        if (getLastTransactionDateTime() != null) {
            _hashCode += getLastTransactionDateTime().hashCode();
        }
        if (getLastTransactionStatus() != null) {
            _hashCode += getLastTransactionStatus().hashCode();
        }
        if (getMaxConsecutivePaymentFailures() != null) {
            _hashCode += getMaxConsecutivePaymentFailures().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumConsecutiveFailures() != null) {
            _hashCode += getNumConsecutiveFailures().hashCode();
        }
        if (getPaymentMethodStatus() != null) {
            _hashCode += getPaymentMethodStatus().hashCode();
        }
        if (getPaymentRetryWindow() != null) {
            _hashCode += getPaymentRetryWindow().hashCode();
        }
        if (getPaypalBaid() != null) {
            _hashCode += getPaypalBaid().hashCode();
        }
        if (getPaypalEmail() != null) {
            _hashCode += getPaypalEmail().hashCode();
        }
        if (getPaypalPreapprovalKey() != null) {
            _hashCode += getPaypalPreapprovalKey().hashCode();
        }
        if (getPaypalType() != null) {
            _hashCode += getPaypalType().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getSkipValidation() != null) {
            _hashCode += getSkipValidation().hashCode();
        }
        if (getTotalNumberOfErrorPayments() != null) {
            _hashCode += getTotalNumberOfErrorPayments().hashCode();
        }
        if (getTotalNumberOfProcessedPayments() != null) {
            _hashCode += getTotalNumberOfProcessedPayments().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUpdatedById() != null) {
            _hashCode += getUpdatedById().hashCode();
        }
        if (getUpdatedDate() != null) {
            _hashCode += getUpdatedDate().hashCode();
        }
        if (getUseDefaultRetryRule() != null) {
            _hashCode += getUseDefaultRetryRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achAbaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchAbaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achAccountNumberMask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchAccountNumberMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achBankName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AchBankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankIdentificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BankIdentificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardExpirationMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardExpirationMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardExpirationYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardExpirationYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardHolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardHolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardMaskNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardMaskNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardSecurityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardSecurityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditCardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DeviceSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayOptionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayOptionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.zuora.com/", "GatewayOption"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFailedSaleTransactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "LastFailedSaleTransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransactionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "LastTransactionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "LastTransactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxConsecutivePaymentFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MaxConsecutivePaymentFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numConsecutiveFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "NumConsecutiveFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethodStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRetryWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentRetryWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalBaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaypalBaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaypalEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalPreapprovalKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaypalPreapprovalKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaypalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipValidation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SkipValidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfErrorPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TotalNumberOfErrorPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfProcessedPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TotalNumberOfProcessedPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedById");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UpdatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UpdatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDefaultRetryRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UseDefaultRetryRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
