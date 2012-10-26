/**
 * TaxationItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class TaxationItem  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountingCode;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.math.BigDecimal exemptAmount;

    private java.lang.String invoiceId;

    private java.lang.String invoiceItemId;

    private java.lang.String jurisdiction;

    private java.lang.String locationCode;

    private java.lang.String name;

    private java.math.BigDecimal taxAmount;

    private java.lang.String taxCode;

    private java.lang.String taxCodeDescription;

    private java.util.Calendar taxDate;

    private java.math.BigDecimal taxRate;

    private java.lang.String taxRateDescription;

    private java.lang.String taxRateType;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public TaxationItem() {
    }

    public TaxationItem(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountingCode,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.math.BigDecimal exemptAmount,
           java.lang.String invoiceId,
           java.lang.String invoiceItemId,
           java.lang.String jurisdiction,
           java.lang.String locationCode,
           java.lang.String name,
           java.math.BigDecimal taxAmount,
           java.lang.String taxCode,
           java.lang.String taxCodeDescription,
           java.util.Calendar taxDate,
           java.math.BigDecimal taxRate,
           java.lang.String taxRateDescription,
           java.lang.String taxRateType,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.accountingCode = accountingCode;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.exemptAmount = exemptAmount;
        this.invoiceId = invoiceId;
        this.invoiceItemId = invoiceItemId;
        this.jurisdiction = jurisdiction;
        this.locationCode = locationCode;
        this.name = name;
        this.taxAmount = taxAmount;
        this.taxCode = taxCode;
        this.taxCodeDescription = taxCodeDescription;
        this.taxDate = taxDate;
        this.taxRate = taxRate;
        this.taxRateDescription = taxRateDescription;
        this.taxRateType = taxRateType;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the accountingCode value for this TaxationItem.
     * 
     * @return accountingCode
     */
    public java.lang.String getAccountingCode() {
        return accountingCode;
    }


    /**
     * Sets the accountingCode value for this TaxationItem.
     * 
     * @param accountingCode
     */
    public void setAccountingCode(java.lang.String accountingCode) {
        this.accountingCode = accountingCode;
    }


    /**
     * Gets the createdById value for this TaxationItem.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this TaxationItem.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this TaxationItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TaxationItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the exemptAmount value for this TaxationItem.
     * 
     * @return exemptAmount
     */
    public java.math.BigDecimal getExemptAmount() {
        return exemptAmount;
    }


    /**
     * Sets the exemptAmount value for this TaxationItem.
     * 
     * @param exemptAmount
     */
    public void setExemptAmount(java.math.BigDecimal exemptAmount) {
        this.exemptAmount = exemptAmount;
    }


    /**
     * Gets the invoiceId value for this TaxationItem.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this TaxationItem.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the invoiceItemId value for this TaxationItem.
     * 
     * @return invoiceItemId
     */
    public java.lang.String getInvoiceItemId() {
        return invoiceItemId;
    }


    /**
     * Sets the invoiceItemId value for this TaxationItem.
     * 
     * @param invoiceItemId
     */
    public void setInvoiceItemId(java.lang.String invoiceItemId) {
        this.invoiceItemId = invoiceItemId;
    }


    /**
     * Gets the jurisdiction value for this TaxationItem.
     * 
     * @return jurisdiction
     */
    public java.lang.String getJurisdiction() {
        return jurisdiction;
    }


    /**
     * Sets the jurisdiction value for this TaxationItem.
     * 
     * @param jurisdiction
     */
    public void setJurisdiction(java.lang.String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    /**
     * Gets the locationCode value for this TaxationItem.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this TaxationItem.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the name value for this TaxationItem.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TaxationItem.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the taxAmount value for this TaxationItem.
     * 
     * @return taxAmount
     */
    public java.math.BigDecimal getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TaxationItem.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.math.BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxCode value for this TaxationItem.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this TaxationItem.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxCodeDescription value for this TaxationItem.
     * 
     * @return taxCodeDescription
     */
    public java.lang.String getTaxCodeDescription() {
        return taxCodeDescription;
    }


    /**
     * Sets the taxCodeDescription value for this TaxationItem.
     * 
     * @param taxCodeDescription
     */
    public void setTaxCodeDescription(java.lang.String taxCodeDescription) {
        this.taxCodeDescription = taxCodeDescription;
    }


    /**
     * Gets the taxDate value for this TaxationItem.
     * 
     * @return taxDate
     */
    public java.util.Calendar getTaxDate() {
        return taxDate;
    }


    /**
     * Sets the taxDate value for this TaxationItem.
     * 
     * @param taxDate
     */
    public void setTaxDate(java.util.Calendar taxDate) {
        this.taxDate = taxDate;
    }


    /**
     * Gets the taxRate value for this TaxationItem.
     * 
     * @return taxRate
     */
    public java.math.BigDecimal getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TaxationItem.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.math.BigDecimal taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the taxRateDescription value for this TaxationItem.
     * 
     * @return taxRateDescription
     */
    public java.lang.String getTaxRateDescription() {
        return taxRateDescription;
    }


    /**
     * Sets the taxRateDescription value for this TaxationItem.
     * 
     * @param taxRateDescription
     */
    public void setTaxRateDescription(java.lang.String taxRateDescription) {
        this.taxRateDescription = taxRateDescription;
    }


    /**
     * Gets the taxRateType value for this TaxationItem.
     * 
     * @return taxRateType
     */
    public java.lang.String getTaxRateType() {
        return taxRateType;
    }


    /**
     * Sets the taxRateType value for this TaxationItem.
     * 
     * @param taxRateType
     */
    public void setTaxRateType(java.lang.String taxRateType) {
        this.taxRateType = taxRateType;
    }


    /**
     * Gets the updatedById value for this TaxationItem.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this TaxationItem.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this TaxationItem.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this TaxationItem.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxationItem)) return false;
        TaxationItem other = (TaxationItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountingCode==null && other.getAccountingCode()==null) || 
             (this.accountingCode!=null &&
              this.accountingCode.equals(other.getAccountingCode()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.exemptAmount==null && other.getExemptAmount()==null) || 
             (this.exemptAmount!=null &&
              this.exemptAmount.equals(other.getExemptAmount()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.invoiceItemId==null && other.getInvoiceItemId()==null) || 
             (this.invoiceItemId!=null &&
              this.invoiceItemId.equals(other.getInvoiceItemId()))) &&
            ((this.jurisdiction==null && other.getJurisdiction()==null) || 
             (this.jurisdiction!=null &&
              this.jurisdiction.equals(other.getJurisdiction()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxCodeDescription==null && other.getTaxCodeDescription()==null) || 
             (this.taxCodeDescription!=null &&
              this.taxCodeDescription.equals(other.getTaxCodeDescription()))) &&
            ((this.taxDate==null && other.getTaxDate()==null) || 
             (this.taxDate!=null &&
              this.taxDate.equals(other.getTaxDate()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.taxRateDescription==null && other.getTaxRateDescription()==null) || 
             (this.taxRateDescription!=null &&
              this.taxRateDescription.equals(other.getTaxRateDescription()))) &&
            ((this.taxRateType==null && other.getTaxRateType()==null) || 
             (this.taxRateType!=null &&
              this.taxRateType.equals(other.getTaxRateType()))) &&
            ((this.updatedById==null && other.getUpdatedById()==null) || 
             (this.updatedById!=null &&
              this.updatedById.equals(other.getUpdatedById()))) &&
            ((this.updatedDate==null && other.getUpdatedDate()==null) || 
             (this.updatedDate!=null &&
              this.updatedDate.equals(other.getUpdatedDate())));
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
        if (getAccountingCode() != null) {
            _hashCode += getAccountingCode().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getExemptAmount() != null) {
            _hashCode += getExemptAmount().hashCode();
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getInvoiceItemId() != null) {
            _hashCode += getInvoiceItemId().hashCode();
        }
        if (getJurisdiction() != null) {
            _hashCode += getJurisdiction().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxCodeDescription() != null) {
            _hashCode += getTaxCodeDescription().hashCode();
        }
        if (getTaxDate() != null) {
            _hashCode += getTaxDate().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getTaxRateDescription() != null) {
            _hashCode += getTaxRateDescription().hashCode();
        }
        if (getTaxRateType() != null) {
            _hashCode += getTaxRateType().hashCode();
        }
        if (getUpdatedById() != null) {
            _hashCode += getUpdatedById().hashCode();
        }
        if (getUpdatedDate() != null) {
            _hashCode += getUpdatedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxationItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxationItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ExemptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Jurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "LocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCodeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxCodeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRateDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxRateDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedById");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UpdatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UpdatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
