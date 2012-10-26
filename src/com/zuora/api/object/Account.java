/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class Account  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String additionalEmailAddresses;

    private java.lang.Boolean allowInvoiceEdit;

    private java.lang.Boolean autoPay;

    private java.math.BigDecimal balance;

    private java.lang.String batch;

    private java.lang.String bcdSettingOption;

    private java.lang.Integer billCycleDay;

    private java.lang.String billToId;

    private java.lang.String communicationProfileId;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.math.BigDecimal creditBalance;

    private java.lang.String crmId;

    private java.lang.String currency;

    private java.lang.String customerServiceRepName;

    private java.lang.String defaultPaymentMethodId;

    private java.lang.Boolean invoiceDeliveryPrefsEmail;

    private java.lang.Boolean invoiceDeliveryPrefsPrint;

    private java.lang.String invoiceTemplateId;

    private java.util.Calendar lastInvoiceDate;

    private java.lang.String name;

    private java.lang.String notes;

    private java.lang.String paymentGateway;

    private java.lang.String paymentTerm;

    private java.lang.String purchaseOrderNumber;

    private java.lang.String salesRepName;

    private java.lang.String soldToId;

    private java.lang.String status;

    private java.lang.String taxExemptCertificateID;

    private java.lang.String taxExemptCertificateType;

    private java.lang.String taxExemptDescription;

    private java.util.Calendar taxExemptEffectiveDate;

    private java.util.Calendar taxExemptExpirationDate;

    private java.lang.String taxExemptIssuingJurisdiction;

    private java.lang.String taxExemptStatus;

    private java.math.BigDecimal totalInvoiceBalance;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public Account() {
    }

    public Account(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountNumber,
           java.lang.String additionalEmailAddresses,
           java.lang.Boolean allowInvoiceEdit,
           java.lang.Boolean autoPay,
           java.math.BigDecimal balance,
           java.lang.String batch,
           java.lang.String bcdSettingOption,
           java.lang.Integer billCycleDay,
           java.lang.String billToId,
           java.lang.String communicationProfileId,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.math.BigDecimal creditBalance,
           java.lang.String crmId,
           java.lang.String currency,
           java.lang.String customerServiceRepName,
           java.lang.String defaultPaymentMethodId,
           java.lang.Boolean invoiceDeliveryPrefsEmail,
           java.lang.Boolean invoiceDeliveryPrefsPrint,
           java.lang.String invoiceTemplateId,
           java.util.Calendar lastInvoiceDate,
           java.lang.String name,
           java.lang.String notes,
           java.lang.String paymentGateway,
           java.lang.String paymentTerm,
           java.lang.String purchaseOrderNumber,
           java.lang.String salesRepName,
           java.lang.String soldToId,
           java.lang.String status,
           java.lang.String taxExemptCertificateID,
           java.lang.String taxExemptCertificateType,
           java.lang.String taxExemptDescription,
           java.util.Calendar taxExemptEffectiveDate,
           java.util.Calendar taxExemptExpirationDate,
           java.lang.String taxExemptIssuingJurisdiction,
           java.lang.String taxExemptStatus,
           java.math.BigDecimal totalInvoiceBalance,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.accountNumber = accountNumber;
        this.additionalEmailAddresses = additionalEmailAddresses;
        this.allowInvoiceEdit = allowInvoiceEdit;
        this.autoPay = autoPay;
        this.balance = balance;
        this.batch = batch;
        this.bcdSettingOption = bcdSettingOption;
        this.billCycleDay = billCycleDay;
        this.billToId = billToId;
        this.communicationProfileId = communicationProfileId;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.creditBalance = creditBalance;
        this.crmId = crmId;
        this.currency = currency;
        this.customerServiceRepName = customerServiceRepName;
        this.defaultPaymentMethodId = defaultPaymentMethodId;
        this.invoiceDeliveryPrefsEmail = invoiceDeliveryPrefsEmail;
        this.invoiceDeliveryPrefsPrint = invoiceDeliveryPrefsPrint;
        this.invoiceTemplateId = invoiceTemplateId;
        this.lastInvoiceDate = lastInvoiceDate;
        this.name = name;
        this.notes = notes;
        this.paymentGateway = paymentGateway;
        this.paymentTerm = paymentTerm;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.salesRepName = salesRepName;
        this.soldToId = soldToId;
        this.status = status;
        this.taxExemptCertificateID = taxExemptCertificateID;
        this.taxExemptCertificateType = taxExemptCertificateType;
        this.taxExemptDescription = taxExemptDescription;
        this.taxExemptEffectiveDate = taxExemptEffectiveDate;
        this.taxExemptExpirationDate = taxExemptExpirationDate;
        this.taxExemptIssuingJurisdiction = taxExemptIssuingJurisdiction;
        this.taxExemptStatus = taxExemptStatus;
        this.totalInvoiceBalance = totalInvoiceBalance;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the accountNumber value for this Account.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Account.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the additionalEmailAddresses value for this Account.
     * 
     * @return additionalEmailAddresses
     */
    public java.lang.String getAdditionalEmailAddresses() {
        return additionalEmailAddresses;
    }


    /**
     * Sets the additionalEmailAddresses value for this Account.
     * 
     * @param additionalEmailAddresses
     */
    public void setAdditionalEmailAddresses(java.lang.String additionalEmailAddresses) {
        this.additionalEmailAddresses = additionalEmailAddresses;
    }


    /**
     * Gets the allowInvoiceEdit value for this Account.
     * 
     * @return allowInvoiceEdit
     */
    public java.lang.Boolean getAllowInvoiceEdit() {
        return allowInvoiceEdit;
    }


    /**
     * Sets the allowInvoiceEdit value for this Account.
     * 
     * @param allowInvoiceEdit
     */
    public void setAllowInvoiceEdit(java.lang.Boolean allowInvoiceEdit) {
        this.allowInvoiceEdit = allowInvoiceEdit;
    }


    /**
     * Gets the autoPay value for this Account.
     * 
     * @return autoPay
     */
    public java.lang.Boolean getAutoPay() {
        return autoPay;
    }


    /**
     * Sets the autoPay value for this Account.
     * 
     * @param autoPay
     */
    public void setAutoPay(java.lang.Boolean autoPay) {
        this.autoPay = autoPay;
    }


    /**
     * Gets the balance value for this Account.
     * 
     * @return balance
     */
    public java.math.BigDecimal getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Account.
     * 
     * @param balance
     */
    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }


    /**
     * Gets the batch value for this Account.
     * 
     * @return batch
     */
    public java.lang.String getBatch() {
        return batch;
    }


    /**
     * Sets the batch value for this Account.
     * 
     * @param batch
     */
    public void setBatch(java.lang.String batch) {
        this.batch = batch;
    }


    /**
     * Gets the bcdSettingOption value for this Account.
     * 
     * @return bcdSettingOption
     */
    public java.lang.String getBcdSettingOption() {
        return bcdSettingOption;
    }


    /**
     * Sets the bcdSettingOption value for this Account.
     * 
     * @param bcdSettingOption
     */
    public void setBcdSettingOption(java.lang.String bcdSettingOption) {
        this.bcdSettingOption = bcdSettingOption;
    }


    /**
     * Gets the billCycleDay value for this Account.
     * 
     * @return billCycleDay
     */
    public java.lang.Integer getBillCycleDay() {
        return billCycleDay;
    }


    /**
     * Sets the billCycleDay value for this Account.
     * 
     * @param billCycleDay
     */
    public void setBillCycleDay(java.lang.Integer billCycleDay) {
        this.billCycleDay = billCycleDay;
    }


    /**
     * Gets the billToId value for this Account.
     * 
     * @return billToId
     */
    public java.lang.String getBillToId() {
        return billToId;
    }


    /**
     * Sets the billToId value for this Account.
     * 
     * @param billToId
     */
    public void setBillToId(java.lang.String billToId) {
        this.billToId = billToId;
    }


    /**
     * Gets the communicationProfileId value for this Account.
     * 
     * @return communicationProfileId
     */
    public java.lang.String getCommunicationProfileId() {
        return communicationProfileId;
    }


    /**
     * Sets the communicationProfileId value for this Account.
     * 
     * @param communicationProfileId
     */
    public void setCommunicationProfileId(java.lang.String communicationProfileId) {
        this.communicationProfileId = communicationProfileId;
    }


    /**
     * Gets the createdById value for this Account.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Account.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Account.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Account.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the creditBalance value for this Account.
     * 
     * @return creditBalance
     */
    public java.math.BigDecimal getCreditBalance() {
        return creditBalance;
    }


    /**
     * Sets the creditBalance value for this Account.
     * 
     * @param creditBalance
     */
    public void setCreditBalance(java.math.BigDecimal creditBalance) {
        this.creditBalance = creditBalance;
    }


    /**
     * Gets the crmId value for this Account.
     * 
     * @return crmId
     */
    public java.lang.String getCrmId() {
        return crmId;
    }


    /**
     * Sets the crmId value for this Account.
     * 
     * @param crmId
     */
    public void setCrmId(java.lang.String crmId) {
        this.crmId = crmId;
    }


    /**
     * Gets the currency value for this Account.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Account.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the customerServiceRepName value for this Account.
     * 
     * @return customerServiceRepName
     */
    public java.lang.String getCustomerServiceRepName() {
        return customerServiceRepName;
    }


    /**
     * Sets the customerServiceRepName value for this Account.
     * 
     * @param customerServiceRepName
     */
    public void setCustomerServiceRepName(java.lang.String customerServiceRepName) {
        this.customerServiceRepName = customerServiceRepName;
    }


    /**
     * Gets the defaultPaymentMethodId value for this Account.
     * 
     * @return defaultPaymentMethodId
     */
    public java.lang.String getDefaultPaymentMethodId() {
        return defaultPaymentMethodId;
    }


    /**
     * Sets the defaultPaymentMethodId value for this Account.
     * 
     * @param defaultPaymentMethodId
     */
    public void setDefaultPaymentMethodId(java.lang.String defaultPaymentMethodId) {
        this.defaultPaymentMethodId = defaultPaymentMethodId;
    }


    /**
     * Gets the invoiceDeliveryPrefsEmail value for this Account.
     * 
     * @return invoiceDeliveryPrefsEmail
     */
    public java.lang.Boolean getInvoiceDeliveryPrefsEmail() {
        return invoiceDeliveryPrefsEmail;
    }


    /**
     * Sets the invoiceDeliveryPrefsEmail value for this Account.
     * 
     * @param invoiceDeliveryPrefsEmail
     */
    public void setInvoiceDeliveryPrefsEmail(java.lang.Boolean invoiceDeliveryPrefsEmail) {
        this.invoiceDeliveryPrefsEmail = invoiceDeliveryPrefsEmail;
    }


    /**
     * Gets the invoiceDeliveryPrefsPrint value for this Account.
     * 
     * @return invoiceDeliveryPrefsPrint
     */
    public java.lang.Boolean getInvoiceDeliveryPrefsPrint() {
        return invoiceDeliveryPrefsPrint;
    }


    /**
     * Sets the invoiceDeliveryPrefsPrint value for this Account.
     * 
     * @param invoiceDeliveryPrefsPrint
     */
    public void setInvoiceDeliveryPrefsPrint(java.lang.Boolean invoiceDeliveryPrefsPrint) {
        this.invoiceDeliveryPrefsPrint = invoiceDeliveryPrefsPrint;
    }


    /**
     * Gets the invoiceTemplateId value for this Account.
     * 
     * @return invoiceTemplateId
     */
    public java.lang.String getInvoiceTemplateId() {
        return invoiceTemplateId;
    }


    /**
     * Sets the invoiceTemplateId value for this Account.
     * 
     * @param invoiceTemplateId
     */
    public void setInvoiceTemplateId(java.lang.String invoiceTemplateId) {
        this.invoiceTemplateId = invoiceTemplateId;
    }


    /**
     * Gets the lastInvoiceDate value for this Account.
     * 
     * @return lastInvoiceDate
     */
    public java.util.Calendar getLastInvoiceDate() {
        return lastInvoiceDate;
    }


    /**
     * Sets the lastInvoiceDate value for this Account.
     * 
     * @param lastInvoiceDate
     */
    public void setLastInvoiceDate(java.util.Calendar lastInvoiceDate) {
        this.lastInvoiceDate = lastInvoiceDate;
    }


    /**
     * Gets the name value for this Account.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Account.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Account.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Account.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the paymentGateway value for this Account.
     * 
     * @return paymentGateway
     */
    public java.lang.String getPaymentGateway() {
        return paymentGateway;
    }


    /**
     * Sets the paymentGateway value for this Account.
     * 
     * @param paymentGateway
     */
    public void setPaymentGateway(java.lang.String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }


    /**
     * Gets the paymentTerm value for this Account.
     * 
     * @return paymentTerm
     */
    public java.lang.String getPaymentTerm() {
        return paymentTerm;
    }


    /**
     * Sets the paymentTerm value for this Account.
     * 
     * @param paymentTerm
     */
    public void setPaymentTerm(java.lang.String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }


    /**
     * Gets the purchaseOrderNumber value for this Account.
     * 
     * @return purchaseOrderNumber
     */
    public java.lang.String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this Account.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(java.lang.String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the salesRepName value for this Account.
     * 
     * @return salesRepName
     */
    public java.lang.String getSalesRepName() {
        return salesRepName;
    }


    /**
     * Sets the salesRepName value for this Account.
     * 
     * @param salesRepName
     */
    public void setSalesRepName(java.lang.String salesRepName) {
        this.salesRepName = salesRepName;
    }


    /**
     * Gets the soldToId value for this Account.
     * 
     * @return soldToId
     */
    public java.lang.String getSoldToId() {
        return soldToId;
    }


    /**
     * Sets the soldToId value for this Account.
     * 
     * @param soldToId
     */
    public void setSoldToId(java.lang.String soldToId) {
        this.soldToId = soldToId;
    }


    /**
     * Gets the status value for this Account.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Account.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the taxExemptCertificateID value for this Account.
     * 
     * @return taxExemptCertificateID
     */
    public java.lang.String getTaxExemptCertificateID() {
        return taxExemptCertificateID;
    }


    /**
     * Sets the taxExemptCertificateID value for this Account.
     * 
     * @param taxExemptCertificateID
     */
    public void setTaxExemptCertificateID(java.lang.String taxExemptCertificateID) {
        this.taxExemptCertificateID = taxExemptCertificateID;
    }


    /**
     * Gets the taxExemptCertificateType value for this Account.
     * 
     * @return taxExemptCertificateType
     */
    public java.lang.String getTaxExemptCertificateType() {
        return taxExemptCertificateType;
    }


    /**
     * Sets the taxExemptCertificateType value for this Account.
     * 
     * @param taxExemptCertificateType
     */
    public void setTaxExemptCertificateType(java.lang.String taxExemptCertificateType) {
        this.taxExemptCertificateType = taxExemptCertificateType;
    }


    /**
     * Gets the taxExemptDescription value for this Account.
     * 
     * @return taxExemptDescription
     */
    public java.lang.String getTaxExemptDescription() {
        return taxExemptDescription;
    }


    /**
     * Sets the taxExemptDescription value for this Account.
     * 
     * @param taxExemptDescription
     */
    public void setTaxExemptDescription(java.lang.String taxExemptDescription) {
        this.taxExemptDescription = taxExemptDescription;
    }


    /**
     * Gets the taxExemptEffectiveDate value for this Account.
     * 
     * @return taxExemptEffectiveDate
     */
    public java.util.Calendar getTaxExemptEffectiveDate() {
        return taxExemptEffectiveDate;
    }


    /**
     * Sets the taxExemptEffectiveDate value for this Account.
     * 
     * @param taxExemptEffectiveDate
     */
    public void setTaxExemptEffectiveDate(java.util.Calendar taxExemptEffectiveDate) {
        this.taxExemptEffectiveDate = taxExemptEffectiveDate;
    }


    /**
     * Gets the taxExemptExpirationDate value for this Account.
     * 
     * @return taxExemptExpirationDate
     */
    public java.util.Calendar getTaxExemptExpirationDate() {
        return taxExemptExpirationDate;
    }


    /**
     * Sets the taxExemptExpirationDate value for this Account.
     * 
     * @param taxExemptExpirationDate
     */
    public void setTaxExemptExpirationDate(java.util.Calendar taxExemptExpirationDate) {
        this.taxExemptExpirationDate = taxExemptExpirationDate;
    }


    /**
     * Gets the taxExemptIssuingJurisdiction value for this Account.
     * 
     * @return taxExemptIssuingJurisdiction
     */
    public java.lang.String getTaxExemptIssuingJurisdiction() {
        return taxExemptIssuingJurisdiction;
    }


    /**
     * Sets the taxExemptIssuingJurisdiction value for this Account.
     * 
     * @param taxExemptIssuingJurisdiction
     */
    public void setTaxExemptIssuingJurisdiction(java.lang.String taxExemptIssuingJurisdiction) {
        this.taxExemptIssuingJurisdiction = taxExemptIssuingJurisdiction;
    }


    /**
     * Gets the taxExemptStatus value for this Account.
     * 
     * @return taxExemptStatus
     */
    public java.lang.String getTaxExemptStatus() {
        return taxExemptStatus;
    }


    /**
     * Sets the taxExemptStatus value for this Account.
     * 
     * @param taxExemptStatus
     */
    public void setTaxExemptStatus(java.lang.String taxExemptStatus) {
        this.taxExemptStatus = taxExemptStatus;
    }


    /**
     * Gets the totalInvoiceBalance value for this Account.
     * 
     * @return totalInvoiceBalance
     */
    public java.math.BigDecimal getTotalInvoiceBalance() {
        return totalInvoiceBalance;
    }


    /**
     * Sets the totalInvoiceBalance value for this Account.
     * 
     * @param totalInvoiceBalance
     */
    public void setTotalInvoiceBalance(java.math.BigDecimal totalInvoiceBalance) {
        this.totalInvoiceBalance = totalInvoiceBalance;
    }


    /**
     * Gets the updatedById value for this Account.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this Account.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this Account.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this Account.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.additionalEmailAddresses==null && other.getAdditionalEmailAddresses()==null) || 
             (this.additionalEmailAddresses!=null &&
              this.additionalEmailAddresses.equals(other.getAdditionalEmailAddresses()))) &&
            ((this.allowInvoiceEdit==null && other.getAllowInvoiceEdit()==null) || 
             (this.allowInvoiceEdit!=null &&
              this.allowInvoiceEdit.equals(other.getAllowInvoiceEdit()))) &&
            ((this.autoPay==null && other.getAutoPay()==null) || 
             (this.autoPay!=null &&
              this.autoPay.equals(other.getAutoPay()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.batch==null && other.getBatch()==null) || 
             (this.batch!=null &&
              this.batch.equals(other.getBatch()))) &&
            ((this.bcdSettingOption==null && other.getBcdSettingOption()==null) || 
             (this.bcdSettingOption!=null &&
              this.bcdSettingOption.equals(other.getBcdSettingOption()))) &&
            ((this.billCycleDay==null && other.getBillCycleDay()==null) || 
             (this.billCycleDay!=null &&
              this.billCycleDay.equals(other.getBillCycleDay()))) &&
            ((this.billToId==null && other.getBillToId()==null) || 
             (this.billToId!=null &&
              this.billToId.equals(other.getBillToId()))) &&
            ((this.communicationProfileId==null && other.getCommunicationProfileId()==null) || 
             (this.communicationProfileId!=null &&
              this.communicationProfileId.equals(other.getCommunicationProfileId()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.creditBalance==null && other.getCreditBalance()==null) || 
             (this.creditBalance!=null &&
              this.creditBalance.equals(other.getCreditBalance()))) &&
            ((this.crmId==null && other.getCrmId()==null) || 
             (this.crmId!=null &&
              this.crmId.equals(other.getCrmId()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.customerServiceRepName==null && other.getCustomerServiceRepName()==null) || 
             (this.customerServiceRepName!=null &&
              this.customerServiceRepName.equals(other.getCustomerServiceRepName()))) &&
            ((this.defaultPaymentMethodId==null && other.getDefaultPaymentMethodId()==null) || 
             (this.defaultPaymentMethodId!=null &&
              this.defaultPaymentMethodId.equals(other.getDefaultPaymentMethodId()))) &&
            ((this.invoiceDeliveryPrefsEmail==null && other.getInvoiceDeliveryPrefsEmail()==null) || 
             (this.invoiceDeliveryPrefsEmail!=null &&
              this.invoiceDeliveryPrefsEmail.equals(other.getInvoiceDeliveryPrefsEmail()))) &&
            ((this.invoiceDeliveryPrefsPrint==null && other.getInvoiceDeliveryPrefsPrint()==null) || 
             (this.invoiceDeliveryPrefsPrint!=null &&
              this.invoiceDeliveryPrefsPrint.equals(other.getInvoiceDeliveryPrefsPrint()))) &&
            ((this.invoiceTemplateId==null && other.getInvoiceTemplateId()==null) || 
             (this.invoiceTemplateId!=null &&
              this.invoiceTemplateId.equals(other.getInvoiceTemplateId()))) &&
            ((this.lastInvoiceDate==null && other.getLastInvoiceDate()==null) || 
             (this.lastInvoiceDate!=null &&
              this.lastInvoiceDate.equals(other.getLastInvoiceDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.paymentGateway==null && other.getPaymentGateway()==null) || 
             (this.paymentGateway!=null &&
              this.paymentGateway.equals(other.getPaymentGateway()))) &&
            ((this.paymentTerm==null && other.getPaymentTerm()==null) || 
             (this.paymentTerm!=null &&
              this.paymentTerm.equals(other.getPaymentTerm()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.salesRepName==null && other.getSalesRepName()==null) || 
             (this.salesRepName!=null &&
              this.salesRepName.equals(other.getSalesRepName()))) &&
            ((this.soldToId==null && other.getSoldToId()==null) || 
             (this.soldToId!=null &&
              this.soldToId.equals(other.getSoldToId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.taxExemptCertificateID==null && other.getTaxExemptCertificateID()==null) || 
             (this.taxExemptCertificateID!=null &&
              this.taxExemptCertificateID.equals(other.getTaxExemptCertificateID()))) &&
            ((this.taxExemptCertificateType==null && other.getTaxExemptCertificateType()==null) || 
             (this.taxExemptCertificateType!=null &&
              this.taxExemptCertificateType.equals(other.getTaxExemptCertificateType()))) &&
            ((this.taxExemptDescription==null && other.getTaxExemptDescription()==null) || 
             (this.taxExemptDescription!=null &&
              this.taxExemptDescription.equals(other.getTaxExemptDescription()))) &&
            ((this.taxExemptEffectiveDate==null && other.getTaxExemptEffectiveDate()==null) || 
             (this.taxExemptEffectiveDate!=null &&
              this.taxExemptEffectiveDate.equals(other.getTaxExemptEffectiveDate()))) &&
            ((this.taxExemptExpirationDate==null && other.getTaxExemptExpirationDate()==null) || 
             (this.taxExemptExpirationDate!=null &&
              this.taxExemptExpirationDate.equals(other.getTaxExemptExpirationDate()))) &&
            ((this.taxExemptIssuingJurisdiction==null && other.getTaxExemptIssuingJurisdiction()==null) || 
             (this.taxExemptIssuingJurisdiction!=null &&
              this.taxExemptIssuingJurisdiction.equals(other.getTaxExemptIssuingJurisdiction()))) &&
            ((this.taxExemptStatus==null && other.getTaxExemptStatus()==null) || 
             (this.taxExemptStatus!=null &&
              this.taxExemptStatus.equals(other.getTaxExemptStatus()))) &&
            ((this.totalInvoiceBalance==null && other.getTotalInvoiceBalance()==null) || 
             (this.totalInvoiceBalance!=null &&
              this.totalInvoiceBalance.equals(other.getTotalInvoiceBalance()))) &&
            ((this.updatedById==null && other.getUpdatedById()==null) || 
             (this.updatedById!=null &&
              this.updatedById.equals(other.getUpdatedById()))) &&
            ((this.updatedDate==null && other.getUpdatedDate()==null) || 
             (this.updatedDate!=null &&
              this.updatedDate.equals(other.getUpdatedDate())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAdditionalEmailAddresses() != null) {
            _hashCode += getAdditionalEmailAddresses().hashCode();
        }
        if (getAllowInvoiceEdit() != null) {
            _hashCode += getAllowInvoiceEdit().hashCode();
        }
        if (getAutoPay() != null) {
            _hashCode += getAutoPay().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getBatch() != null) {
            _hashCode += getBatch().hashCode();
        }
        if (getBcdSettingOption() != null) {
            _hashCode += getBcdSettingOption().hashCode();
        }
        if (getBillCycleDay() != null) {
            _hashCode += getBillCycleDay().hashCode();
        }
        if (getBillToId() != null) {
            _hashCode += getBillToId().hashCode();
        }
        if (getCommunicationProfileId() != null) {
            _hashCode += getCommunicationProfileId().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCreditBalance() != null) {
            _hashCode += getCreditBalance().hashCode();
        }
        if (getCrmId() != null) {
            _hashCode += getCrmId().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCustomerServiceRepName() != null) {
            _hashCode += getCustomerServiceRepName().hashCode();
        }
        if (getDefaultPaymentMethodId() != null) {
            _hashCode += getDefaultPaymentMethodId().hashCode();
        }
        if (getInvoiceDeliveryPrefsEmail() != null) {
            _hashCode += getInvoiceDeliveryPrefsEmail().hashCode();
        }
        if (getInvoiceDeliveryPrefsPrint() != null) {
            _hashCode += getInvoiceDeliveryPrefsPrint().hashCode();
        }
        if (getInvoiceTemplateId() != null) {
            _hashCode += getInvoiceTemplateId().hashCode();
        }
        if (getLastInvoiceDate() != null) {
            _hashCode += getLastInvoiceDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getPaymentGateway() != null) {
            _hashCode += getPaymentGateway().hashCode();
        }
        if (getPaymentTerm() != null) {
            _hashCode += getPaymentTerm().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getSalesRepName() != null) {
            _hashCode += getSalesRepName().hashCode();
        }
        if (getSoldToId() != null) {
            _hashCode += getSoldToId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTaxExemptCertificateID() != null) {
            _hashCode += getTaxExemptCertificateID().hashCode();
        }
        if (getTaxExemptCertificateType() != null) {
            _hashCode += getTaxExemptCertificateType().hashCode();
        }
        if (getTaxExemptDescription() != null) {
            _hashCode += getTaxExemptDescription().hashCode();
        }
        if (getTaxExemptEffectiveDate() != null) {
            _hashCode += getTaxExemptEffectiveDate().hashCode();
        }
        if (getTaxExemptExpirationDate() != null) {
            _hashCode += getTaxExemptExpirationDate().hashCode();
        }
        if (getTaxExemptIssuingJurisdiction() != null) {
            _hashCode += getTaxExemptIssuingJurisdiction().hashCode();
        }
        if (getTaxExemptStatus() != null) {
            _hashCode += getTaxExemptStatus().hashCode();
        }
        if (getTotalInvoiceBalance() != null) {
            _hashCode += getTotalInvoiceBalance().hashCode();
        }
        if (getUpdatedById() != null) {
            _hashCode += getUpdatedById().hashCode();
        }
        if (getUpdatedDate() != null) {
            _hashCode += getUpdatedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Account.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalEmailAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AdditionalEmailAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowInvoiceEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AllowInvoiceEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AutoPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Batch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bcdSettingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BcdSettingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BillCycleDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BillToId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CommunicationProfileId"));
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
        elemField.setFieldName("creditBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crmId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CrmId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerServiceRepName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CustomerServiceRepName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPaymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DefaultPaymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDeliveryPrefsEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceDeliveryPrefsEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDeliveryPrefsPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceDeliveryPrefsPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastInvoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "LastInvoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentGateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentGateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PurchaseOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRepName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SalesRepName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SoldToId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptCertificateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxExemptCertificateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptCertificateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxExemptCertificateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxExemptDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxExemptEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxExemptExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptIssuingJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxExemptIssuingJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxExemptStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInvoiceBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TotalInvoiceBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
