// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: federal.proto

package com.federal_c1.federal_client1.oldgrpc;

public final class FederalProto {
  private FederalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rfederal.proto\022\007example\"E\n\007Request\022\n\n\002i" +
      "p\030\001 \001(\t\022\013\n\003url\030\002 \001(\t\022\014\n\004type\030\003 \001(\t\022\023\n\013da" +
      "tainfoReq\030\004 \001(\t\"9\n\010Response\022\n\n\002ip\030\001 \001(\t\022" +
      "\023\n\013datainfoRet\030\002 \001(\t\022\014\n\004time\030\003 \001(\t2v\n\020Ar" +
      "ithmeticServer\022/\n\010dataInfo\022\020.example.Req" +
      "uest\032\021.example.Response\0221\n\nlocalTrain\022\020." +
      "example.Request\032\021.example.ResponseB\"\n\020co" +
      "m.example.grpcB\014FederalProtoP\001b\006proto3"
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
    internal_static_example_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_example_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_Request_descriptor,
        new java.lang.String[] { "Ip", "Url", "Type", "DatainfoReq", });
    internal_static_example_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_example_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_Response_descriptor,
        new java.lang.String[] { "Ip", "DatainfoRet", "Time", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
