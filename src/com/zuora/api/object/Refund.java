/**
 * Refund.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class Refund  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String accountingCode;

    private java.math.BigDecimal amount;

    private java.util.Calendar cancelledOn;

    private java.lang.String comment;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String gateway;

    private com.zuora.api.object.GatewayOption[] gatewayOptionData;

    private java.lang.String gatewayResponse;

    private java.lang.String gatewayResponseCode;

    private java.lang.String gatewayState;

    private java.util.Calendar markedForSubmissionOn;

    private java.lang.String methodType;

    private java.lang.String paymentId;

    private java.lang.String paymentMethodId;

    private java.lang.String referenceID;

    private java.util.Calendar refundDate;

    private java.lang.String refundNumber;

    private java.util.Calendar refundTransactionTime;

    private java.util.Calendar settledOn;

    private java.lang.String sourceType;

    private java.lang.String status;

    private java.util.Calendar submittedOn;

    private java.lang.String transferredToAccounting;

    private java.lang.String type;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public Refund() {
    }

    public Refund(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.lang.String accountingCode,
           java.math.BigDecimal amount,
           java.util.Calendar cancelledOn,
           java.lang.String comment,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String gateway,
           com.zuora.api.object.GatewayOption[] gatewayOptionData,
           java.lang.String gatewayResponse,
           java.lang.String gatewayResponseCode,
           java.lang.String gatewayState,
           java.util.Calendar markedForSubmissionOn,
           java.lang.String methodType,
           java.lang.String paymentId,
           java.lang.String paymentMethodId,
           java.lang.String referenceID,
           java.util.Calendar refundDate,
           java.lang.String refundNumber,
           java.util.Calendar refundTransactionTime,
           java.util.Calendar settledOn,
           java.lang.String sourceType,
           java.lang.String status,
           java.util.Calendar submittedOn,
           java.lang.String transferredToAccounting,
           java.lang.String type,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.accountId = accountId;
        this.accountingCode = accountingCode;
        this.amount = amount;
        this.cancelledOn = cancelledOn;
        this.comment = comment;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.gateway = gateway;
        this.gatewayOptionData = gatewayOptionData;
        this.gatewayResponse = gatewayResponse;
        this.gatewayResponseCode = gatewayResponseCode;
        this.gatewayState = gatewayState;
        this.markedForSubmissionOn = markedForSubmissionOn;
        this.methodType = methodType;
        this.paymentId = paymentId;
        this.paymentMethodId = paymentMethodId;
        this.referenceID = referenceID;
        this.refundDate = refundDate;
        this.refundNumber = refundNumber;
        this.refundTransactionTime = refundTransactionTime;
        this.settledOn = settledOn;
        this.sourceType = sourceType;
        this.status = status;
        this.submittedOn = submittedOn;
        this.transferredToAccounting = transferredToAccounting;
        this.type = type;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the accountId value for this Refund.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Refund.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountingCode value for this Refund.
     * 
     * @return accountingCode
     */
    public java.lang.String getAccountingCode() {
        return accountingCode;
    }


    /**
     * Sets the accountingCode value for this Refund.
     * 
     * @param accountingCode
     */
    public void setAccountingCode(java.lang.String accountingCode) {
        this.accountingCode = accountingCode;
    }


    /**
     * Gets the amount value for this Refund.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Refund.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cancelledOn value for this Refund.
     * 
     * @return cancelledOn
     */
    public java.util.Calendar getCancelledOn() {
        return cancelledOn;
    }


    /**
     * Sets the cancelledOn value for this Refund.
     * 
     * @param cancelledOn
     */
    public void setCancelledOn(java.util.Calendar cancelledOn) {
        this.cancelledOn = cancelledOn;
    }


    /**
     * Gets the comment value for this Refund.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Refund.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the createdById value for this Refund.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Refund.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Refund.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Refund.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the gateway value for this Refund.
     * 
     * @return gateway
     */
    public java.lang.String getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this Refund.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String gateway) {
        this.gateway = gateway;
    }


    /**
     * Gets the gatewayOptionData value for this Refund.
     * 
     * @return gatewayOptionData
     */
    public com.zuora.api.object.GatewayOption[] getGatewayOptionData() {
        return gatewayOptionData;
    }


    /**
     * Sets the gatewayOptionData value for this Refund.
     * 
     * @param gatewayOptionData
     */
    public void setGatewayOptionData(com.zuora.api.object.GatewayOption[] gatewayOptionData) {
        this.gatewayOptionData = gatewayOptionData;
    }


    /**
     * Gets the gatewayResponse value for this Refund.
     * 
     * @return gatewayResponse
     */
    public java.lang.String getGatewayResponse() {
        return gatewayResponse;
    }


    /**
     * Sets the gatewayResponse value for this Refund.
     * 
     * @param gatewayResponse
     */
    public void setGatewayResponse(java.lang.String gatewayResponse) {
        this.gatewayResponse = gatewayResponse;
    }


    /**
     * Gets the gatewayResponseCode value for this Refund.
     * 
     * @return gatewayResponseCode
     */
    public java.lang.String getGatewayResponseCode() {
        return gatewayResponseCode;
    }


    /**
     * Sets the gatewayResponseCode value for this Refund.
     * 
     * @param gatewayResponseCode
     */
    public void setGatewayResponseCode(java.lang.String gatewayResponseCode) {
        this.gatewayResponseCode = gatewayResponseCode;
    }


    /**
     * Gets the gatewayState value for this Refund.
     * 
     * @return gatewayState
     */
    public java.lang.String getGatewayState() {
        return gatewayState;
    }


    /**
     * Sets the gatewayState value for this Refund.
     * 
     * @param gatewayState
     */
    public void setGatewayState(java.lang.String gatewayState) {
        this.gatewayState = gatewayState;
    }


    /**
     * Gets the markedForSubmissionOn value for this Refund.
     * 
     * @return markedForSubmissionOn
     */
    public java.util.Calendar getMarkedForSubmissionOn() {
        return markedForSubmissionOn;
    }


    /**
     * Sets the markedForSubmissionOn value for this Refund.
     * 
     * @param markedForSubmissionOn
     */
    public void setMarkedForSubmissionOn(java.util.Calendar markedForSubmissionOn) {
        this.markedForSubmissionOn = markedForSubmissionOn;
    }


    /**
     * Gets the methodType value for this Refund.
     * 
     * @return methodType
     */
    public java.lang.String getMethodType() {
        return methodType;
    }


    /**
     * Sets the methodType value for this Refund.
     * 
     * @param methodType
     */
    public void setMethodType(java.lang.String methodType) {
        this.methodType = methodType;
    }


    /**
     * Gets the paymentId value for this Refund.
     * 
     * @return paymentId
     */
    public java.lang.String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this Refund.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the paymentMethodId value for this Refund.
     * 
     * @return paymentMethodId
     */
    public java.lang.String getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this Refund.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(java.lang.String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the referenceID value for this Refund.
     * 
     * @return referenceID
     */
    public java.lang.String getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this Refund.
     * 
     * @param referenceID
     */
    public void setReferenceID(java.lang.String referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the refundDate value for this Refund.
     * 
     * @return refundDate
     */
    public java.util.Calendar getRefundDate() {
        return refundDate;
    }


    /**
     * Sets the refundDate value for this Refund.
     * 
     * @param refundDate
     */
    public void setRefundDate(java.util.Calendar refundDate) {
        this.refundDate = refundDate;
    }


    /**
     * Gets the refundNumber value for this Refund.
     * 
     * @return refundNumber
     */
    public java.lang.String getRefundNumber() {
        return refundNumber;
    }


    /**
     * Sets the refundNumber value for this Refund.
     * 
     * @param refundNumber
     */
    public void setRefundNumber(java.lang.String refundNumber) {
        this.refundNumber = refundNumber;
    }


    /**
     * Gets the refundTransactionTime value for this Refund.
     * 
     * @return refundTransactionTime
     */
    public java.util.Calendar getRefundTransactionTime() {
        return refundTransactionTime;
    }


    /**
     * Sets the refundTransactionTime value for this Refund.
     * 
     * @param refundTransactionTime
     */
    public void setRefundTransactionTime(java.util.Calendar refundTransactionTime) {
        this.refundTransactionTime = refundTransactionTime;
    }


    /**
     * Gets the settledOn value for this Refund.
     * 
     * @return settledOn
     */
    public java.util.Calendar getSettledOn() {
        return settledOn;
    }


    /**
     * Sets the settledOn value for this Refund.
     * 
     * @param settledOn
     */
    public void setSettledOn(java.util.Calendar settledOn) {
        this.settledOn = settledOn;
    }


    /**
     * Gets the sourceType value for this Refund.
     * 
     * @return sourceType
     */
    public java.lang.String getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this Refund.
     * 
     * @param sourceType
     */
    public void setSourceType(java.lang.String sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the status value for this Refund.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Refund.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the submittedOn value for this Refund.
     * 
     * @return submittedOn
     */
    public java.util.Calendar getSubmittedOn() {
        return submittedOn;
    }


    /**
     * Sets the submittedOn value for this Refund.
     * 
     * @param submittedOn
     */
    public void setSubmittedOn(java.util.Calendar submittedOn) {
        this.submittedOn = submittedOn;
    }


    /**
     * Gets the transferredToAccounting value for this Refund.
     * 
     * @return transferredToAccounting
     */
    public java.lang.String getTransferredToAccounting() {
        return transferredToAccounting;
    }


    /**
     * Sets the transferredToAccounting value for this Refund.
     * 
     * @param transferredToAccounting
     */
    public void setTransferredToAccounting(java.lang.String transferredToAccounting) {
        this.transferredToAccounting = transferredToAccounting;
    }


    /**
     * Gets the type value for this Refund.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Refund.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the updatedById value for this Refund.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this Refund.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this Refund.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this Refund.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Refund)) return false;
        Refund other = (Refund) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountingCode==null && other.getAccountingCode()==null) || 
             (this.accountingCode!=null &&
              this.accountingCode.equals(other.getAccountingCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cancelledOn==null && other.getCancelledOn()==null) || 
             (this.cancelledOn!=null &&
              this.cancelledOn.equals(other.getCancelledOn()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              this.gateway.equals(other.getGateway()))) &&
            ((this.gatewayOptionData==null && other.getGatewayOptionData()==null) || 
             (this.gatewayOptionData!=null &&
              java.util.Arrays.equals(this.gatewayOptionData, other.getGatewayOptionData()))) &&
            ((this.gatewayResponse==null && other.getGatewayResponse()==null) || 
             (this.gatewayResponse!=null &&
              this.gatewayResponse.equals(other.getGatewayResponse()))) &&
            ((this.gatewayResponseCode==null && other.getGatewayResponseCode()==null) || 
             (this.gatewayResponseCode!=null &&
              this.gatewayResponseCode.equals(other.getGatewayResponseCode()))) &&
            ((this.gatewayState==null && other.getGatewayState()==null) || 
             (this.gatewayState!=null &&
              this.gatewayState.equals(other.getGatewayState()))) &&
            ((this.markedForSubmissionOn==null && other.getMarkedForSubmissionOn()==null) || 
             (this.markedForSubmissionOn!=null &&
              this.markedForSubmissionOn.equals(other.getMarkedForSubmissionOn()))) &&
            ((this.methodType==null && other.getMethodType()==null) || 
             (this.methodType!=null &&
              this.methodType.equals(other.getMethodType()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.paymentMethodId==null && other.getPaymentMethodId()==null) || 
             (this.paymentMethodId!=null &&
              this.paymentMethodId.equals(other.getPaymentMethodId()))) &&
            ((this.referenceID==null && other.getReferenceID()==null) || 
             (this.referenceID!=null &&
              this.referenceID.equals(other.getReferenceID()))) &&
            ((this.refundDate==null && other.getRefundDate()==null) || 
             (this.refundDate!=null &&
              this.refundDate.equals(other.getRefundDate()))) &&
            ((this.refundNumber==null && other.getRefundNumber()==null) || 
             (this.refundNumber!=null &&
              this.refundNumber.equals(other.getRefundNumber()))) &&
            ((this.refundTransactionTime==null && other.getRefundTransactionTime()==null) || 
             (this.refundTransactionTime!=null &&
              this.refundTransactionTime.equals(other.getRefundTransactionTime()))) &&
            ((this.settledOn==null && other.getSettledOn()==null) || 
             (this.settledOn!=null &&
              this.settledOn.equals(other.getSettledOn()))) &&
            ((this.sourceType==null && other.getSourceType()==null) || 
             (this.sourceType!=null &&
              this.sourceType.equals(other.getSourceType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.submittedOn==null && other.getSubmittedOn()==null) || 
             (this.submittedOn!=null &&
              this.submittedOn.equals(other.getSubmittedOn()))) &&
            ((this.transferredToAccounting==null && other.getTransferredToAccounting()==null) || 
             (this.transferredToAccounting!=null &&
              this.transferredToAccounting.equals(other.getTransferredToAccounting()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountingCode() != null) {
            _hashCode += getAccountingCode().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCancelledOn() != null) {
            _hashCode += getCancelledOn().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
        }
        if (getGatewayOptionData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGatewayOptionData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGatewayOptionData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGatewayResponse() != null) {
            _hashCode += getGatewayResponse().hashCode();
        }
        if (getGatewayResponseCode() != null) {
            _hashCode += getGatewayResponseCode().hashCode();
        }
        if (getGatewayState() != null) {
            _hashCode += getGatewayState().hashCode();
        }
        if (getMarkedForSubmissionOn() != null) {
            _hashCode += getMarkedForSubmissionOn().hashCode();
        }
        if (getMethodType() != null) {
            _hashCode += getMethodType().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getPaymentMethodId() != null) {
            _hashCode += getPaymentMethodId().hashCode();
        }
        if (getReferenceID() != null) {
            _hashCode += getReferenceID().hashCode();
        }
        if (getRefundDate() != null) {
            _hashCode += getRefundDate().hashCode();
        }
        if (getRefundNumber() != null) {
            _hashCode += getRefundNumber().hashCode();
        }
        if (getRefundTransactionTime() != null) {
            _hashCode += getRefundTransactionTime().hashCode();
        }
        if (getSettledOn() != null) {
            _hashCode += getSettledOn().hashCode();
        }
        if (getSourceType() != null) {
            _hashCode += getSourceType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubmittedOn() != null) {
            _hashCode += getSubmittedOn().hashCode();
        }
        if (getTransferredToAccounting() != null) {
            _hashCode += getTransferredToAccounting().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
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
        new org.apache.axis.description.TypeDesc(Refund.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Refund"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CancelledOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Comment"));
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
        elemField.setFieldName("gateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Gateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayOptionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayOptionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.zuora.com/", "GatewayOption"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markedForSubmissionOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MarkedForSubmissionOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "MethodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RefundDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RefundNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundTransactionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RefundTransactionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settledOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SettledOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submittedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SubmittedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferredToAccounting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TransferredToAccounting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Type"));
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
