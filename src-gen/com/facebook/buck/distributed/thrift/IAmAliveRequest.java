/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-11-07")
public class IAmAliveRequest implements org.apache.thrift.TBase<IAmAliveRequest, IAmAliveRequest._Fields>, java.io.Serializable, Cloneable, Comparable<IAmAliveRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("IAmAliveRequest");

  private static final org.apache.thrift.protocol.TField MINION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("minionId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STAMPEDE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stampedeId", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IAmAliveRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new IAmAliveRequestTupleSchemeFactory());
  }

  public String minionId; // optional
  public com.facebook.buck.distributed.thrift.StampedeId stampedeId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MINION_ID((short)1, "minionId"),
    STAMPEDE_ID((short)2, "stampedeId");

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
        case 1: // MINION_ID
          return MINION_ID;
        case 2: // STAMPEDE_ID
          return STAMPEDE_ID;
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
  private static final _Fields optionals[] = {_Fields.MINION_ID,_Fields.STAMPEDE_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MINION_ID, new org.apache.thrift.meta_data.FieldMetaData("minionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STAMPEDE_ID, new org.apache.thrift.meta_data.FieldMetaData("stampedeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.facebook.buck.distributed.thrift.StampedeId.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(IAmAliveRequest.class, metaDataMap);
  }

  public IAmAliveRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IAmAliveRequest(IAmAliveRequest other) {
    if (other.isSetMinionId()) {
      this.minionId = other.minionId;
    }
    if (other.isSetStampedeId()) {
      this.stampedeId = new com.facebook.buck.distributed.thrift.StampedeId(other.stampedeId);
    }
  }

  public IAmAliveRequest deepCopy() {
    return new IAmAliveRequest(this);
  }

  @Override
  public void clear() {
    this.minionId = null;
    this.stampedeId = null;
  }

  public String getMinionId() {
    return this.minionId;
  }

  public IAmAliveRequest setMinionId(String minionId) {
    this.minionId = minionId;
    return this;
  }

  public void unsetMinionId() {
    this.minionId = null;
  }

  /** Returns true if field minionId is set (has been assigned a value) and false otherwise */
  public boolean isSetMinionId() {
    return this.minionId != null;
  }

  public void setMinionIdIsSet(boolean value) {
    if (!value) {
      this.minionId = null;
    }
  }

  public com.facebook.buck.distributed.thrift.StampedeId getStampedeId() {
    return this.stampedeId;
  }

  public IAmAliveRequest setStampedeId(com.facebook.buck.distributed.thrift.StampedeId stampedeId) {
    this.stampedeId = stampedeId;
    return this;
  }

  public void unsetStampedeId() {
    this.stampedeId = null;
  }

  /** Returns true if field stampedeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStampedeId() {
    return this.stampedeId != null;
  }

  public void setStampedeIdIsSet(boolean value) {
    if (!value) {
      this.stampedeId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MINION_ID:
      if (value == null) {
        unsetMinionId();
      } else {
        setMinionId((String)value);
      }
      break;

    case STAMPEDE_ID:
      if (value == null) {
        unsetStampedeId();
      } else {
        setStampedeId((com.facebook.buck.distributed.thrift.StampedeId)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MINION_ID:
      return getMinionId();

    case STAMPEDE_ID:
      return getStampedeId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MINION_ID:
      return isSetMinionId();
    case STAMPEDE_ID:
      return isSetStampedeId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IAmAliveRequest)
      return this.equals((IAmAliveRequest)that);
    return false;
  }

  public boolean equals(IAmAliveRequest that) {
    if (that == null)
      return false;

    boolean this_present_minionId = true && this.isSetMinionId();
    boolean that_present_minionId = true && that.isSetMinionId();
    if (this_present_minionId || that_present_minionId) {
      if (!(this_present_minionId && that_present_minionId))
        return false;
      if (!this.minionId.equals(that.minionId))
        return false;
    }

    boolean this_present_stampedeId = true && this.isSetStampedeId();
    boolean that_present_stampedeId = true && that.isSetStampedeId();
    if (this_present_stampedeId || that_present_stampedeId) {
      if (!(this_present_stampedeId && that_present_stampedeId))
        return false;
      if (!this.stampedeId.equals(that.stampedeId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_minionId = true && (isSetMinionId());
    list.add(present_minionId);
    if (present_minionId)
      list.add(minionId);

    boolean present_stampedeId = true && (isSetStampedeId());
    list.add(present_stampedeId);
    if (present_stampedeId)
      list.add(stampedeId);

    return list.hashCode();
  }

  @Override
  public int compareTo(IAmAliveRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMinionId()).compareTo(other.isSetMinionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minionId, other.minionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStampedeId()).compareTo(other.isSetStampedeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStampedeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stampedeId, other.stampedeId);
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
    StringBuilder sb = new StringBuilder("IAmAliveRequest(");
    boolean first = true;

    if (isSetMinionId()) {
      sb.append("minionId:");
      if (this.minionId == null) {
        sb.append("null");
      } else {
        sb.append(this.minionId);
      }
      first = false;
    }
    if (isSetStampedeId()) {
      if (!first) sb.append(", ");
      sb.append("stampedeId:");
      if (this.stampedeId == null) {
        sb.append("null");
      } else {
        sb.append(this.stampedeId);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stampedeId != null) {
      stampedeId.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class IAmAliveRequestStandardSchemeFactory implements SchemeFactory {
    public IAmAliveRequestStandardScheme getScheme() {
      return new IAmAliveRequestStandardScheme();
    }
  }

  private static class IAmAliveRequestStandardScheme extends StandardScheme<IAmAliveRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, IAmAliveRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MINION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.minionId = iprot.readString();
              struct.setMinionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STAMPEDE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stampedeId = new com.facebook.buck.distributed.thrift.StampedeId();
              struct.stampedeId.read(iprot);
              struct.setStampedeIdIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, IAmAliveRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.minionId != null) {
        if (struct.isSetMinionId()) {
          oprot.writeFieldBegin(MINION_ID_FIELD_DESC);
          oprot.writeString(struct.minionId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.stampedeId != null) {
        if (struct.isSetStampedeId()) {
          oprot.writeFieldBegin(STAMPEDE_ID_FIELD_DESC);
          struct.stampedeId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class IAmAliveRequestTupleSchemeFactory implements SchemeFactory {
    public IAmAliveRequestTupleScheme getScheme() {
      return new IAmAliveRequestTupleScheme();
    }
  }

  private static class IAmAliveRequestTupleScheme extends TupleScheme<IAmAliveRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, IAmAliveRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMinionId()) {
        optionals.set(0);
      }
      if (struct.isSetStampedeId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMinionId()) {
        oprot.writeString(struct.minionId);
      }
      if (struct.isSetStampedeId()) {
        struct.stampedeId.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, IAmAliveRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.minionId = iprot.readString();
        struct.setMinionIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stampedeId = new com.facebook.buck.distributed.thrift.StampedeId();
        struct.stampedeId.read(iprot);
        struct.setStampedeIdIsSet(true);
      }
    }
  }

}
