package com.federal_c1.federal_client1.grpc;


import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.26.0)",
        comments = "Source: AI.proto")
public final class ArithmeticServerGrpc {

  private ArithmeticServerGrpc() {}

  public static final String SERVICE_NAME = "example.ArithmeticServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Request,
          Response> getdataInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "dataInfo",
          requestType = Request.class,
          responseType = Response.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Request,
          Response> getdataInfoMethod() {
    io.grpc.MethodDescriptor<Request, Response> getdataInfoMethod;
    if ((getdataInfoMethod = ArithmeticServerGrpc.getdataInfoMethod) == null) {
      synchronized (ArithmeticServerGrpc.class) {
        if ((getdataInfoMethod = ArithmeticServerGrpc.getdataInfoMethod) == null) {
          ArithmeticServerGrpc.getdataInfoMethod = getdataInfoMethod =
                  io.grpc.MethodDescriptor.<Request, Response>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "dataInfo"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  Request.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  Response.getDefaultInstance()))
                          .setSchemaDescriptor(new ArithmeticServerMethodDescriptorSupplier("dataInfo"))
                          .build();
        }
      }
    }
    return getdataInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Request,
          Response> getlocalTrainMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "localTrain",
          requestType = Request.class,
          responseType = Response.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Request,
          Response> getlocalTrainMethod() {
    io.grpc.MethodDescriptor<Request, Response> getlocalTrainMethod;
    if ((getlocalTrainMethod = ArithmeticServerGrpc.getlocalTrainMethod) == null) {
      synchronized (ArithmeticServerGrpc.class) {
        if ((getlocalTrainMethod = ArithmeticServerGrpc.getlocalTrainMethod) == null) {
          ArithmeticServerGrpc.getlocalTrainMethod = getlocalTrainMethod =
                  io.grpc.MethodDescriptor.<Request, Response>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "localTrain"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  Request.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  Response.getDefaultInstance()))
                          .setSchemaDescriptor(new ArithmeticServerMethodDescriptorSupplier("localTrain"))
                          .build();
        }
      }
    }
    return getlocalTrainMethod;
  }


  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArithmeticServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArithmeticServerStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<ArithmeticServerStub>() {
              @java.lang.Override
              public ArithmeticServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ArithmeticServerStub(channel, callOptions);
              }
            };
    return ArithmeticServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArithmeticServerBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArithmeticServerBlockingStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<ArithmeticServerBlockingStub>() {
              @java.lang.Override
              public ArithmeticServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ArithmeticServerBlockingStub(channel, callOptions);
              }
            };
    return ArithmeticServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArithmeticServerFutureStub newFutureStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArithmeticServerFutureStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<ArithmeticServerFutureStub>() {
              @java.lang.Override
              public ArithmeticServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ArithmeticServerFutureStub(channel, callOptions);
              }
            };
    return ArithmeticServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ArithmeticServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void dataInfo(Request request,
                             io.grpc.stub.StreamObserver<Response> responseObserver) {
      asyncUnimplementedUnaryCall(getdataInfoMethod(), responseObserver);
    }

    /**
     */
    public void localTrain(Request request,
                      io.grpc.stub.StreamObserver<Response> responseObserver) {
      asyncUnimplementedUnaryCall(getlocalTrainMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getdataInfoMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Request,
                                      Response>(
                                      this, METHODID_DATA_ANALYSIS)))
              .addMethod(
                      getlocalTrainMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      Request,
                                      Response>(
                                      this, METHODID_localTrain)))
              .build();
    }
  }

  /**
   */
  public static final class ArithmeticServerStub extends io.grpc.stub.AbstractAsyncStub<ArithmeticServerStub> {
    private ArithmeticServerStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArithmeticServerStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArithmeticServerStub(channel, callOptions);
    }

    /**
     */
    public void dataInfo(Request request,
                             io.grpc.stub.StreamObserver<Response> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getdataInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void localTrain(Request request,
                      io.grpc.stub.StreamObserver<Response> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getlocalTrainMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ArithmeticServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ArithmeticServerBlockingStub> {
    private ArithmeticServerBlockingStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArithmeticServerBlockingStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArithmeticServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public Response dataInfo(Request request) {
      return blockingUnaryCall(
              getChannel(), getdataInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public Response localTrain(Request request) {
      return blockingUnaryCall(
              getChannel(), getlocalTrainMethod(), getCallOptions(), request);
    }

  }

  /**
   */
  public static final class ArithmeticServerFutureStub extends io.grpc.stub.AbstractFutureStub<ArithmeticServerFutureStub> {
    private ArithmeticServerFutureStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArithmeticServerFutureStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArithmeticServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Response> dataInfo(
            Request request) {
      return futureUnaryCall(
              getChannel().newCall(getdataInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Response> localTrain(
            Request request) {
      return futureUnaryCall(
              getChannel().newCall(getlocalTrainMethod(), getCallOptions()), request);
    }

  }

  private static final int METHODID_DATA_ANALYSIS = 0;
  private static final int METHODID_localTrain = 1;
  private static final int METHODID_PREDICT = 2;

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArithmeticServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArithmeticServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DATA_ANALYSIS:
          serviceImpl.dataInfo((Request) request,
                  (io.grpc.stub.StreamObserver<Response>) responseObserver);
          break;
        case METHODID_localTrain:
          serviceImpl.localTrain((Request) request,
                  (io.grpc.stub.StreamObserver<Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
            io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ArithmeticServerBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArithmeticServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return FederalProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ArithmeticServer");
    }
  }

  private static final class ArithmeticServerFileDescriptorSupplier
          extends ArithmeticServerBaseDescriptorSupplier {
    ArithmeticServerFileDescriptorSupplier() {}
  }

  private static final class ArithmeticServerMethodDescriptorSupplier
          extends ArithmeticServerBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArithmeticServerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ArithmeticServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new ArithmeticServerFileDescriptorSupplier())
                  .addMethod(getdataInfoMethod())
                  .addMethod(getlocalTrainMethod())
                  .build();
        }
      }
    }
    return result;
  }
}
