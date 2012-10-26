/**
 * ProductRatePlanChargeTier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class ProductRatePlanChargeTier  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String currency;

    private java.math.BigDecimal discountAmount;

    private java.math.BigDecimal discountPercentage;

    private java.math.BigDecimal endingUnit;

    private java.lang.Boolean isOveragePrice;

    private java.math.BigDecimal price;

    private java.lang.String priceFormat;

    private java.lang.String productRatePlanChargeId;

    private java.math.BigDecimal startingUnit;

    private java.lang.Integer tier;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public ProductRatePlanChargeTier() {
    }

    public ProductRatePlanChargeTier(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Boolean active,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String currency,
           java.math.BigDecimal discountAmount,
           java.math.BigDecimal discountPercentage,
           java.math.BigDecimal endingUnit,
           java.lang.Boolean isOveragePrice,
           java.math.BigDecimal price,
           java.lang.String priceFormat,
           java.lang.String productRatePlanChargeId,
           java.math.BigDecimal startingUnit,
           java.lang.Integer tier,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.active = active;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.currency = currency;
        this.discountAmount = discountAmount;
        this.discountPercentage = discountPercentage;
        this.endingUnit = endingUnit;
        this.isOveragePrice = isOveragePrice;
        this.price = price;
        this.priceFormat = priceFormat;
        this.productRatePlanChargeId = productRatePlanChargeId;
        this.startingUnit = startingUnit;
        this.tier = tier;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the active value for this ProductRatePlanChargeTier.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this ProductRatePlanChargeTier.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the createdById value for this ProductRatePlanChargeTier.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ProductRatePlanChargeTier.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ProductRatePlanChargeTier.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProductRatePlanChargeTier.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currency value for this ProductRatePlanChargeTier.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ProductRatePlanChargeTier.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the discountAmount value for this ProductRatePlanChargeTier.
     * 
     * @return discountAmount
     */
    public java.math.BigDecimal getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this ProductRatePlanChargeTier.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.math.BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the discountPercentage value for this ProductRatePlanChargeTier.
     * 
     * @return discountPercentage
     */
    public java.math.BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }


    /**
     * Sets the discountPercentage value for this ProductRatePlanChargeTier.
     * 
     * @param discountPercentage
     */
    public void setDiscountPercentage(java.math.BigDecimal discountPercentage) {
        this.discountPercentage = discountPercentage;
    }


    /**
     * Gets the endingUnit value for this ProductRatePlanChargeTier.
     * 
     * @return endingUnit
     */
    public java.math.BigDecimal getEndingUnit() {
        return endingUnit;
    }


    /**
     * Sets the endingUnit value for this ProductRatePlanChargeTier.
     * 
     * @param endingUnit
     */
    public void setEndingUnit(java.math.BigDecimal endingUnit) {
        this.endingUnit = endingUnit;
    }


    /**
     * Gets the isOveragePrice value for this ProductRatePlanChargeTier.
     * 
     * @return isOveragePrice
     */
    public java.lang.Boolean getIsOveragePrice() {
        return isOveragePrice;
    }


    /**
     * Sets the isOveragePrice value for this ProductRatePlanChargeTier.
     * 
     * @param isOveragePrice
     */
    public void setIsOveragePrice(java.lang.Boolean isOveragePrice) {
        this.isOveragePrice = isOveragePrice;
    }


    /**
     * Gets the price value for this ProductRatePlanChargeTier.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ProductRatePlanChargeTier.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the priceFormat value for this ProductRatePlanChargeTier.
     * 
     * @return priceFormat
     */
    public java.lang.String getPriceFormat() {
        return priceFormat;
    }


    /**
     * Sets the priceFormat value for this ProductRatePlanChargeTier.
     * 
     * @param priceFormat
     */
    public void setPriceFormat(java.lang.String priceFormat) {
        this.priceFormat = priceFormat;
    }


    /**
     * Gets the productRatePlanChargeId value for this ProductRatePlanChargeTier.
     * 
     * @return productRatePlanChargeId
     */
    public java.lang.String getProductRatePlanChargeId() {
        return productRatePlanChargeId;
    }


    /**
     * Sets the productRatePlanChargeId value for this ProductRatePlanChargeTier.
     * 
     * @param productRatePlanChargeId
     */
    public void setProductRatePlanChargeId(java.lang.String productRatePlanChargeId) {
        this.productRatePlanChargeId = productRatePlanChargeId;
    }


    /**
     * Gets the startingUnit value for this ProductRatePlanChargeTier.
     * 
     * @return startingUnit
     */
    public java.math.BigDecimal getStartingUnit() {
        return startingUnit;
    }


    /**
     * Sets the startingUnit value for this ProductRatePlanChargeTier.
     * 
     * @param startingUnit
     */
    public void setStartingUnit(java.math.BigDecimal startingUnit) {
        this.startingUnit = startingUnit;
    }


    /**
     * Gets the tier value for this ProductRatePlanChargeTier.
     * 
     * @return tier
     */
    public java.lang.Integer getTier() {
        return tier;
    }


    /**
     * Sets the tier value for this ProductRatePlanChargeTier.
     * 
     * @param tier
     */
    public void setTier(java.lang.Integer tier) {
        this.tier = tier;
    }


    /**
     * Gets the updatedById value for this ProductRatePlanChargeTier.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this ProductRatePlanChargeTier.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this ProductRatePlanChargeTier.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this ProductRatePlanChargeTier.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductRatePlanChargeTier)) return false;
        ProductRatePlanChargeTier other = (ProductRatePlanChargeTier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.discountPercentage==null && other.getDiscountPercentage()==null) || 
             (this.discountPercentage!=null &&
              this.discountPercentage.equals(other.getDiscountPercentage()))) &&
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
            ((this.productRatePlanChargeId==null && other.getProductRatePlanChargeId()==null) || 
             (this.productRatePlanChargeId!=null &&
              this.productRatePlanChargeId.equals(other.getProductRatePlanChargeId()))) &&
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getDiscountPercentage() != null) {
            _hashCode += getDiscountPercentage().hashCode();
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
        if (getProductRatePlanChargeId() != null) {
            _hashCode += getProductRatePlanChargeId().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProductRatePlanChargeTier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlanChargeTier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DiscountPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("productRatePlanChargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlanChargeId"));
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
