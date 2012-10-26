/**
 * SubscriptionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class SubscriptionData  implements java.io.Serializable {
    private com.zuora.api.object.Subscription subscription;

    private com.zuora.api.RatePlanData[] ratePlanData;

    public SubscriptionData() {
    }

    public SubscriptionData(
           com.zuora.api.object.Subscription subscription,
           com.zuora.api.RatePlanData[] ratePlanData) {
           this.subscription = subscription;
           this.ratePlanData = ratePlanData;
    }


    /**
     * Gets the subscription value for this SubscriptionData.
     * 
     * @return subscription
     */
    public com.zuora.api.object.Subscription getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this SubscriptionData.
     * 
     * @param subscription
     */
    public void setSubscription(com.zuora.api.object.Subscription subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the ratePlanData value for this SubscriptionData.
     * 
     * @return ratePlanData
     */
    public com.zuora.api.RatePlanData[] getRatePlanData() {
        return ratePlanData;
    }


    /**
     * Sets the ratePlanData value for this SubscriptionData.
     * 
     * @param ratePlanData
     */
    public void setRatePlanData(com.zuora.api.RatePlanData[] ratePlanData) {
        this.ratePlanData = ratePlanData;
    }

    public com.zuora.api.RatePlanData getRatePlanData(int i) {
        return this.ratePlanData[i];
    }

    public void setRatePlanData(int i, com.zuora.api.RatePlanData _value) {
        this.ratePlanData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionData)) return false;
        SubscriptionData other = (SubscriptionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.ratePlanData==null && other.getRatePlanData()==null) || 
             (this.ratePlanData!=null &&
              java.util.Arrays.equals(this.ratePlanData, other.getRatePlanData())));
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
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getRatePlanData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatePlanData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatePlanData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriptionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscriptionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "Subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Subscription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
