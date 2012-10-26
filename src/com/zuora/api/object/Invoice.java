/**
 * Invoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class Invoice  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.math.BigDecimal adjustmentAmount;

    private java.math.BigDecimal amount;

    private java.math.BigDecimal amountWithoutTax;

    private java.math.BigDecimal balance;

    private java.lang.String body;

    private java.lang.String comments;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar dueDate;

    private java.lang.Boolean includesOneTime;

    private java.lang.Boolean includesRecurring;

    private java.lang.Boolean includesUsage;

    private java.util.Calendar invoiceDate;

    private java.lang.String invoiceNumber;

    private java.util.Calendar lastEmailSentDate;

    private java.math.BigDecimal paymentAmount;

    private java.lang.String postedBy;

    private java.util.Calendar postedDate;

    private java.math.BigDecimal refundAmount;

    private java.lang.Boolean regenerateInvoicePDF;

    private java.lang.String status;

    private java.util.Calendar targetDate;

    private java.math.BigDecimal taxAmount;

    private java.math.BigDecimal taxExemptAmount;

    private java.lang.String transferredToAccounting;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public Invoice() {
    }

    public Invoice(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.math.BigDecimal adjustmentAmount,
           java.math.BigDecimal amount,
           java.math.BigDecimal amountWithoutTax,
           java.math.BigDecimal balance,
           java.lang.String body,
           java.lang.String comments,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar dueDate,
           java.lang.Boolean includesOneTime,
           java.lang.Boolean includesRecurring,
           java.lang.Boolean includesUsage,
           java.util.Calendar invoiceDate,
           java.lang.String invoiceNumber,
           java.util.Calendar lastEmailSentDate,
           java.math.BigDecimal paymentAmount,
           java.lang.String postedBy,
           java.util.Calendar postedDate,
           java.math.BigDecimal refundAmount,
           java.lang.Boolean regenerateInvoicePDF,
           java.lang.String status,
           java.util.Calendar targetDate,
           java.math.BigDecimal taxAmount,
           java.math.BigDecimal taxExemptAmount,
           java.lang.String transferredToAccounting,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.accountId = accountId;
        this.adjustmentAmount = adjustmentAmount;
        this.amount = amount;
        this.amountWithoutTax = amountWithoutTax;
        this.balance = balance;
        this.body = body;
        this.comments = comments;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.dueDate = dueDate;
        this.includesOneTime = includesOneTime;
        this.includesRecurring = includesRecurring;
        this.includesUsage = includesUsage;
        this.invoiceDate = invoiceDate;
        this.invoiceNumber = invoiceNumber;
        this.lastEmailSentDate = lastEmailSentDate;
        this.paymentAmount = paymentAmount;
        this.postedBy = postedBy;
        this.postedDate = postedDate;
        this.refundAmount = refundAmount;
        this.regenerateInvoicePDF = regenerateInvoicePDF;
        this.status = status;
        this.targetDate = targetDate;
        this.taxAmount = taxAmount;
        this.taxExemptAmount = taxExemptAmount;
        this.transferredToAccounting = transferredToAccounting;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the accountId value for this Invoice.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Invoice.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the adjustmentAmount value for this Invoice.
     * 
     * @return adjustmentAmount
     */
    public java.math.BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }


    /**
     * Sets the adjustmentAmount value for this Invoice.
     * 
     * @param adjustmentAmount
     */
    public void setAdjustmentAmount(java.math.BigDecimal adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }


    /**
     * Gets the amount value for this Invoice.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Invoice.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountWithoutTax value for this Invoice.
     * 
     * @return amountWithoutTax
     */
    public java.math.BigDecimal getAmountWithoutTax() {
        return amountWithoutTax;
    }


    /**
     * Sets the amountWithoutTax value for this Invoice.
     * 
     * @param amountWithoutTax
     */
    public void setAmountWithoutTax(java.math.BigDecimal amountWithoutTax) {
        this.amountWithoutTax = amountWithoutTax;
    }


    /**
     * Gets the balance value for this Invoice.
     * 
     * @return balance
     */
    public java.math.BigDecimal getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Invoice.
     * 
     * @param balance
     */
    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }


    /**
     * Gets the body value for this Invoice.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this Invoice.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the comments value for this Invoice.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Invoice.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the createdById value for this Invoice.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Invoice.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Invoice.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Invoice.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the dueDate value for this Invoice.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this Invoice.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the includesOneTime value for this Invoice.
     * 
     * @return includesOneTime
     */
    public java.lang.Boolean getIncludesOneTime() {
        return includesOneTime;
    }


    /**
     * Sets the includesOneTime value for this Invoice.
     * 
     * @param includesOneTime
     */
    public void setIncludesOneTime(java.lang.Boolean includesOneTime) {
        this.includesOneTime = includesOneTime;
    }


    /**
     * Gets the includesRecurring value for this Invoice.
     * 
     * @return includesRecurring
     */
    public java.lang.Boolean getIncludesRecurring() {
        return includesRecurring;
    }


    /**
     * Sets the includesRecurring value for this Invoice.
     * 
     * @param includesRecurring
     */
    public void setIncludesRecurring(java.lang.Boolean includesRecurring) {
        this.includesRecurring = includesRecurring;
    }


    /**
     * Gets the includesUsage value for this Invoice.
     * 
     * @return includesUsage
     */
    public java.lang.Boolean getIncludesUsage() {
        return includesUsage;
    }


    /**
     * Sets the includesUsage value for this Invoice.
     * 
     * @param includesUsage
     */
    public void setIncludesUsage(java.lang.Boolean includesUsage) {
        this.includesUsage = includesUsage;
    }


    /**
     * Gets the invoiceDate value for this Invoice.
     * 
     * @return invoiceDate
     */
    public java.util.Calendar getInvoiceDate() {
        return invoiceDate;
    }


    /**
     * Sets the invoiceDate value for this Invoice.
     * 
     * @param invoiceDate
     */
    public void setInvoiceDate(java.util.Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    /**
     * Gets the invoiceNumber value for this Invoice.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this Invoice.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the lastEmailSentDate value for this Invoice.
     * 
     * @return lastEmailSentDate
     */
    public java.util.Calendar getLastEmailSentDate() {
        return lastEmailSentDate;
    }


    /**
     * Sets the lastEmailSentDate value for this Invoice.
     * 
     * @param lastEmailSentDate
     */
    public void setLastEmailSentDate(java.util.Calendar lastEmailSentDate) {
        this.lastEmailSentDate = lastEmailSentDate;
    }


    /**
     * Gets the paymentAmount value for this Invoice.
     * 
     * @return paymentAmount
     */
    public java.math.BigDecimal getPaymentAmount() {
        return paymentAmount;
    }


    /**
     * Sets the paymentAmount value for this Invoice.
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(java.math.BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }


    /**
     * Gets the postedBy value for this Invoice.
     * 
     * @return postedBy
     */
    public java.lang.String getPostedBy() {
        return postedBy;
    }


    /**
     * Sets the postedBy value for this Invoice.
     * 
     * @param postedBy
     */
    public void setPostedBy(java.lang.String postedBy) {
        this.postedBy = postedBy;
    }


    /**
     * Gets the postedDate value for this Invoice.
     * 
     * @return postedDate
     */
    public java.util.Calendar getPostedDate() {
        return postedDate;
    }


    /**
     * Sets the postedDate value for this Invoice.
     * 
     * @param postedDate
     */
    public void setPostedDate(java.util.Calendar postedDate) {
        this.postedDate = postedDate;
    }


    /**
     * Gets the refundAmount value for this Invoice.
     * 
     * @return refundAmount
     */
    public java.math.BigDecimal getRefundAmount() {
        return refundAmount;
    }


    /**
     * Sets the refundAmount value for this Invoice.
     * 
     * @param refundAmount
     */
    public void setRefundAmount(java.math.BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * Gets the regenerateInvoicePDF value for this Invoice.
     * 
     * @return regenerateInvoicePDF
     */
    public java.lang.Boolean getRegenerateInvoicePDF() {
        return regenerateInvoicePDF;
    }


    /**
     * Sets the regenerateInvoicePDF value for this Invoice.
     * 
     * @param regenerateInvoicePDF
     */
    public void setRegenerateInvoicePDF(java.lang.Boolean regenerateInvoicePDF) {
        this.regenerateInvoicePDF = regenerateInvoicePDF;
    }


    /**
     * Gets the status value for this Invoice.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Invoice.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the targetDate value for this Invoice.
     * 
     * @return targetDate
     */
    public java.util.Calendar getTargetDate() {
        return targetDate;
    }


    /**
     * Sets the targetDate value for this Invoice.
     * 
     * @param targetDate
     */
    public void setTargetDate(java.util.Calendar targetDate) {
        this.targetDate = targetDate;
    }


    /**
     * Gets the taxAmount value for this Invoice.
     * 
     * @return taxAmount
     */
    public java.math.BigDecimal getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this Invoice.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.math.BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxExemptAmount value for this Invoice.
     * 
     * @return taxExemptAmount
     */
    public java.math.BigDecimal getTaxExemptAmount() {
        return taxExemptAmount;
    }


    /**
     * Sets the taxExemptAmount value for this Invoice.
     * 
     * @param taxExemptAmount
     */
    public void setTaxExemptAmount(java.math.BigDecimal taxExemptAmount) {
        this.taxExemptAmount = taxExemptAmount;
    }


    /**
     * Gets the transferredToAccounting value for this Invoice.
     * 
     * @return transferredToAccounting
     */
    public java.lang.String getTransferredToAccounting() {
        return transferredToAccounting;
    }


    /**
     * Sets the transferredToAccounting value for this Invoice.
     * 
     * @param transferredToAccounting
     */
    public void setTransferredToAccounting(java.lang.String transferredToAccounting) {
        this.transferredToAccounting = transferredToAccounting;
    }


    /**
     * Gets the updatedById value for this Invoice.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this Invoice.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this Invoice.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this Invoice.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Invoice)) return false;
        Invoice other = (Invoice) obj;
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
            ((this.adjustmentAmount==null && other.getAdjustmentAmount()==null) || 
             (this.adjustmentAmount!=null &&
              this.adjustmentAmount.equals(other.getAdjustmentAmount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountWithoutTax==null && other.getAmountWithoutTax()==null) || 
             (this.amountWithoutTax!=null &&
              this.amountWithoutTax.equals(other.getAmountWithoutTax()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.includesOneTime==null && other.getIncludesOneTime()==null) || 
             (this.includesOneTime!=null &&
              this.includesOneTime.equals(other.getIncludesOneTime()))) &&
            ((this.includesRecurring==null && other.getIncludesRecurring()==null) || 
             (this.includesRecurring!=null &&
              this.includesRecurring.equals(other.getIncludesRecurring()))) &&
            ((this.includesUsage==null && other.getIncludesUsage()==null) || 
             (this.includesUsage!=null &&
              this.includesUsage.equals(other.getIncludesUsage()))) &&
            ((this.invoiceDate==null && other.getInvoiceDate()==null) || 
             (this.invoiceDate!=null &&
              this.invoiceDate.equals(other.getInvoiceDate()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.lastEmailSentDate==null && other.getLastEmailSentDate()==null) || 
             (this.lastEmailSentDate!=null &&
              this.lastEmailSentDate.equals(other.getLastEmailSentDate()))) &&
            ((this.paymentAmount==null && other.getPaymentAmount()==null) || 
             (this.paymentAmount!=null &&
              this.paymentAmount.equals(other.getPaymentAmount()))) &&
            ((this.postedBy==null && other.getPostedBy()==null) || 
             (this.postedBy!=null &&
              this.postedBy.equals(other.getPostedBy()))) &&
            ((this.postedDate==null && other.getPostedDate()==null) || 
             (this.postedDate!=null &&
              this.postedDate.equals(other.getPostedDate()))) &&
            ((this.refundAmount==null && other.getRefundAmount()==null) || 
             (this.refundAmount!=null &&
              this.refundAmount.equals(other.getRefundAmount()))) &&
            ((this.regenerateInvoicePDF==null && other.getRegenerateInvoicePDF()==null) || 
             (this.regenerateInvoicePDF!=null &&
              this.regenerateInvoicePDF.equals(other.getRegenerateInvoicePDF()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.targetDate==null && other.getTargetDate()==null) || 
             (this.targetDate!=null &&
              this.targetDate.equals(other.getTargetDate()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxExemptAmount==null && other.getTaxExemptAmount()==null) || 
             (this.taxExemptAmount!=null &&
              this.taxExemptAmount.equals(other.getTaxExemptAmount()))) &&
            ((this.transferredToAccounting==null && other.getTransferredToAccounting()==null) || 
             (this.transferredToAccounting!=null &&
              this.transferredToAccounting.equals(other.getTransferredToAccounting()))) &&
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
        if (getAdjustmentAmount() != null) {
            _hashCode += getAdjustmentAmount().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountWithoutTax() != null) {
            _hashCode += getAmountWithoutTax().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getIncludesOneTime() != null) {
            _hashCode += getIncludesOneTime().hashCode();
        }
        if (getIncludesRecurring() != null) {
            _hashCode += getIncludesRecurring().hashCode();
        }
        if (getIncludesUsage() != null) {
            _hashCode += getIncludesUsage().hashCode();
        }
        if (getInvoiceDate() != null) {
            _hashCode += getInvoiceDate().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getLastEmailSentDate() != null) {
            _hashCode += getLastEmailSentDate().hashCode();
        }
        if (getPaymentAmount() != null) {
            _hashCode += getPaymentAmount().hashCode();
        }
        if (getPostedBy() != null) {
            _hashCode += getPostedBy().hashCode();
        }
        if (getPostedDate() != null) {
            _hashCode += getPostedDate().hashCode();
        }
        if (getRefundAmount() != null) {
            _hashCode += getRefundAmount().hashCode();
        }
        if (getRegenerateInvoicePDF() != null) {
            _hashCode += getRegenerateInvoicePDF().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTargetDate() != null) {
            _hashCode += getTargetDate().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxExemptAmount() != null) {
            _hashCode += getTaxExemptAmount().hashCode();
        }
        if (getTransferredToAccounting() != null) {
            _hashCode += getTransferredToAccounting().hashCode();
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
        new org.apache.axis.description.TypeDesc(Invoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Invoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AdjustmentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("amountWithoutTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AmountWithoutTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Comments"));
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
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includesOneTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IncludesOneTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includesRecurring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IncludesRecurring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includesUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IncludesUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("lastEmailSentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "LastEmailSentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PostedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PostedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("regenerateInvoicePDF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RegenerateInvoicePDF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("targetDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TargetDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxExemptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
