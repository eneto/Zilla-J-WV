/**
 * ProductRatePlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class ProductRatePlan  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private java.util.Calendar effectiveEndDate;

    private java.util.Calendar effectiveStartDate;

    private java.lang.String name;

    private java.lang.String productId;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    private java.lang.String upgradeGroup__c;

    private java.lang.String upgradeLevel__c;

    public ProductRatePlan() {
    }

    public ProductRatePlan(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           java.util.Calendar effectiveEndDate,
           java.util.Calendar effectiveStartDate,
           java.lang.String name,
           java.lang.String productId,
           java.lang.String updatedById,
           java.util.Calendar updatedDate,
           java.lang.String upgradeGroup__c,
           java.lang.String upgradeLevel__c) {
        super(
            fieldsToNull,
            id);
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.effectiveEndDate = effectiveEndDate;
        this.effectiveStartDate = effectiveStartDate;
        this.name = name;
        this.productId = productId;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
        this.upgradeGroup__c = upgradeGroup__c;
        this.upgradeLevel__c = upgradeLevel__c;
    }


    /**
     * Gets the createdById value for this ProductRatePlan.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ProductRatePlan.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ProductRatePlan.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProductRatePlan.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this ProductRatePlan.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductRatePlan.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the effectiveEndDate value for this ProductRatePlan.
     * 
     * @return effectiveEndDate
     */
    public java.util.Calendar getEffectiveEndDate() {
        return effectiveEndDate;
    }


    /**
     * Sets the effectiveEndDate value for this ProductRatePlan.
     * 
     * @param effectiveEndDate
     */
    public void setEffectiveEndDate(java.util.Calendar effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }


    /**
     * Gets the effectiveStartDate value for this ProductRatePlan.
     * 
     * @return effectiveStartDate
     */
    public java.util.Calendar getEffectiveStartDate() {
        return effectiveStartDate;
    }


    /**
     * Sets the effectiveStartDate value for this ProductRatePlan.
     * 
     * @param effectiveStartDate
     */
    public void setEffectiveStartDate(java.util.Calendar effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }


    /**
     * Gets the name value for this ProductRatePlan.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductRatePlan.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the productId value for this ProductRatePlan.
     * 
     * @return productId
     */
    public java.lang.String getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ProductRatePlan.
     * 
     * @param productId
     */
    public void setProductId(java.lang.String productId) {
        this.productId = productId;
    }


    /**
     * Gets the updatedById value for this ProductRatePlan.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this ProductRatePlan.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this ProductRatePlan.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this ProductRatePlan.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the upgradeGroup__c value for this ProductRatePlan.
     * 
     * @return upgradeGroup__c
     */
    public java.lang.String getUpgradeGroup__c() {
        return upgradeGroup__c;
    }


    /**
     * Sets the upgradeGroup__c value for this ProductRatePlan.
     * 
     * @param upgradeGroup__c
     */
    public void setUpgradeGroup__c(java.lang.String upgradeGroup__c) {
        this.upgradeGroup__c = upgradeGroup__c;
    }


    /**
     * Gets the upgradeLevel__c value for this ProductRatePlan.
     * 
     * @return upgradeLevel__c
     */
    public java.lang.String getUpgradeLevel__c() {
        return upgradeLevel__c;
    }


    /**
     * Sets the upgradeLevel__c value for this ProductRatePlan.
     * 
     * @param upgradeLevel__c
     */
    public void setUpgradeLevel__c(java.lang.String upgradeLevel__c) {
        this.upgradeLevel__c = upgradeLevel__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductRatePlan)) return false;
        ProductRatePlan other = (ProductRatePlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.effectiveEndDate==null && other.getEffectiveEndDate()==null) || 
             (this.effectiveEndDate!=null &&
              this.effectiveEndDate.equals(other.getEffectiveEndDate()))) &&
            ((this.effectiveStartDate==null && other.getEffectiveStartDate()==null) || 
             (this.effectiveStartDate!=null &&
              this.effectiveStartDate.equals(other.getEffectiveStartDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.updatedById==null && other.getUpdatedById()==null) || 
             (this.updatedById!=null &&
              this.updatedById.equals(other.getUpdatedById()))) &&
            ((this.updatedDate==null && other.getUpdatedDate()==null) || 
             (this.updatedDate!=null &&
              this.updatedDate.equals(other.getUpdatedDate()))) &&
            ((this.upgradeGroup__c==null && other.getUpgradeGroup__c()==null) || 
             (this.upgradeGroup__c!=null &&
              this.upgradeGroup__c.equals(other.getUpgradeGroup__c()))) &&
            ((this.upgradeLevel__c==null && other.getUpgradeLevel__c()==null) || 
             (this.upgradeLevel__c!=null &&
              this.upgradeLevel__c.equals(other.getUpgradeLevel__c())));
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
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEffectiveEndDate() != null) {
            _hashCode += getEffectiveEndDate().hashCode();
        }
        if (getEffectiveStartDate() != null) {
            _hashCode += getEffectiveStartDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getUpdatedById() != null) {
            _hashCode += getUpdatedById().hashCode();
        }
        if (getUpdatedDate() != null) {
            _hashCode += getUpdatedDate().hashCode();
        }
        if (getUpgradeGroup__c() != null) {
            _hashCode += getUpgradeGroup__c().hashCode();
        }
        if (getUpgradeLevel__c() != null) {
            _hashCode += getUpgradeLevel__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductRatePlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "EffectiveEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "EffectiveStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upgradeGroup__c");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UpgradeGroup__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upgradeLevel__c");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UpgradeLevel__c"));
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

}
