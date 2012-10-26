/**
 * AmendOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class AmendOptions  implements java.io.Serializable {
    private java.lang.Boolean generateInvoice;

    private com.zuora.api.InvoiceProcessingOptions invoiceProcessingOptions;

    private java.lang.Boolean processPayments;

    public AmendOptions() {
    }

    public AmendOptions(
           java.lang.Boolean generateInvoice,
           com.zuora.api.InvoiceProcessingOptions invoiceProcessingOptions,
           java.lang.Boolean processPayments) {
           this.generateInvoice = generateInvoice;
           this.invoiceProcessingOptions = invoiceProcessingOptions;
           this.processPayments = processPayments;
    }


    /**
     * Gets the generateInvoice value for this AmendOptions.
     * 
     * @return generateInvoice
     */
    public java.lang.Boolean getGenerateInvoice() {
        return generateInvoice;
    }


    /**
     * Sets the generateInvoice value for this AmendOptions.
     * 
     * @param generateInvoice
     */
    public void setGenerateInvoice(java.lang.Boolean generateInvoice) {
        this.generateInvoice = generateInvoice;
    }


    /**
     * Gets the invoiceProcessingOptions value for this AmendOptions.
     * 
     * @return invoiceProcessingOptions
     */
    public com.zuora.api.InvoiceProcessingOptions getInvoiceProcessingOptions() {
        return invoiceProcessingOptions;
    }


    /**
     * Sets the invoiceProcessingOptions value for this AmendOptions.
     * 
     * @param invoiceProcessingOptions
     */
    public void setInvoiceProcessingOptions(com.zuora.api.InvoiceProcessingOptions invoiceProcessingOptions) {
        this.invoiceProcessingOptions = invoiceProcessingOptions;
    }


    /**
     * Gets the processPayments value for this AmendOptions.
     * 
     * @return processPayments
     */
    public java.lang.Boolean getProcessPayments() {
        return processPayments;
    }


    /**
     * Sets the processPayments value for this AmendOptions.
     * 
     * @param processPayments
     */
    public void setProcessPayments(java.lang.Boolean processPayments) {
        this.processPayments = processPayments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AmendOptions)) return false;
        AmendOptions other = (AmendOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.generateInvoice==null && other.getGenerateInvoice()==null) || 
             (this.generateInvoice!=null &&
              this.generateInvoice.equals(other.getGenerateInvoice()))) &&
            ((this.invoiceProcessingOptions==null && other.getInvoiceProcessingOptions()==null) || 
             (this.invoiceProcessingOptions!=null &&
              this.invoiceProcessingOptions.equals(other.getInvoiceProcessingOptions()))) &&
            ((this.processPayments==null && other.getProcessPayments()==null) || 
             (this.processPayments!=null &&
              this.processPayments.equals(other.getProcessPayments())));
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
        if (getGenerateInvoice() != null) {
            _hashCode += getGenerateInvoice().hashCode();
        }
        if (getInvoiceProcessingOptions() != null) {
            _hashCode += getInvoiceProcessingOptions().hashCode();
        }
        if (getProcessPayments() != null) {
            _hashCode += getProcessPayments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AmendOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "AmendOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "GenerateInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceProcessingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceProcessingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceProcessingOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "ProcessPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
