/**
 * ProductRatePlanCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class ProductRatePlanCharge  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountingCode;

    private java.lang.String applyDiscountTo;

    private java.lang.Integer billCycleDay;

    private java.lang.String billCycleType;

    private java.lang.String billingPeriod;

    private java.lang.String billingPeriodAlignment;

    private java.lang.String chargeModel;

    private java.lang.String chargeType;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.math.BigDecimal defaultQuantity;

    private java.lang.String description;

    private java.lang.String discountLevel;

    private java.math.BigDecimal includedUnits;

    private java.math.BigDecimal maxQuantity;

    private java.math.BigDecimal minQuantity;

    private java.lang.String name;

    private java.lang.Long numberOfPeriod;

    private java.lang.String overageCalculationOption;

    private java.lang.String overageUnusedUnitsCreditOption;

    private java.lang.String priceIncreaseOption;

    private java.math.BigDecimal priceIncreasePercentage;

    private com.zuora.api.object.ProductRatePlanChargeTier[] productRatePlanChargeTierData;

    private java.lang.String productRatePlanId;

    private java.lang.String revRecCode;

    private java.lang.String revRecTriggerCondition;

    private java.lang.String smoothingModel;

    private java.lang.Long specificBillingPeriod;

    private java.lang.Boolean taxable;

    private java.lang.String taxCode;

    private java.lang.String triggerEvent;

    private java.lang.String UOM;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    private java.lang.Long upToPeriods;

    private java.lang.Boolean useDiscountSpecificAccountingCode;

    public ProductRatePlanCharge() {
    }

    public ProductRatePlanCharge(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountingCode,
           java.lang.String applyDiscountTo,
           java.lang.Integer billCycleDay,
           java.lang.String billCycleType,
           java.lang.String billingPeriod,
           java.lang.String billingPeriodAlignment,
           java.lang.String chargeModel,
           java.lang.String chargeType,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.math.BigDecimal defaultQuantity,
           java.lang.String description,
           java.lang.String discountLevel,
           java.math.BigDecimal includedUnits,
           java.math.BigDecimal maxQuantity,
           java.math.BigDecimal minQuantity,
           java.lang.String name,
           java.lang.Long numberOfPeriod,
           java.lang.String overageCalculationOption,
           java.lang.String overageUnusedUnitsCreditOption,
           java.lang.String priceIncreaseOption,
           java.math.BigDecimal priceIncreasePercentage,
           com.zuora.api.object.ProductRatePlanChargeTier[] productRatePlanChargeTierData,
           java.lang.String productRatePlanId,
           java.lang.String revRecCode,
           java.lang.String revRecTriggerCondition,
           java.lang.String smoothingModel,
           java.lang.Long specificBillingPeriod,
           java.lang.Boolean taxable,
           java.lang.String taxCode,
           java.lang.String triggerEvent,
           java.lang.String UOM,
           java.lang.String updatedById,
           java.util.Calendar updatedDate,
           java.lang.Long upToPeriods,
           java.lang.Boolean useDiscountSpecificAccountingCode) {
        super(
            fieldsToNull,
            id);
        this.accountingCode = accountingCode;
        this.applyDiscountTo = applyDiscountTo;
        this.billCycleDay = billCycleDay;
        this.billCycleType = billCycleType;
        this.billingPeriod = billingPeriod;
        this.billingPeriodAlignment = billingPeriodAlignment;
        this.chargeModel = chargeModel;
        this.chargeType = chargeType;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.defaultQuantity = defaultQuantity;
        this.description = description;
        this.discountLevel = discountLevel;
        this.includedUnits = includedUnits;
        this.maxQuantity = maxQuantity;
        this.minQuantity = minQuantity;
        this.name = name;
        this.numberOfPeriod = numberOfPeriod;
        this.overageCalculationOption = overageCalculationOption;
        this.overageUnusedUnitsCreditOption = overageUnusedUnitsCreditOption;
        this.priceIncreaseOption = priceIncreaseOption;
        this.priceIncreasePercentage = priceIncreasePercentage;
        this.productRatePlanChargeTierData = productRatePlanChargeTierData;
        this.productRatePlanId = productRatePlanId;
        this.revRecCode = revRecCode;
        this.revRecTriggerCondition = revRecTriggerCondition;
        this.smoothingModel = smoothingModel;
        this.specificBillingPeriod = specificBillingPeriod;
        this.taxable = taxable;
        this.taxCode = taxCode;
        this.triggerEvent = triggerEvent;
        this.UOM = UOM;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
        this.upToPeriods = upToPeriods;
        this.useDiscountSpecificAccountingCode = useDiscountSpecificAccountingCode;
    }


    /**
     * Gets the accountingCode value for this ProductRatePlanCharge.
     * 
     * @return accountingCode
     */
    public java.lang.String getAccountingCode() {
        return accountingCode;
    }


    /**
     * Sets the accountingCode value for this ProductRatePlanCharge.
     * 
     * @param accountingCode
     */
    public void setAccountingCode(java.lang.String accountingCode) {
        this.accountingCode = accountingCode;
    }


    /**
     * Gets the applyDiscountTo value for this ProductRatePlanCharge.
     * 
     * @return applyDiscountTo
     */
    public java.lang.String getApplyDiscountTo() {
        return applyDiscountTo;
    }


    /**
     * Sets the applyDiscountTo value for this ProductRatePlanCharge.
     * 
     * @param applyDiscountTo
     */
    public void setApplyDiscountTo(java.lang.String applyDiscountTo) {
        this.applyDiscountTo = applyDiscountTo;
    }


    /**
     * Gets the billCycleDay value for this ProductRatePlanCharge.
     * 
     * @return billCycleDay
     */
    public java.lang.Integer getBillCycleDay() {
        return billCycleDay;
    }


    /**
     * Sets the billCycleDay value for this ProductRatePlanCharge.
     * 
     * @param billCycleDay
     */
    public void setBillCycleDay(java.lang.Integer billCycleDay) {
        this.billCycleDay = billCycleDay;
    }


    /**
     * Gets the billCycleType value for this ProductRatePlanCharge.
     * 
     * @return billCycleType
     */
    public java.lang.String getBillCycleType() {
        return billCycleType;
    }


    /**
     * Sets the billCycleType value for this ProductRatePlanCharge.
     * 
     * @param billCycleType
     */
    public void setBillCycleType(java.lang.String billCycleType) {
        this.billCycleType = billCycleType;
    }


    /**
     * Gets the billingPeriod value for this ProductRatePlanCharge.
     * 
     * @return billingPeriod
     */
    public java.lang.String getBillingPeriod() {
        return billingPeriod;
    }


    /**
     * Sets the billingPeriod value for this ProductRatePlanCharge.
     * 
     * @param billingPeriod
     */
    public void setBillingPeriod(java.lang.String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }


    /**
     * Gets the billingPeriodAlignment value for this ProductRatePlanCharge.
     * 
     * @return billingPeriodAlignment
     */
    public java.lang.String getBillingPeriodAlignment() {
        return billingPeriodAlignment;
    }


    /**
     * Sets the billingPeriodAlignment value for this ProductRatePlanCharge.
     * 
     * @param billingPeriodAlignment
     */
    public void setBillingPeriodAlignment(java.lang.String billingPeriodAlignment) {
        this.billingPeriodAlignment = billingPeriodAlignment;
    }


    /**
     * Gets the chargeModel value for this ProductRatePlanCharge.
     * 
     * @return chargeModel
     */
    public java.lang.String getChargeModel() {
        return chargeModel;
    }


    /**
     * Sets the chargeModel value for this ProductRatePlanCharge.
     * 
     * @param chargeModel
     */
    public void setChargeModel(java.lang.String chargeModel) {
        this.chargeModel = chargeModel;
    }


    /**
     * Gets the chargeType value for this ProductRatePlanCharge.
     * 
     * @return chargeType
     */
    public java.lang.String getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this ProductRatePlanCharge.
     * 
     * @param chargeType
     */
    public void setChargeType(java.lang.String chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the createdById value for this ProductRatePlanCharge.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ProductRatePlanCharge.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ProductRatePlanCharge.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProductRatePlanCharge.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the defaultQuantity value for this ProductRatePlanCharge.
     * 
     * @return defaultQuantity
     */
    public java.math.BigDecimal getDefaultQuantity() {
        return defaultQuantity;
    }


    /**
     * Sets the defaultQuantity value for this ProductRatePlanCharge.
     * 
     * @param defaultQuantity
     */
    public void setDefaultQuantity(java.math.BigDecimal defaultQuantity) {
        this.defaultQuantity = defaultQuantity;
    }


    /**
     * Gets the description value for this ProductRatePlanCharge.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductRatePlanCharge.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the discountLevel value for this ProductRatePlanCharge.
     * 
     * @return discountLevel
     */
    public java.lang.String getDiscountLevel() {
        return discountLevel;
    }


    /**
     * Sets the discountLevel value for this ProductRatePlanCharge.
     * 
     * @param discountLevel
     */
    public void setDiscountLevel(java.lang.String discountLevel) {
        this.discountLevel = discountLevel;
    }


    /**
     * Gets the includedUnits value for this ProductRatePlanCharge.
     * 
     * @return includedUnits
     */
    public java.math.BigDecimal getIncludedUnits() {
        return includedUnits;
    }


    /**
     * Sets the includedUnits value for this ProductRatePlanCharge.
     * 
     * @param includedUnits
     */
    public void setIncludedUnits(java.math.BigDecimal includedUnits) {
        this.includedUnits = includedUnits;
    }


    /**
     * Gets the maxQuantity value for this ProductRatePlanCharge.
     * 
     * @return maxQuantity
     */
    public java.math.BigDecimal getMaxQuantity() {
        return maxQuantity;
    }


    /**
     * Sets the maxQuantity value for this ProductRatePlanCharge.
     * 
     * @param maxQuantity
     */
    public void setMaxQuantity(java.math.BigDecimal maxQuantity) {
        this.maxQuantity = maxQuantity;
    }


    /**
     * Gets the minQuantity value for this ProductRatePlanCharge.
     * 
     * @return minQuantity
     */
    public java.math.BigDecimal getMinQuantity() {
        return minQuantity;
    }


    /**
     * Sets the minQuantity value for this ProductRatePlanCharge.
     * 
     * @param minQuantity
     */
    public void setMinQuantity(java.math.BigDecimal minQuantity) {
        this.minQuantity = minQuantity;
    }


    /**
     * Gets the name value for this ProductRatePlanCharge.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductRatePlanCharge.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numberOfPeriod value for this ProductRatePlanCharge.
     * 
     * @return numberOfPeriod
     */
    public java.lang.Long getNumberOfPeriod() {
        return numberOfPeriod;
    }


    /**
     * Sets the numberOfPeriod value for this ProductRatePlanCharge.
     * 
     * @param numberOfPeriod
     */
    public void setNumberOfPeriod(java.lang.Long numberOfPeriod) {
        this.numberOfPeriod = numberOfPeriod;
    }


    /**
     * Gets the overageCalculationOption value for this ProductRatePlanCharge.
     * 
     * @return overageCalculationOption
     */
    public java.lang.String getOverageCalculationOption() {
        return overageCalculationOption;
    }


    /**
     * Sets the overageCalculationOption value for this ProductRatePlanCharge.
     * 
     * @param overageCalculationOption
     */
    public void setOverageCalculationOption(java.lang.String overageCalculationOption) {
        this.overageCalculationOption = overageCalculationOption;
    }


    /**
     * Gets the overageUnusedUnitsCreditOption value for this ProductRatePlanCharge.
     * 
     * @return overageUnusedUnitsCreditOption
     */
    public java.lang.String getOverageUnusedUnitsCreditOption() {
        return overageUnusedUnitsCreditOption;
    }


    /**
     * Sets the overageUnusedUnitsCreditOption value for this ProductRatePlanCharge.
     * 
     * @param overageUnusedUnitsCreditOption
     */
    public void setOverageUnusedUnitsCreditOption(java.lang.String overageUnusedUnitsCreditOption) {
        this.overageUnusedUnitsCreditOption = overageUnusedUnitsCreditOption;
    }


    /**
     * Gets the priceIncreaseOption value for this ProductRatePlanCharge.
     * 
     * @return priceIncreaseOption
     */
    public java.lang.String getPriceIncreaseOption() {
        return priceIncreaseOption;
    }


    /**
     * Sets the priceIncreaseOption value for this ProductRatePlanCharge.
     * 
     * @param priceIncreaseOption
     */
    public void setPriceIncreaseOption(java.lang.String priceIncreaseOption) {
        this.priceIncreaseOption = priceIncreaseOption;
    }


    /**
     * Gets the priceIncreasePercentage value for this ProductRatePlanCharge.
     * 
     * @return priceIncreasePercentage
     */
    public java.math.BigDecimal getPriceIncreasePercentage() {
        return priceIncreasePercentage;
    }


    /**
     * Sets the priceIncreasePercentage value for this ProductRatePlanCharge.
     * 
     * @param priceIncreasePercentage
     */
    public void setPriceIncreasePercentage(java.math.BigDecimal priceIncreasePercentage) {
        this.priceIncreasePercentage = priceIncreasePercentage;
    }


    /**
     * Gets the productRatePlanChargeTierData value for this ProductRatePlanCharge.
     * 
     * @return productRatePlanChargeTierData
     */
    public com.zuora.api.object.ProductRatePlanChargeTier[] getProductRatePlanChargeTierData() {
        return productRatePlanChargeTierData;
    }


    /**
     * Sets the productRatePlanChargeTierData value for this ProductRatePlanCharge.
     * 
     * @param productRatePlanChargeTierData
     */
    public void setProductRatePlanChargeTierData(com.zuora.api.object.ProductRatePlanChargeTier[] productRatePlanChargeTierData) {
        this.productRatePlanChargeTierData = productRatePlanChargeTierData;
    }


    /**
     * Gets the productRatePlanId value for this ProductRatePlanCharge.
     * 
     * @return productRatePlanId
     */
    public java.lang.String getProductRatePlanId() {
        return productRatePlanId;
    }


    /**
     * Sets the productRatePlanId value for this ProductRatePlanCharge.
     * 
     * @param productRatePlanId
     */
    public void setProductRatePlanId(java.lang.String productRatePlanId) {
        this.productRatePlanId = productRatePlanId;
    }


    /**
     * Gets the revRecCode value for this ProductRatePlanCharge.
     * 
     * @return revRecCode
     */
    public java.lang.String getRevRecCode() {
        return revRecCode;
    }


    /**
     * Sets the revRecCode value for this ProductRatePlanCharge.
     * 
     * @param revRecCode
     */
    public void setRevRecCode(java.lang.String revRecCode) {
        this.revRecCode = revRecCode;
    }


    /**
     * Gets the revRecTriggerCondition value for this ProductRatePlanCharge.
     * 
     * @return revRecTriggerCondition
     */
    public java.lang.String getRevRecTriggerCondition() {
        return revRecTriggerCondition;
    }


    /**
     * Sets the revRecTriggerCondition value for this ProductRatePlanCharge.
     * 
     * @param revRecTriggerCondition
     */
    public void setRevRecTriggerCondition(java.lang.String revRecTriggerCondition) {
        this.revRecTriggerCondition = revRecTriggerCondition;
    }


    /**
     * Gets the smoothingModel value for this ProductRatePlanCharge.
     * 
     * @return smoothingModel
     */
    public java.lang.String getSmoothingModel() {
        return smoothingModel;
    }


    /**
     * Sets the smoothingModel value for this ProductRatePlanCharge.
     * 
     * @param smoothingModel
     */
    public void setSmoothingModel(java.lang.String smoothingModel) {
        this.smoothingModel = smoothingModel;
    }


    /**
     * Gets the specificBillingPeriod value for this ProductRatePlanCharge.
     * 
     * @return specificBillingPeriod
     */
    public java.lang.Long getSpecificBillingPeriod() {
        return specificBillingPeriod;
    }


    /**
     * Sets the specificBillingPeriod value for this ProductRatePlanCharge.
     * 
     * @param specificBillingPeriod
     */
    public void setSpecificBillingPeriod(java.lang.Long specificBillingPeriod) {
        this.specificBillingPeriod = specificBillingPeriod;
    }


    /**
     * Gets the taxable value for this ProductRatePlanCharge.
     * 
     * @return taxable
     */
    public java.lang.Boolean getTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this ProductRatePlanCharge.
     * 
     * @param taxable
     */
    public void setTaxable(java.lang.Boolean taxable) {
        this.taxable = taxable;
    }


    /**
     * Gets the taxCode value for this ProductRatePlanCharge.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this ProductRatePlanCharge.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the triggerEvent value for this ProductRatePlanCharge.
     * 
     * @return triggerEvent
     */
    public java.lang.String getTriggerEvent() {
        return triggerEvent;
    }


    /**
     * Sets the triggerEvent value for this ProductRatePlanCharge.
     * 
     * @param triggerEvent
     */
    public void setTriggerEvent(java.lang.String triggerEvent) {
        this.triggerEvent = triggerEvent;
    }


    /**
     * Gets the UOM value for this ProductRatePlanCharge.
     * 
     * @return UOM
     */
    public java.lang.String getUOM() {
        return UOM;
    }


    /**
     * Sets the UOM value for this ProductRatePlanCharge.
     * 
     * @param UOM
     */
    public void setUOM(java.lang.String UOM) {
        this.UOM = UOM;
    }


    /**
     * Gets the updatedById value for this ProductRatePlanCharge.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this ProductRatePlanCharge.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this ProductRatePlanCharge.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this ProductRatePlanCharge.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the upToPeriods value for this ProductRatePlanCharge.
     * 
     * @return upToPeriods
     */
    public java.lang.Long getUpToPeriods() {
        return upToPeriods;
    }


    /**
     * Sets the upToPeriods value for this ProductRatePlanCharge.
     * 
     * @param upToPeriods
     */
    public void setUpToPeriods(java.lang.Long upToPeriods) {
        this.upToPeriods = upToPeriods;
    }


    /**
     * Gets the useDiscountSpecificAccountingCode value for this ProductRatePlanCharge.
     * 
     * @return useDiscountSpecificAccountingCode
     */
    public java.lang.Boolean getUseDiscountSpecificAccountingCode() {
        return useDiscountSpecificAccountingCode;
    }


    /**
     * Sets the useDiscountSpecificAccountingCode value for this ProductRatePlanCharge.
     * 
     * @param useDiscountSpecificAccountingCode
     */
    public void setUseDiscountSpecificAccountingCode(java.lang.Boolean useDiscountSpecificAccountingCode) {
        this.useDiscountSpecificAccountingCode = useDiscountSpecificAccountingCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductRatePlanCharge)) return false;
        ProductRatePlanCharge other = (ProductRatePlanCharge) obj;
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
            ((this.applyDiscountTo==null && other.getApplyDiscountTo()==null) || 
             (this.applyDiscountTo!=null &&
              this.applyDiscountTo.equals(other.getApplyDiscountTo()))) &&
            ((this.billCycleDay==null && other.getBillCycleDay()==null) || 
             (this.billCycleDay!=null &&
              this.billCycleDay.equals(other.getBillCycleDay()))) &&
            ((this.billCycleType==null && other.getBillCycleType()==null) || 
             (this.billCycleType!=null &&
              this.billCycleType.equals(other.getBillCycleType()))) &&
            ((this.billingPeriod==null && other.getBillingPeriod()==null) || 
             (this.billingPeriod!=null &&
              this.billingPeriod.equals(other.getBillingPeriod()))) &&
            ((this.billingPeriodAlignment==null && other.getBillingPeriodAlignment()==null) || 
             (this.billingPeriodAlignment!=null &&
              this.billingPeriodAlignment.equals(other.getBillingPeriodAlignment()))) &&
            ((this.chargeModel==null && other.getChargeModel()==null) || 
             (this.chargeModel!=null &&
              this.chargeModel.equals(other.getChargeModel()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              this.chargeType.equals(other.getChargeType()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.defaultQuantity==null && other.getDefaultQuantity()==null) || 
             (this.defaultQuantity!=null &&
              this.defaultQuantity.equals(other.getDefaultQuantity()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.discountLevel==null && other.getDiscountLevel()==null) || 
             (this.discountLevel!=null &&
              this.discountLevel.equals(other.getDiscountLevel()))) &&
            ((this.includedUnits==null && other.getIncludedUnits()==null) || 
             (this.includedUnits!=null &&
              this.includedUnits.equals(other.getIncludedUnits()))) &&
            ((this.maxQuantity==null && other.getMaxQuantity()==null) || 
             (this.maxQuantity!=null &&
              this.maxQuantity.equals(other.getMaxQuantity()))) &&
            ((this.minQuantity==null && other.getMinQuantity()==null) || 
             (this.minQuantity!=null &&
              this.minQuantity.equals(other.getMinQuantity()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.numberOfPeriod==null && other.getNumberOfPeriod()==null) || 
             (this.numberOfPeriod!=null &&
              this.numberOfPeriod.equals(other.getNumberOfPeriod()))) &&
            ((this.overageCalculationOption==null && other.getOverageCalculationOption()==null) || 
             (this.overageCalculationOption!=null &&
              this.overageCalculationOption.equals(other.getOverageCalculationOption()))) &&
            ((this.overageUnusedUnitsCreditOption==null && other.getOverageUnusedUnitsCreditOption()==null) || 
             (this.overageUnusedUnitsCreditOption!=null &&
              this.overageUnusedUnitsCreditOption.equals(other.getOverageUnusedUnitsCreditOption()))) &&
            ((this.priceIncreaseOption==null && other.getPriceIncreaseOption()==null) || 
             (this.priceIncreaseOption!=null &&
              this.priceIncreaseOption.equals(other.getPriceIncreaseOption()))) &&
            ((this.priceIncreasePercentage==null && other.getPriceIncreasePercentage()==null) || 
             (this.priceIncreasePercentage!=null &&
              this.priceIncreasePercentage.equals(other.getPriceIncreasePercentage()))) &&
            ((this.productRatePlanChargeTierData==null && other.getProductRatePlanChargeTierData()==null) || 
             (this.productRatePlanChargeTierData!=null &&
              java.util.Arrays.equals(this.productRatePlanChargeTierData, other.getProductRatePlanChargeTierData()))) &&
            ((this.productRatePlanId==null && other.getProductRatePlanId()==null) || 
             (this.productRatePlanId!=null &&
              this.productRatePlanId.equals(other.getProductRatePlanId()))) &&
            ((this.revRecCode==null && other.getRevRecCode()==null) || 
             (this.revRecCode!=null &&
              this.revRecCode.equals(other.getRevRecCode()))) &&
            ((this.revRecTriggerCondition==null && other.getRevRecTriggerCondition()==null) || 
             (this.revRecTriggerCondition!=null &&
              this.revRecTriggerCondition.equals(other.getRevRecTriggerCondition()))) &&
            ((this.smoothingModel==null && other.getSmoothingModel()==null) || 
             (this.smoothingModel!=null &&
              this.smoothingModel.equals(other.getSmoothingModel()))) &&
            ((this.specificBillingPeriod==null && other.getSpecificBillingPeriod()==null) || 
             (this.specificBillingPeriod!=null &&
              this.specificBillingPeriod.equals(other.getSpecificBillingPeriod()))) &&
            ((this.taxable==null && other.getTaxable()==null) || 
             (this.taxable!=null &&
              this.taxable.equals(other.getTaxable()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.triggerEvent==null && other.getTriggerEvent()==null) || 
             (this.triggerEvent!=null &&
              this.triggerEvent.equals(other.getTriggerEvent()))) &&
            ((this.UOM==null && other.getUOM()==null) || 
             (this.UOM!=null &&
              this.UOM.equals(other.getUOM()))) &&
            ((this.updatedById==null && other.getUpdatedById()==null) || 
             (this.updatedById!=null &&
              this.updatedById.equals(other.getUpdatedById()))) &&
            ((this.updatedDate==null && other.getUpdatedDate()==null) || 
             (this.updatedDate!=null &&
              this.updatedDate.equals(other.getUpdatedDate()))) &&
            ((this.upToPeriods==null && other.getUpToPeriods()==null) || 
             (this.upToPeriods!=null &&
              this.upToPeriods.equals(other.getUpToPeriods()))) &&
            ((this.useDiscountSpecificAccountingCode==null && other.getUseDiscountSpecificAccountingCode()==null) || 
             (this.useDiscountSpecificAccountingCode!=null &&
              this.useDiscountSpecificAccountingCode.equals(other.getUseDiscountSpecificAccountingCode())));
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
        if (getApplyDiscountTo() != null) {
            _hashCode += getApplyDiscountTo().hashCode();
        }
        if (getBillCycleDay() != null) {
            _hashCode += getBillCycleDay().hashCode();
        }
        if (getBillCycleType() != null) {
            _hashCode += getBillCycleType().hashCode();
        }
        if (getBillingPeriod() != null) {
            _hashCode += getBillingPeriod().hashCode();
        }
        if (getBillingPeriodAlignment() != null) {
            _hashCode += getBillingPeriodAlignment().hashCode();
        }
        if (getChargeModel() != null) {
            _hashCode += getChargeModel().hashCode();
        }
        if (getChargeType() != null) {
            _hashCode += getChargeType().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDefaultQuantity() != null) {
            _hashCode += getDefaultQuantity().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDiscountLevel() != null) {
            _hashCode += getDiscountLevel().hashCode();
        }
        if (getIncludedUnits() != null) {
            _hashCode += getIncludedUnits().hashCode();
        }
        if (getMaxQuantity() != null) {
            _hashCode += getMaxQuantity().hashCode();
        }
        if (getMinQuantity() != null) {
            _hashCode += getMinQuantity().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumberOfPeriod() != null) {
            _hashCode += getNumberOfPeriod().hashCode();
        }
        if (getOverageCalculationOption() != null) {
            _hashCode += getOverageCalculationOption().hashCode();
        }
        if (getOverageUnusedUnitsCreditOption() != null) {
            _hashCode += getOverageUnusedUnitsCreditOption().hashCode();
        }
        if (getPriceIncreaseOption() != null) {
            _hashCode += getPriceIncreaseOption().hashCode();
        }
        if (getPriceIncreasePercentage() != null) {
            _hashCode += getPriceIncreasePercentage().hashCode();
        }
        if (getProductRatePlanChargeTierData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductRatePlanChargeTierData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductRatePlanChargeTierData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductRatePlanId() != null) {
            _hashCode += getProductRatePlanId().hashCode();
        }
        if (getRevRecCode() != null) {
            _hashCode += getRevRecCode().hashCode();
        }
        if (getRevRecTriggerCondition() != null) {
            _hashCode += getRevRecTriggerCondition().hashCode();
        }
        if (getSmoothingModel() != null) {
            _hashCode += getSmoothingModel().hashCode();
        }
        if (getSpecificBillingPeriod() != null) {
            _hashCode += getSpecificBillingPeriod().hashCode();
        }
        if (getTaxable() != null) {
            _hashCode += getTaxable().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTriggerEvent() != null) {
            _hashCode += getTriggerEvent().hashCode();
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
        if (getUpToPeriods() != null) {
            _hashCode += getUpToPeriods().hashCode();
        }
        if (getUseDiscountSpecificAccountingCode() != null) {
            _hashCode += getUseDiscountSpecificAccountingCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductRatePlanCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlanCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDiscountTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ApplyDiscountTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BillCycleDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BillCycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BillingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPeriodAlignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BillingPeriodAlignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargeModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargeType"));
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
        elemField.setFieldName("defaultQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DefaultQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("discountLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DiscountLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includedUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IncludedUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MaxQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MinQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("numberOfPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "NumberOfPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overageCalculationOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "OverageCalculationOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overageUnusedUnitsCreditOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "OverageUnusedUnitsCreditOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceIncreaseOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PriceIncreaseOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceIncreasePercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PriceIncreasePercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productRatePlanChargeTierData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlanChargeTierData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlanChargeTier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.zuora.com/", "ProductRatePlanChargeTier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productRatePlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlanId"));
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
        elemField.setFieldName("revRecTriggerCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RevRecTriggerCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smoothingModel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SmoothingModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificBillingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SpecificBillingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("triggerEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TriggerEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upToPeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UpToPeriods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDiscountSpecificAccountingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UseDiscountSpecificAccountingCode"));
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
