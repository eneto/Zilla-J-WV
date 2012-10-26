/**
 * RatePlanCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class RatePlanCharge  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountingCode;

    private java.lang.String applyDiscountTo;

    private java.lang.Integer billCycleDay;

    private java.lang.String billCycleType;

    private java.lang.String billingPeriodAlignment;

    private java.util.Calendar chargedThroughDate;

    private java.lang.String chargeModel;

    private java.lang.String chargeNumber;

    private java.lang.String chargeType;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private java.math.BigDecimal discountAmount;

    private java.lang.String discountLevel;

    private java.math.BigDecimal discountPercentage;

    private java.math.BigDecimal DMRC;

    private java.math.BigDecimal DTCV;

    private java.util.Calendar effectiveEndDate;

    private java.util.Calendar effectiveStartDate;

    private java.math.BigDecimal includedUnits;

    private java.lang.Boolean isLastSegment;

    private java.math.BigDecimal MRR;

    private java.lang.String name;

    private java.lang.Long numberOfPeriods;

    private java.lang.String originalId;

    private java.lang.String overageCalculationOption;

    private java.math.BigDecimal overagePrice;

    private java.lang.String overageUnusedUnitsCreditOption;

    private java.math.BigDecimal price;

    private java.math.BigDecimal priceIncreasePercentage;

    private java.util.Calendar processedThroughDate;

    private java.lang.String productRatePlanChargeId;

    private java.math.BigDecimal quantity;

    private java.lang.String ratePlanId;

    private java.math.BigDecimal rolloverBalance;

    private java.lang.Integer segment;

    private java.math.BigDecimal TCV;

    private java.util.Calendar triggerDate;

    private java.lang.String triggerEvent;

    private java.math.BigDecimal unusedUnitsCreditRates;

    private java.lang.String UOM;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    private java.lang.Long upToPeriods;

    private java.lang.String usageRecordRatingOption;

    private java.lang.Boolean useDiscountSpecificAccountingCode;

    private java.lang.Long version;

    public RatePlanCharge() {
    }

    public RatePlanCharge(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountingCode,
           java.lang.String applyDiscountTo,
           java.lang.Integer billCycleDay,
           java.lang.String billCycleType,
           java.lang.String billingPeriodAlignment,
           java.util.Calendar chargedThroughDate,
           java.lang.String chargeModel,
           java.lang.String chargeNumber,
           java.lang.String chargeType,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           java.math.BigDecimal discountAmount,
           java.lang.String discountLevel,
           java.math.BigDecimal discountPercentage,
           java.math.BigDecimal DMRC,
           java.math.BigDecimal DTCV,
           java.util.Calendar effectiveEndDate,
           java.util.Calendar effectiveStartDate,
           java.math.BigDecimal includedUnits,
           java.lang.Boolean isLastSegment,
           java.math.BigDecimal MRR,
           java.lang.String name,
           java.lang.Long numberOfPeriods,
           java.lang.String originalId,
           java.lang.String overageCalculationOption,
           java.math.BigDecimal overagePrice,
           java.lang.String overageUnusedUnitsCreditOption,
           java.math.BigDecimal price,
           java.math.BigDecimal priceIncreasePercentage,
           java.util.Calendar processedThroughDate,
           java.lang.String productRatePlanChargeId,
           java.math.BigDecimal quantity,
           java.lang.String ratePlanId,
           java.math.BigDecimal rolloverBalance,
           java.lang.Integer segment,
           java.math.BigDecimal TCV,
           java.util.Calendar triggerDate,
           java.lang.String triggerEvent,
           java.math.BigDecimal unusedUnitsCreditRates,
           java.lang.String UOM,
           java.lang.String updatedById,
           java.util.Calendar updatedDate,
           java.lang.Long upToPeriods,
           java.lang.String usageRecordRatingOption,
           java.lang.Boolean useDiscountSpecificAccountingCode,
           java.lang.Long version) {
        super(
            fieldsToNull,
            id);
        this.accountingCode = accountingCode;
        this.applyDiscountTo = applyDiscountTo;
        this.billCycleDay = billCycleDay;
        this.billCycleType = billCycleType;
        this.billingPeriodAlignment = billingPeriodAlignment;
        this.chargedThroughDate = chargedThroughDate;
        this.chargeModel = chargeModel;
        this.chargeNumber = chargeNumber;
        this.chargeType = chargeType;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.discountAmount = discountAmount;
        this.discountLevel = discountLevel;
        this.discountPercentage = discountPercentage;
        this.DMRC = DMRC;
        this.DTCV = DTCV;
        this.effectiveEndDate = effectiveEndDate;
        this.effectiveStartDate = effectiveStartDate;
        this.includedUnits = includedUnits;
        this.isLastSegment = isLastSegment;
        this.MRR = MRR;
        this.name = name;
        this.numberOfPeriods = numberOfPeriods;
        this.originalId = originalId;
        this.overageCalculationOption = overageCalculationOption;
        this.overagePrice = overagePrice;
        this.overageUnusedUnitsCreditOption = overageUnusedUnitsCreditOption;
        this.price = price;
        this.priceIncreasePercentage = priceIncreasePercentage;
        this.processedThroughDate = processedThroughDate;
        this.productRatePlanChargeId = productRatePlanChargeId;
        this.quantity = quantity;
        this.ratePlanId = ratePlanId;
        this.rolloverBalance = rolloverBalance;
        this.segment = segment;
        this.TCV = TCV;
        this.triggerDate = triggerDate;
        this.triggerEvent = triggerEvent;
        this.unusedUnitsCreditRates = unusedUnitsCreditRates;
        this.UOM = UOM;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
        this.upToPeriods = upToPeriods;
        this.usageRecordRatingOption = usageRecordRatingOption;
        this.useDiscountSpecificAccountingCode = useDiscountSpecificAccountingCode;
        this.version = version;
    }


    /**
     * Gets the accountingCode value for this RatePlanCharge.
     * 
     * @return accountingCode
     */
    public java.lang.String getAccountingCode() {
        return accountingCode;
    }


    /**
     * Sets the accountingCode value for this RatePlanCharge.
     * 
     * @param accountingCode
     */
    public void setAccountingCode(java.lang.String accountingCode) {
        this.accountingCode = accountingCode;
    }


    /**
     * Gets the applyDiscountTo value for this RatePlanCharge.
     * 
     * @return applyDiscountTo
     */
    public java.lang.String getApplyDiscountTo() {
        return applyDiscountTo;
    }


    /**
     * Sets the applyDiscountTo value for this RatePlanCharge.
     * 
     * @param applyDiscountTo
     */
    public void setApplyDiscountTo(java.lang.String applyDiscountTo) {
        this.applyDiscountTo = applyDiscountTo;
    }


    /**
     * Gets the billCycleDay value for this RatePlanCharge.
     * 
     * @return billCycleDay
     */
    public java.lang.Integer getBillCycleDay() {
        return billCycleDay;
    }


    /**
     * Sets the billCycleDay value for this RatePlanCharge.
     * 
     * @param billCycleDay
     */
    public void setBillCycleDay(java.lang.Integer billCycleDay) {
        this.billCycleDay = billCycleDay;
    }


    /**
     * Gets the billCycleType value for this RatePlanCharge.
     * 
     * @return billCycleType
     */
    public java.lang.String getBillCycleType() {
        return billCycleType;
    }


    /**
     * Sets the billCycleType value for this RatePlanCharge.
     * 
     * @param billCycleType
     */
    public void setBillCycleType(java.lang.String billCycleType) {
        this.billCycleType = billCycleType;
    }


    /**
     * Gets the billingPeriodAlignment value for this RatePlanCharge.
     * 
     * @return billingPeriodAlignment
     */
    public java.lang.String getBillingPeriodAlignment() {
        return billingPeriodAlignment;
    }


    /**
     * Sets the billingPeriodAlignment value for this RatePlanCharge.
     * 
     * @param billingPeriodAlignment
     */
    public void setBillingPeriodAlignment(java.lang.String billingPeriodAlignment) {
        this.billingPeriodAlignment = billingPeriodAlignment;
    }


    /**
     * Gets the chargedThroughDate value for this RatePlanCharge.
     * 
     * @return chargedThroughDate
     */
    public java.util.Calendar getChargedThroughDate() {
        return chargedThroughDate;
    }


    /**
     * Sets the chargedThroughDate value for this RatePlanCharge.
     * 
     * @param chargedThroughDate
     */
    public void setChargedThroughDate(java.util.Calendar chargedThroughDate) {
        this.chargedThroughDate = chargedThroughDate;
    }


    /**
     * Gets the chargeModel value for this RatePlanCharge.
     * 
     * @return chargeModel
     */
    public java.lang.String getChargeModel() {
        return chargeModel;
    }


    /**
     * Sets the chargeModel value for this RatePlanCharge.
     * 
     * @param chargeModel
     */
    public void setChargeModel(java.lang.String chargeModel) {
        this.chargeModel = chargeModel;
    }


    /**
     * Gets the chargeNumber value for this RatePlanCharge.
     * 
     * @return chargeNumber
     */
    public java.lang.String getChargeNumber() {
        return chargeNumber;
    }


    /**
     * Sets the chargeNumber value for this RatePlanCharge.
     * 
     * @param chargeNumber
     */
    public void setChargeNumber(java.lang.String chargeNumber) {
        this.chargeNumber = chargeNumber;
    }


    /**
     * Gets the chargeType value for this RatePlanCharge.
     * 
     * @return chargeType
     */
    public java.lang.String getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this RatePlanCharge.
     * 
     * @param chargeType
     */
    public void setChargeType(java.lang.String chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the createdById value for this RatePlanCharge.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this RatePlanCharge.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this RatePlanCharge.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RatePlanCharge.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this RatePlanCharge.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RatePlanCharge.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the discountAmount value for this RatePlanCharge.
     * 
     * @return discountAmount
     */
    public java.math.BigDecimal getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this RatePlanCharge.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.math.BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the discountLevel value for this RatePlanCharge.
     * 
     * @return discountLevel
     */
    public java.lang.String getDiscountLevel() {
        return discountLevel;
    }


    /**
     * Sets the discountLevel value for this RatePlanCharge.
     * 
     * @param discountLevel
     */
    public void setDiscountLevel(java.lang.String discountLevel) {
        this.discountLevel = discountLevel;
    }


    /**
     * Gets the discountPercentage value for this RatePlanCharge.
     * 
     * @return discountPercentage
     */
    public java.math.BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }


    /**
     * Sets the discountPercentage value for this RatePlanCharge.
     * 
     * @param discountPercentage
     */
    public void setDiscountPercentage(java.math.BigDecimal discountPercentage) {
        this.discountPercentage = discountPercentage;
    }


    /**
     * Gets the DMRC value for this RatePlanCharge.
     * 
     * @return DMRC
     */
    public java.math.BigDecimal getDMRC() {
        return DMRC;
    }


    /**
     * Sets the DMRC value for this RatePlanCharge.
     * 
     * @param DMRC
     */
    public void setDMRC(java.math.BigDecimal DMRC) {
        this.DMRC = DMRC;
    }


    /**
     * Gets the DTCV value for this RatePlanCharge.
     * 
     * @return DTCV
     */
    public java.math.BigDecimal getDTCV() {
        return DTCV;
    }


    /**
     * Sets the DTCV value for this RatePlanCharge.
     * 
     * @param DTCV
     */
    public void setDTCV(java.math.BigDecimal DTCV) {
        this.DTCV = DTCV;
    }


    /**
     * Gets the effectiveEndDate value for this RatePlanCharge.
     * 
     * @return effectiveEndDate
     */
    public java.util.Calendar getEffectiveEndDate() {
        return effectiveEndDate;
    }


    /**
     * Sets the effectiveEndDate value for this RatePlanCharge.
     * 
     * @param effectiveEndDate
     */
    public void setEffectiveEndDate(java.util.Calendar effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }


    /**
     * Gets the effectiveStartDate value for this RatePlanCharge.
     * 
     * @return effectiveStartDate
     */
    public java.util.Calendar getEffectiveStartDate() {
        return effectiveStartDate;
    }


    /**
     * Sets the effectiveStartDate value for this RatePlanCharge.
     * 
     * @param effectiveStartDate
     */
    public void setEffectiveStartDate(java.util.Calendar effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }


    /**
     * Gets the includedUnits value for this RatePlanCharge.
     * 
     * @return includedUnits
     */
    public java.math.BigDecimal getIncludedUnits() {
        return includedUnits;
    }


    /**
     * Sets the includedUnits value for this RatePlanCharge.
     * 
     * @param includedUnits
     */
    public void setIncludedUnits(java.math.BigDecimal includedUnits) {
        this.includedUnits = includedUnits;
    }


    /**
     * Gets the isLastSegment value for this RatePlanCharge.
     * 
     * @return isLastSegment
     */
    public java.lang.Boolean getIsLastSegment() {
        return isLastSegment;
    }


    /**
     * Sets the isLastSegment value for this RatePlanCharge.
     * 
     * @param isLastSegment
     */
    public void setIsLastSegment(java.lang.Boolean isLastSegment) {
        this.isLastSegment = isLastSegment;
    }


    /**
     * Gets the MRR value for this RatePlanCharge.
     * 
     * @return MRR
     */
    public java.math.BigDecimal getMRR() {
        return MRR;
    }


    /**
     * Sets the MRR value for this RatePlanCharge.
     * 
     * @param MRR
     */
    public void setMRR(java.math.BigDecimal MRR) {
        this.MRR = MRR;
    }


    /**
     * Gets the name value for this RatePlanCharge.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RatePlanCharge.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numberOfPeriods value for this RatePlanCharge.
     * 
     * @return numberOfPeriods
     */
    public java.lang.Long getNumberOfPeriods() {
        return numberOfPeriods;
    }


    /**
     * Sets the numberOfPeriods value for this RatePlanCharge.
     * 
     * @param numberOfPeriods
     */
    public void setNumberOfPeriods(java.lang.Long numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }


    /**
     * Gets the originalId value for this RatePlanCharge.
     * 
     * @return originalId
     */
    public java.lang.String getOriginalId() {
        return originalId;
    }


    /**
     * Sets the originalId value for this RatePlanCharge.
     * 
     * @param originalId
     */
    public void setOriginalId(java.lang.String originalId) {
        this.originalId = originalId;
    }


    /**
     * Gets the overageCalculationOption value for this RatePlanCharge.
     * 
     * @return overageCalculationOption
     */
    public java.lang.String getOverageCalculationOption() {
        return overageCalculationOption;
    }


    /**
     * Sets the overageCalculationOption value for this RatePlanCharge.
     * 
     * @param overageCalculationOption
     */
    public void setOverageCalculationOption(java.lang.String overageCalculationOption) {
        this.overageCalculationOption = overageCalculationOption;
    }


    /**
     * Gets the overagePrice value for this RatePlanCharge.
     * 
     * @return overagePrice
     */
    public java.math.BigDecimal getOveragePrice() {
        return overagePrice;
    }


    /**
     * Sets the overagePrice value for this RatePlanCharge.
     * 
     * @param overagePrice
     */
    public void setOveragePrice(java.math.BigDecimal overagePrice) {
        this.overagePrice = overagePrice;
    }


    /**
     * Gets the overageUnusedUnitsCreditOption value for this RatePlanCharge.
     * 
     * @return overageUnusedUnitsCreditOption
     */
    public java.lang.String getOverageUnusedUnitsCreditOption() {
        return overageUnusedUnitsCreditOption;
    }


    /**
     * Sets the overageUnusedUnitsCreditOption value for this RatePlanCharge.
     * 
     * @param overageUnusedUnitsCreditOption
     */
    public void setOverageUnusedUnitsCreditOption(java.lang.String overageUnusedUnitsCreditOption) {
        this.overageUnusedUnitsCreditOption = overageUnusedUnitsCreditOption;
    }


    /**
     * Gets the price value for this RatePlanCharge.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this RatePlanCharge.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the priceIncreasePercentage value for this RatePlanCharge.
     * 
     * @return priceIncreasePercentage
     */
    public java.math.BigDecimal getPriceIncreasePercentage() {
        return priceIncreasePercentage;
    }


    /**
     * Sets the priceIncreasePercentage value for this RatePlanCharge.
     * 
     * @param priceIncreasePercentage
     */
    public void setPriceIncreasePercentage(java.math.BigDecimal priceIncreasePercentage) {
        this.priceIncreasePercentage = priceIncreasePercentage;
    }


    /**
     * Gets the processedThroughDate value for this RatePlanCharge.
     * 
     * @return processedThroughDate
     */
    public java.util.Calendar getProcessedThroughDate() {
        return processedThroughDate;
    }


    /**
     * Sets the processedThroughDate value for this RatePlanCharge.
     * 
     * @param processedThroughDate
     */
    public void setProcessedThroughDate(java.util.Calendar processedThroughDate) {
        this.processedThroughDate = processedThroughDate;
    }


    /**
     * Gets the productRatePlanChargeId value for this RatePlanCharge.
     * 
     * @return productRatePlanChargeId
     */
    public java.lang.String getProductRatePlanChargeId() {
        return productRatePlanChargeId;
    }


    /**
     * Sets the productRatePlanChargeId value for this RatePlanCharge.
     * 
     * @param productRatePlanChargeId
     */
    public void setProductRatePlanChargeId(java.lang.String productRatePlanChargeId) {
        this.productRatePlanChargeId = productRatePlanChargeId;
    }


    /**
     * Gets the quantity value for this RatePlanCharge.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this RatePlanCharge.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the ratePlanId value for this RatePlanCharge.
     * 
     * @return ratePlanId
     */
    public java.lang.String getRatePlanId() {
        return ratePlanId;
    }


    /**
     * Sets the ratePlanId value for this RatePlanCharge.
     * 
     * @param ratePlanId
     */
    public void setRatePlanId(java.lang.String ratePlanId) {
        this.ratePlanId = ratePlanId;
    }


    /**
     * Gets the rolloverBalance value for this RatePlanCharge.
     * 
     * @return rolloverBalance
     */
    public java.math.BigDecimal getRolloverBalance() {
        return rolloverBalance;
    }


    /**
     * Sets the rolloverBalance value for this RatePlanCharge.
     * 
     * @param rolloverBalance
     */
    public void setRolloverBalance(java.math.BigDecimal rolloverBalance) {
        this.rolloverBalance = rolloverBalance;
    }


    /**
     * Gets the segment value for this RatePlanCharge.
     * 
     * @return segment
     */
    public java.lang.Integer getSegment() {
        return segment;
    }


    /**
     * Sets the segment value for this RatePlanCharge.
     * 
     * @param segment
     */
    public void setSegment(java.lang.Integer segment) {
        this.segment = segment;
    }


    /**
     * Gets the TCV value for this RatePlanCharge.
     * 
     * @return TCV
     */
    public java.math.BigDecimal getTCV() {
        return TCV;
    }


    /**
     * Sets the TCV value for this RatePlanCharge.
     * 
     * @param TCV
     */
    public void setTCV(java.math.BigDecimal TCV) {
        this.TCV = TCV;
    }


    /**
     * Gets the triggerDate value for this RatePlanCharge.
     * 
     * @return triggerDate
     */
    public java.util.Calendar getTriggerDate() {
        return triggerDate;
    }


    /**
     * Sets the triggerDate value for this RatePlanCharge.
     * 
     * @param triggerDate
     */
    public void setTriggerDate(java.util.Calendar triggerDate) {
        this.triggerDate = triggerDate;
    }


    /**
     * Gets the triggerEvent value for this RatePlanCharge.
     * 
     * @return triggerEvent
     */
    public java.lang.String getTriggerEvent() {
        return triggerEvent;
    }


    /**
     * Sets the triggerEvent value for this RatePlanCharge.
     * 
     * @param triggerEvent
     */
    public void setTriggerEvent(java.lang.String triggerEvent) {
        this.triggerEvent = triggerEvent;
    }


    /**
     * Gets the unusedUnitsCreditRates value for this RatePlanCharge.
     * 
     * @return unusedUnitsCreditRates
     */
    public java.math.BigDecimal getUnusedUnitsCreditRates() {
        return unusedUnitsCreditRates;
    }


    /**
     * Sets the unusedUnitsCreditRates value for this RatePlanCharge.
     * 
     * @param unusedUnitsCreditRates
     */
    public void setUnusedUnitsCreditRates(java.math.BigDecimal unusedUnitsCreditRates) {
        this.unusedUnitsCreditRates = unusedUnitsCreditRates;
    }


    /**
     * Gets the UOM value for this RatePlanCharge.
     * 
     * @return UOM
     */
    public java.lang.String getUOM() {
        return UOM;
    }


    /**
     * Sets the UOM value for this RatePlanCharge.
     * 
     * @param UOM
     */
    public void setUOM(java.lang.String UOM) {
        this.UOM = UOM;
    }


    /**
     * Gets the updatedById value for this RatePlanCharge.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this RatePlanCharge.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this RatePlanCharge.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this RatePlanCharge.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the upToPeriods value for this RatePlanCharge.
     * 
     * @return upToPeriods
     */
    public java.lang.Long getUpToPeriods() {
        return upToPeriods;
    }


    /**
     * Sets the upToPeriods value for this RatePlanCharge.
     * 
     * @param upToPeriods
     */
    public void setUpToPeriods(java.lang.Long upToPeriods) {
        this.upToPeriods = upToPeriods;
    }


    /**
     * Gets the usageRecordRatingOption value for this RatePlanCharge.
     * 
     * @return usageRecordRatingOption
     */
    public java.lang.String getUsageRecordRatingOption() {
        return usageRecordRatingOption;
    }


    /**
     * Sets the usageRecordRatingOption value for this RatePlanCharge.
     * 
     * @param usageRecordRatingOption
     */
    public void setUsageRecordRatingOption(java.lang.String usageRecordRatingOption) {
        this.usageRecordRatingOption = usageRecordRatingOption;
    }


    /**
     * Gets the useDiscountSpecificAccountingCode value for this RatePlanCharge.
     * 
     * @return useDiscountSpecificAccountingCode
     */
    public java.lang.Boolean getUseDiscountSpecificAccountingCode() {
        return useDiscountSpecificAccountingCode;
    }


    /**
     * Sets the useDiscountSpecificAccountingCode value for this RatePlanCharge.
     * 
     * @param useDiscountSpecificAccountingCode
     */
    public void setUseDiscountSpecificAccountingCode(java.lang.Boolean useDiscountSpecificAccountingCode) {
        this.useDiscountSpecificAccountingCode = useDiscountSpecificAccountingCode;
    }


    /**
     * Gets the version value for this RatePlanCharge.
     * 
     * @return version
     */
    public java.lang.Long getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RatePlanCharge.
     * 
     * @param version
     */
    public void setVersion(java.lang.Long version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RatePlanCharge)) return false;
        RatePlanCharge other = (RatePlanCharge) obj;
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
            ((this.billingPeriodAlignment==null && other.getBillingPeriodAlignment()==null) || 
             (this.billingPeriodAlignment!=null &&
              this.billingPeriodAlignment.equals(other.getBillingPeriodAlignment()))) &&
            ((this.chargedThroughDate==null && other.getChargedThroughDate()==null) || 
             (this.chargedThroughDate!=null &&
              this.chargedThroughDate.equals(other.getChargedThroughDate()))) &&
            ((this.chargeModel==null && other.getChargeModel()==null) || 
             (this.chargeModel!=null &&
              this.chargeModel.equals(other.getChargeModel()))) &&
            ((this.chargeNumber==null && other.getChargeNumber()==null) || 
             (this.chargeNumber!=null &&
              this.chargeNumber.equals(other.getChargeNumber()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              this.chargeType.equals(other.getChargeType()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.discountLevel==null && other.getDiscountLevel()==null) || 
             (this.discountLevel!=null &&
              this.discountLevel.equals(other.getDiscountLevel()))) &&
            ((this.discountPercentage==null && other.getDiscountPercentage()==null) || 
             (this.discountPercentage!=null &&
              this.discountPercentage.equals(other.getDiscountPercentage()))) &&
            ((this.DMRC==null && other.getDMRC()==null) || 
             (this.DMRC!=null &&
              this.DMRC.equals(other.getDMRC()))) &&
            ((this.DTCV==null && other.getDTCV()==null) || 
             (this.DTCV!=null &&
              this.DTCV.equals(other.getDTCV()))) &&
            ((this.effectiveEndDate==null && other.getEffectiveEndDate()==null) || 
             (this.effectiveEndDate!=null &&
              this.effectiveEndDate.equals(other.getEffectiveEndDate()))) &&
            ((this.effectiveStartDate==null && other.getEffectiveStartDate()==null) || 
             (this.effectiveStartDate!=null &&
              this.effectiveStartDate.equals(other.getEffectiveStartDate()))) &&
            ((this.includedUnits==null && other.getIncludedUnits()==null) || 
             (this.includedUnits!=null &&
              this.includedUnits.equals(other.getIncludedUnits()))) &&
            ((this.isLastSegment==null && other.getIsLastSegment()==null) || 
             (this.isLastSegment!=null &&
              this.isLastSegment.equals(other.getIsLastSegment()))) &&
            ((this.MRR==null && other.getMRR()==null) || 
             (this.MRR!=null &&
              this.MRR.equals(other.getMRR()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.numberOfPeriods==null && other.getNumberOfPeriods()==null) || 
             (this.numberOfPeriods!=null &&
              this.numberOfPeriods.equals(other.getNumberOfPeriods()))) &&
            ((this.originalId==null && other.getOriginalId()==null) || 
             (this.originalId!=null &&
              this.originalId.equals(other.getOriginalId()))) &&
            ((this.overageCalculationOption==null && other.getOverageCalculationOption()==null) || 
             (this.overageCalculationOption!=null &&
              this.overageCalculationOption.equals(other.getOverageCalculationOption()))) &&
            ((this.overagePrice==null && other.getOveragePrice()==null) || 
             (this.overagePrice!=null &&
              this.overagePrice.equals(other.getOveragePrice()))) &&
            ((this.overageUnusedUnitsCreditOption==null && other.getOverageUnusedUnitsCreditOption()==null) || 
             (this.overageUnusedUnitsCreditOption!=null &&
              this.overageUnusedUnitsCreditOption.equals(other.getOverageUnusedUnitsCreditOption()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.priceIncreasePercentage==null && other.getPriceIncreasePercentage()==null) || 
             (this.priceIncreasePercentage!=null &&
              this.priceIncreasePercentage.equals(other.getPriceIncreasePercentage()))) &&
            ((this.processedThroughDate==null && other.getProcessedThroughDate()==null) || 
             (this.processedThroughDate!=null &&
              this.processedThroughDate.equals(other.getProcessedThroughDate()))) &&
            ((this.productRatePlanChargeId==null && other.getProductRatePlanChargeId()==null) || 
             (this.productRatePlanChargeId!=null &&
              this.productRatePlanChargeId.equals(other.getProductRatePlanChargeId()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.ratePlanId==null && other.getRatePlanId()==null) || 
             (this.ratePlanId!=null &&
              this.ratePlanId.equals(other.getRatePlanId()))) &&
            ((this.rolloverBalance==null && other.getRolloverBalance()==null) || 
             (this.rolloverBalance!=null &&
              this.rolloverBalance.equals(other.getRolloverBalance()))) &&
            ((this.segment==null && other.getSegment()==null) || 
             (this.segment!=null &&
              this.segment.equals(other.getSegment()))) &&
            ((this.TCV==null && other.getTCV()==null) || 
             (this.TCV!=null &&
              this.TCV.equals(other.getTCV()))) &&
            ((this.triggerDate==null && other.getTriggerDate()==null) || 
             (this.triggerDate!=null &&
              this.triggerDate.equals(other.getTriggerDate()))) &&
            ((this.triggerEvent==null && other.getTriggerEvent()==null) || 
             (this.triggerEvent!=null &&
              this.triggerEvent.equals(other.getTriggerEvent()))) &&
            ((this.unusedUnitsCreditRates==null && other.getUnusedUnitsCreditRates()==null) || 
             (this.unusedUnitsCreditRates!=null &&
              this.unusedUnitsCreditRates.equals(other.getUnusedUnitsCreditRates()))) &&
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
            ((this.usageRecordRatingOption==null && other.getUsageRecordRatingOption()==null) || 
             (this.usageRecordRatingOption!=null &&
              this.usageRecordRatingOption.equals(other.getUsageRecordRatingOption()))) &&
            ((this.useDiscountSpecificAccountingCode==null && other.getUseDiscountSpecificAccountingCode()==null) || 
             (this.useDiscountSpecificAccountingCode!=null &&
              this.useDiscountSpecificAccountingCode.equals(other.getUseDiscountSpecificAccountingCode()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getBillingPeriodAlignment() != null) {
            _hashCode += getBillingPeriodAlignment().hashCode();
        }
        if (getChargedThroughDate() != null) {
            _hashCode += getChargedThroughDate().hashCode();
        }
        if (getChargeModel() != null) {
            _hashCode += getChargeModel().hashCode();
        }
        if (getChargeNumber() != null) {
            _hashCode += getChargeNumber().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getDiscountLevel() != null) {
            _hashCode += getDiscountLevel().hashCode();
        }
        if (getDiscountPercentage() != null) {
            _hashCode += getDiscountPercentage().hashCode();
        }
        if (getDMRC() != null) {
            _hashCode += getDMRC().hashCode();
        }
        if (getDTCV() != null) {
            _hashCode += getDTCV().hashCode();
        }
        if (getEffectiveEndDate() != null) {
            _hashCode += getEffectiveEndDate().hashCode();
        }
        if (getEffectiveStartDate() != null) {
            _hashCode += getEffectiveStartDate().hashCode();
        }
        if (getIncludedUnits() != null) {
            _hashCode += getIncludedUnits().hashCode();
        }
        if (getIsLastSegment() != null) {
            _hashCode += getIsLastSegment().hashCode();
        }
        if (getMRR() != null) {
            _hashCode += getMRR().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumberOfPeriods() != null) {
            _hashCode += getNumberOfPeriods().hashCode();
        }
        if (getOriginalId() != null) {
            _hashCode += getOriginalId().hashCode();
        }
        if (getOverageCalculationOption() != null) {
            _hashCode += getOverageCalculationOption().hashCode();
        }
        if (getOveragePrice() != null) {
            _hashCode += getOveragePrice().hashCode();
        }
        if (getOverageUnusedUnitsCreditOption() != null) {
            _hashCode += getOverageUnusedUnitsCreditOption().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPriceIncreasePercentage() != null) {
            _hashCode += getPriceIncreasePercentage().hashCode();
        }
        if (getProcessedThroughDate() != null) {
            _hashCode += getProcessedThroughDate().hashCode();
        }
        if (getProductRatePlanChargeId() != null) {
            _hashCode += getProductRatePlanChargeId().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRatePlanId() != null) {
            _hashCode += getRatePlanId().hashCode();
        }
        if (getRolloverBalance() != null) {
            _hashCode += getRolloverBalance().hashCode();
        }
        if (getSegment() != null) {
            _hashCode += getSegment().hashCode();
        }
        if (getTCV() != null) {
            _hashCode += getTCV().hashCode();
        }
        if (getTriggerDate() != null) {
            _hashCode += getTriggerDate().hashCode();
        }
        if (getTriggerEvent() != null) {
            _hashCode += getTriggerEvent().hashCode();
        }
        if (getUnusedUnitsCreditRates() != null) {
            _hashCode += getUnusedUnitsCreditRates().hashCode();
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
        if (getUsageRecordRatingOption() != null) {
            _hashCode += getUsageRecordRatingOption().hashCode();
        }
        if (getUseDiscountSpecificAccountingCode() != null) {
            _hashCode += getUseDiscountSpecificAccountingCode().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RatePlanCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlanCharge"));
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
        elemField.setFieldName("billingPeriodAlignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "BillingPeriodAlignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargedThroughDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargedThroughDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("chargeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ChargeNumber"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Description"));
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
        elemField.setFieldName("discountLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DiscountLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("DMRC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DMRC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DTCV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DTCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("includedUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IncludedUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLastSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IsLastSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MRR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MRR"));
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
        elemField.setFieldName("numberOfPeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "NumberOfPeriods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "OriginalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("overagePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "OveragePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("processedThroughDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProcessedThroughDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolloverBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RolloverBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TriggerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("unusedUnitsCreditRates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UnusedUnitsCreditRates"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upToPeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UpToPeriods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageRecordRatingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "UsageRecordRatingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
