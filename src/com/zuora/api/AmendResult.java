/**
 * AmendResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class AmendResult  implements java.io.Serializable {
    private java.lang.String[] amendmentIds;

    private com.zuora.api.Error[] errors;

    private com.zuora.api.InvoiceData[] invoiceDatas;

    private java.lang.String invoiceId;

    private java.lang.String paymentTransactionNumber;

    private java.lang.Boolean success;

    public AmendResult() {
    }

    public AmendResult(
           java.lang.String[] amendmentIds,
           com.zuora.api.Error[] errors,
           com.zuora.api.InvoiceData[] invoiceDatas,
           java.lang.String invoiceId,
           java.lang.String paymentTransactionNumber,
           java.lang.Boolean success) {
           this.amendmentIds = amendmentIds;
           this.errors = errors;
           this.invoiceDatas = invoiceDatas;
           this.invoiceId = invoiceId;
           this.paymentTransactionNumber = paymentTransactionNumber;
           this.success = success;
    }


    /**
     * Gets the amendmentIds value for this AmendResult.
     * 
     * @return amendmentIds
     */
    public java.lang.String[] getAmendmentIds() {
        return amendmentIds;
    }


    /**
     * Sets the amendmentIds value for this AmendResult.
     * 
     * @param amendmentIds
     */
    public void setAmendmentIds(java.lang.String[] amendmentIds) {
        this.amendmentIds = amendmentIds;
    }

    public java.lang.String getAmendmentIds(int i) {
        return this.amendmentIds[i];
    }

    public void setAmendmentIds(int i, java.lang.String _value) {
        this.amendmentIds[i] = _value;
    }


    /**
     * Gets the errors value for this AmendResult.
     * 
     * @return errors
     */
    public com.zuora.api.Error[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this AmendResult.
     * 
     * @param errors
     */
    public void setErrors(com.zuora.api.Error[] errors) {
        this.errors = errors;
    }

    public com.zuora.api.Error getErrors(int i) {
        return this.errors[i];
    }

    public void setErrors(int i, com.zuora.api.Error _value) {
        this.errors[i] = _value;
    }


    /**
     * Gets the invoiceDatas value for this AmendResult.
     * 
     * @return invoiceDatas
     */
    public com.zuora.api.InvoiceData[] getInvoiceDatas() {
        return invoiceDatas;
    }


    /**
     * Sets the invoiceDatas value for this AmendResult.
     * 
     * @param invoiceDatas
     */
    public void setInvoiceDatas(com.zuora.api.InvoiceData[] invoiceDatas) {
        this.invoiceDatas = invoiceDatas;
    }

    public com.zuora.api.InvoiceData getInvoiceDatas(int i) {
        return this.invoiceDatas[i];
    }

    public void setInvoiceDatas(int i, com.zuora.api.InvoiceData _value) {
        this.invoiceDatas[i] = _value;
    }


    /**
     * Gets the invoiceId value for this AmendResult.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this AmendResult.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the paymentTransactionNumber value for this AmendResult.
     * 
     * @return paymentTransactionNumber
     */
    public java.lang.String getPaymentTransactionNumber() {
        return paymentTransactionNumber;
    }


    /**
     * Sets the paymentTransactionNumber value for this AmendResult.
     * 
     * @param paymentTransactionNumber
     */
    public void setPaymentTransactionNumber(java.lang.String paymentTransactionNumber) {
        this.paymentTransactionNumber = paymentTransactionNumber;
    }


    /**
     * Gets the success value for this AmendResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this AmendResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AmendResult)) return false;
        AmendResult other = (AmendResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amendmentIds==null && other.getAmendmentIds()==null) || 
             (this.amendmentIds!=null &&
              java.util.Arrays.equals(this.amendmentIds, other.getAmendmentIds()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.invoiceDatas==null && other.getInvoiceDatas()==null) || 
             (this.invoiceDatas!=null &&
              java.util.Arrays.equals(this.invoiceDatas, other.getInvoiceDatas()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.paymentTransactionNumber==null && other.getPaymentTransactionNumber()==null) || 
             (this.paymentTransactionNumber!=null &&
              this.paymentTransactionNumber.equals(other.getPaymentTransactionNumber()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAmendmentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmendmentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmendmentIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoiceDatas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceDatas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceDatas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getPaymentTransactionNumber() != null) {
            _hashCode += getPaymentTransactionNumber().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AmendResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "AmendResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amendmentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "AmendmentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "Error"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDatas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceDatas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTransactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "PaymentTransactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
