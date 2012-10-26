/**
 * Usage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class Usage  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String accountNumber;

    private java.lang.String chargeId;

    private java.lang.String chargeNumber;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private java.util.Calendar endDateTime;

    private java.lang.String importId;

    private java.lang.String invoiceId;

    private java.lang.String invoiceNumber;

    private java.math.BigDecimal quantity;

    private java.lang.String rbeStatus;

    private java.lang.String sourceName;

    private java.lang.String sourceType;

    private java.util.Calendar startDateTime;

    private java.util.Calendar submissionDateTime;

    private java.lang.String subscriptionId;

    private java.lang.String subscriptionNumber;

    private java.lang.String UOM;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public Usage() {
    }

    public Usage(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.lang.String accountNumber,
           java.lang.String chargeId,
           java.lang.String chargeNumber,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           java.util.Calendar endDateTime,
           java.lang.String importId,
           java.lang.String invoiceId,
           java.lang.String invoiceNumber,
           java.math.BigDecimal quantity,
           java.lang.String rbeStatus,
           java.lang.String sourceName,
           java.lang.String sourceType,
           java.util.Calendar startDateTime,
           java.util.Calendar submissionDateTime,
           java.lang.String subscriptionId,
           java.lang.String subscriptionNumber,
           java.lang.String UOM,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.chargeId = chargeId;
        this.chargeNumber = chargeNumber;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.endDateTime = endDateTime;
        this.importId = importId;
        this.invoiceId = invoiceId;
        this.invoiceNumber = invoiceNumber;
        this.quantity = quantity;
        this.rbeStatus = rbeStatus;
        this.sourceName = sourceName;
        this.sourceType = sourceType;
        this.startDateTime = startDateTime;
        this.submissionDateTime = submissionDateTime;
        this.subscriptionId = subscriptionId;
        this.subscriptionNumber = subscriptionNumber;
        this.UOM = UOM;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the accountId value for this Usage.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Usage.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountNumber value for this Usage.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Usage.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the chargeId value for this Usage.
     * 
     * @return chargeId
     */
    public java.lang.String getChargeId() {
        return chargeId;
    }


    /**
     * Sets the chargeId value for this Usage.
     * 
     * @param chargeId
     */
    public void setChargeId(java.lang.String chargeId) {
        this.chargeId = chargeId;
    }


    /**
     * Gets the chargeNumber value for this Usage.
     * 
     * @return chargeNumber
     */
    public java.lang.String getChargeNumber() {
        return chargeNumber;
    }


    /**
     * Sets the chargeNumber value for this Usage.
     * 
     * @param chargeNumber
     */
    public void setChargeNumber(java.lang.String chargeNumber) {
        this.chargeNumber = chargeNumber;
    }


    /**
     * Gets the createdById value for this Usage.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Usage.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Usage.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Usage.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this Usage.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Usage.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the endDateTime value for this Usage.
     * 
     * @return endDateTime
     */
    public java.util.Calendar getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this Usage.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.util.Calendar endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the importId value for this Usage.
     * 
     * @return importId
     */
    public java.lang.String getImportId() {
        return importId;
    }


    /**
     * Sets the importId value for this Usage.
     * 
     * @param importId
     */
    public void setImportId(java.lang.String importId) {
        this.importId = importId;
    }


    /**
     * Gets the invoiceId value for this Usage.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this Usage.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the invoiceNumber value for this Usage.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this Usage.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the quantity value for this Usage.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Usage.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the rbeStatus value for this Usage.
     * 
     * @return rbeStatus
     */
    public java.lang.String getRbeStatus() {
        return rbeStatus;
    }


    /**
     * Sets the rbeStatus value for this Usage.
     * 
     * @param rbeStatus
     */
    public void setRbeStatus(java.lang.String rbeStatus) {
        this.rbeStatus = rbeStatus;
    }


    /**
     * Gets the sourceName value for this Usage.
     * 
     * @return sourceName
     */
    public java.lang.String getSourceName() {
        return sourceName;
    }


    /**
     * Sets the sourceName value for this Usage.
     * 
     * @param sourceName
     */
    public void setSourceName(java.lang.String sourceName) {
        this.sourceName = sourceName;
    }


    /**
     * Gets the sourceType value for this Usage.
     * 
     * @return sourceType
     */
    public java.lang.String getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this Usage.
     * 
     * @param sourceType
     */
    public void setSourceType(java.lang.String sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the startDateTime value for this Usage.
     * 
     * @return startDateTime
     */
    public java.util.Calendar getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this Usage.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.util.Calendar startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the submissionDateTime value for this Usage.
     * 
     * @return submissionDateTime
     */
    public java.util.Calendar getSubmissionDateTime() {
        return submissionDateTime;
    }


    /**
     * Sets the submissionDateTime value for this Usage.
     * 
     * @param submissionDateTime
     */
    public void setSubmissionDateTime(java.util.Calendar submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
    }


    /**
     * Gets the subscriptionId value for this Usage.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this Usage.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the subscriptionNumber value for this Usage.
     * 
     * @return subscriptionNumber
     */
    public java.lang.String getSubscriptionNumber() {
        return subscriptionNumber;
    }


    /**
     * Sets the subscriptionNumber value for this Usage.
     * 
     * @param subscriptionNumber
     */
    public void setSubscriptionNumber(java.lang.String subscriptionNumber) {
        this.subscriptionNumber = subscriptionNumber;
    }


    /**
     * Gets the UOM value for this Usage.
     * 
     * @return UOM
     */
    public java.lang.String getUOM() {
        return UOM;
    }


    /**
     * Sets the UOM value for this Usage.
     * 
     * @param UOM
     */
    public void setUOM(java.lang.String UOM) {
        this.UOM = UOM;
    }


    /**
     * Gets the updatedById value for this Usage.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this Usage.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this Usage.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this Usage.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Usage)) return false;
        Usage other = (Usage) obj;
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
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.chargeId==null && other.getChargeId()==null) || 
             (this.chargeId!=null &&
              this.chargeId.equals(other.getChargeId()))) &&
            ((this.chargeNumber==null && other.getChargeNumber()==null) || 
             (this.chargeNumber!=null &&
              this.chargeNumber.equals(other.getChargeNumber()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.importId==null && other.getImportId()==null) || 
             (this.importId!=null &&
              this.importId.equals(other.getImportId()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.rbeStatus==null && other.getRbeStatus()==null) || 
             (this.rbeStatus!=null &&
              this.rbeStatus.equals(other.getRbeStatus()))) &&
            ((this.sourceName==null && other.getSourceName()==null) || 
             (this.sourceName!=null &&
              this.sourceName.equals(other.getSourceName()))) &&
            ((this.sourceType==null && other.getSourceType()==null) || 
             (this.sourceType!=null &&
              this.sourceType.equals(other.getSourceType()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.submissionDateTime==null && other.getSubmissionDateTime()==null) || 
             (this.submissionDateTime!=null &&
              this.submissionDateTime.equals(other.getSubmissionDateTime()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
            ((this.subscriptionNumber==null && other.getSubscriptionNumber()==null) || 
             (this.subscriptionNumber!=null &&
              this.subscriptionNumber.equals(other.getSubscriptionNumber()))) &&
            ((this.UOM==null && other.getUOM()==null) || 
             (this.UOM!=null &&
              this.UOM.equals(other.getUOM()))) &&
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getChargeId() != null) {
            _hashCode += getChargeId().hashCode();
        }
        if (getChargeNumber() != null) {
            _hashCode += getChargeNumber().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getImportId() != null) {
            _hashCode += getImportId().hashCode();
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRbeStatus() != null) {
            _hashCode += getRbeStatus().hashCode();
        }
        if (getSourceName() != null) {
            _hashCode += getSourceName().hashCode();
        }
        if (getSourceType() != null) {
            _hashCode += getSourceType().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getSubmissionDateTime() != null) {
            _hashCode += getSubmissionDateTime().hashCode();
        }
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        if (getSubscriptionNumber() != null) {
            _hashCode += getSubscriptionNumber().hashCode();
        }
        if (getUOM() != null) {
            _hashCode += getUOM().hashCode();
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
        new org.apache.axis.description.TypeDesc(Usage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Usage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargeNumber"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "EndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ImportId"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rbeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RbeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SourceName"));
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
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "StartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submissionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SubmissionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SubscriptionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UOM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UOM"));
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
