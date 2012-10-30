/**
 * PreviewOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class PreviewOptions  implements java.io.Serializable {
    private java.lang.Boolean enablePreviewMode;

    private java.lang.Integer numberOfPeriods;

    public PreviewOptions() {
    }

    public PreviewOptions(
           java.lang.Boolean enablePreviewMode,
           java.lang.Integer numberOfPeriods) {
           this.enablePreviewMode = enablePreviewMode;
           this.numberOfPeriods = numberOfPeriods;
    }


    /**
     * Gets the enablePreviewMode value for this PreviewOptions.
     * 
     * @return enablePreviewMode
     */
    public java.lang.Boolean getEnablePreviewMode() {
        return enablePreviewMode;
    }


    /**
     * Sets the enablePreviewMode value for this PreviewOptions.
     * 
     * @param enablePreviewMode
     */
    public void setEnablePreviewMode(java.lang.Boolean enablePreviewMode) {
        this.enablePreviewMode = enablePreviewMode;
    }


    /**
     * Gets the numberOfPeriods value for this PreviewOptions.
     * 
     * @return numberOfPeriods
     */
    public java.lang.Integer getNumberOfPeriods() {
        return numberOfPeriods;
    }


    /**
     * Sets the numberOfPeriods value for this PreviewOptions.
     * 
     * @param numberOfPeriods
     */
    public void setNumberOfPeriods(java.lang.Integer numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreviewOptions)) return false;
        PreviewOptions other = (PreviewOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enablePreviewMode==null && other.getEnablePreviewMode()==null) || 
             (this.enablePreviewMode!=null &&
              this.enablePreviewMode.equals(other.getEnablePreviewMode()))) &&
            ((this.numberOfPeriods==null && other.getNumberOfPeriods()==null) || 
             (this.numberOfPeriods!=null &&
              this.numberOfPeriods.equals(other.getNumberOfPeriods())));
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
        if (getEnablePreviewMode() != null) {
            _hashCode += getEnablePreviewMode().hashCode();
        }
        if (getNumberOfPeriods() != null) {
            _hashCode += getNumberOfPeriods().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreviewOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "PreviewOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enablePreviewMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "EnablePreviewMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "NumberOfPeriods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
