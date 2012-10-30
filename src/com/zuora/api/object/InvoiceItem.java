/**
 * InvoiceItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class InvoiceItem  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountingCode;

    private java.math.BigDecimal chargeAmount;

    private java.util.Calendar chargeDate;

    private java.lang.String chargeDescription;

    private java.lang.String chargeName;

    private java.lang.String chargeNumber;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String invoiceId;

    private java.math.BigDecimal processingType;

    private java.lang.String productDescription;

    private java.lang.String productId;

    private java.lang.String productName;

    private java.math.BigDecimal quantity;

    private java.lang.String ratePlanChargeId;

    private java.lang.String revRecCode;

    private java.util.Calendar revRecStartDate;

    private java.lang.String revRecTriggerCondition;

    private java.util.Calendar serviceEndDate;

    private java.util.Calendar serviceStartDate;

    private java.lang.String SKU;

    private java.lang.String subscriptionId;

    private java.lang.String subscriptionNumber;

    private java.math.BigDecimal taxAmount;

    private java.lang.String taxCode;

    private java.math.BigDecimal taxExemptAmount;

    private java.math.BigDecimal unitPrice;

    private java.lang.String UOM;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public InvoiceItem() {
    }

    public InvoiceItem(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountingCode,
           java.math.BigDecimal chargeAmount,
           java.util.Calendar chargeDate,
           java.lang.String chargeDescription,
           java.lang.String chargeName,
           java.lang.String chargeNumber,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String invoiceId,
           java.math.BigDecimal processingType,
           java.lang.String productDescription,
           java.lang.String productId,
           java.lang.String productName,
           java.math.BigDecimal quantity,
           java.lang.String ratePlanChargeId,
           java.lang.String revRecCode,
           java.util.Calendar revRecStartDate,
           java.lang.String revRecTriggerCondition,
           java.util.Calendar serviceEndDate,
           java.util.Calendar serviceStartDate,
           java.lang.String SKU,
           java.lang.String subscriptionId,
           java.lang.String subscriptionNumber,
           java.math.BigDecimal taxAmount,
           java.lang.String taxCode,
           java.math.BigDecimal taxExemptAmount,
           java.math.BigDecimal unitPrice,
           java.lang.String UOM,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.accountingCode = accountingCode;
        this.chargeAmount = chargeAmount;
        this.chargeDate = chargeDate;
        this.chargeDescription = chargeDescription;
        this.chargeName = chargeName;
        this.chargeNumber = chargeNumber;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.invoiceId = invoiceId;
        this.processingType = processingType;
        this.productDescription = productDescription;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.ratePlanChargeId = ratePlanChargeId;
        this.revRecCode = revRecCode;
        this.revRecStartDate = revRecStartDate;
        this.revRecTriggerCondition = revRecTriggerCondition;
        this.serviceEndDate = serviceEndDate;
        this.serviceStartDate = serviceStartDate;
        this.SKU = SKU;
        this.subscriptionId = subscriptionId;
        this.subscriptionNumber = subscriptionNumber;
        this.taxAmount = taxAmount;
        this.taxCode = taxCode;
        this.taxExemptAmount = taxExemptAmount;
        this.unitPrice = unitPrice;
        this.UOM = UOM;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the accountingCode value for this InvoiceItem.
     * 
     * @return accountingCode
     */
    public java.lang.String getAccountingCode() {
        return accountingCode;
    }


    /**
     * Sets the accountingCode value for this InvoiceItem.
     * 
     * @param accountingCode
     */
    public void setAccountingCode(java.lang.String accountingCode) {
        this.accountingCode = accountingCode;
    }


    /**
     * Gets the chargeAmount value for this InvoiceItem.
     * 
     * @return chargeAmount
     */
    public java.math.BigDecimal getChargeAmount() {
        return chargeAmount;
    }


    /**
     * Sets the chargeAmount value for this InvoiceItem.
     * 
     * @param chargeAmount
     */
    public void setChargeAmount(java.math.BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
    }


    /**
     * Gets the chargeDate value for this InvoiceItem.
     * 
     * @return chargeDate
     */
    public java.util.Calendar getChargeDate() {
        return chargeDate;
    }


    /**
     * Sets the chargeDate value for this InvoiceItem.
     * 
     * @param chargeDate
     */
    public void setChargeDate(java.util.Calendar chargeDate) {
        this.chargeDate = chargeDate;
    }


    /**
     * Gets the chargeDescription value for this InvoiceItem.
     * 
     * @return chargeDescription
     */
    public java.lang.String getChargeDescription() {
        return chargeDescription;
    }


    /**
     * Sets the chargeDescription value for this InvoiceItem.
     * 
     * @param chargeDescription
     */
    public void setChargeDescription(java.lang.String chargeDescription) {
        this.chargeDescription = chargeDescription;
    }


    /**
     * Gets the chargeName value for this InvoiceItem.
     * 
     * @return chargeName
     */
    public java.lang.String getChargeName() {
        return chargeName;
    }


    /**
     * Sets the chargeName value for this InvoiceItem.
     * 
     * @param chargeName
     */
    public void setChargeName(java.lang.String chargeName) {
        this.chargeName = chargeName;
    }


    /**
     * Gets the chargeNumber value for this InvoiceItem.
     * 
     * @return chargeNumber
     */
    public java.lang.String getChargeNumber() {
        return chargeNumber;
    }


    /**
     * Sets the chargeNumber value for this InvoiceItem.
     * 
     * @param chargeNumber
     */
    public void setChargeNumber(java.lang.String chargeNumber) {
        this.chargeNumber = chargeNumber;
    }


    /**
     * Gets the createdById value for this InvoiceItem.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this InvoiceItem.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this InvoiceItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this InvoiceItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the invoiceId value for this InvoiceItem.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this InvoiceItem.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the processingType value for this InvoiceItem.
     * 
     * @return processingType
     */
    public java.math.BigDecimal getProcessingType() {
        return processingType;
    }


    /**
     * Sets the processingType value for this InvoiceItem.
     * 
     * @param processingType
     */
    public void setProcessingType(java.math.BigDecimal processingType) {
        this.processingType = processingType;
    }


    /**
     * Gets the productDescription value for this InvoiceItem.
     * 
     * @return productDescription
     */
    public java.lang.String getProductDescription() {
        return productDescription;
    }


    /**
     * Sets the productDescription value for this InvoiceItem.
     * 
     * @param productDescription
     */
    public void setProductDescription(java.lang.String productDescription) {
        this.productDescription = productDescription;
    }


    /**
     * Gets the productId value for this InvoiceItem.
     * 
     * @return productId
     */
    public java.lang.String getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this InvoiceItem.
     * 
     * @param productId
     */
    public void setProductId(java.lang.String productId) {
        this.productId = productId;
    }


    /**
     * Gets the productName value for this InvoiceItem.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this InvoiceItem.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the quantity value for this InvoiceItem.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this InvoiceItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the ratePlanChargeId value for this InvoiceItem.
     * 
     * @return ratePlanChargeId
     */
    public java.lang.String getRatePlanChargeId() {
        return ratePlanChargeId;
    }


    /**
     * Sets the ratePlanChargeId value for this InvoiceItem.
     * 
     * @param ratePlanChargeId
     */
    public void setRatePlanChargeId(java.lang.String ratePlanChargeId) {
        this.ratePlanChargeId = ratePlanChargeId;
    }


    /**
     * Gets the revRecCode value for this InvoiceItem.
     * 
     * @return revRecCode
     */
    public java.lang.String getRevRecCode() {
        return revRecCode;
    }


    /**
     * Sets the revRecCode value for this InvoiceItem.
     * 
     * @param revRecCode
     */
    public void setRevRecCode(java.lang.String revRecCode) {
        this.revRecCode = revRecCode;
    }


    /**
     * Gets the revRecStartDate value for this InvoiceItem.
     * 
     * @return revRecStartDate
     */
    public java.util.Calendar getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this InvoiceItem.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(java.util.Calendar revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }


    /**
     * Gets the revRecTriggerCondition value for this InvoiceItem.
     * 
     * @return revRecTriggerCondition
     */
    public java.lang.String getRevRecTriggerCondition() {
        return revRecTriggerCondition;
    }


    /**
     * Sets the revRecTriggerCondition value for this InvoiceItem.
     * 
     * @param revRecTriggerCondition
     */
    public void setRevRecTriggerCondition(java.lang.String revRecTriggerCondition) {
        this.revRecTriggerCondition = revRecTriggerCondition;
    }


    /**
     * Gets the serviceEndDate value for this InvoiceItem.
     * 
     * @return serviceEndDate
     */
    public java.util.Calendar getServiceEndDate() {
        return serviceEndDate;
    }


    /**
     * Sets the serviceEndDate value for this InvoiceItem.
     * 
     * @param serviceEndDate
     */
    public void setServiceEndDate(java.util.Calendar serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }


    /**
     * Gets the serviceStartDate value for this InvoiceItem.
     * 
     * @return serviceStartDate
     */
    public java.util.Calendar getServiceStartDate() {
        return serviceStartDate;
    }


    /**
     * Sets the serviceStartDate value for this InvoiceItem.
     * 
     * @param serviceStartDate
     */
    public void setServiceStartDate(java.util.Calendar serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }


    /**
     * Gets the SKU value for this InvoiceItem.
     * 
     * @return SKU
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this InvoiceItem.
     * 
     * @param SKU
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the subscriptionId value for this InvoiceItem.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this InvoiceItem.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the subscriptionNumber value for this InvoiceItem.
     * 
     * @return subscriptionNumber
     */
    public java.lang.String getSubscriptionNumber() {
        return subscriptionNumber;
    }


    /**
     * Sets the subscriptionNumber value for this InvoiceItem.
     * 
     * @param subscriptionNumber
     */
    public void setSubscriptionNumber(java.lang.String subscriptionNumber) {
        this.subscriptionNumber = subscriptionNumber;
    }


    /**
     * Gets the taxAmount value for this InvoiceItem.
     * 
     * @return taxAmount
     */
    public java.math.BigDecimal getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this InvoiceItem.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.math.BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxCode value for this InvoiceItem.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this InvoiceItem.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxExemptAmount value for this InvoiceItem.
     * 
     * @return taxExemptAmount
     */
    public java.math.BigDecimal getTaxExemptAmount() {
        return taxExemptAmount;
    }


    /**
     * Sets the taxExemptAmount value for this InvoiceItem.
     * 
     * @param taxExemptAmount
     */
    public void setTaxExemptAmount(java.math.BigDecimal taxExemptAmount) {
        this.taxExemptAmount = taxExemptAmount;
    }


    /**
     * Gets the unitPrice value for this InvoiceItem.
     * 
     * @return unitPrice
     */
    public java.math.BigDecimal getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this InvoiceItem.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the UOM value for this InvoiceItem.
     * 
     * @return UOM
     */
    public java.lang.String getUOM() {
        return UOM;
    }


    /**
     * Sets the UOM value for this InvoiceItem.
     * 
     * @param UOM
     */
    public void setUOM(java.lang.String UOM) {
        this.UOM = UOM;
    }


    /**
     * Gets the updatedById value for this InvoiceItem.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this InvoiceItem.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this InvoiceItem.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this InvoiceItem.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceItem)) return false;
        InvoiceItem other = (InvoiceItem) obj;
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
            ((this.chargeAmount==null && other.getChargeAmount()==null) || 
             (this.chargeAmount!=null &&
              this.chargeAmount.equals(other.getChargeAmount()))) &&
            ((this.chargeDate==null && other.getChargeDate()==null) || 
             (this.chargeDate!=null &&
              this.chargeDate.equals(other.getChargeDate()))) &&
            ((this.chargeDescription==null && other.getChargeDescription()==null) || 
             (this.chargeDescription!=null &&
              this.chargeDescription.equals(other.getChargeDescription()))) &&
            ((this.chargeName==null && other.getChargeName()==null) || 
             (this.chargeName!=null &&
              this.chargeName.equals(other.getChargeName()))) &&
            ((this.chargeNumber==null && other.getChargeNumber()==null) || 
             (this.chargeNumber!=null &&
              this.chargeNumber.equals(other.getChargeNumber()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.processingType==null && other.getProcessingType()==null) || 
             (this.processingType!=null &&
              this.processingType.equals(other.getProcessingType()))) &&
            ((this.productDescription==null && other.getProductDescription()==null) || 
             (this.productDescription!=null &&
              this.productDescription.equals(other.getProductDescription()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.ratePlanChargeId==null && other.getRatePlanChargeId()==null) || 
             (this.ratePlanChargeId!=null &&
              this.ratePlanChargeId.equals(other.getRatePlanChargeId()))) &&
            ((this.revRecCode==null && other.getRevRecCode()==null) || 
             (this.revRecCode!=null &&
              this.revRecCode.equals(other.getRevRecCode()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              this.revRecStartDate.equals(other.getRevRecStartDate()))) &&
            ((this.revRecTriggerCondition==null && other.getRevRecTriggerCondition()==null) || 
             (this.revRecTriggerCondition!=null &&
              this.revRecTriggerCondition.equals(other.getRevRecTriggerCondition()))) &&
            ((this.serviceEndDate==null && other.getServiceEndDate()==null) || 
             (this.serviceEndDate!=null &&
              this.serviceEndDate.equals(other.getServiceEndDate()))) &&
            ((this.serviceStartDate==null && other.getServiceStartDate()==null) || 
             (this.serviceStartDate!=null &&
              this.serviceStartDate.equals(other.getServiceStartDate()))) &&
            ((this.SKU==null && other.getSKU()==null) || 
             (this.SKU!=null &&
              this.SKU.equals(other.getSKU()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
            ((this.subscriptionNumber==null && other.getSubscriptionNumber()==null) || 
             (this.subscriptionNumber!=null &&
              this.subscriptionNumber.equals(other.getSubscriptionNumber()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxExemptAmount==null && other.getTaxExemptAmount()==null) || 
             (this.taxExemptAmount!=null &&
              this.taxExemptAmount.equals(other.getTaxExemptAmount()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.UOM==null && other.getUOM()==null) || 
             (this.UOM!=null &&
              this.UOM.equals(other.getUOM()))) &&
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
        if (getChargeAmount() != null) {
            _hashCode += getChargeAmount().hashCode();
        }
        if (getChargeDate() != null) {
            _hashCode += getChargeDate().hashCode();
        }
        if (getChargeDescription() != null) {
            _hashCode += getChargeDescription().hashCode();
        }
        if (getChargeName() != null) {
            _hashCode += getChargeName().hashCode();
        }
        if (getChargeNumber() != null) {
            _hashCode += getChargeNumber().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getProcessingType() != null) {
            _hashCode += getProcessingType().hashCode();
        }
        if (getProductDescription() != null) {
            _hashCode += getProductDescription().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRatePlanChargeId() != null) {
            _hashCode += getRatePlanChargeId().hashCode();
        }
        if (getRevRecCode() != null) {
            _hashCode += getRevRecCode().hashCode();
        }
        if (getRevRecStartDate() != null) {
            _hashCode += getRevRecStartDate().hashCode();
        }
        if (getRevRecTriggerCondition() != null) {
            _hashCode += getRevRecTriggerCondition().hashCode();
        }
        if (getServiceEndDate() != null) {
            _hashCode += getServiceEndDate().hashCode();
        }
        if (getServiceStartDate() != null) {
            _hashCode += getServiceStartDate().hashCode();
        }
        if (getSKU() != null) {
            _hashCode += getSKU().hashCode();
        }
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        if (getSubscriptionNumber() != null) {
            _hashCode += getSubscriptionNumber().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxExemptAmount() != null) {
            _hashCode += getTaxExemptAmount().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getUOM() != null) {
            _hashCode += getUOM().hashCode();
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
        new org.apache.axis.description.TypeDesc(InvoiceItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargeNumber"));
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
        elemField.setFieldName("invoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProcessingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductDescription"));
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
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("revRecCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RevRecCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RevRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecTriggerCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RevRecTriggerCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ServiceEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ServiceStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SKU"));
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
        elemField.setFieldName("subscriptionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SubscriptionNumber"));
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
        elemField.setFieldName("taxExemptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxExemptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UOM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UOM"));
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
