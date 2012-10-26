/**
 * InvoiceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class InvoiceData  implements java.io.Serializable {
    private com.zuora.api.object.Invoice invoice;

    private com.zuora.api.object.InvoiceItem[] invoiceItem;

    public InvoiceData() {
    }

    public InvoiceData(
           com.zuora.api.object.Invoice invoice,
           com.zuora.api.object.InvoiceItem[] invoiceItem) {
           this.invoice = invoice;
           this.invoiceItem = invoiceItem;
    }


    /**
     * Gets the invoice value for this InvoiceData.
     * 
     * @return invoice
     */
    public com.zuora.api.object.Invoice getInvoice() {
        return invoice;
    }


    /**
     * Sets the invoice value for this InvoiceData.
     * 
     * @param invoice
     */
    public void setInvoice(com.zuora.api.object.Invoice invoice) {
        this.invoice = invoice;
    }


    /**
     * Gets the invoiceItem value for this InvoiceData.
     * 
     * @return invoiceItem
     */
    public com.zuora.api.object.InvoiceItem[] getInvoiceItem() {
        return invoiceItem;
    }


    /**
     * Sets the invoiceItem value for this InvoiceData.
     * 
     * @param invoiceItem
     */
    public void setInvoiceItem(com.zuora.api.object.InvoiceItem[] invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public com.zuora.api.object.InvoiceItem getInvoiceItem(int i) {
        return this.invoiceItem[i];
    }

    public void setInvoiceItem(int i, com.zuora.api.object.InvoiceItem _value) {
        this.invoiceItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceData)) return false;
        InvoiceData other = (InvoiceData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invoice==null && other.getInvoice()==null) || 
             (this.invoice!=null &&
              this.invoice.equals(other.getInvoice()))) &&
            ((this.invoiceItem==null && other.getInvoiceItem()==null) || 
             (this.invoiceItem!=null &&
              java.util.Arrays.equals(this.invoiceItem, other.getInvoiceItem())));
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
        if (getInvoice() != null) {
            _hashCode += getInvoice().hashCode();
        }
        if (getInvoiceItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceItem(), i);
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
        new org.apache.axis.description.TypeDesc(InvoiceData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "Invoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Invoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceItem"));
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
