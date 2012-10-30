/**
 * _import.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api.object;

public class _import  extends com.zuora.api.object.ZObject  implements java.io.Serializable {
    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private byte[] fileContent;

    private java.lang.Integer importedCount;

    private java.lang.String importType;

    private java.lang.String md5;

    private java.lang.String name;

    private java.lang.String originalResourceUrl;

    private java.lang.String resultResourceUrl;

    private java.lang.String status;

    private java.lang.String statusReason;

    private java.lang.Integer totalCount;

    private java.lang.String updatedById;

    private java.util.Calendar updatedDate;

    public _import() {
    }

    public _import(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           byte[] fileContent,
           java.lang.Integer importedCount,
           java.lang.String importType,
           java.lang.String md5,
           java.lang.String name,
           java.lang.String originalResourceUrl,
           java.lang.String resultResourceUrl,
           java.lang.String status,
           java.lang.String statusReason,
           java.lang.Integer totalCount,
           java.lang.String updatedById,
           java.util.Calendar updatedDate) {
        super(
            fieldsToNull,
            id);
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.fileContent = fileContent;
        this.importedCount = importedCount;
        this.importType = importType;
        this.md5 = md5;
        this.name = name;
        this.originalResourceUrl = originalResourceUrl;
        this.resultResourceUrl = resultResourceUrl;
        this.status = status;
        this.statusReason = statusReason;
        this.totalCount = totalCount;
        this.updatedById = updatedById;
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the createdById value for this _import.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this _import.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this _import.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this _import.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the fileContent value for this _import.
     * 
     * @return fileContent
     */
    public byte[] getFileContent() {
        return fileContent;
    }


    /**
     * Sets the fileContent value for this _import.
     * 
     * @param fileContent
     */
    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }


    /**
     * Gets the importedCount value for this _import.
     * 
     * @return importedCount
     */
    public java.lang.Integer getImportedCount() {
        return importedCount;
    }


    /**
     * Sets the importedCount value for this _import.
     * 
     * @param importedCount
     */
    public void setImportedCount(java.lang.Integer importedCount) {
        this.importedCount = importedCount;
    }


    /**
     * Gets the importType value for this _import.
     * 
     * @return importType
     */
    public java.lang.String getImportType() {
        return importType;
    }


    /**
     * Sets the importType value for this _import.
     * 
     * @param importType
     */
    public void setImportType(java.lang.String importType) {
        this.importType = importType;
    }


    /**
     * Gets the md5 value for this _import.
     * 
     * @return md5
     */
    public java.lang.String getMd5() {
        return md5;
    }


    /**
     * Sets the md5 value for this _import.
     * 
     * @param md5
     */
    public void setMd5(java.lang.String md5) {
        this.md5 = md5;
    }


    /**
     * Gets the name value for this _import.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this _import.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the originalResourceUrl value for this _import.
     * 
     * @return originalResourceUrl
     */
    public java.lang.String getOriginalResourceUrl() {
        return originalResourceUrl;
    }


    /**
     * Sets the originalResourceUrl value for this _import.
     * 
     * @param originalResourceUrl
     */
    public void setOriginalResourceUrl(java.lang.String originalResourceUrl) {
        this.originalResourceUrl = originalResourceUrl;
    }


    /**
     * Gets the resultResourceUrl value for this _import.
     * 
     * @return resultResourceUrl
     */
    public java.lang.String getResultResourceUrl() {
        return resultResourceUrl;
    }


    /**
     * Sets the resultResourceUrl value for this _import.
     * 
     * @param resultResourceUrl
     */
    public void setResultResourceUrl(java.lang.String resultResourceUrl) {
        this.resultResourceUrl = resultResourceUrl;
    }


    /**
     * Gets the status value for this _import.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this _import.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusReason value for this _import.
     * 
     * @return statusReason
     */
    public java.lang.String getStatusReason() {
        return statusReason;
    }


    /**
     * Sets the statusReason value for this _import.
     * 
     * @param statusReason
     */
    public void setStatusReason(java.lang.String statusReason) {
        this.statusReason = statusReason;
    }


    /**
     * Gets the totalCount value for this _import.
     * 
     * @return totalCount
     */
    public java.lang.Integer getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this _import.
     * 
     * @param totalCount
     */
    public void setTotalCount(java.lang.Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * Gets the updatedById value for this _import.
     * 
     * @return updatedById
     */
    public java.lang.String getUpdatedById() {
        return updatedById;
    }


    /**
     * Sets the updatedById value for this _import.
     * 
     * @param updatedById
     */
    public void setUpdatedById(java.lang.String updatedById) {
        this.updatedById = updatedById;
    }


    /**
     * Gets the updatedDate value for this _import.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this _import.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _import)) return false;
        _import other = (_import) obj;
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
            ((this.fileContent==null && other.getFileContent()==null) || 
             (this.fileContent!=null &&
              java.util.Arrays.equals(this.fileContent, other.getFileContent()))) &&
            ((this.importedCount==null && other.getImportedCount()==null) || 
             (this.importedCount!=null &&
              this.importedCount.equals(other.getImportedCount()))) &&
            ((this.importType==null && other.getImportType()==null) || 
             (this.importType!=null &&
              this.importType.equals(other.getImportType()))) &&
            ((this.md5==null && other.getMd5()==null) || 
             (this.md5!=null &&
              this.md5.equals(other.getMd5()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.originalResourceUrl==null && other.getOriginalResourceUrl()==null) || 
             (this.originalResourceUrl!=null &&
              this.originalResourceUrl.equals(other.getOriginalResourceUrl()))) &&
            ((this.resultResourceUrl==null && other.getResultResourceUrl()==null) || 
             (this.resultResourceUrl!=null &&
              this.resultResourceUrl.equals(other.getResultResourceUrl()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusReason==null && other.getStatusReason()==null) || 
             (this.statusReason!=null &&
              this.statusReason.equals(other.getStatusReason()))) &&
            ((this.totalCount==null && other.getTotalCount()==null) || 
             (this.totalCount!=null &&
              this.totalCount.equals(other.getTotalCount()))) &&
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
        if (getFileContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImportedCount() != null) {
            _hashCode += getImportedCount().hashCode();
        }
        if (getImportType() != null) {
            _hashCode += getImportType().hashCode();
        }
        if (getMd5() != null) {
            _hashCode += getMd5().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOriginalResourceUrl() != null) {
            _hashCode += getOriginalResourceUrl().hashCode();
        }
        if (getResultResourceUrl() != null) {
            _hashCode += getResultResourceUrl().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusReason() != null) {
            _hashCode += getStatusReason().hashCode();
        }
        if (getTotalCount() != null) {
            _hashCode += getTotalCount().hashCode();
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
        new org.apache.axis.description.TypeDesc(_import.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Import"));
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
        elemField.setFieldName("fileContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "FileContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ImportedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ImportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("md5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "Md5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("originalResourceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "OriginalResourceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultResourceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "ResultResourceUrl"));
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
        elemField.setFieldName("statusReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "StatusReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://object.api.zuora.com/", "TotalCount"));
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
