/**
 * RatePlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class RatePlan  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String amendmentId;

    private java.lang.String amendmentSubscriptionRatePlanId;

    private java.lang.String amendmentType;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String name;

    private java.lang.String productRatePlanId;

    private java.lang.String subscriptionId;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public RatePlan() {
    }

    public RatePlan(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String amendmentId,
           java.lang.String amendmentSubscriptionRatePlanId,
           java.lang.String amendmentType,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String name,
           java.lang.String productRatePlanId,
           java.lang.String subscriptionId,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.amendmentId = amendmentId;
        this.amendmentSubscriptionRatePlanId = amendmentSubscriptionRatePlanId;
        this.amendmentType = amendmentType;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.name = name;
        this.productRatePlanId = productRatePlanId;
        this.subscriptionId = subscriptionId;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the amendmentId value for this RatePlan.
     * 
     * @return amendmentId
     */
    public java.lang.String getAmendmentId() {
        return amendmentId;
    }


    /**
     * Sets the amendmentId value for this RatePlan.
     * 
     * @param amendmentId
     */
    public void setAmendmentId(java.lang.String amendmentId) {
        this.amendmentId = amendmentId;
    }


    /**
     * Gets the amendmentSubscriptionRatePlanId value for this RatePlan.
     * 
     * @return amendmentSubscriptionRatePlanId
     */
    public java.lang.String getAmendmentSubscriptionRatePlanId() {
        return amendmentSubscriptionRatePlanId;
    }


    /**
     * Sets the amendmentSubscriptionRatePlanId value for this RatePlan.
     * 
     * @param amendmentSubscriptionRatePlanId
     */
    public void setAmendmentSubscriptionRatePlanId(java.lang.String amendmentSubscriptionRatePlanId) {
        this.amendmentSubscriptionRatePlanId = amendmentSubscriptionRatePlanId;
    }


    /**
     * Gets the amendmentType value for this RatePlan.
     * 
     * @return amendmentType
     */
    public java.lang.String getAmendmentType() {
        return amendmentType;
    }


    /**
     * Sets the amendmentType value for this RatePlan.
     * 
     * @param amendmentType
     */
    public void setAmendmentType(java.lang.String amendmentType) {
        this.amendmentType = amendmentType;
    }


    /**
     * Gets the createdById value for this RatePlan.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this RatePlan.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this RatePlan.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RatePlan.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the name value for this RatePlan.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RatePlan.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the productRatePlanId value for this RatePlan.
     * 
     * @return productRatePlanId
     */
    public java.lang.String getProductRatePlanId() {
        return productRatePlanId;
    }


    /**
     * Sets the productRatePlanId value for this RatePlan.
     * 
     * @param productRatePlanId
     */
    public void setProductRatePlanId(java.lang.String productRatePlanId) {
        this.productRatePlanId = productRatePlanId;
    }


    /**
     * Gets the subscriptionId value for this RatePlan.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this RatePlan.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the updatedById value for this RatePlan.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this RatePlan.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this RatePlan.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this RatePlan.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RatePlan)) return false;
        RatePlan other = (RatePlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amendmentId==null && other.getAmendmentId()==null) || 
             (this.amendmentId!=null &&
              this.amendmentId.equals(other.getAmendmentId()))) &&
            ((this.amendmentSubscriptionRatePlanId==null && other.getAmendmentSubscriptionRatePlanId()==null) || 
             (this.amendmentSubscriptionRatePlanId!=null &&
              this.amendmentSubscriptionRatePlanId.equals(other.getAmendmentSubscriptionRatePlanId()))) &&
            ((this.amendmentType==null && other.getAmendmentType()==null) || 
             (this.amendmentType!=null &&
              this.amendmentType.equals(other.getAmendmentType()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.productRatePlanId==null && other.getProductRatePlanId()==null) || 
             (this.productRatePlanId!=null &&
              this.productRatePlanId.equals(other.getProductRatePlanId()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
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
        if (getAmendmentId() != null) {
            _hashCode += getAmendmentId().hashCode();
        }
        if (getAmendmentSubscriptionRatePlanId() != null) {
            _hashCode += getAmendmentSubscriptionRatePlanId().hashCode();
        }
        if (getAmendmentType() != null) {
            _hashCode += getAmendmentType().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProductRatePlanId() != null) {
            _hashCode += getProductRatePlanId().hashCode();
        }
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
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
        new org.apache.axis.description.TypeDesc(RatePlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amendmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AmendmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amendmentSubscriptionRatePlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AmendmentSubscriptionRatePlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amendmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AmendmentType"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productRatePlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SubscriptionId"));
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
