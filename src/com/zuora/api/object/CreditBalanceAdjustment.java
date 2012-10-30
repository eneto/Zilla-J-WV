/**
 * CreditBalanceAdjustment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class CreditBalanceAdjustment  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String accountingCode;

    private java.util.Calendar adjustmentDate;

    private java.math.BigDecimal amount;

    private java.lang.String comment;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String number;

    private java.lang.String referenceId;

    private java.lang.String sourceTransactionId;

    private java.lang.String sourceTransactionNumber;

    private java.lang.String sourceTransactionType;

    private java.lang.String status;

    private java.lang.String transferredToAccounting;

    private java.lang.String type;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public CreditBalanceAdjustment() {
    }

    public CreditBalanceAdjustment(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.lang.String accountingCode,
           java.util.Calendar adjustmentDate,
           java.math.BigDecimal amount,
           java.lang.String comment,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String number,
           java.lang.String referenceId,
           java.lang.String sourceTransactionId,
           java.lang.String sourceTransactionNumber,
           java.lang.String sourceTransactionType,
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
        this.amount = amount;
        this.comment = comment;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.number = number;
        this.referenceId = referenceId;
        this.sourceTransactionId = sourceTransactionId;
        this.sourceTransactionNumber = sourceTransactionNumber;
        this.sourceTransactionType = sourceTransactionType;
        this.status = status;
        this.transferredToAccounting = transferredToAccounting;
        this.type = type;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the accountId value for this CreditBalanceAdjustment.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this CreditBalanceAdjustment.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountingCode value for this CreditBalanceAdjustment.
     * 
     * @return accountingCode
     */
    public java.lang.String getAccountingCode() {
        return accountingCode;
    }


    /**
     * Sets the accountingCode value for this CreditBalanceAdjustment.
     * 
     * @param accountingCode
     */
    public void setAccountingCode(java.lang.String accountingCode) {
        this.accountingCode = accountingCode;
    }


    /**
     * Gets the adjustmentDate value for this CreditBalanceAdjustment.
     * 
     * @return adjustmentDate
     */
    public java.util.Calendar getAdjustmentDate() {
        return adjustmentDate;
    }


    /**
     * Sets the adjustmentDate value for this CreditBalanceAdjustment.
     * 
     * @param adjustmentDate
     */
    public void setAdjustmentDate(java.util.Calendar adjustmentDate) {
        this.adjustmentDate = adjustmentDate;
    }


    /**
     * Gets the amount value for this CreditBalanceAdjustment.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CreditBalanceAdjustment.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the comment value for this CreditBalanceAdjustment.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this CreditBalanceAdjustment.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the createdById value for this CreditBalanceAdjustment.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CreditBalanceAdjustment.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CreditBalanceAdjustment.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CreditBalanceAdjustment.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the number value for this CreditBalanceAdjustment.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CreditBalanceAdjustment.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the referenceId value for this CreditBalanceAdjustment.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this CreditBalanceAdjustment.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the sourceTransactionId value for this CreditBalanceAdjustment.
     * 
     * @return sourceTransactionId
     */
    public java.lang.String getSourceTransactionId() {
        return sourceTransactionId;
    }


    /**
     * Sets the sourceTransactionId value for this CreditBalanceAdjustment.
     * 
     * @param sourceTransactionId
     */
    public void setSourceTransactionId(java.lang.String sourceTransactionId) {
        this.sourceTransactionId = sourceTransactionId;
    }


    /**
     * Gets the sourceTransactionNumber value for this CreditBalanceAdjustment.
     * 
     * @return sourceTransactionNumber
     */
    public java.lang.String getSourceTransactionNumber() {
        return sourceTransactionNumber;
    }


    /**
     * Sets the sourceTransactionNumber value for this CreditBalanceAdjustment.
     * 
     * @param sourceTransactionNumber
     */
    public void setSourceTransactionNumber(java.lang.String sourceTransactionNumber) {
        this.sourceTransactionNumber = sourceTransactionNumber;
    }


    /**
     * Gets the sourceTransactionType value for this CreditBalanceAdjustment.
     * 
     * @return sourceTransactionType
     */
    public java.lang.String getSourceTransactionType() {
        return sourceTransactionType;
    }


    /**
     * Sets the sourceTransactionType value for this CreditBalanceAdjustment.
     * 
     * @param sourceTransactionType
     */
    public void setSourceTransactionType(java.lang.String sourceTransactionType) {
        this.sourceTransactionType = sourceTransactionType;
    }


    /**
     * Gets the status value for this CreditBalanceAdjustment.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CreditBalanceAdjustment.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the transferredToAccounting value for this CreditBalanceAdjustment.
     * 
     * @return transferredToAccounting
     */
    public java.lang.String getTransferredToAccounting() {
        return transferredToAccounting;
    }


    /**
     * Sets the transferredToAccounting value for this CreditBalanceAdjustment.
     * 
     * @param transferredToAccounting
     */
    public void setTransferredToAccounting(java.lang.String transferredToAccounting) {
        this.transferredToAccounting = transferredToAccounting;
    }


    /**
     * Gets the type value for this CreditBalanceAdjustment.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CreditBalanceAdjustment.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the updatedById value for this CreditBalanceAdjustment.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this CreditBalanceAdjustment.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this CreditBalanceAdjustment.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this CreditBalanceAdjustment.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditBalanceAdjustment)) return false;
        CreditBalanceAdjustment other = (CreditBalanceAdjustment) obj;
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
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.sourceTransactionId==null && other.getSourceTransactionId()==null) || 
             (this.sourceTransactionId!=null &&
              this.sourceTransactionId.equals(other.getSourceTransactionId()))) &&
            ((this.sourceTransactionNumber==null && other.getSourceTransactionNumber()==null) || 
             (this.sourceTransactionNumber!=null &&
              this.sourceTransactionNumber.equals(other.getSourceTransactionNumber()))) &&
            ((this.sourceTransactionType==null && other.getSourceTransactionType()==null) || 
             (this.sourceTransactionType!=null &&
              this.sourceTransactionType.equals(other.getSourceTransactionType()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getSourceTransactionId() != null) {
            _hashCode += getSourceTransactionId().hashCode();
        }
        if (getSourceTransactionNumber() != null) {
            _hashCode += getSourceTransactionNumber().hashCode();
        }
        if (getSourceTransactionType() != null) {
            _hashCode += getSourceTransactionType().hashCode();
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
        new org.apache.axis.description.TypeDesc(CreditBalanceAdjustment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditBalanceAdjustment"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Number"));
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
        elemField.setFieldName("sourceTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SourceTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceTransactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SourceTransactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceTransactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SourceTransactionType"));
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
