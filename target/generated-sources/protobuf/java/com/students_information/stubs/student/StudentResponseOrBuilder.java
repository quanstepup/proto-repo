// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package com.students_information.stubs.student;

public interface StudentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.students_information.stubs.student.StudentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string student_id = 1;</code>
   */
  java.lang.String getStudentId();
  /**
   * <code>string student_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getStudentIdBytes();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 3;</code>
   */
  int getAge();

  /**
   * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
   */
  int getGenderValue();
  /**
   * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
   */
  com.students_information.stubs.student.Gender getGender();

  /**
   * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
   */
  int getMathsValue();
  /**
   * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
   */
  com.students_information.stubs.student.Grade getMaths();

  /**
   * <code>.com.students_information.stubs.student.Grade art = 6;</code>
   */
  int getArtValue();
  /**
   * <code>.com.students_information.stubs.student.Grade art = 6;</code>
   */
  com.students_information.stubs.student.Grade getArt();

  /**
   * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
   */
  int getChemistryValue();
  /**
   * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
   */
  com.students_information.stubs.student.Grade getChemistry();
}
