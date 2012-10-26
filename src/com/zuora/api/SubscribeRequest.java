/**
 * SubscribeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class SubscribeRequest  implements java.io.Serializable {
    private com.zuora.api.object.Account account;

    private com.zuora.api.object.PaymentMethod paymentMethod;

    private com.zuora.api.object.Contact billToContact;

    private com.zuora.api.PreviewOptions previewOptions;

    private com.zuora.api.object.Contact soldToContact;

    private com.zuora.api.SubscribeOptions subscribeOptions;

    private com.zuora.api.SubscriptionData subscriptionData;

    public SubscribeRequest() {
    }

    public SubscribeRequest(
           com.zuora.api.object.Account account,
           com.zuora.api.object.PaymentMethod paymentMethod,
           com.zuora.api.object.Contact billToContact,
           com.zuora.api.PreviewOptions previewOptions,
           com.zuora.api.object.Contact soldToContact,
           com.zuora.api.SubscribeOptions subscribeOptions,
           com.zuora.api.SubscriptionData subscriptionData) {
           this.account = account;
           this.paymentMethod = paymentMethod;
           this.billToContact = billToContact;
           this.previewOptions = previewOptions;
           this.soldToContact = soldToContact;
           this.subscribeOptions = subscribeOptions;
           this.subscriptionData = subscriptionData;
    }


    /**
     * Gets the account value for this SubscribeRequest.
     * 
     * @return account
     */
    public com.zuora.api.object.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this SubscribeRequest.
     * 
     * @param account
     */
    public void setAccount(com.zuora.api.object.Account account) {
        this.account = account;
    }


    /**
     * Gets the paymentMethod value for this SubscribeRequest.
     * 
     * @return paymentMethod
     */
    public com.zuora.api.object.PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this SubscribeRequest.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.zuora.api.object.PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the billToContact value for this SubscribeRequest.
     * 
     * @return billToContact
     */
    public com.zuora.api.object.Contact getBillToContact() {
        return billToContact;
    }


    /**
     * Sets the billToContact value for this SubscribeRequest.
     * 
     * @param billToContact
     */
    public void setBillToContact(com.zuora.api.object.Contact billToContact) {
        this.billToContact = billToContact;
    }


    /**
     * Gets the previewOptions value for this SubscribeRequest.
     * 
     * @return previewOptions
     */
    public com.zuora.api.PreviewOptions getPreviewOptions() {
        return previewOptions;
    }


    /**
     * Sets the previewOptions value for this SubscribeRequest.
     * 
     * @param previewOptions
     */
    public void setPreviewOptions(com.zuora.api.PreviewOptions previewOptions) {
        this.previewOptions = previewOptions;
    }


    /**
     * Gets the soldToContact value for this SubscribeRequest.
     * 
     * @return soldToContact
     */
    public com.zuora.api.object.Contact getSoldToContact() {
        return soldToContact;
    }


    /**
     * Sets the soldToContact value for this SubscribeRequest.
     * 
     * @param soldToContact
     */
    public void setSoldToContact(com.zuora.api.object.Contact soldToContact) {
        this.soldToContact = soldToContact;
    }


    /**
     * Gets the subscribeOptions value for this SubscribeRequest.
     * 
     * @return subscribeOptions
     */
    public com.zuora.api.SubscribeOptions getSubscribeOptions() {
        return subscribeOptions;
    }


    /**
     * Sets the subscribeOptions value for this SubscribeRequest.
     * 
     * @param subscribeOptions
     */
    public void setSubscribeOptions(com.zuora.api.SubscribeOptions subscribeOptions) {
        this.subscribeOptions = subscribeOptions;
    }


    /**
     * Gets the subscriptionData value for this SubscribeRequest.
     * 
     * @return subscriptionData
     */
    public com.zuora.api.SubscriptionData getSubscriptionData() {
        return subscriptionData;
    }


    /**
     * Sets the subscriptionData value for this SubscribeRequest.
     * 
     * @param subscriptionData
     */
    public void setSubscriptionData(com.zuora.api.SubscriptionData subscriptionData) {
        this.subscriptionData = subscriptionData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribeRequest)) return false;
        SubscribeRequest other = (SubscribeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.billToContact==null && other.getBillToContact()==null) || 
             (this.billToContact!=null &&
              this.billToContact.equals(other.getBillToContact()))) &&
            ((this.previewOptions==null && other.getPreviewOptions()==null) || 
             (this.previewOptions!=null &&
              this.previewOptions.equals(other.getPreviewOptions()))) &&
            ((this.soldToContact==null && other.getSoldToContact()==null) || 
             (this.soldToContact!=null &&
              this.soldToContact.equals(other.getSoldToContact()))) &&
            ((this.subscribeOptions==null && other.getSubscribeOptions()==null) || 
             (this.subscribeOptions!=null &&
              this.subscribeOptions.equals(other.getSubscribeOptions()))) &&
            ((this.subscriptionData==null && other.getSubscriptionData()==null) || 
             (this.subscriptionData!=null &&
              this.subscriptionData.equals(other.getSubscriptionData())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getBillToContact() != null) {
            _hashCode += getBillToContact().hashCode();
        }
        if (getPreviewOptions() != null) {
            _hashCode += getPreviewOptions().hashCode();
        }
        if (getSoldToContact() != null) {
            _hashCode += getSoldToContact().hashCode();
        }
        if (getSubscribeOptions() != null) {
            _hashCode += getSubscribeOptions().hashCode();
        }
        if (getSubscriptionData() != null) {
            _hashCode += getSubscriptionData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscribeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "PaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "BillToContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previewOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "PreviewOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "PreviewOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "SoldToContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribeOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscriptionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscriptionData"));
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
