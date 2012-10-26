/**
 * Subscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class Subscription  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.Boolean autoRenew;

    private java.util.Calendar cancelledDate;

    private java.util.Calendar contractAcceptanceDate;

    private java.util.Calendar contractEffectiveDate;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String creatorAccountId;

    private java.lang.String creatorInvoiceOwnerId;

    private java.lang.Integer initialTerm;

    private java.lang.String invoiceOwnerId;

    private java.lang.Boolean isInvoiceSeparate;

    private java.lang.String name;

    private java.lang.String notes;

    private java.util.Calendar originalCreatedDate;

    private java.lang.String originalId;

    private java.lang.String previousSubscriptionId;

    private java.lang.Integer renewalTerm;

    private java.util.Calendar serviceActivationDate;

    private java.lang.String status;

    private java.util.Calendar subscriptionEndDate;

    private java.util.Calendar subscriptionStartDate;

    private java.util.Calendar termEndDate;

    private java.util.Calendar termStartDate;

    private java.lang.String termType;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    private java.lang.Integer version;

    public Subscription() {
    }

    public Subscription(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.lang.Boolean autoRenew,
           java.util.Calendar cancelledDate,
           java.util.Calendar contractAcceptanceDate,
           java.util.Calendar contractEffectiveDate,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String creatorAccountId,
           java.lang.String creatorInvoiceOwnerId,
           java.lang.Integer initialTerm,
           java.lang.String invoiceOwnerId,
           java.lang.Boolean isInvoiceSeparate,
           java.lang.String name,
           java.lang.String notes,
           java.util.Calendar originalCreatedDate,
           java.lang.String originalId,
           java.lang.String previousSubscriptionId,
           java.lang.Integer renewalTerm,
           java.util.Calendar serviceActivationDate,
           java.lang.String status,
           java.util.Calendar subscriptionEndDate,
           java.util.Calendar subscriptionStartDate,
           java.util.Calendar termEndDate,
           java.util.Calendar termStartDate,
           java.lang.String termType,
           java.lang.String updatedById,
           java.util.Calendar updatedDate,
           java.lang.Integer version) {
        super(
            fieldsToNull,
            id);
        this.accountId = accountId;
        this.autoRenew = autoRenew;
        this.cancelledDate = cancelledDate;
        this.contractAcceptanceDate = contractAcceptanceDate;
        this.contractEffectiveDate = contractEffectiveDate;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.creatorAccountId = creatorAccountId;
        this.creatorInvoiceOwnerId = creatorInvoiceOwnerId;
        this.initialTerm = initialTerm;
        this.invoiceOwnerId = invoiceOwnerId;
        this.isInvoiceSeparate = isInvoiceSeparate;
        this.name = name;
        this.notes = notes;
        this.originalCreatedDate = originalCreatedDate;
        this.originalId = originalId;
        this.previousSubscriptionId = previousSubscriptionId;
        this.renewalTerm = renewalTerm;
        this.serviceActivationDate = serviceActivationDate;
        this.status = status;
        this.subscriptionEndDate = subscriptionEndDate;
        this.subscriptionStartDate = subscriptionStartDate;
        this.termEndDate = termEndDate;
        this.termStartDate = termStartDate;
        this.termType = termType;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
        this.version = version;
    }


    /**
     * Gets the accountId value for this Subscription.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Subscription.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the autoRenew value for this Subscription.
     * 
     * @return autoRenew
     */
    public java.lang.Boolean getAutoRenew() {
        return autoRenew;
    }


    /**
     * Sets the autoRenew value for this Subscription.
     * 
     * @param autoRenew
     */
    public void setAutoRenew(java.lang.Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }


    /**
     * Gets the cancelledDate value for this Subscription.
     * 
     * @return cancelledDate
     */
    public java.util.Calendar getCancelledDate() {
        return cancelledDate;
    }


    /**
     * Sets the cancelledDate value for this Subscription.
     * 
     * @param cancelledDate
     */
    public void setCancelledDate(java.util.Calendar cancelledDate) {
        this.cancelledDate = cancelledDate;
    }


    /**
     * Gets the contractAcceptanceDate value for this Subscription.
     * 
     * @return contractAcceptanceDate
     */
    public java.util.Calendar getContractAcceptanceDate() {
        return contractAcceptanceDate;
    }


    /**
     * Sets the contractAcceptanceDate value for this Subscription.
     * 
     * @param contractAcceptanceDate
     */
    public void setContractAcceptanceDate(java.util.Calendar contractAcceptanceDate) {
        this.contractAcceptanceDate = contractAcceptanceDate;
    }


    /**
     * Gets the contractEffectiveDate value for this Subscription.
     * 
     * @return contractEffectiveDate
     */
    public java.util.Calendar getContractEffectiveDate() {
        return contractEffectiveDate;
    }


    /**
     * Sets the contractEffectiveDate value for this Subscription.
     * 
     * @param contractEffectiveDate
     */
    public void setContractEffectiveDate(java.util.Calendar contractEffectiveDate) {
        this.contractEffectiveDate = contractEffectiveDate;
    }


    /**
     * Gets the createdById value for this Subscription.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Subscription.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Subscription.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Subscription.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the creatorAccountId value for this Subscription.
     * 
     * @return creatorAccountId
     */
    public java.lang.String getCreatorAccountId() {
        return creatorAccountId;
    }


    /**
     * Sets the creatorAccountId value for this Subscription.
     * 
     * @param creatorAccountId
     */
    public void setCreatorAccountId(java.lang.String creatorAccountId) {
        this.creatorAccountId = creatorAccountId;
    }


    /**
     * Gets the creatorInvoiceOwnerId value for this Subscription.
     * 
     * @return creatorInvoiceOwnerId
     */
    public java.lang.String getCreatorInvoiceOwnerId() {
        return creatorInvoiceOwnerId;
    }


    /**
     * Sets the creatorInvoiceOwnerId value for this Subscription.
     * 
     * @param creatorInvoiceOwnerId
     */
    public void setCreatorInvoiceOwnerId(java.lang.String creatorInvoiceOwnerId) {
        this.creatorInvoiceOwnerId = creatorInvoiceOwnerId;
    }


    /**
     * Gets the initialTerm value for this Subscription.
     * 
     * @return initialTerm
     */
    public java.lang.Integer getInitialTerm() {
        return initialTerm;
    }


    /**
     * Sets the initialTerm value for this Subscription.
     * 
     * @param initialTerm
     */
    public void setInitialTerm(java.lang.Integer initialTerm) {
        this.initialTerm = initialTerm;
    }


    /**
     * Gets the invoiceOwnerId value for this Subscription.
     * 
     * @return invoiceOwnerId
     */
    public java.lang.String getInvoiceOwnerId() {
        return invoiceOwnerId;
    }


    /**
     * Sets the invoiceOwnerId value for this Subscription.
     * 
     * @param invoiceOwnerId
     */
    public void setInvoiceOwnerId(java.lang.String invoiceOwnerId) {
        this.invoiceOwnerId = invoiceOwnerId;
    }


    /**
     * Gets the isInvoiceSeparate value for this Subscription.
     * 
     * @return isInvoiceSeparate
     */
    public java.lang.Boolean getIsInvoiceSeparate() {
        return isInvoiceSeparate;
    }


    /**
     * Sets the isInvoiceSeparate value for this Subscription.
     * 
     * @param isInvoiceSeparate
     */
    public void setIsInvoiceSeparate(java.lang.Boolean isInvoiceSeparate) {
        this.isInvoiceSeparate = isInvoiceSeparate;
    }


    /**
     * Gets the name value for this Subscription.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Subscription.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Subscription.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Subscription.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the originalCreatedDate value for this Subscription.
     * 
     * @return originalCreatedDate
     */
    public java.util.Calendar getOriginalCreatedDate() {
        return originalCreatedDate;
    }


    /**
     * Sets the originalCreatedDate value for this Subscription.
     * 
     * @param originalCreatedDate
     */
    public void setOriginalCreatedDate(java.util.Calendar originalCreatedDate) {
        this.originalCreatedDate = originalCreatedDate;
    }


    /**
     * Gets the originalId value for this Subscription.
     * 
     * @return originalId
     */
    public java.lang.String getOriginalId() {
        return originalId;
    }


    /**
     * Sets the originalId value for this Subscription.
     * 
     * @param originalId
     */
    public void setOriginalId(java.lang.String originalId) {
        this.originalId = originalId;
    }


    /**
     * Gets the previousSubscriptionId value for this Subscription.
     * 
     * @return previousSubscriptionId
     */
    public java.lang.String getPreviousSubscriptionId() {
        return previousSubscriptionId;
    }


    /**
     * Sets the previousSubscriptionId value for this Subscription.
     * 
     * @param previousSubscriptionId
     */
    public void setPreviousSubscriptionId(java.lang.String previousSubscriptionId) {
        this.previousSubscriptionId = previousSubscriptionId;
    }


    /**
     * Gets the renewalTerm value for this Subscription.
     * 
     * @return renewalTerm
     */
    public java.lang.Integer getRenewalTerm() {
        return renewalTerm;
    }


    /**
     * Sets the renewalTerm value for this Subscription.
     * 
     * @param renewalTerm
     */
    public void setRenewalTerm(java.lang.Integer renewalTerm) {
        this.renewalTerm = renewalTerm;
    }


    /**
     * Gets the serviceActivationDate value for this Subscription.
     * 
     * @return serviceActivationDate
     */
    public java.util.Calendar getServiceActivationDate() {
        return serviceActivationDate;
    }


    /**
     * Sets the serviceActivationDate value for this Subscription.
     * 
     * @param serviceActivationDate
     */
    public void setServiceActivationDate(java.util.Calendar serviceActivationDate) {
        this.serviceActivationDate = serviceActivationDate;
    }


    /**
     * Gets the status value for this Subscription.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Subscription.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the subscriptionEndDate value for this Subscription.
     * 
     * @return subscriptionEndDate
     */
    public java.util.Calendar getSubscriptionEndDate() {
        return subscriptionEndDate;
    }


    /**
     * Sets the subscriptionEndDate value for this Subscription.
     * 
     * @param subscriptionEndDate
     */
    public void setSubscriptionEndDate(java.util.Calendar subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }


    /**
     * Gets the subscriptionStartDate value for this Subscription.
     * 
     * @return subscriptionStartDate
     */
    public java.util.Calendar getSubscriptionStartDate() {
        return subscriptionStartDate;
    }


    /**
     * Sets the subscriptionStartDate value for this Subscription.
     * 
     * @param subscriptionStartDate
     */
    public void setSubscriptionStartDate(java.util.Calendar subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }


    /**
     * Gets the termEndDate value for this Subscription.
     * 
     * @return termEndDate
     */
    public java.util.Calendar getTermEndDate() {
        return termEndDate;
    }


    /**
     * Sets the termEndDate value for this Subscription.
     * 
     * @param termEndDate
     */
    public void setTermEndDate(java.util.Calendar termEndDate) {
        this.termEndDate = termEndDate;
    }


    /**
     * Gets the termStartDate value for this Subscription.
     * 
     * @return termStartDate
     */
    public java.util.Calendar getTermStartDate() {
        return termStartDate;
    }


    /**
     * Sets the termStartDate value for this Subscription.
     * 
     * @param termStartDate
     */
    public void setTermStartDate(java.util.Calendar termStartDate) {
        this.termStartDate = termStartDate;
    }


    /**
     * Gets the termType value for this Subscription.
     * 
     * @return termType
     */
    public java.lang.String getTermType() {
        return termType;
    }


    /**
     * Sets the termType value for this Subscription.
     * 
     * @param termType
     */
    public void setTermType(java.lang.String termType) {
        this.termType = termType;
    }


    /**
     * Gets the updatedById value for this Subscription.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this Subscription.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this Subscription.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this Subscription.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the version value for this Subscription.
     * 
     * @return version
     */
    public java.lang.Integer getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Subscription.
     * 
     * @param version
     */
    public void setVersion(java.lang.Integer version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscription)) return false;
        Subscription other = (Subscription) obj;
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
            ((this.autoRenew==null && other.getAutoRenew()==null) || 
             (this.autoRenew!=null &&
              this.autoRenew.equals(other.getAutoRenew()))) &&
            ((this.cancelledDate==null && other.getCancelledDate()==null) || 
             (this.cancelledDate!=null &&
              this.cancelledDate.equals(other.getCancelledDate()))) &&
            ((this.contractAcceptanceDate==null && other.getContractAcceptanceDate()==null) || 
             (this.contractAcceptanceDate!=null &&
              this.contractAcceptanceDate.equals(other.getContractAcceptanceDate()))) &&
            ((this.contractEffectiveDate==null && other.getContractEffectiveDate()==null) || 
             (this.contractEffectiveDate!=null &&
              this.contractEffectiveDate.equals(other.getContractEffectiveDate()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.creatorAccountId==null && other.getCreatorAccountId()==null) || 
             (this.creatorAccountId!=null &&
              this.creatorAccountId.equals(other.getCreatorAccountId()))) &&
            ((this.creatorInvoiceOwnerId==null && other.getCreatorInvoiceOwnerId()==null) || 
             (this.creatorInvoiceOwnerId!=null &&
              this.creatorInvoiceOwnerId.equals(other.getCreatorInvoiceOwnerId()))) &&
            ((this.initialTerm==null && other.getInitialTerm()==null) || 
             (this.initialTerm!=null &&
              this.initialTerm.equals(other.getInitialTerm()))) &&
            ((this.invoiceOwnerId==null && other.getInvoiceOwnerId()==null) || 
             (this.invoiceOwnerId!=null &&
              this.invoiceOwnerId.equals(other.getInvoiceOwnerId()))) &&
            ((this.isInvoiceSeparate==null && other.getIsInvoiceSeparate()==null) || 
             (this.isInvoiceSeparate!=null &&
              this.isInvoiceSeparate.equals(other.getIsInvoiceSeparate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.originalCreatedDate==null && other.getOriginalCreatedDate()==null) || 
             (this.originalCreatedDate!=null &&
              this.originalCreatedDate.equals(other.getOriginalCreatedDate()))) &&
            ((this.originalId==null && other.getOriginalId()==null) || 
             (this.originalId!=null &&
              this.originalId.equals(other.getOriginalId()))) &&
            ((this.previousSubscriptionId==null && other.getPreviousSubscriptionId()==null) || 
             (this.previousSubscriptionId!=null &&
              this.previousSubscriptionId.equals(other.getPreviousSubscriptionId()))) &&
            ((this.renewalTerm==null && other.getRenewalTerm()==null) || 
             (this.renewalTerm!=null &&
              this.renewalTerm.equals(other.getRenewalTerm()))) &&
            ((this.serviceActivationDate==null && other.getServiceActivationDate()==null) || 
             (this.serviceActivationDate!=null &&
              this.serviceActivationDate.equals(other.getServiceActivationDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subscriptionEndDate==null && other.getSubscriptionEndDate()==null) || 
             (this.subscriptionEndDate!=null &&
              this.subscriptionEndDate.equals(other.getSubscriptionEndDate()))) &&
            ((this.subscriptionStartDate==null && other.getSubscriptionStartDate()==null) || 
             (this.subscriptionStartDate!=null &&
              this.subscriptionStartDate.equals(other.getSubscriptionStartDate()))) &&
            ((this.termEndDate==null && other.getTermEndDate()==null) || 
             (this.termEndDate!=null &&
              this.termEndDate.equals(other.getTermEndDate()))) &&
            ((this.termStartDate==null && other.getTermStartDate()==null) || 
             (this.termStartDate!=null &&
              this.termStartDate.equals(other.getTermStartDate()))) &&
            ((this.termType==null && other.getTermType()==null) || 
             (this.termType!=null &&
              this.termType.equals(other.getTermType()))) &&
            ((this.updatedById==null && other.getUpdatedById()==null) || 
             (this.updatedById!=null &&
              this.updatedById.equals(other.getUpdatedById()))) &&
            ((this.updatedDate==null && other.getUpdatedDate()==null) || 
             (this.updatedDate!=null &&
              this.updatedDate.equals(other.getUpdatedDate()))) &&
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAutoRenew() != null) {
            _hashCode += getAutoRenew().hashCode();
        }
        if (getCancelledDate() != null) {
            _hashCode += getCancelledDate().hashCode();
        }
        if (getContractAcceptanceDate() != null) {
            _hashCode += getContractAcceptanceDate().hashCode();
        }
        if (getContractEffectiveDate() != null) {
            _hashCode += getContractEffectiveDate().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCreatorAccountId() != null) {
            _hashCode += getCreatorAccountId().hashCode();
        }
        if (getCreatorInvoiceOwnerId() != null) {
            _hashCode += getCreatorInvoiceOwnerId().hashCode();
        }
        if (getInitialTerm() != null) {
            _hashCode += getInitialTerm().hashCode();
        }
        if (getInvoiceOwnerId() != null) {
            _hashCode += getInvoiceOwnerId().hashCode();
        }
        if (getIsInvoiceSeparate() != null) {
            _hashCode += getIsInvoiceSeparate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getOriginalCreatedDate() != null) {
            _hashCode += getOriginalCreatedDate().hashCode();
        }
        if (getOriginalId() != null) {
            _hashCode += getOriginalId().hashCode();
        }
        if (getPreviousSubscriptionId() != null) {
            _hashCode += getPreviousSubscriptionId().hashCode();
        }
        if (getRenewalTerm() != null) {
            _hashCode += getRenewalTerm().hashCode();
        }
        if (getServiceActivationDate() != null) {
            _hashCode += getServiceActivationDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubscriptionEndDate() != null) {
            _hashCode += getSubscriptionEndDate().hashCode();
        }
        if (getSubscriptionStartDate() != null) {
            _hashCode += getSubscriptionStartDate().hashCode();
        }
        if (getTermEndDate() != null) {
            _hashCode += getTermEndDate().hashCode();
        }
        if (getTermStartDate() != null) {
            _hashCode += getTermStartDate().hashCode();
        }
        if (getTermType() != null) {
            _hashCode += getTermType().hashCode();
        }
        if (getUpdatedById() != null) {
            _hashCode += getUpdatedById().hashCode();
        }
        if (getUpdatedDate() != null) {
            _hashCode += getUpdatedDate().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subscription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Subscription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRenew");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AutoRenew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CancelledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractAcceptanceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ContractAcceptanceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ContractEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("creatorAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreatorAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorInvoiceOwnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreatorInvoiceOwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InitialTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceOwnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceOwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInvoiceSeparate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "IsInvoiceSeparate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalCreatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "OriginalCreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("previousSubscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "PreviousSubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewalTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RenewalTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceActivationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ServiceActivationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("subscriptionEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SubscriptionEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SubscriptionStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TermEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TermStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TermType"));
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
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
