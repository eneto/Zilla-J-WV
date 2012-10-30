/**
 * RatePlanChargeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class RatePlanChargeData  implements java.io.Serializable {
    private com.zuora.api.object.RatePlanCharge ratePlanCharge;

    private com.zuora.api.object.RatePlanChargeTier[] ratePlanChargeTier;

    public RatePlanChargeData() {
    }

    public RatePlanChargeData(
           com.zuora.api.object.RatePlanCharge ratePlanCharge,
           com.zuora.api.object.RatePlanChargeTier[] ratePlanChargeTier) {
           this.ratePlanCharge = ratePlanCharge;
           this.ratePlanChargeTier = ratePlanChargeTier;
    }


    /**
     * Gets the ratePlanCharge value for this RatePlanChargeData.
     * 
     * @return ratePlanCharge
     */
    public com.zuora.api.object.RatePlanCharge getRatePlanCharge() {
        return ratePlanCharge;
    }


    /**
     * Sets the ratePlanCharge value for this RatePlanChargeData.
     * 
     * @param ratePlanCharge
     */
    public void setRatePlanCharge(com.zuora.api.object.RatePlanCharge ratePlanCharge) {
        this.ratePlanCharge = ratePlanCharge;
    }


    /**
     * Gets the ratePlanChargeTier value for this RatePlanChargeData.
     * 
     * @return ratePlanChargeTier
     */
    public com.zuora.api.object.RatePlanChargeTier[] getRatePlanChargeTier() {
        return ratePlanChargeTier;
    }


    /**
     * Sets the ratePlanChargeTier value for this RatePlanChargeData.
     * 
     * @param ratePlanChargeTier
     */
    public void setRatePlanChargeTier(com.zuora.api.object.RatePlanChargeTier[] ratePlanChargeTier) {
        this.ratePlanChargeTier = ratePlanChargeTier;
    }

    public com.zuora.api.object.RatePlanChargeTier getRatePlanChargeTier(int i) {
        return this.ratePlanChargeTier[i];
    }

    public void setRatePlanChargeTier(int i, com.zuora.api.object.RatePlanChargeTier _value) {
        this.ratePlanChargeTier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RatePlanChargeData)) return false;
        RatePlanChargeData other = (RatePlanChargeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ratePlanCharge==null && other.getRatePlanCharge()==null) || 
             (this.ratePlanCharge!=null &&
              this.ratePlanCharge.equals(other.getRatePlanCharge()))) &&
            ((this.ratePlanChargeTier==null && other.getRatePlanChargeTier()==null) || 
             (this.ratePlanChargeTier!=null &&
              java.util.Arrays.equals(this.ratePlanChargeTier, other.getRatePlanChargeTier())));
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
        if (getRatePlanCharge() != null) {
            _hashCode += getRatePlanCharge().hashCode();
        }
        if (getRatePlanChargeTier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatePlanChargeTier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatePlanChargeTier(), i);
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
        new org.apache.axis.description.TypeDesc(RatePlanChargeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanChargeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlanCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanChargeTier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanChargeTier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlanChargeTier"));
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
