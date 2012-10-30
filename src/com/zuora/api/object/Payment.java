/**
 * Payment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class Payment  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String accountingCode;

    private java.math.BigDecimal amount;

    private java.math.BigDecimal appliedCreditBalanceAmount;

    private java.math.BigDecimal appliedInvoiceAmount;

    private java.lang.String authTransactionId;

    private java.lang.String bankIdentificationNumber;

    private java.util.Calendar cancelledOn;

    private java.lang.String comment;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar effectiveDate;

    private com.zuora.api.object.GatewayOption[] gatewayOptionData;

    private java.lang.String gatewayOrderId;

    private java.lang.String gatewayResponse;

    private java.lang.String gatewayResponseCode;

    private java.lang.String gatewayState;

    private java.lang.String invoiceId;

    private java.lang.String invoiceNumber;

    private java.util.Calendar markedForSubmissionOn;

    private java.lang.String paymentMethodId;

    private java.lang.String paymentNumber;

    private java.lang.String referenceId;

    private java.math.BigDecimal refundAmount;

    private java.lang.String secondPaymentReferenceId;

    private java.util.Calendar settledOn;

    private java.lang.String status;

    private java.util.Calendar submittedOn;

    private java.lang.String transferredToAccounting;

    private java.lang.String type;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public Payment() {
    }

    public Payment(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.lang.String accountingCode,
           java.math.BigDecimal amount,
           java.math.BigDecimal appliedCreditBalanceAmount,
           java.math.BigDecimal appliedInvoiceAmount,
           java.lang.String authTransactionId,
           java.lang.String bankIdentificationNumber,
           java.util.Calendar cancelledOn,
           java.lang.String comment,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar effectiveDate,
           com.zuora.api.object.GatewayOption[] gatewayOptionData,
           java.lang.String gatewayOrderId,
           java.lang.String gatewayResponse,
           java.lang.String gatewayResponseCode,
           java.lang.String gatewayState,
           java.lang.String invoiceId,
           java.lang.String invoiceNumber,
           java.util.Calendar markedForSubmissionOn,
           java.lang.String paymentMethodId,
           java.lang.String paymentNumber,
           java.lang.String referenceId,
           java.math.BigDecimal refundAmount,
           java.lang.String secondPaymentReferenceId,
           java.util.Calendar settledOn,
           java.lang.String status,
           java.util.Calendar submittedOn,
           java.lang.String transferredToAccounting,
           java.lang.String type,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.accountId = accountId;
        this.accountingCode = accountingCode;
        this.amount = amount;
        this.appliedCreditBalanceAmount = appliedCreditBalanceAmount;
        this.appliedInvoiceAmount = appliedInvoiceAmount;
        this.authTransactionId = authTransactionId;
        this.bankIdentificationNumber = bankIdentificationNumber;
        this.cancelledOn = cancelledOn;
        this.comment = comment;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.effectiveDate = effectiveDate;
        this.gatewayOptionData = gatewayOptionData;
        this.gatewayOrderId = gatewayOrderId;
        this.gatewayResponse = gatewayResponse;
        this.gatewayResponseCode = gatewayResponseCode;
        this.gatewayState = gatewayState;
        this.invoiceId = invoiceId;
        this.invoiceNumber = invoiceNumber;
        this.markedForSubmissionOn = markedForSubmissionOn;
        this.paymentMethodId = paymentMethodId;
        this.paymentNumber = paymentNumber;
        this.referenceId = referenceId;
        this.refundAmount = refundAmount;
        this.secondPaymentReferenceId = secondPaymentReferenceId;
        this.settledOn = settledOn;
        this.status = status;
        this.submittedOn = submittedOn;
        this.transferredToAccounting = transferredToAccounting;
        this.type = type;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the accountId value for this Payment.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Payment.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountingCode value for this Payment.
     * 
     * @return accountingCode
     */
    public java.lang.String getAccountingCode() {
        return accountingCode;
    }


    /**
     * Sets the accountingCode value for this Payment.
     * 
     * @param accountingCode
     */
    public void setAccountingCode(java.lang.String accountingCode) {
        this.accountingCode = accountingCode;
    }


    /**
     * Gets the amount value for this Payment.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Payment.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the appliedCreditBalanceAmount value for this Payment.
     * 
     * @return appliedCreditBalanceAmount
     */
    public java.math.BigDecimal getAppliedCreditBalanceAmount() {
        return appliedCreditBalanceAmount;
    }


    /**
     * Sets the appliedCreditBalanceAmount value for this Payment.
     * 
     * @param appliedCreditBalanceAmount
     */
    public void setAppliedCreditBalanceAmount(java.math.BigDecimal appliedCreditBalanceAmount) {
        this.appliedCreditBalanceAmount = appliedCreditBalanceAmount;
    }


    /**
     * Gets the appliedInvoiceAmount value for this Payment.
     * 
     * @return appliedInvoiceAmount
     */
    public java.math.BigDecimal getAppliedInvoiceAmount() {
        return appliedInvoiceAmount;
    }


    /**
     * Sets the appliedInvoiceAmount value for this Payment.
     * 
     * @param appliedInvoiceAmount
     */
    public void setAppliedInvoiceAmount(java.math.BigDecimal appliedInvoiceAmount) {
        this.appliedInvoiceAmount = appliedInvoiceAmount;
    }


    /**
     * Gets the authTransactionId value for this Payment.
     * 
     * @return authTransactionId
     */
    public java.lang.String getAuthTransactionId() {
        return authTransactionId;
    }


    /**
     * Sets the authTransactionId value for this Payment.
     * 
     * @param authTransactionId
     */
    public void setAuthTransactionId(java.lang.String authTransactionId) {
        this.authTransactionId = authTransactionId;
    }


    /**
     * Gets the bankIdentificationNumber value for this Payment.
     * 
     * @return bankIdentificationNumber
     */
    public java.lang.String getBankIdentificationNumber() {
        return bankIdentificationNumber;
    }


    /**
     * Sets the bankIdentificationNumber value for this Payment.
     * 
     * @param bankIdentificationNumber
     */
    public void setBankIdentificationNumber(java.lang.String bankIdentificationNumber) {
        this.bankIdentificationNumber = bankIdentificationNumber;
    }


    /**
     * Gets the cancelledOn value for this Payment.
     * 
     * @return cancelledOn
     */
    public java.util.Calendar getCancelledOn() {
        return cancelledOn;
    }


    /**
     * Sets the cancelledOn value for this Payment.
     * 
     * @param cancelledOn
     */
    public void setCancelledOn(java.util.Calendar cancelledOn) {
        this.cancelledOn = cancelledOn;
    }


    /**
     * Gets the comment value for this Payment.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Payment.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the createdById value for this Payment.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Payment.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Payment.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Payment.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the effectiveDate value for this Payment.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this Payment.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the gatewayOptionData value for this Payment.
     * 
     * @return gatewayOptionData
     */
    public com.zuora.api.object.GatewayOption[] getGatewayOptionData() {
        return gatewayOptionData;
    }


    /**
     * Sets the gatewayOptionData value for this Payment.
     * 
     * @param gatewayOptionData
     */
    public void setGatewayOptionData(com.zuora.api.object.GatewayOption[] gatewayOptionData) {
        this.gatewayOptionData = gatewayOptionData;
    }


    /**
     * Gets the gatewayOrderId value for this Payment.
     * 
     * @return gatewayOrderId
     */
    public java.lang.String getGatewayOrderId() {
        return gatewayOrderId;
    }


    /**
     * Sets the gatewayOrderId value for this Payment.
     * 
     * @param gatewayOrderId
     */
    public void setGatewayOrderId(java.lang.String gatewayOrderId) {
        this.gatewayOrderId = gatewayOrderId;
    }


    /**
     * Gets the gatewayResponse value for this Payment.
     * 
     * @return gatewayResponse
     */
    public java.lang.String getGatewayResponse() {
        return gatewayResponse;
    }


    /**
     * Sets the gatewayResponse value for this Payment.
     * 
     * @param gatewayResponse
     */
    public void setGatewayResponse(java.lang.String gatewayResponse) {
        this.gatewayResponse = gatewayResponse;
    }


    /**
     * Gets the gatewayResponseCode value for this Payment.
     * 
     * @return gatewayResponseCode
     */
    public java.lang.String getGatewayResponseCode() {
        return gatewayResponseCode;
    }


    /**
     * Sets the gatewayResponseCode value for this Payment.
     * 
     * @param gatewayResponseCode
     */
    public void setGatewayResponseCode(java.lang.String gatewayResponseCode) {
        this.gatewayResponseCode = gatewayResponseCode;
    }


    /**
     * Gets the gatewayState value for this Payment.
     * 
     * @return gatewayState
     */
    public java.lang.String getGatewayState() {
        return gatewayState;
    }


    /**
     * Sets the gatewayState value for this Payment.
     * 
     * @param gatewayState
     */
    public void setGatewayState(java.lang.String gatewayState) {
        this.gatewayState = gatewayState;
    }


    /**
     * Gets the invoiceId value for this Payment.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this Payment.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the invoiceNumber value for this Payment.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this Payment.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the markedForSubmissionOn value for this Payment.
     * 
     * @return markedForSubmissionOn
     */
    public java.util.Calendar getMarkedForSubmissionOn() {
        return markedForSubmissionOn;
    }


    /**
     * Sets the markedForSubmissionOn value for this Payment.
     * 
     * @param markedForSubmissionOn
     */
    public void setMarkedForSubmissionOn(java.util.Calendar markedForSubmissionOn) {
        this.markedForSubmissionOn = markedForSubmissionOn;
    }


    /**
     * Gets the paymentMethodId value for this Payment.
     * 
     * @return paymentMethodId
     */
    public java.lang.String getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this Payment.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(java.lang.String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the paymentNumber value for this Payment.
     * 
     * @return paymentNumber
     */
    public java.lang.String getPaymentNumber() {
        return paymentNumber;
    }


    /**
     * Sets the paymentNumber value for this Payment.
     * 
     * @param paymentNumber
     */
    public void setPaymentNumber(java.lang.String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }


    /**
     * Gets the referenceId value for this Payment.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this Payment.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the refundAmount value for this Payment.
     * 
     * @return refundAmount
     */
    public java.math.BigDecimal getRefundAmount() {
        return refundAmount;
    }


    /**
     * Sets the refundAmount value for this Payment.
     * 
     * @param refundAmount
     */
    public void setRefundAmount(java.math.BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * Gets the secondPaymentReferenceId value for this Payment.
     * 
     * @return secondPaymentReferenceId
     */
    public java.lang.String getSecondPaymentReferenceId() {
        return secondPaymentReferenceId;
    }


    /**
     * Sets the secondPaymentReferenceId value for this Payment.
     * 
     * @param secondPaymentReferenceId
     */
    public void setSecondPaymentReferenceId(java.lang.String secondPaymentReferenceId) {
        this.secondPaymentReferenceId = secondPaymentReferenceId;
    }


    /**
     * Gets the settledOn value for this Payment.
     * 
     * @return settledOn
     */
    public java.util.Calendar getSettledOn() {
        return settledOn;
    }


    /**
     * Sets the settledOn value for this Payment.
     * 
     * @param settledOn
     */
    public void setSettledOn(java.util.Calendar settledOn) {
        this.settledOn = settledOn;
    }


    /**
     * Gets the status value for this Payment.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Payment.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the submittedOn value for this Payment.
     * 
     * @return submittedOn
     */
    public java.util.Calendar getSubmittedOn() {
        return submittedOn;
    }


    /**
     * Sets the submittedOn value for this Payment.
     * 
     * @param submittedOn
     */
    public void setSubmittedOn(java.util.Calendar submittedOn) {
        this.submittedOn = submittedOn;
    }


    /**
     * Gets the transferredToAccounting value for this Payment.
     * 
     * @return transferredToAccounting
     */
    public java.lang.String getTransferredToAccounting() {
        return transferredToAccounting;
    }


    /**
     * Sets the transferredToAccounting value for this Payment.
     * 
     * @param transferredToAccounting
     */
    public void setTransferredToAccounting(java.lang.String transferredToAccounting) {
        this.transferredToAccounting = transferredToAccounting;
    }


    /**
     * Gets the type value for this Payment.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Payment.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the updatedById value for this Payment.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this Payment.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this Payment.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this Payment.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Payment)) return false;
        Payment other = (Payment) obj;
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
            ((this.accountingCode==null && other.getAccountingCode()==null) || 
             (this.accountingCode!=null &&
              this.accountingCode.equals(other.getAccountingCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.appliedCreditBalanceAmount==null && other.getAppliedCreditBalanceAmount()==null) || 
             (this.appliedCreditBalanceAmount!=null &&
              this.appliedCreditBalanceAmount.equals(other.getAppliedCreditBalanceAmount()))) &&
            ((this.appliedInvoiceAmount==null && other.getAppliedInvoiceAmount()==null) || 
             (this.appliedInvoiceAmount!=null &&
              this.appliedInvoiceAmount.equals(other.getAppliedInvoiceAmount()))) &&
            ((this.authTransactionId==null && other.getAuthTransactionId()==null) || 
             (this.authTransactionId!=null &&
              this.authTransactionId.equals(other.getAuthTransactionId()))) &&
            ((this.bankIdentificationNumber==null && other.getBankIdentificationNumber()==null) || 
             (this.bankIdentificationNumber!=null &&
              this.bankIdentificationNumber.equals(other.getBankIdentificationNumber()))) &&
            ((this.cancelledOn==null && other.getCancelledOn()==null) || 
             (this.cancelledOn!=null &&
              this.cancelledOn.equals(other.getCancelledOn()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.gatewayOptionData==null && other.getGatewayOptionData()==null) || 
             (this.gatewayOptionData!=null &&
              java.util.Arrays.equals(this.gatewayOptionData, other.getGatewayOptionData()))) &&
            ((this.gatewayOrderId==null && other.getGatewayOrderId()==null) || 
             (this.gatewayOrderId!=null &&
              this.gatewayOrderId.equals(other.getGatewayOrderId()))) &&
            ((this.gatewayResponse==null && other.getGatewayResponse()==null) || 
             (this.gatewayResponse!=null &&
              this.gatewayResponse.equals(other.getGatewayResponse()))) &&
            ((this.gatewayResponseCode==null && other.getGatewayResponseCode()==null) || 
             (this.gatewayResponseCode!=null &&
              this.gatewayResponseCode.equals(other.getGatewayResponseCode()))) &&
            ((this.gatewayState==null && other.getGatewayState()==null) || 
             (this.gatewayState!=null &&
              this.gatewayState.equals(other.getGatewayState()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.markedForSubmissionOn==null && other.getMarkedForSubmissionOn()==null) || 
             (this.markedForSubmissionOn!=null &&
              this.markedForSubmissionOn.equals(other.getMarkedForSubmissionOn()))) &&
            ((this.paymentMethodId==null && other.getPaymentMethodId()==null) || 
             (this.paymentMethodId!=null &&
              this.paymentMethodId.equals(other.getPaymentMethodId()))) &&
            ((this.paymentNumber==null && other.getPaymentNumber()==null) || 
             (this.paymentNumber!=null &&
              this.paymentNumber.equals(other.getPaymentNumber()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.refundAmount==null && other.getRefundAmount()==null) || 
             (this.refundAmount!=null &&
              this.refundAmount.equals(other.getRefundAmount()))) &&
            ((this.secondPaymentReferenceId==null && other.getSecondPaymentReferenceId()==null) || 
             (this.secondPaymentReferenceId!=null &&
              this.secondPaymentReferenceId.equals(other.getSecondPaymentReferenceId()))) &&
            ((this.settledOn==null && other.getSettledOn()==null) || 
             (this.settledOn!=null &&
              this.settledOn.equals(other.getSettledOn()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.submittedOn==null && other.getSubmittedOn()==null) || 
             (this.submittedOn!=null &&
              this.submittedOn.equals(other.getSubmittedOn()))) &&
            ((this.transferredToAccounting==null && other.getTransferredToAccounting()==null) || 
             (this.transferredToAccounting!=null &&
              this.transferredToAccounting.equals(other.getTransferredToAccounting()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountingCode() != null) {
            _hashCode += getAccountingCode().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAppliedCreditBalanceAmount() != null) {
            _hashCode += getAppliedCreditBalanceAmount().hashCode();
        }
        if (getAppliedInvoiceAmount() != null) {
            _hashCode += getAppliedInvoiceAmount().hashCode();
        }
        if (getAuthTransactionId() != null) {
            _hashCode += getAuthTransactionId().hashCode();
        }
        if (getBankIdentificationNumber() != null) {
            _hashCode += getBankIdentificationNumber().hashCode();
        }
        if (getCancelledOn() != null) {
            _hashCode += getCancelledOn().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
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
        if (getGatewayOrderId() != null) {
            _hashCode += getGatewayOrderId().hashCode();
        }
        if (getGatewayResponse() != null) {
            _hashCode += getGatewayResponse().hashCode();
        }
        if (getGatewayResponseCode() != null) {
            _hashCode += getGatewayResponseCode().hashCode();
        }
        if (getGatewayState() != null) {
            _hashCode += getGatewayState().hashCode();
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getMarkedForSubmissionOn() != null) {
            _hashCode += getMarkedForSubmissionOn().hashCode();
        }
        if (getPaymentMethodId() != null) {
            _hashCode += getPaymentMethodId().hashCode();
        }
        if (getPaymentNumber() != null) {
            _hashCode += getPaymentNumber().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getRefundAmount() != null) {
            _hashCode += getRefundAmount().hashCode();
        }
        if (getSecondPaymentReferenceId() != null) {
            _hashCode += getSecondPaymentReferenceId().hashCode();
        }
        if (getSettledOn() != null) {
            _hashCode += getSettledOn().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubmittedOn() != null) {
            _hashCode += getSubmittedOn().hashCode();
        }
        if (getTransferredToAccounting() != null) {
            _hashCode += getTransferredToAccounting().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Payment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Payment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedCreditBalanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AppliedCreditBalanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedInvoiceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AppliedInvoiceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AuthTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("cancelledOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CancelledOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Comment"));
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
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("gatewayOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markedForSubmissionOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MarkedForSubmissionOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondPaymentReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SecondPaymentReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settledOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SettledOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("submittedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SubmittedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferredToAccounting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TransferredToAccounting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
