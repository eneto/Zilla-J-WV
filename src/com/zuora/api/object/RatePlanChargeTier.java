/**
 * RatePlanChargeTier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class RatePlanChargeTier  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.math.BigDecimal endingUnit;

    private java.lang.Boolean isOveragePrice;

    private java.math.BigDecimal price;

    private java.lang.String priceFormat;

    private java.lang.String ratePlanChargeId;

    private java.math.BigDecimal startingUnit;

    private java.lang.Integer tier;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public RatePlanChargeTier() {
    }

    public RatePlanChargeTier(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.math.BigDecimal endingUnit,
           java.lang.Boolean isOveragePrice,
           java.math.BigDecimal price,
           java.lang.String priceFormat,
           java.lang.String ratePlanChargeId,
           java.math.BigDecimal startingUnit,
           java.lang.Integer tier,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.endingUnit = endingUnit;
        this.isOveragePrice = isOveragePrice;
        this.price = price;
        this.priceFormat = priceFormat;
        this.ratePlanChargeId = ratePlanChargeId;
        this.startingUnit = startingUnit;
        this.tier = tier;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the createdById value for this RatePlanChargeTier.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this RatePlanChargeTier.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this RatePlanChargeTier.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RatePlanChargeTier.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the endingUnit value for this RatePlanChargeTier.
     * 
     * @return endingUnit
     */
    public java.math.BigDecimal getEndingUnit() {
        return endingUnit;
    }


    /**
     * Sets the endingUnit value for this RatePlanChargeTier.
     * 
     * @param endingUnit
     */
    public void setEndingUnit(java.math.BigDecimal endingUnit) {
        this.endingUnit = endingUnit;
    }


    /**
     * Gets the isOveragePrice value for this RatePlanChargeTier.
     * 
     * @return isOveragePrice
     */
    public java.lang.Boolean getIsOveragePrice() {
        return isOveragePrice;
    }


    /**
     * Sets the isOveragePrice value for this RatePlanChargeTier.
     * 
     * @param isOveragePrice
     */
    public void setIsOveragePrice(java.lang.Boolean isOveragePrice) {
        this.isOveragePrice = isOveragePrice;
    }


    /**
     * Gets the price value for this RatePlanChargeTier.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this RatePlanChargeTier.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the priceFormat value for this RatePlanChargeTier.
     * 
     * @return priceFormat
     */
    public java.lang.String getPriceFormat() {
        return priceFormat;
    }


    /**
     * Sets the priceFormat value for this RatePlanChargeTier.
     * 
     * @param priceFormat
     */
    public void setPriceFormat(java.lang.String priceFormat) {
        this.priceFormat = priceFormat;
    }


    /**
     * Gets the ratePlanChargeId value for this RatePlanChargeTier.
     * 
     * @return ratePlanChargeId
     */
    public java.lang.String getRatePlanChargeId() {
        return ratePlanChargeId;
    }


    /**
     * Sets the ratePlanChargeId value for this RatePlanChargeTier.
     * 
     * @param ratePlanChargeId
     */
    public void setRatePlanChargeId(java.lang.String ratePlanChargeId) {
        this.ratePlanChargeId = ratePlanChargeId;
    }


    /**
     * Gets the startingUnit value for this RatePlanChargeTier.
     * 
     * @return startingUnit
     */
    public java.math.BigDecimal getStartingUnit() {
        return startingUnit;
    }


    /**
     * Sets the startingUnit value for this RatePlanChargeTier.
     * 
     * @param startingUnit
     */
    public void setStartingUnit(java.math.BigDecimal startingUnit) {
        this.startingUnit = startingUnit;
    }


    /**
     * Gets the tier value for this RatePlanChargeTier.
     * 
     * @return tier
     */
    public java.lang.Integer getTier() {
        return tier;
    }


    /**
     * Sets the tier value for this RatePlanChargeTier.
     * 
     * @param tier
     */
    public void setTier(java.lang.Integer tier) {
        this.tier = tier;
    }


    /**
     * Gets the updatedById value for this RatePlanChargeTier.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this RatePlanChargeTier.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this RatePlanChargeTier.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this RatePlanChargeTier.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RatePlanChargeTier)) return false;
        RatePlanChargeTier other = (RatePlanChargeTier) obj;
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
            ((this.endingUnit==null && other.getEndingUnit()==null) || 
             (this.endingUnit!=null &&
              this.endingUnit.equals(other.getEndingUnit()))) &&
            ((this.isOveragePrice==null && other.getIsOveragePrice()==null) || 
             (this.isOveragePrice!=null &&
              this.isOveragePrice.equals(other.getIsOveragePrice()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.priceFormat==null && other.getPriceFormat()==null) || 
             (this.priceFormat!=null &&
              this.priceFormat.equals(other.getPriceFormat()))) &&
            ((this.ratePlanChargeId==null && other.getRatePlanChargeId()==null) || 
             (this.ratePlanChargeId!=null &&
              this.ratePlanChargeId.equals(other.getRatePlanChargeId()))) &&
            ((this.startingUnit==null && other.getStartingUnit()==null) || 
             (this.startingUnit!=null &&
              this.startingUnit.equals(other.getStartingUnit()))) &&
            ((this.tier==null && other.getTier()==null) || 
             (this.tier!=null &&
              this.tier.equals(other.getTier()))) &&
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
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEndingUnit() != null) {
            _hashCode += getEndingUnit().hashCode();
        }
        if (getIsOveragePrice() != null) {
            _hashCode += getIsOveragePrice().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPriceFormat() != null) {
            _hashCode += getPriceFormat().hashCode();
        }
        if (getRatePlanChargeId() != null) {
            _hashCode += getRatePlanChargeId().hashCode();
        }
        if (getStartingUnit() != null) {
            _hashCode += getStartingUnit().hashCode();
        }
        if (getTier() != null) {
            _hashCode += getTier().hashCode();
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
        new org.apache.axis.description.TypeDesc(RatePlanChargeTier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlanChargeTier"));
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
        elemField.setFieldName("endingUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "EndingUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOveragePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IsOveragePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PriceFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanChargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlanChargeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "StartingUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Tier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
