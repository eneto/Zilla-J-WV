/**
 * RatePlanData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class RatePlanData  implements java.io.Serializable {
    private com.zuora.api.object.RatePlan ratePlan;

    private com.zuora.api.RatePlanChargeData[] ratePlanChargeData;

    public RatePlanData() {
    }

    public RatePlanData(
           com.zuora.api.object.RatePlan ratePlan,
           com.zuora.api.RatePlanChargeData[] ratePlanChargeData) {
           this.ratePlan = ratePlan;
           this.ratePlanChargeData = ratePlanChargeData;
    }


    /**
     * Gets the ratePlan value for this RatePlanData.
     * 
     * @return ratePlan
     */
    public com.zuora.api.object.RatePlan getRatePlan() {
        return ratePlan;
    }


    /**
     * Sets the ratePlan value for this RatePlanData.
     * 
     * @param ratePlan
     */
    public void setRatePlan(com.zuora.api.object.RatePlan ratePlan) {
        this.ratePlan = ratePlan;
    }


    /**
     * Gets the ratePlanChargeData value for this RatePlanData.
     * 
     * @return ratePlanChargeData
     */
    public com.zuora.api.RatePlanChargeData[] getRatePlanChargeData() {
        return ratePlanChargeData;
    }


    /**
     * Sets the ratePlanChargeData value for this RatePlanData.
     * 
     * @param ratePlanChargeData
     */
    public void setRatePlanChargeData(com.zuora.api.RatePlanChargeData[] ratePlanChargeData) {
        this.ratePlanChargeData = ratePlanChargeData;
    }

    public com.zuora.api.RatePlanChargeData getRatePlanChargeData(int i) {
        return this.ratePlanChargeData[i];
    }

    public void setRatePlanChargeData(int i, com.zuora.api.RatePlanChargeData _value) {
        this.ratePlanChargeData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RatePlanData)) return false;
        RatePlanData other = (RatePlanData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ratePlan==null && other.getRatePlan()==null) || 
             (this.ratePlan!=null &&
              this.ratePlan.equals(other.getRatePlan()))) &&
            ((this.ratePlanChargeData==null && other.getRatePlanChargeData()==null) || 
             (this.ratePlanChargeData!=null &&
              java.util.Arrays.equals(this.ratePlanChargeData, other.getRatePlanChargeData())));
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
        if (getRatePlan() != null) {
            _hashCode += getRatePlan().hashCode();
        }
        if (getRatePlanChargeData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatePlanChargeData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatePlanChargeData(), i);
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
        new org.apache.axis.description.TypeDesc(RatePlanData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanChargeData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanChargeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanChargeData"));
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
