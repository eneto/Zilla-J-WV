/**
 * SubscribeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class SubscribeResult  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String accountNumber;

    private com.zuora.api.Error[] errors;

    private com.zuora.api.InvoiceData[] invoiceData;

    private java.lang.String invoiceId;

    private java.lang.String invoiceNumber;

    private com.zuora.api.object.Invoice[] invoiceResult;

    private java.lang.String paymentTransactionNumber;

    private java.lang.String subscriptionId;

    private java.lang.String subscriptionNumber;

    private java.lang.Boolean success;

    public SubscribeResult() {
    }

    public SubscribeResult(
           java.lang.String accountId,
           java.lang.String accountNumber,
           com.zuora.api.Error[] errors,
           com.zuora.api.InvoiceData[] invoiceData,
           java.lang.String invoiceId,
           java.lang.String invoiceNumber,
           com.zuora.api.object.Invoice[] invoiceResult,
           java.lang.String paymentTransactionNumber,
           java.lang.String subscriptionId,
           java.lang.String subscriptionNumber,
           java.lang.Boolean success) {
           this.accountId = accountId;
           this.accountNumber = accountNumber;
           this.errors = errors;
           this.invoiceData = invoiceData;
           this.invoiceId = invoiceId;
           this.invoiceNumber = invoiceNumber;
           this.invoiceResult = invoiceResult;
           this.paymentTransactionNumber = paymentTransactionNumber;
           this.subscriptionId = subscriptionId;
           this.subscriptionNumber = subscriptionNumber;
           this.success = success;
    }


    /**
     * Gets the accountId value for this SubscribeResult.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this SubscribeResult.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountNumber value for this SubscribeResult.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this SubscribeResult.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the errors value for this SubscribeResult.
     * 
     * @return errors
     */
    public com.zuora.api.Error[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this SubscribeResult.
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
     * Gets the invoiceData value for this SubscribeResult.
     * 
     * @return invoiceData
     */
    public com.zuora.api.InvoiceData[] getInvoiceData() {
        return invoiceData;
    }


    /**
     * Sets the invoiceData value for this SubscribeResult.
     * 
     * @param invoiceData
     */
    public void setInvoiceData(com.zuora.api.InvoiceData[] invoiceData) {
        this.invoiceData = invoiceData;
    }

    public com.zuora.api.InvoiceData getInvoiceData(int i) {
        return this.invoiceData[i];
    }

    public void setInvoiceData(int i, com.zuora.api.InvoiceData _value) {
        this.invoiceData[i] = _value;
    }


    /**
     * Gets the invoiceId value for this SubscribeResult.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this SubscribeResult.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the invoiceNumber value for this SubscribeResult.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this SubscribeResult.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the invoiceResult value for this SubscribeResult.
     * 
     * @return invoiceResult
     */
    public com.zuora.api.object.Invoice[] getInvoiceResult() {
        return invoiceResult;
    }


    /**
     * Sets the invoiceResult value for this SubscribeResult.
     * 
     * @param invoiceResult
     */
    public void setInvoiceResult(com.zuora.api.object.Invoice[] invoiceResult) {
        this.invoiceResult = invoiceResult;
    }


    /**
     * Gets the paymentTransactionNumber value for this SubscribeResult.
     * 
     * @return paymentTransactionNumber
     */
    public java.lang.String getPaymentTransactionNumber() {
        return paymentTransactionNumber;
    }


    /**
     * Sets the paymentTransactionNumber value for this SubscribeResult.
     * 
     * @param paymentTransactionNumber
     */
    public void setPaymentTransactionNumber(java.lang.String paymentTransactionNumber) {
        this.paymentTransactionNumber = paymentTransactionNumber;
    }


    /**
     * Gets the subscriptionId value for this SubscribeResult.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this SubscribeResult.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the subscriptionNumber value for this SubscribeResult.
     * 
     * @return subscriptionNumber
     */
    public java.lang.String getSubscriptionNumber() {
        return subscriptionNumber;
    }


    /**
     * Sets the subscriptionNumber value for this SubscribeResult.
     * 
     * @param subscriptionNumber
     */
    public void setSubscriptionNumber(java.lang.String subscriptionNumber) {
        this.subscriptionNumber = subscriptionNumber;
    }


    /**
     * Gets the success value for this SubscribeResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this SubscribeResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribeResult)) return false;
        SubscribeResult other = (SubscribeResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.invoiceData==null && other.getInvoiceData()==null) || 
             (this.invoiceData!=null &&
              java.util.Arrays.equals(this.invoiceData, other.getInvoiceData()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.invoiceResult==null && other.getInvoiceResult()==null) || 
             (this.invoiceResult!=null &&
              java.util.Arrays.equals(this.invoiceResult, other.getInvoiceResult()))) &&
            ((this.paymentTransactionNumber==null && other.getPaymentTransactionNumber()==null) || 
             (this.paymentTransactionNumber!=null &&
              this.paymentTransactionNumber.equals(other.getPaymentTransactionNumber()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
            ((this.subscriptionNumber==null && other.getSubscriptionNumber()==null) || 
             (this.subscriptionNumber!=null &&
              this.subscriptionNumber.equals(other.getSubscriptionNumber()))) &&
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
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
        if (getInvoiceData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getInvoiceResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentTransactionNumber() != null) {
            _hashCode += getPaymentTransactionNumber().hashCode();
        }
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        if (getSubscriptionNumber() != null) {
            _hashCode += getSubscriptionNumber().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscribeResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("invoiceData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceData"));
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
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Invoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.zuora.com/", "Invoice"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTransactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "PaymentTransactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscriptionNumber"));
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
