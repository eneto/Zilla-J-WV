/**
 * ErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class ErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _API_DISABLED = "API_DISABLED";
    public static final java.lang.String _CANNOT_DELETE = "CANNOT_DELETE";
    public static final java.lang.String _CREDIT_CARD_PROCESSING_FAILURE = "CREDIT_CARD_PROCESSING_FAILURE";
    public static final java.lang.String _DUPLICATE_VALUE = "DUPLICATE_VALUE";
    public static final java.lang.String _INVALID_FIELD = "INVALID_FIELD";
    public static final java.lang.String _INVALID_LOGIN = "INVALID_LOGIN";
    public static final java.lang.String _INVALID_SESSION = "INVALID_SESSION";
    public static final java.lang.String _INVALID_TYPE = "INVALID_TYPE";
    public static final java.lang.String _INVALID_ID = "INVALID_ID";
    public static final java.lang.String _INVALID_VALUE = "INVALID_VALUE";
    public static final java.lang.String _INVALID_VERSION = "INVALID_VERSION";
    public static final java.lang.String _MALFORMED_QUERY = "MALFORMED_QUERY";
    public static final java.lang.String _MAX_RECORDS_EXCEEDED = "MAX_RECORDS_EXCEEDED";
    public static final java.lang.String _MISSING_REQUIRED_VALUE = "MISSING_REQUIRED_VALUE";
    public static final java.lang.String _NO_PERMISSION = "NO_PERMISSION";
    public static final java.lang.String _SERVER_UNAVAILABLE = "SERVER_UNAVAILABLE";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _TRANSACTION_FAILED = "TRANSACTION_FAILED";
    public static final java.lang.String _INVALID_TEMPLATE = "INVALID_TEMPLATE";
    public static final java.lang.String _ACCOUNTING_PERIOD_CLOSED = "ACCOUNTING_PERIOD_CLOSED";
    public static final java.lang.String _BATCH_FAIL_ERROR = "BATCH_FAIL_ERROR";
    public static final ErrorCode API_DISABLED = new ErrorCode(_API_DISABLED);
    public static final ErrorCode CANNOT_DELETE = new ErrorCode(_CANNOT_DELETE);
    public static final ErrorCode CREDIT_CARD_PROCESSING_FAILURE = new ErrorCode(_CREDIT_CARD_PROCESSING_FAILURE);
    public static final ErrorCode DUPLICATE_VALUE = new ErrorCode(_DUPLICATE_VALUE);
    public static final ErrorCode INVALID_FIELD = new ErrorCode(_INVALID_FIELD);
    public static final ErrorCode INVALID_LOGIN = new ErrorCode(_INVALID_LOGIN);
    public static final ErrorCode INVALID_SESSION = new ErrorCode(_INVALID_SESSION);
    public static final ErrorCode INVALID_TYPE = new ErrorCode(_INVALID_TYPE);
    public static final ErrorCode INVALID_ID = new ErrorCode(_INVALID_ID);
    public static final ErrorCode INVALID_VALUE = new ErrorCode(_INVALID_VALUE);
    public static final ErrorCode INVALID_VERSION = new ErrorCode(_INVALID_VERSION);
    public static final ErrorCode MALFORMED_QUERY = new ErrorCode(_MALFORMED_QUERY);
    public static final ErrorCode MAX_RECORDS_EXCEEDED = new ErrorCode(_MAX_RECORDS_EXCEEDED);
    public static final ErrorCode MISSING_REQUIRED_VALUE = new ErrorCode(_MISSING_REQUIRED_VALUE);
    public static final ErrorCode NO_PERMISSION = new ErrorCode(_NO_PERMISSION);
    public static final ErrorCode SERVER_UNAVAILABLE = new ErrorCode(_SERVER_UNAVAILABLE);
    public static final ErrorCode UNKNOWN_ERROR = new ErrorCode(_UNKNOWN_ERROR);
    public static final ErrorCode TRANSACTION_FAILED = new ErrorCode(_TRANSACTION_FAILED);
    public static final ErrorCode INVALID_TEMPLATE = new ErrorCode(_INVALID_TEMPLATE);
    public static final ErrorCode ACCOUNTING_PERIOD_CLOSED = new ErrorCode(_ACCOUNTING_PERIOD_CLOSED);
    public static final ErrorCode BATCH_FAIL_ERROR = new ErrorCode(_BATCH_FAIL_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ErrorCode enumeration = (ErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ErrorCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.zuora.com/", "ErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
