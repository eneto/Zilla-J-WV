/**
 * Amendment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class Amendment  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.Boolean autoRenew;

    private java.lang.String code;

    private java.util.Calendar contractEffectiveDate;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar customerAcceptanceDate;

    private java.lang.String description;

    private java.lang.String destinationAccountId;

    private java.lang.String destinationInvoiceOwnerId;

    private java.util.Calendar effectiveDate;

    private java.lang.Long initialTerm;

    private java.lang.String name;

    private com.zuora.api.RatePlanData ratePlanData;

    private java.lang.Long renewalTerm;

    private java.util.Calendar serviceActivationDate;

    private java.lang.String status;

    private java.lang.String subscriptionId;

    private java.util.Calendar termStartDate;

    private java.lang.String termType;

    private java.lang.String type;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public Amendment() {
    }

    public Amendment(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Boolean autoRenew,
           java.lang.String code,
           java.util.Calendar contractEffectiveDate,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar customerAcceptanceDate,
           java.lang.String description,
           java.lang.String destinationAccountId,
           java.lang.String destinationInvoiceOwnerId,
           java.util.Calendar effectiveDate,
           java.lang.Long initialTerm,
           java.lang.String name,
           com.zuora.api.RatePlanData ratePlanData,
           java.lang.Long renewalTerm,
           java.util.Calendar serviceActivationDate,
           java.lang.String status,
           java.lang.String subscriptionId,
           java.util.Calendar termStartDate,
           java.lang.String termType,
           java.lang.String type,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.autoRenew = autoRenew;
        this.code = code;
        this.contractEffectiveDate = contractEffectiveDate;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.customerAcceptanceDate = customerAcceptanceDate;
        this.description = description;
        this.destinationAccountId = destinationAccountId;
        this.destinationInvoiceOwnerId = destinationInvoiceOwnerId;
        this.effectiveDate = effectiveDate;
        this.initialTerm = initialTerm;
        this.name = name;
        this.ratePlanData = ratePlanData;
        this.renewalTerm = renewalTerm;
        this.serviceActivationDate = serviceActivationDate;
        this.status = status;
        this.subscriptionId = subscriptionId;
        this.termStartDate = termStartDate;
        this.termType = termType;
        this.type = type;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the autoRenew value for this Amendment.
     * 
     * @return autoRenew
     */
    public java.lang.Boolean getAutoRenew() {
        return autoRenew;
    }


    /**
     * Sets the autoRenew value for this Amendment.
     * 
     * @param autoRenew
     */
    public void setAutoRenew(java.lang.Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }


    /**
     * Gets the code value for this Amendment.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this Amendment.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the contractEffectiveDate value for this Amendment.
     * 
     * @return contractEffectiveDate
     */
    public java.util.Calendar getContractEffectiveDate() {
        return contractEffectiveDate;
    }


    /**
     * Sets the contractEffectiveDate value for this Amendment.
     * 
     * @param contractEffectiveDate
     */
    public void setContractEffectiveDate(java.util.Calendar contractEffectiveDate) {
        this.contractEffectiveDate = contractEffectiveDate;
    }


    /**
     * Gets the createdById value for this Amendment.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Amendment.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Amendment.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Amendment.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the customerAcceptanceDate value for this Amendment.
     * 
     * @return customerAcceptanceDate
     */
    public java.util.Calendar getCustomerAcceptanceDate() {
        return customerAcceptanceDate;
    }


    /**
     * Sets the customerAcceptanceDate value for this Amendment.
     * 
     * @param customerAcceptanceDate
     */
    public void setCustomerAcceptanceDate(java.util.Calendar customerAcceptanceDate) {
        this.customerAcceptanceDate = customerAcceptanceDate;
    }


    /**
     * Gets the description value for this Amendment.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Amendment.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the destinationAccountId value for this Amendment.
     * 
     * @return destinationAccountId
     */
    public java.lang.String getDestinationAccountId() {
        return destinationAccountId;
    }


    /**
     * Sets the destinationAccountId value for this Amendment.
     * 
     * @param destinationAccountId
     */
    public void setDestinationAccountId(java.lang.String destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }


    /**
     * Gets the destinationInvoiceOwnerId value for this Amendment.
     * 
     * @return destinationInvoiceOwnerId
     */
    public java.lang.String getDestinationInvoiceOwnerId() {
        return destinationInvoiceOwnerId;
    }


    /**
     * Sets the destinationInvoiceOwnerId value for this Amendment.
     * 
     * @param destinationInvoiceOwnerId
     */
    public void setDestinationInvoiceOwnerId(java.lang.String destinationInvoiceOwnerId) {
        this.destinationInvoiceOwnerId = destinationInvoiceOwnerId;
    }


    /**
     * Gets the effectiveDate value for this Amendment.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this Amendment.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the initialTerm value for this Amendment.
     * 
     * @return initialTerm
     */
    public java.lang.Long getInitialTerm() {
        return initialTerm;
    }


    /**
     * Sets the initialTerm value for this Amendment.
     * 
     * @param initialTerm
     */
    public void setInitialTerm(java.lang.Long initialTerm) {
        this.initialTerm = initialTerm;
    }


    /**
     * Gets the name value for this Amendment.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Amendment.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ratePlanData value for this Amendment.
     * 
     * @return ratePlanData
     */
    public com.zuora.api.RatePlanData getRatePlanData() {
        return ratePlanData;
    }


    /**
     * Sets the ratePlanData value for this Amendment.
     * 
     * @param ratePlanData
     */
    public void setRatePlanData(com.zuora.api.RatePlanData ratePlanData) {
        this.ratePlanData = ratePlanData;
    }


    /**
     * Gets the renewalTerm value for this Amendment.
     * 
     * @return renewalTerm
     */
    public java.lang.Long getRenewalTerm() {
        return renewalTerm;
    }


    /**
     * Sets the renewalTerm value for this Amendment.
     * 
     * @param renewalTerm
     */
    public void setRenewalTerm(java.lang.Long renewalTerm) {
        this.renewalTerm = renewalTerm;
    }


    /**
     * Gets the serviceActivationDate value for this Amendment.
     * 
     * @return serviceActivationDate
     */
    public java.util.Calendar getServiceActivationDate() {
        return serviceActivationDate;
    }


    /**
     * Sets the serviceActivationDate value for this Amendment.
     * 
     * @param serviceActivationDate
     */
    public void setServiceActivationDate(java.util.Calendar serviceActivationDate) {
        this.serviceActivationDate = serviceActivationDate;
    }


    /**
     * Gets the status value for this Amendment.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Amendment.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the subscriptionId value for this Amendment.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this Amendment.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the termStartDate value for this Amendment.
     * 
     * @return termStartDate
     */
    public java.util.Calendar getTermStartDate() {
        return termStartDate;
    }


    /**
     * Sets the termStartDate value for this Amendment.
     * 
     * @param termStartDate
     */
    public void setTermStartDate(java.util.Calendar termStartDate) {
        this.termStartDate = termStartDate;
    }


    /**
     * Gets the termType value for this Amendment.
     * 
     * @return termType
     */
    public java.lang.String getTermType() {
        return termType;
    }


    /**
     * Sets the termType value for this Amendment.
     * 
     * @param termType
     */
    public void setTermType(java.lang.String termType) {
        this.termType = termType;
    }


    /**
     * Gets the type value for this Amendment.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Amendment.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the updatedById value for this Amendment.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this Amendment.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this Amendment.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this Amendment.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Amendment)) return false;
        Amendment other = (Amendment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoRenew==null && other.getAutoRenew()==null) || 
             (this.autoRenew!=null &&
              this.autoRenew.equals(other.getAutoRenew()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.contractEffectiveDate==null && other.getContractEffectiveDate()==null) || 
             (this.contractEffectiveDate!=null &&
              this.contractEffectiveDate.equals(other.getContractEffectiveDate()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.customerAcceptanceDate==null && other.getCustomerAcceptanceDate()==null) || 
             (this.customerAcceptanceDate!=null &&
              this.customerAcceptanceDate.equals(other.getCustomerAcceptanceDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.destinationAccountId==null && other.getDestinationAccountId()==null) || 
             (this.destinationAccountId!=null &&
              this.destinationAccountId.equals(other.getDestinationAccountId()))) &&
            ((this.destinationInvoiceOwnerId==null && other.getDestinationInvoiceOwnerId()==null) || 
             (this.destinationInvoiceOwnerId!=null &&
              this.destinationInvoiceOwnerId.equals(other.getDestinationInvoiceOwnerId()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.initialTerm==null && other.getInitialTerm()==null) || 
             (this.initialTerm!=null &&
              this.initialTerm.equals(other.getInitialTerm()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ratePlanData==null && other.getRatePlanData()==null) || 
             (this.ratePlanData!=null &&
              this.ratePlanData.equals(other.getRatePlanData()))) &&
            ((this.renewalTerm==null && other.getRenewalTerm()==null) || 
             (this.renewalTerm!=null &&
              this.renewalTerm.equals(other.getRenewalTerm()))) &&
            ((this.serviceActivationDate==null && other.getServiceActivationDate()==null) || 
             (this.serviceActivationDate!=null &&
              this.serviceActivationDate.equals(other.getServiceActivationDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
            ((this.termStartDate==null && other.getTermStartDate()==null) || 
             (this.termStartDate!=null &&
              this.termStartDate.equals(other.getTermStartDate()))) &&
            ((this.termType==null && other.getTermType()==null) || 
             (this.termType!=null &&
              this.termType.equals(other.getTermType()))) &&
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
        if (getAutoRenew() != null) {
            _hashCode += getAutoRenew().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
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
        if (getCustomerAcceptanceDate() != null) {
            _hashCode += getCustomerAcceptanceDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDestinationAccountId() != null) {
            _hashCode += getDestinationAccountId().hashCode();
        }
        if (getDestinationInvoiceOwnerId() != null) {
            _hashCode += getDestinationInvoiceOwnerId().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getInitialTerm() != null) {
            _hashCode += getInitialTerm().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRatePlanData() != null) {
            _hashCode += getRatePlanData().hashCode();
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
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        if (getTermStartDate() != null) {
            _hashCode += getTermStartDate().hashCode();
        }
        if (getTermType() != null) {
            _hashCode += getTermType().hashCode();
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
        new org.apache.axis.description.TypeDesc(Amendment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Amendment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRenew");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "AutoRenew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("customerAcceptanceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "CustomerAcceptanceDate"));
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
        elemField.setFieldName("destinationAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DestinationAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationInvoiceOwnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "DestinationInvoiceOwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "InitialTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("ratePlanData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlanData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewalTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "RenewalTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "SubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
