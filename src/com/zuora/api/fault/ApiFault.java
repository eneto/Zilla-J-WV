/**
 * ApiFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.fault;

public class ApiFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.zuora.api.ErrorCode faultCode1;

    private java.lang.String faultMessage;

    public ApiFault() {
    }

    public ApiFault(
           com.zuora.api.ErrorCode faultCode1,
           java.lang.String faultMessage) {
        this.faultCode1 = faultCode1;
        this.faultMessage = faultMessage;
    }


    /**
     * Gets the faultCode1 value for this ApiFault.
     * 
     * @return faultCode1
     */
    public com.zuora.api.ErrorCode getFaultCode1() {
        return faultCode1;
    }


    /**
     * Sets the faultCode1 value for this ApiFault.
     * 
     * @param faultCode1
     */
    public void setFaultCode1(com.zuora.api.ErrorCode faultCode1) {
        this.faultCode1 = faultCode1;
    }


    /**
     * Gets the faultMessage value for this ApiFault.
     * 
     * @return faultMessage
     */
    public java.lang.String getFaultMessage() {
        return faultMessage;
    }


    /**
     * Sets the faultMessage value for this ApiFault.
     * 
     * @param faultMessage
     */
    public void setFaultMessage(java.lang.String faultMessage) {
        this.faultMessage = faultMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiFault)) return false;
        ApiFault other = (ApiFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultCode1==null && other.getFaultCode1()==null) || 
             (this.faultCode1!=null &&
              this.faultCode1.equals(other.getFaultCode1()))) &&
            ((this.faultMessage==null && other.getFaultMessage()==null) || 
             (this.faultMessage!=null &&
              this.faultMessage.equals(other.getFaultMessage())));
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
        if (getFaultCode1() != null) {
            _hashCode += getFaultCode1().hashCode();
        }
        if (getFaultMessage() != null) {
            _hashCode += getFaultMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fault.api.zuora.com/", "ApiFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fault.api.zuora.com/", "FaultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "ErrorCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fault.api.zuora.com/", "FaultMessage"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
