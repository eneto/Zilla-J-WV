/**
 * AmendRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class AmendRequest  implements java.io.Serializable {
    private com.zuora.api.object.Amendment[] amendments;

    private com.zuora.api.AmendOptions amendOptions;

    private com.zuora.api.PreviewOptions previewOptions;

    public AmendRequest() {
    }

    public AmendRequest(
           com.zuora.api.object.Amendment[] amendments,
           com.zuora.api.AmendOptions amendOptions,
           com.zuora.api.PreviewOptions previewOptions) {
           this.amendments = amendments;
           this.amendOptions = amendOptions;
           this.previewOptions = previewOptions;
    }


    /**
     * Gets the amendments value for this AmendRequest.
     * 
     * @return amendments
     */
    public com.zuora.api.object.Amendment[] getAmendments() {
        return amendments;
    }


    /**
     * Sets the amendments value for this AmendRequest.
     * 
     * @param amendments
     */
    public void setAmendments(com.zuora.api.object.Amendment[] amendments) {
        this.amendments = amendments;
    }

    public com.zuora.api.object.Amendment getAmendments(int i) {
        return this.amendments[i];
    }

    public void setAmendments(int i, com.zuora.api.object.Amendment _value) {
        this.amendments[i] = _value;
    }


    /**
     * Gets the amendOptions value for this AmendRequest.
     * 
     * @return amendOptions
     */
    public com.zuora.api.AmendOptions getAmendOptions() {
        return amendOptions;
    }


    /**
     * Sets the amendOptions value for this AmendRequest.
     * 
     * @param amendOptions
     */
    public void setAmendOptions(com.zuora.api.AmendOptions amendOptions) {
        this.amendOptions = amendOptions;
    }


    /**
     * Gets the previewOptions value for this AmendRequest.
     * 
     * @return previewOptions
     */
    public com.zuora.api.PreviewOptions getPreviewOptions() {
        return previewOptions;
    }


    /**
     * Sets the previewOptions value for this AmendRequest.
     * 
     * @param previewOptions
     */
    public void setPreviewOptions(com.zuora.api.PreviewOptions previewOptions) {
        this.previewOptions = previewOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AmendRequest)) return false;
        AmendRequest other = (AmendRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amendments==null && other.getAmendments()==null) || 
             (this.amendments!=null &&
              java.util.Arrays.equals(this.amendments, other.getAmendments()))) &&
            ((this.amendOptions==null && other.getAmendOptions()==null) || 
             (this.amendOptions!=null &&
              this.amendOptions.equals(other.getAmendOptions()))) &&
            ((this.previewOptions==null && other.getPreviewOptions()==null) || 
             (this.previewOptions!=null &&
              this.previewOptions.equals(other.getPreviewOptions())));
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
        if (getAmendments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmendments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmendments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmendOptions() != null) {
            _hashCode += getAmendOptions().hashCode();
        }
        if (getPreviewOptions() != null) {
            _hashCode += getPreviewOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AmendRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "AmendRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amendments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "Amendments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Amendment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amendOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "AmendOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "AmendOptions"));
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
