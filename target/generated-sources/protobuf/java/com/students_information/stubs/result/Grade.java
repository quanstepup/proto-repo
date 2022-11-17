// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: result.proto

package com.students_information.stubs.result;

/**
 * <pre>
 * Students grades are given either as PASS or FAIL.
 * </pre>
 *
 * Protobuf enum {@code com.students_information.stubs.result.Grade}
 */
public enum Grade
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PASS = 0;</code>
   */
  PASS(0),
  /**
   * <code>FAIL = 1;</code>
   */
  FAIL(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PASS = 0;</code>
   */
  public static final int PASS_VALUE = 0;
  /**
   * <code>FAIL = 1;</code>
   */
  public static final int FAIL_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Grade valueOf(int value) {
    return forNumber(value);
  }

  public static Grade forNumber(int value) {
    switch (value) {
      case 0: return PASS;
      case 1: return FAIL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Grade>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Grade> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Grade>() {
          public Grade findValueByNumber(int number) {
            return Grade.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.students_information.stubs.result.Result.getDescriptor().getEnumTypes().get(0);
  }

  private static final Grade[] VALUES = values();

  public static Grade valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Grade(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.students_information.stubs.result.Grade)
}

