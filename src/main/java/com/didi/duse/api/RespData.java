/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.didi.duse.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-05")
public class RespData implements org.apache.thrift.TBase<RespData, RespData._Fields>, java.io.Serializable, Cloneable, Comparable<RespData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RespData");

  private static final org.apache.thrift.protocol.TField ERR_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("errNo", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ERR_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("errMsg", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RESULT_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("resultData", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RespDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RespDataTupleSchemeFactory());
  }

  public int errNo; // required
  public String errMsg; // required
  public Map<String,String> resultData; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERR_NO((short)1, "errNo"),
    ERR_MSG((short)2, "errMsg"),
    RESULT_DATA((short)3, "resultData");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERR_NO
          return ERR_NO;
        case 2: // ERR_MSG
          return ERR_MSG;
        case 3: // RESULT_DATA
          return RESULT_DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ERRNO_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RESULT_DATA};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERR_NO, new org.apache.thrift.meta_data.FieldMetaData("errNo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ERR_MSG, new org.apache.thrift.meta_data.FieldMetaData("errMsg", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESULT_DATA, new org.apache.thrift.meta_data.FieldMetaData("resultData", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RespData.class, metaDataMap);
  }

  public RespData() {
    this.errNo = 0;

    this.errMsg = "OK";

  }

  public RespData(
    int errNo,
    String errMsg)
  {
    this();
    this.errNo = errNo;
    setErrNoIsSet(true);
    this.errMsg = errMsg;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RespData(RespData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.errNo = other.errNo;
    if (other.isSetErrMsg()) {
      this.errMsg = other.errMsg;
    }
    if (other.isSetResultData()) {
      Map<String,String> __this__resultData = new HashMap<String,String>(other.resultData);
      this.resultData = __this__resultData;
    }
  }

  public RespData deepCopy() {
    return new RespData(this);
  }

  @Override
  public void clear() {
    this.errNo = 0;

    this.errMsg = "OK";

    this.resultData = null;
  }

  public int getErrNo() {
    return this.errNo;
  }

  public RespData setErrNo(int errNo) {
    this.errNo = errNo;
    setErrNoIsSet(true);
    return this;
  }

  public void unsetErrNo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ERRNO_ISSET_ID);
  }

  /** Returns true if field errNo is set (has been assigned a value) and false otherwise */
  public boolean isSetErrNo() {
    return EncodingUtils.testBit(__isset_bitfield, __ERRNO_ISSET_ID);
  }

  public void setErrNoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ERRNO_ISSET_ID, value);
  }

  public String getErrMsg() {
    return this.errMsg;
  }

  public RespData setErrMsg(String errMsg) {
    this.errMsg = errMsg;
    return this;
  }

  public void unsetErrMsg() {
    this.errMsg = null;
  }

  /** Returns true if field errMsg is set (has been assigned a value) and false otherwise */
  public boolean isSetErrMsg() {
    return this.errMsg != null;
  }

  public void setErrMsgIsSet(boolean value) {
    if (!value) {
      this.errMsg = null;
    }
  }

  public int getResultDataSize() {
    return (this.resultData == null) ? 0 : this.resultData.size();
  }

  public void putToResultData(String key, String val) {
    if (this.resultData == null) {
      this.resultData = new HashMap<String,String>();
    }
    this.resultData.put(key, val);
  }

  public Map<String,String> getResultData() {
    return this.resultData;
  }

  public RespData setResultData(Map<String,String> resultData) {
    this.resultData = resultData;
    return this;
  }

  public void unsetResultData() {
    this.resultData = null;
  }

  /** Returns true if field resultData is set (has been assigned a value) and false otherwise */
  public boolean isSetResultData() {
    return this.resultData != null;
  }

  public void setResultDataIsSet(boolean value) {
    if (!value) {
      this.resultData = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERR_NO:
      if (value == null) {
        unsetErrNo();
      } else {
        setErrNo((Integer)value);
      }
      break;

    case ERR_MSG:
      if (value == null) {
        unsetErrMsg();
      } else {
        setErrMsg((String)value);
      }
      break;

    case RESULT_DATA:
      if (value == null) {
        unsetResultData();
      } else {
        setResultData((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERR_NO:
      return getErrNo();

    case ERR_MSG:
      return getErrMsg();

    case RESULT_DATA:
      return getResultData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERR_NO:
      return isSetErrNo();
    case ERR_MSG:
      return isSetErrMsg();
    case RESULT_DATA:
      return isSetResultData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RespData)
      return this.equals((RespData)that);
    return false;
  }

  public boolean equals(RespData that) {
    if (that == null)
      return false;

    boolean this_present_errNo = true;
    boolean that_present_errNo = true;
    if (this_present_errNo || that_present_errNo) {
      if (!(this_present_errNo && that_present_errNo))
        return false;
      if (this.errNo != that.errNo)
        return false;
    }

    boolean this_present_errMsg = true && this.isSetErrMsg();
    boolean that_present_errMsg = true && that.isSetErrMsg();
    if (this_present_errMsg || that_present_errMsg) {
      if (!(this_present_errMsg && that_present_errMsg))
        return false;
      if (!this.errMsg.equals(that.errMsg))
        return false;
    }

    boolean this_present_resultData = true && this.isSetResultData();
    boolean that_present_resultData = true && that.isSetResultData();
    if (this_present_resultData || that_present_resultData) {
      if (!(this_present_resultData && that_present_resultData))
        return false;
      if (!this.resultData.equals(that.resultData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_errNo = true;
    list.add(present_errNo);
    if (present_errNo)
      list.add(errNo);

    boolean present_errMsg = true && (isSetErrMsg());
    list.add(present_errMsg);
    if (present_errMsg)
      list.add(errMsg);

    boolean present_resultData = true && (isSetResultData());
    list.add(present_resultData);
    if (present_resultData)
      list.add(resultData);

    return list.hashCode();
  }

  @Override
  public int compareTo(RespData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErrNo()).compareTo(other.isSetErrNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errNo, other.errNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrMsg()).compareTo(other.isSetErrMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errMsg, other.errMsg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResultData()).compareTo(other.isSetResultData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resultData, other.resultData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RespData(");
    boolean first = true;

    sb.append("errNo:");
    sb.append(this.errNo);
    first = false;
    if (!first) sb.append(", ");
    sb.append("errMsg:");
    if (this.errMsg == null) {
      sb.append("null");
    } else {
      sb.append(this.errMsg);
    }
    first = false;
    if (isSetResultData()) {
      if (!first) sb.append(", ");
      sb.append("resultData:");
      if (this.resultData == null) {
        sb.append("null");
      } else {
        sb.append(this.resultData);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'errNo' because it's a primitive and you chose the non-beans generator.
    if (errMsg == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'errMsg' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RespDataStandardSchemeFactory implements SchemeFactory {
    public RespDataStandardScheme getScheme() {
      return new RespDataStandardScheme();
    }
  }

  private static class RespDataStandardScheme extends StandardScheme<RespData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RespData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERR_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errNo = iprot.readI32();
              struct.setErrNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERR_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errMsg = iprot.readString();
              struct.setErrMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESULT_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.resultData = new HashMap<String,String>(2*_map0.size);
                String _key1;
                String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.resultData.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setResultDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetErrNo()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'errNo' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RespData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ERR_NO_FIELD_DESC);
      oprot.writeI32(struct.errNo);
      oprot.writeFieldEnd();
      if (struct.errMsg != null) {
        oprot.writeFieldBegin(ERR_MSG_FIELD_DESC);
        oprot.writeString(struct.errMsg);
        oprot.writeFieldEnd();
      }
      if (struct.resultData != null) {
        if (struct.isSetResultData()) {
          oprot.writeFieldBegin(RESULT_DATA_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.resultData.size()));
            for (Map.Entry<String, String> _iter4 : struct.resultData.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RespDataTupleSchemeFactory implements SchemeFactory {
    public RespDataTupleScheme getScheme() {
      return new RespDataTupleScheme();
    }
  }

  private static class RespDataTupleScheme extends TupleScheme<RespData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RespData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.errNo);
      oprot.writeString(struct.errMsg);
      BitSet optionals = new BitSet();
      if (struct.isSetResultData()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetResultData()) {
        {
          oprot.writeI32(struct.resultData.size());
          for (Map.Entry<String, String> _iter5 : struct.resultData.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RespData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.errNo = iprot.readI32();
      struct.setErrNoIsSet(true);
      struct.errMsg = iprot.readString();
      struct.setErrMsgIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.resultData = new HashMap<String,String>(2*_map6.size);
          String _key7;
          String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.resultData.put(_key7, _val8);
          }
        }
        struct.setResultDataIsSet(true);
      }
    }
  }

}
