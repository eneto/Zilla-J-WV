/**
 * InvoiceItemAdjustment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class InvoiceItemAdjustment  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String accountingCode;

    private java.util.Calendar adjustmentDate;

    private java.lang.String adjustmentNumber;

    private java.math.BigDecimal amount;

    private java.lang.String cancelledById;

    private java.util.Calendar cancelledDate;

    private java.lang.String comment;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String customerName;

    private java.lang.String customerNumber;

    private java.lang.String invoiceId;

    private java.lang.String invoiceItemName;

    private java.lang.String invoiceNumber;

    private java.lang.String referenceId;

    private java.util.Calendar serviceEndDate;

    private java.util.Calendar serviceStartDate;

    private java.lang.String sourceId;

    private java.lang.String sourceType;

    private java.lang.String status;

    private java.lang.String transferredToAccounting;

    private java.lang.String type;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public InvoiceItemAdjustment() {
    }

    public InvoiceItemAdjustment(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.lang.String accountingCode,
           java.util.Calendar adjustmentDate,
           java.lang.String adjustmentNumber,
           java.math.BigDecimal amount,
           java.lang.String cancelledById,
           java.util.Calendar cancelledDate,
           java.lang.String comment,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String customerName,
           java.lang.String customerNumber,
           java.lang.String invoiceId,
           java.lang.String invoiceItemName,
           java.lang.String invoiceNumber,
           java.lang.String referenceId,
           java.util.Calendar serviceEndDate,
           java.util.Calendar serviceStartDate,
           java.lang.String sourceId,
           java.lang.String sourceType,
           java.lang.String status,
           java.lang.String transferredToAccounting,
           java.lang.String type,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.accountId = accountId;
        this.accountingCode = accountingCode;
        this.adjustmentDate = adjustmentDate;
        this.adjustmentNumber = adjustmentNumber;
        this.amount = amount;
        this.cancelledById = cancelledById;
        this.cancelledDate = cancelledDate;
        this.comment = comment;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.invoiceId = invoiceId;
        this.invoiceItemName = invoiceItemName;
        this.invoiceNumber = invoiceNumber;
        this.referenceId = referenceId;
        this.serviceEndDate = serviceEndDate;
        this.serviceStartDate = serviceStartDate;
        this.sourceId = sourceId;
        this.sourceType = sourceType;
        this.status = status;
        this.transferredToAccounting = transferredToAccounting;
        this.type = type;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the accountId value for this InvoiceItemAdjustment.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this InvoiceItemAdjustment.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountingCode value for this InvoiceItemAdjustment.
     * 
     * @return accountingCode
     */
    public java.lang.String getAccountingCode() {
        return accountingCode;
    }


    /**
     * Sets the accountingCode value for this InvoiceItemAdjustment.
     * 
     * @param accountingCode
     */
    public void setAccountingCode(java.lang.String accountingCode) {
        this.accountingCode = accountingCode;
    }


    /**
     * Gets the adjustmentDate value for this InvoiceItemAdjustment.
     * 
     * @return adjustmentDate
     */
    public java.util.Calendar getAdjustmentDate() {
        return adjustmentDate;
    }


    /**
     * Sets the adjustmentDate value for this InvoiceItemAdjustment.
     * 
     * @param adjustmentDate
     */
    public void setAdjustmentDate(java.util.Calendar adjustmentDate) {
        this.adjustmentDate = adjustmentDate;
    }


    /**
     * Gets the adjustmentNumber value for this InvoiceItemAdjustment.
     * 
     * @return adjustmentNumber
     */
    public java.lang.String getAdjustmentNumber() {
        return adjustmentNumber;
    }


    /**
     * Sets the adjustmentNumber value for this InvoiceItemAdjustment.
     * 
     * @param adjustmentNumber
     */
    public void setAdjustmentNumber(java.lang.String adjustmentNumber) {
        this.adjustmentNumber = adjustmentNumber;
    }


    /**
     * Gets the amount value for this InvoiceItemAdjustment.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this InvoiceItemAdjustment.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cancelledById value for this InvoiceItemAdjustment.
     * 
     * @return cancelledById
     */
    public java.lang.String getCancelledById() {
        return cancelledById;
    }


    /**
     * Sets the cancelledById value for this InvoiceItemAdjustment.
     * 
     * @param cancelledById
     */
    public void setCancelledById(java.lang.String cancelledById) {
        this.cancelledById = cancelledById;
    }


    /**
     * Gets the cancelledDate value for this InvoiceItemAdjustment.
     * 
     * @return cancelledDate
     */
    public java.util.Calendar getCancelledDate() {
        return cancelledDate;
    }


    /**
     * Sets the cancelledDate value for this InvoiceItemAdjustment.
     * 
     * @param cancelledDate
     */
    public void setCancelledDate(java.util.Calendar cancelledDate) {
        this.cancelledDate = cancelledDate;
    }


    /**
     * Gets the comment value for this InvoiceItemAdjustment.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this InvoiceItemAdjustment.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the createdById value for this InvoiceItemAdjustment.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this InvoiceItemAdjustment.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this InvoiceItemAdjustment.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this InvoiceItemAdjustment.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the customerName value for this InvoiceItemAdjustment.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this InvoiceItemAdjustment.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerNumber value for this InvoiceItemAdjustment.
     * 
     * @return customerNumber
     */
    public java.lang.String getCustomerNumber() {
        return customerNumber;
    }


    /**
     * Sets the customerNumber value for this InvoiceItemAdjustment.
     * 
     * @param customerNumber
     */
    public void setCustomerNumber(java.lang.String customerNumber) {
        this.customerNumber = customerNumber;
    }


    /**
     * Gets the invoiceId value for this InvoiceItemAdjustment.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this InvoiceItemAdjustment.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the invoiceItemName value for this InvoiceItemAdjustment.
     * 
     * @return invoiceItemName
     */
    public java.lang.String getInvoiceItemName() {
        return invoiceItemName;
    }


    /**
     * Sets the invoiceItemName value for this InvoiceItemAdjustment.
     * 
     * @param invoiceItemName
     */
    public void setInvoiceItemName(java.lang.String invoiceItemName) {
        this.invoiceItemName = invoiceItemName;
    }


    /**
     * Gets the invoiceNumber value for this InvoiceItemAdjustment.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this InvoiceItemAdjustment.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the referenceId value for this InvoiceItemAdjustment.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this InvoiceItemAdjustment.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the serviceEndDate value for this InvoiceItemAdjustment.
     * 
     * @return serviceEndDate
     */
    public java.util.Calendar getServiceEndDate() {
        return serviceEndDate;
    }


    /**
     * Sets the serviceEndDate value for this InvoiceItemAdjustment.
     * 
     * @param serviceEndDate
     */
    public void setServiceEndDate(java.util.Calendar serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }


    /**
     * Gets the serviceStartDate value for this InvoiceItemAdjustment.
     * 
     * @return serviceStartDate
     */
    public java.util.Calendar getServiceStartDate() {
        return serviceStartDate;
    }


    /**
     * Sets the serviceStartDate value for this InvoiceItemAdjustment.
     * 
     * @param serviceStartDate
     */
    public void setServiceStartDate(java.util.Calendar serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }


    /**
     * Gets the sourceId value for this InvoiceItemAdjustment.
     * 
     * @return sourceId
     */
    public java.lang.String getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this InvoiceItemAdjustment.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the sourceType value for this InvoiceItemAdjustment.
     * 
     * @return sourceType
     */
    public java.lang.String getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this InvoiceItemAdjustment.
     * 
     * @param sourceType
     */
    public void setSourceType(java.lang.String sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the status value for this InvoiceItemAdjustment.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InvoiceItemAdjustment.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the transferredToAccounting value for this InvoiceItemAdjustment.
     * 
     * @return transferredToAccounting
     */
    public java.lang.String getTransferredToAccounting() {
        return transferredToAccounting;
    }


    /**
     * Sets the transferredToAccounting value for this InvoiceItemAdjustment.
     * 
     * @param transferredToAccounting
     */
    public void setTransferredToAccounting(java.lang.String transferredToAccounting) {
        this.transferredToAccounting = transferredToAccounting;
    }


    /**
     * Gets the type value for this InvoiceItemAdjustment.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this InvoiceItemAdjustment.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the updatedById value for this InvoiceItemAdjustment.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this InvoiceItemAdjustment.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this InvoiceItemAdjustment.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this InvoiceItemAdjustment.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceItemAdjustment)) return false;
        InvoiceItemAdjustment other = (InvoiceItemAdjustment) obj;
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
            ((this.adjustmentDate==null && other.getAdjustmentDate()==null) || 
             (this.adjustmentDate!=null &&
              this.adjustmentDate.equals(other.getAdjustmentDate()))) &&
            ((this.adjustmentNumber==null && other.getAdjustmentNumber()==null) || 
             (this.adjustmentNumber!=null &&
              this.adjustmentNumber.equals(other.getAdjustmentNumber()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cancelledById==null && other.getCancelledById()==null) || 
             (this.cancelledById!=null &&
              this.cancelledById.equals(other.getCancelledById()))) &&
            ((this.cancelledDate==null && other.getCancelledDate()==null) || 
             (this.cancelledDate!=null &&
              this.cancelledDate.equals(other.getCancelledDate()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerNumber==null && other.getCustomerNumber()==null) || 
             (this.customerNumber!=null &&
              this.customerNumber.equals(other.getCustomerNumber()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.invoiceItemName==null && other.getInvoiceItemName()==null) || 
             (this.invoiceItemName!=null &&
              this.invoiceItemName.equals(other.getInvoiceItemName()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.serviceEndDate==null && other.getServiceEndDate()==null) || 
             (this.serviceEndDate!=null &&
              this.serviceEndDate.equals(other.getServiceEndDate()))) &&
            ((this.serviceStartDate==null && other.getServiceStartDate()==null) || 
             (this.serviceStartDate!=null &&
              this.serviceStartDate.equals(other.getServiceStartDate()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.sourceType==null && other.getSourceType()==null) || 
             (this.sourceType!=null &&
              this.sourceType.equals(other.getSourceType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        if (getAdjustmentDate() != null) {
            _hashCode += getAdjustmentDate().hashCode();
        }
        if (getAdjustmentNumber() != null) {
            _hashCode += getAdjustmentNumber().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCancelledById() != null) {
            _hashCode += getCancelledById().hashCode();
        }
        if (getCancelledDate() != null) {
            _hashCode += getCancelledDate().hashCode();
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
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerNumber() != null) {
            _hashCode += getCustomerNumber().hashCode();
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getInvoiceItemName() != null) {
            _hashCode += getInvoiceItemName().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getServiceEndDate() != null) {
            _hashCode += getServiceEndDate().hashCode();
        }
        if (getServiceStartDate() != null) {
            _hashCode += getServiceStartDate().hashCode();
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        if (getSourceType() != null) {
            _hashCode += getSourceType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
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
        new org.apache.axis.description.TypeDesc(InvoiceItemAdjustment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceItemAdjustment"));
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
        elemField.setFieldName("adjustmentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AdjustmentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AdjustmentNumber"));
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
        elemField.setFieldName("cancelledById");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CancelledById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CancelledDate"));
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
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CustomerNumber"));
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
        elemField.setFieldName("invoiceItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceItemName"));
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
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ServiceEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ServiceStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SourceType"));
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
