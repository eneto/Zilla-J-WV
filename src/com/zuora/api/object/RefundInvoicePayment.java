/**
 * RefundInvoicePayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class RefundInvoicePayment  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String invoicePaymentId;

    private java.math.BigDecimal refundAmount;

    private java.lang.String refundId;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public RefundInvoicePayment() {
    }

    public RefundInvoicePayment(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String invoicePaymentId,
           java.math.BigDecimal refundAmount,
           java.lang.String refundId,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.invoicePaymentId = invoicePaymentId;
        this.refundAmount = refundAmount;
        this.refundId = refundId;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the createdById value for this RefundInvoicePayment.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this RefundInvoicePayment.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this RefundInvoicePayment.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RefundInvoicePayment.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the invoicePaymentId value for this RefundInvoicePayment.
     * 
     * @return invoicePaymentId
     */
    public java.lang.String getInvoicePaymentId() {
        return invoicePaymentId;
    }


    /**
     * Sets the invoicePaymentId value for this RefundInvoicePayment.
     * 
     * @param invoicePaymentId
     */
    public void setInvoicePaymentId(java.lang.String invoicePaymentId) {
        this.invoicePaymentId = invoicePaymentId;
    }


    /**
     * Gets the refundAmount value for this RefundInvoicePayment.
     * 
     * @return refundAmount
     */
    public java.math.BigDecimal getRefundAmount() {
        return refundAmount;
    }


    /**
     * Sets the refundAmount value for this RefundInvoicePayment.
     * 
     * @param refundAmount
     */
    public void setRefundAmount(java.math.BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * Gets the refundId value for this RefundInvoicePayment.
     * 
     * @return refundId
     */
    public java.lang.String getRefundId() {
        return refundId;
    }


    /**
     * Sets the refundId value for this RefundInvoicePayment.
     * 
     * @param refundId
     */
    public void setRefundId(java.lang.String refundId) {
        this.refundId = refundId;
    }


    /**
     * Gets the updatedById value for this RefundInvoicePayment.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this RefundInvoicePayment.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this RefundInvoicePayment.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this RefundInvoicePayment.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundInvoicePayment)) return false;
        RefundInvoicePayment other = (RefundInvoicePayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.invoicePaymentId==null && other.getInvoicePaymentId()==null) || 
             (this.invoicePaymentId!=null &&
              this.invoicePaymentId.equals(other.getInvoicePaymentId()))) &&
            ((this.refundAmount==null && other.getRefundAmount()==null) || 
             (this.refundAmount!=null &&
              this.refundAmount.equals(other.getRefundAmount()))) &&
            ((this.refundId==null && other.getRefundId()==null) || 
             (this.refundId!=null &&
              this.refundId.equals(other.getRefundId()))) &&
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
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getInvoicePaymentId() != null) {
            _hashCode += getInvoicePaymentId().hashCode();
        }
        if (getRefundAmount() != null) {
            _hashCode += getRefundAmount().hashCode();
        }
        if (getRefundId() != null) {
            _hashCode += getRefundId().hashCode();
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
        new org.apache.axis.description.TypeDesc(RefundInvoicePayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RefundInvoicePayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("invoicePaymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoicePaymentId"));
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
        elemField.setFieldName("refundId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RefundId"));
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
