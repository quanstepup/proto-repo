// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package com.students_information.stubs.student;

/**
 * <pre>
 * This is the response message
 * </pre>
 *
 * Protobuf type {@code com.students_information.stubs.student.StudentResponse}
 */
public  final class StudentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.students_information.stubs.student.StudentResponse)
    StudentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudentResponse.newBuilder() to construct.
  private StudentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudentResponse() {
    studentId_ = "";
    name_ = "";
    age_ = 0;
    gender_ = 0;
    maths_ = 0;
    art_ = 0;
    chemistry_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StudentResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            studentId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            age_ = input.readInt32();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            gender_ = rawValue;
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            maths_ = rawValue;
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            art_ = rawValue;
            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            chemistry_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.students_information.stubs.student.Student.internal_static_com_students_information_stubs_student_StudentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.students_information.stubs.student.Student.internal_static_com_students_information_stubs_student_StudentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.students_information.stubs.student.StudentResponse.class, com.students_information.stubs.student.StudentResponse.Builder.class);
  }

  public static final int STUDENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object studentId_;
  /**
   * <code>string student_id = 1;</code>
   */
  public java.lang.String getStudentId() {
    java.lang.Object ref = studentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      studentId_ = s;
      return s;
    }
  }
  /**
   * <code>string student_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getStudentIdBytes() {
    java.lang.Object ref = studentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      studentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 3;
  private int age_;
  /**
   * <code>int32 age = 3;</code>
   */
  public int getAge() {
    return age_;
  }

  public static final int GENDER_FIELD_NUMBER = 4;
  private int gender_;
  /**
   * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
   */
  public int getGenderValue() {
    return gender_;
  }
  /**
   * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
   */
  public com.students_information.stubs.student.Gender getGender() {
    @SuppressWarnings("deprecation")
    com.students_information.stubs.student.Gender result = com.students_information.stubs.student.Gender.valueOf(gender_);
    return result == null ? com.students_information.stubs.student.Gender.UNRECOGNIZED : result;
  }

  public static final int MATHS_FIELD_NUMBER = 5;
  private int maths_;
  /**
   * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
   */
  public int getMathsValue() {
    return maths_;
  }
  /**
   * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
   */
  public com.students_information.stubs.student.Grade getMaths() {
    @SuppressWarnings("deprecation")
    com.students_information.stubs.student.Grade result = com.students_information.stubs.student.Grade.valueOf(maths_);
    return result == null ? com.students_information.stubs.student.Grade.UNRECOGNIZED : result;
  }

  public static final int ART_FIELD_NUMBER = 6;
  private int art_;
  /**
   * <code>.com.students_information.stubs.student.Grade art = 6;</code>
   */
  public int getArtValue() {
    return art_;
  }
  /**
   * <code>.com.students_information.stubs.student.Grade art = 6;</code>
   */
  public com.students_information.stubs.student.Grade getArt() {
    @SuppressWarnings("deprecation")
    com.students_information.stubs.student.Grade result = com.students_information.stubs.student.Grade.valueOf(art_);
    return result == null ? com.students_information.stubs.student.Grade.UNRECOGNIZED : result;
  }

  public static final int CHEMISTRY_FIELD_NUMBER = 7;
  private int chemistry_;
  /**
   * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
   */
  public int getChemistryValue() {
    return chemistry_;
  }
  /**
   * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
   */
  public com.students_information.stubs.student.Grade getChemistry() {
    @SuppressWarnings("deprecation")
    com.students_information.stubs.student.Grade result = com.students_information.stubs.student.Grade.valueOf(chemistry_);
    return result == null ? com.students_information.stubs.student.Grade.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getStudentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, studentId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (age_ != 0) {
      output.writeInt32(3, age_);
    }
    if (gender_ != com.students_information.stubs.student.Gender.MALE.getNumber()) {
      output.writeEnum(4, gender_);
    }
    if (maths_ != com.students_information.stubs.student.Grade.PASS.getNumber()) {
      output.writeEnum(5, maths_);
    }
    if (art_ != com.students_information.stubs.student.Grade.PASS.getNumber()) {
      output.writeEnum(6, art_);
    }
    if (chemistry_ != com.students_information.stubs.student.Grade.PASS.getNumber()) {
      output.writeEnum(7, chemistry_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStudentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, studentId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, age_);
    }
    if (gender_ != com.students_information.stubs.student.Gender.MALE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, gender_);
    }
    if (maths_ != com.students_information.stubs.student.Grade.PASS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, maths_);
    }
    if (art_ != com.students_information.stubs.student.Grade.PASS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, art_);
    }
    if (chemistry_ != com.students_information.stubs.student.Grade.PASS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, chemistry_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.students_information.stubs.student.StudentResponse)) {
      return super.equals(obj);
    }
    com.students_information.stubs.student.StudentResponse other = (com.students_information.stubs.student.StudentResponse) obj;

    boolean result = true;
    result = result && getStudentId()
        .equals(other.getStudentId());
    result = result && getName()
        .equals(other.getName());
    result = result && (getAge()
        == other.getAge());
    result = result && gender_ == other.gender_;
    result = result && maths_ == other.maths_;
    result = result && art_ == other.art_;
    result = result && chemistry_ == other.chemistry_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STUDENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStudentId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    hash = (37 * hash) + GENDER_FIELD_NUMBER;
    hash = (53 * hash) + gender_;
    hash = (37 * hash) + MATHS_FIELD_NUMBER;
    hash = (53 * hash) + maths_;
    hash = (37 * hash) + ART_FIELD_NUMBER;
    hash = (53 * hash) + art_;
    hash = (37 * hash) + CHEMISTRY_FIELD_NUMBER;
    hash = (53 * hash) + chemistry_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.students_information.stubs.student.StudentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.students_information.stubs.student.StudentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.students_information.stubs.student.StudentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.students_information.stubs.student.StudentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.students_information.stubs.student.StudentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.students_information.stubs.student.StudentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.students_information.stubs.student.StudentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.students_information.stubs.student.StudentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.students_information.stubs.student.StudentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.students_information.stubs.student.StudentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.students_information.stubs.student.StudentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.students_information.stubs.student.StudentResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.students_information.stubs.student.StudentResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * This is the response message
   * </pre>
   *
   * Protobuf type {@code com.students_information.stubs.student.StudentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.students_information.stubs.student.StudentResponse)
      com.students_information.stubs.student.StudentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.students_information.stubs.student.Student.internal_static_com_students_information_stubs_student_StudentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.students_information.stubs.student.Student.internal_static_com_students_information_stubs_student_StudentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.students_information.stubs.student.StudentResponse.class, com.students_information.stubs.student.StudentResponse.Builder.class);
    }

    // Construct using com.students_information.stubs.student.StudentResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      studentId_ = "";

      name_ = "";

      age_ = 0;

      gender_ = 0;

      maths_ = 0;

      art_ = 0;

      chemistry_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.students_information.stubs.student.Student.internal_static_com_students_information_stubs_student_StudentResponse_descriptor;
    }

    @java.lang.Override
    public com.students_information.stubs.student.StudentResponse getDefaultInstanceForType() {
      return com.students_information.stubs.student.StudentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.students_information.stubs.student.StudentResponse build() {
      com.students_information.stubs.student.StudentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.students_information.stubs.student.StudentResponse buildPartial() {
      com.students_information.stubs.student.StudentResponse result = new com.students_information.stubs.student.StudentResponse(this);
      result.studentId_ = studentId_;
      result.name_ = name_;
      result.age_ = age_;
      result.gender_ = gender_;
      result.maths_ = maths_;
      result.art_ = art_;
      result.chemistry_ = chemistry_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.students_information.stubs.student.StudentResponse) {
        return mergeFrom((com.students_information.stubs.student.StudentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.students_information.stubs.student.StudentResponse other) {
      if (other == com.students_information.stubs.student.StudentResponse.getDefaultInstance()) return this;
      if (!other.getStudentId().isEmpty()) {
        studentId_ = other.studentId_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAge() != 0) {
        setAge(other.getAge());
      }
      if (other.gender_ != 0) {
        setGenderValue(other.getGenderValue());
      }
      if (other.maths_ != 0) {
        setMathsValue(other.getMathsValue());
      }
      if (other.art_ != 0) {
        setArtValue(other.getArtValue());
      }
      if (other.chemistry_ != 0) {
        setChemistryValue(other.getChemistryValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.students_information.stubs.student.StudentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.students_information.stubs.student.StudentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object studentId_ = "";
    /**
     * <code>string student_id = 1;</code>
     */
    public java.lang.String getStudentId() {
      java.lang.Object ref = studentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        studentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string student_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getStudentIdBytes() {
      java.lang.Object ref = studentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        studentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string student_id = 1;</code>
     */
    public Builder setStudentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      studentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string student_id = 1;</code>
     */
    public Builder clearStudentId() {
      
      studentId_ = getDefaultInstance().getStudentId();
      onChanged();
      return this;
    }
    /**
     * <code>string student_id = 1;</code>
     */
    public Builder setStudentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      studentId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int age_ ;
    /**
     * <code>int32 age = 3;</code>
     */
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 3;</code>
     */
    public Builder setAge(int value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 age = 3;</code>
     */
    public Builder clearAge() {
      
      age_ = 0;
      onChanged();
      return this;
    }

    private int gender_ = 0;
    /**
     * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
     */
    public int getGenderValue() {
      return gender_;
    }
    /**
     * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
     */
    public Builder setGenderValue(int value) {
      gender_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
     */
    public com.students_information.stubs.student.Gender getGender() {
      @SuppressWarnings("deprecation")
      com.students_information.stubs.student.Gender result = com.students_information.stubs.student.Gender.valueOf(gender_);
      return result == null ? com.students_information.stubs.student.Gender.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
     */
    public Builder setGender(com.students_information.stubs.student.Gender value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gender_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
     */
    public Builder clearGender() {
      
      gender_ = 0;
      onChanged();
      return this;
    }

    private int maths_ = 0;
    /**
     * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
     */
    public int getMathsValue() {
      return maths_;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
     */
    public Builder setMathsValue(int value) {
      maths_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
     */
    public com.students_information.stubs.student.Grade getMaths() {
      @SuppressWarnings("deprecation")
      com.students_information.stubs.student.Grade result = com.students_information.stubs.student.Grade.valueOf(maths_);
      return result == null ? com.students_information.stubs.student.Grade.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
     */
    public Builder setMaths(com.students_information.stubs.student.Grade value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      maths_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
     */
    public Builder clearMaths() {
      
      maths_ = 0;
      onChanged();
      return this;
    }

    private int art_ = 0;
    /**
     * <code>.com.students_information.stubs.student.Grade art = 6;</code>
     */
    public int getArtValue() {
      return art_;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade art = 6;</code>
     */
    public Builder setArtValue(int value) {
      art_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade art = 6;</code>
     */
    public com.students_information.stubs.student.Grade getArt() {
      @SuppressWarnings("deprecation")
      com.students_information.stubs.student.Grade result = com.students_information.stubs.student.Grade.valueOf(art_);
      return result == null ? com.students_information.stubs.student.Grade.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade art = 6;</code>
     */
    public Builder setArt(com.students_information.stubs.student.Grade value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      art_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade art = 6;</code>
     */
    public Builder clearArt() {
      
      art_ = 0;
      onChanged();
      return this;
    }

    private int chemistry_ = 0;
    /**
     * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
     */
    public int getChemistryValue() {
      return chemistry_;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
     */
    public Builder setChemistryValue(int value) {
      chemistry_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
     */
    public com.students_information.stubs.student.Grade getChemistry() {
      @SuppressWarnings("deprecation")
      com.students_information.stubs.student.Grade result = com.students_information.stubs.student.Grade.valueOf(chemistry_);
      return result == null ? com.students_information.stubs.student.Grade.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
     */
    public Builder setChemistry(com.students_information.stubs.student.Grade value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      chemistry_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
     */
    public Builder clearChemistry() {
      
      chemistry_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.students_information.stubs.student.StudentResponse)
  }

  // @@protoc_insertion_point(class_scope:com.students_information.stubs.student.StudentResponse)
  private static final com.students_information.stubs.student.StudentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.students_information.stubs.student.StudentResponse();
  }

  public static com.students_information.stubs.student.StudentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudentResponse>
      PARSER = new com.google.protobuf.AbstractParser<StudentResponse>() {
    @java.lang.Override
    public StudentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StudentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StudentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.students_information.stubs.student.StudentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

