// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package com.students_information.stubs.student;

public final class Student {
  private Student() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_students_information_stubs_student_StudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_students_information_stubs_student_StudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_students_information_stubs_student_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_students_information_stubs_student_StudentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rstudent.proto\022&com.students_informatio" +
      "n.stubs.student\"$\n\016StudentRequest\022\022\n\nstu" +
      "dent_id\030\001 \001(\t\"\274\002\n\017StudentResponse\022\022\n\nstu" +
      "dent_id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\013\n\003age\030\003 \001(\005" +
      "\022>\n\006gender\030\004 \001(\0162..com.students_informat" +
      "ion.stubs.student.Gender\022<\n\005maths\030\005 \001(\0162" +
      "-.com.students_information.stubs.student" +
      ".Grade\022:\n\003art\030\006 \001(\0162-.com.students_infor" +
      "mation.stubs.student.Grade\022@\n\tchemistry\030" +
      "\007 \001(\0162-.com.students_information.stubs.s" +
      "tudent.Grade*\033\n\005Grade\022\010\n\004PASS\020\000\022\010\n\004FAIL\020" +
      "\001*\036\n\006Gender\022\010\n\004MALE\020\000\022\n\n\006FEMALE\020\0012\224\001\n\016St" +
      "udentService\022\201\001\n\016getStudentInfo\0226.com.st" +
      "udents_information.stubs.student.Student" +
      "Request\0327.com.students_information.stubs" +
      ".student.StudentResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_students_information_stubs_student_StudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_students_information_stubs_student_StudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_students_information_stubs_student_StudentRequest_descriptor,
        new java.lang.String[] { "StudentId", });
    internal_static_com_students_information_stubs_student_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_students_information_stubs_student_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_students_information_stubs_student_StudentResponse_descriptor,
        new java.lang.String[] { "StudentId", "Name", "Age", "Gender", "Maths", "Art", "Chemistry", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
