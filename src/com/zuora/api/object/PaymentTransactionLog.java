/**
 * PaymentTransactionLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class PaymentTransactionLog  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String AVSResponseCode;

    private java.lang.String batchId;

    private java.lang.String CVVResponseCode;

    private java.lang.String gatewayReasonCode;

    private java.lang.String gatewayReasonCodeDescription;

    private java.lang.String gatewayState;

    private java.lang.String gatewayTransactionType;

    private java.lang.String paymentId;

    private java.lang.String requestString;

    private java.lang.String responseString;

    private java.util.Calendar transactionDate;

    private java.lang.String transactionId;

    public PaymentTransactionLog() {
    }

    public PaymentTransactionLog(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String AVSResponseCode,
           java.lang.String batchId,
           java.lang.String CVVResponseCode,
           java.lang.String gatewayReasonCode,
           java.lang.String gatewayReasonCodeDescription,
           java.lang.String gatewayState,
           java.lang.String gatewayTransactionType,
           java.lang.String paymentId,
           java.lang.String requestString,
           java.lang.String responseString,
           java.util.Calendar transactionDate,
           java.lang.String transactionId) {
        super(
            fieldsToNull,
            id);
        this.AVSResponseCode = AVSResponseCode;
        this.batchId = batchId;
        this.CVVResponseCode = CVVResponseCode;
        this.gatewayReasonCode = gatewayReasonCode;
        this.gatewayReasonCodeDescription = gatewayReasonCodeDescription;
        this.gatewayState = gatewayState;
        this.gatewayTransactionType = gatewayTransactionType;
        this.paymentId = paymentId;
        this.requestString = requestString;
        this.responseString = responseString;
        this.transactionDate = transactionDate;
        this.transactionId = transactionId;
    }


    /**
     * Gets the AVSResponseCode value for this PaymentTransactionLog.
     * 
     * @return AVSResponseCode
     */
    public java.lang.String getAVSResponseCode() {
        return AVSResponseCode;
    }


    /**
     * Sets the AVSResponseCode value for this PaymentTransactionLog.
     * 
     * @param AVSResponseCode
     */
    public void setAVSResponseCode(java.lang.String AVSResponseCode) {
        this.AVSResponseCode = AVSResponseCode;
    }


    /**
     * Gets the batchId value for this PaymentTransactionLog.
     * 
     * @return batchId
     */
    public java.lang.String getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this PaymentTransactionLog.
     * 
     * @param batchId
     */
    public void setBatchId(java.lang.String batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the CVVResponseCode value for this PaymentTransactionLog.
     * 
     * @return CVVResponseCode
     */
    public java.lang.String getCVVResponseCode() {
        return CVVResponseCode;
    }


    /**
     * Sets the CVVResponseCode value for this PaymentTransactionLog.
     * 
     * @param CVVResponseCode
     */
    public void setCVVResponseCode(java.lang.String CVVResponseCode) {
        this.CVVResponseCode = CVVResponseCode;
    }


    /**
     * Gets the gatewayReasonCode value for this PaymentTransactionLog.
     * 
     * @return gatewayReasonCode
     */
    public java.lang.String getGatewayReasonCode() {
        return gatewayReasonCode;
    }


    /**
     * Sets the gatewayReasonCode value for this PaymentTransactionLog.
     * 
     * @param gatewayReasonCode
     */
    public void setGatewayReasonCode(java.lang.String gatewayReasonCode) {
        this.gatewayReasonCode = gatewayReasonCode;
    }


    /**
     * Gets the gatewayReasonCodeDescription value for this PaymentTransactionLog.
     * 
     * @return gatewayReasonCodeDescription
     */
    public java.lang.String getGatewayReasonCodeDescription() {
        return gatewayReasonCodeDescription;
    }


    /**
     * Sets the gatewayReasonCodeDescription value for this PaymentTransactionLog.
     * 
     * @param gatewayReasonCodeDescription
     */
    public void setGatewayReasonCodeDescription(java.lang.String gatewayReasonCodeDescription) {
        this.gatewayReasonCodeDescription = gatewayReasonCodeDescription;
    }


    /**
     * Gets the gatewayState value for this PaymentTransactionLog.
     * 
     * @return gatewayState
     */
    public java.lang.String getGatewayState() {
        return gatewayState;
    }


    /**
     * Sets the gatewayState value for this PaymentTransactionLog.
     * 
     * @param gatewayState
     */
    public void setGatewayState(java.lang.String gatewayState) {
        this.gatewayState = gatewayState;
    }


    /**
     * Gets the gatewayTransactionType value for this PaymentTransactionLog.
     * 
     * @return gatewayTransactionType
     */
    public java.lang.String getGatewayTransactionType() {
        return gatewayTransactionType;
    }


    /**
     * Sets the gatewayTransactionType value for this PaymentTransactionLog.
     * 
     * @param gatewayTransactionType
     */
    public void setGatewayTransactionType(java.lang.String gatewayTransactionType) {
        this.gatewayTransactionType = gatewayTransactionType;
    }


    /**
     * Gets the paymentId value for this PaymentTransactionLog.
     * 
     * @return paymentId
     */
    public java.lang.String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this PaymentTransactionLog.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the requestString value for this PaymentTransactionLog.
     * 
     * @return requestString
     */
    public java.lang.String getRequestString() {
        return requestString;
    }


    /**
     * Sets the requestString value for this PaymentTransactionLog.
     * 
     * @param requestString
     */
    public void setRequestString(java.lang.String requestString) {
        this.requestString = requestString;
    }


    /**
     * Gets the responseString value for this PaymentTransactionLog.
     * 
     * @return responseString
     */
    public java.lang.String getResponseString() {
        return responseString;
    }


    /**
     * Sets the responseString value for this PaymentTransactionLog.
     * 
     * @param responseString
     */
    public void setResponseString(java.lang.String responseString) {
        this.responseString = responseString;
    }


    /**
     * Gets the transactionDate value for this PaymentTransactionLog.
     * 
     * @return transactionDate
     */
    public java.util.Calendar getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this PaymentTransactionLog.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.util.Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the transactionId value for this PaymentTransactionLog.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PaymentTransactionLog.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentTransactionLog)) return false;
        PaymentTransactionLog other = (PaymentTransactionLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.AVSResponseCode==null && other.getAVSResponseCode()==null) || 
             (this.AVSResponseCode!=null &&
              this.AVSResponseCode.equals(other.getAVSResponseCode()))) &&
            ((this.batchId==null && other.getBatchId()==null) || 
             (this.batchId!=null &&
              this.batchId.equals(other.getBatchId()))) &&
            ((this.CVVResponseCode==null && other.getCVVResponseCode()==null) || 
             (this.CVVResponseCode!=null &&
              this.CVVResponseCode.equals(other.getCVVResponseCode()))) &&
            ((this.gatewayReasonCode==null && other.getGatewayReasonCode()==null) || 
             (this.gatewayReasonCode!=null &&
              this.gatewayReasonCode.equals(other.getGatewayReasonCode()))) &&
            ((this.gatewayReasonCodeDescription==null && other.getGatewayReasonCodeDescription()==null) || 
             (this.gatewayReasonCodeDescription!=null &&
              this.gatewayReasonCodeDescription.equals(other.getGatewayReasonCodeDescription()))) &&
            ((this.gatewayState==null && other.getGatewayState()==null) || 
             (this.gatewayState!=null &&
              this.gatewayState.equals(other.getGatewayState()))) &&
            ((this.gatewayTransactionType==null && other.getGatewayTransactionType()==null) || 
             (this.gatewayTransactionType!=null &&
              this.gatewayTransactionType.equals(other.getGatewayTransactionType()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.requestString==null && other.getRequestString()==null) || 
             (this.requestString!=null &&
              this.requestString.equals(other.getRequestString()))) &&
            ((this.responseString==null && other.getResponseString()==null) || 
             (this.responseString!=null &&
              this.responseString.equals(other.getResponseString()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getAVSResponseCode() != null) {
            _hashCode += getAVSResponseCode().hashCode();
        }
        if (getBatchId() != null) {
            _hashCode += getBatchId().hashCode();
        }
        if (getCVVResponseCode() != null) {
            _hashCode += getCVVResponseCode().hashCode();
        }
        if (getGatewayReasonCode() != null) {
            _hashCode += getGatewayReasonCode().hashCode();
        }
        if (getGatewayReasonCodeDescription() != null) {
            _hashCode += getGatewayReasonCodeDescription().hashCode();
        }
        if (getGatewayState() != null) {
            _hashCode += getGatewayState().hashCode();
        }
        if (getGatewayTransactionType() != null) {
            _hashCode += getGatewayTransactionType().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getRequestString() != null) {
            _hashCode += getRequestString().hashCode();
        }
        if (getResponseString() != null) {
            _hashCode += getResponseString().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentTransactionLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentTransactionLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AVSResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AVSResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVVResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CVVResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayReasonCodeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayReasonCodeDescription"));
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
        elemField.setFieldName("gatewayTransactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayTransactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RequestString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ResponseString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
