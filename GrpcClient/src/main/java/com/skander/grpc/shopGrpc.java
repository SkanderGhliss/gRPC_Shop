package com.skander.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * ShopService provides CRUD operations for items and orders.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: shop.proto")
public final class shopGrpc {

  private shopGrpc() {}

  public static final String SERVICE_NAME = "shop";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skander.grpc.Shop.Empty,
      com.skander.grpc.Shop.ItemListResponse> getGetAllItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllItems",
      requestType = com.skander.grpc.Shop.Empty.class,
      responseType = com.skander.grpc.Shop.ItemListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skander.grpc.Shop.Empty,
      com.skander.grpc.Shop.ItemListResponse> getGetAllItemsMethod() {
    io.grpc.MethodDescriptor<com.skander.grpc.Shop.Empty, com.skander.grpc.Shop.ItemListResponse> getGetAllItemsMethod;
    if ((getGetAllItemsMethod = shopGrpc.getGetAllItemsMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getGetAllItemsMethod = shopGrpc.getGetAllItemsMethod) == null) {
          shopGrpc.getGetAllItemsMethod = getGetAllItemsMethod = 
              io.grpc.MethodDescriptor.<com.skander.grpc.Shop.Empty, com.skander.grpc.Shop.ItemListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "GetAllItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.ItemListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("GetAllItems"))
                  .build();
          }
        }
     }
     return getGetAllItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skander.grpc.Shop.ItemIdRequest,
      com.skander.grpc.Shop.ItemResponse> getGetItemByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemById",
      requestType = com.skander.grpc.Shop.ItemIdRequest.class,
      responseType = com.skander.grpc.Shop.ItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skander.grpc.Shop.ItemIdRequest,
      com.skander.grpc.Shop.ItemResponse> getGetItemByIdMethod() {
    io.grpc.MethodDescriptor<com.skander.grpc.Shop.ItemIdRequest, com.skander.grpc.Shop.ItemResponse> getGetItemByIdMethod;
    if ((getGetItemByIdMethod = shopGrpc.getGetItemByIdMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getGetItemByIdMethod = shopGrpc.getGetItemByIdMethod) == null) {
          shopGrpc.getGetItemByIdMethod = getGetItemByIdMethod = 
              io.grpc.MethodDescriptor.<com.skander.grpc.Shop.ItemIdRequest, com.skander.grpc.Shop.ItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "GetItemById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.ItemIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.ItemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("GetItemById"))
                  .build();
          }
        }
     }
     return getGetItemByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skander.grpc.Shop.CreateItemRequest,
      com.skander.grpc.Shop.ItemResponse> getCreateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateItem",
      requestType = com.skander.grpc.Shop.CreateItemRequest.class,
      responseType = com.skander.grpc.Shop.ItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skander.grpc.Shop.CreateItemRequest,
      com.skander.grpc.Shop.ItemResponse> getCreateItemMethod() {
    io.grpc.MethodDescriptor<com.skander.grpc.Shop.CreateItemRequest, com.skander.grpc.Shop.ItemResponse> getCreateItemMethod;
    if ((getCreateItemMethod = shopGrpc.getCreateItemMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getCreateItemMethod = shopGrpc.getCreateItemMethod) == null) {
          shopGrpc.getCreateItemMethod = getCreateItemMethod = 
              io.grpc.MethodDescriptor.<com.skander.grpc.Shop.CreateItemRequest, com.skander.grpc.Shop.ItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "CreateItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.CreateItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.ItemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("CreateItem"))
                  .build();
          }
        }
     }
     return getCreateItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skander.grpc.Shop.ItemIdRequest,
      com.skander.grpc.Shop.Empty> getDeleteItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteItem",
      requestType = com.skander.grpc.Shop.ItemIdRequest.class,
      responseType = com.skander.grpc.Shop.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skander.grpc.Shop.ItemIdRequest,
      com.skander.grpc.Shop.Empty> getDeleteItemMethod() {
    io.grpc.MethodDescriptor<com.skander.grpc.Shop.ItemIdRequest, com.skander.grpc.Shop.Empty> getDeleteItemMethod;
    if ((getDeleteItemMethod = shopGrpc.getDeleteItemMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getDeleteItemMethod = shopGrpc.getDeleteItemMethod) == null) {
          shopGrpc.getDeleteItemMethod = getDeleteItemMethod = 
              io.grpc.MethodDescriptor.<com.skander.grpc.Shop.ItemIdRequest, com.skander.grpc.Shop.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "DeleteItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.ItemIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("DeleteItem"))
                  .build();
          }
        }
     }
     return getDeleteItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skander.grpc.Shop.Empty,
      com.skander.grpc.Shop.OrderListResponse> getGetAllOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllOrders",
      requestType = com.skander.grpc.Shop.Empty.class,
      responseType = com.skander.grpc.Shop.OrderListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skander.grpc.Shop.Empty,
      com.skander.grpc.Shop.OrderListResponse> getGetAllOrdersMethod() {
    io.grpc.MethodDescriptor<com.skander.grpc.Shop.Empty, com.skander.grpc.Shop.OrderListResponse> getGetAllOrdersMethod;
    if ((getGetAllOrdersMethod = shopGrpc.getGetAllOrdersMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getGetAllOrdersMethod = shopGrpc.getGetAllOrdersMethod) == null) {
          shopGrpc.getGetAllOrdersMethod = getGetAllOrdersMethod = 
              io.grpc.MethodDescriptor.<com.skander.grpc.Shop.Empty, com.skander.grpc.Shop.OrderListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "GetAllOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.OrderListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("GetAllOrders"))
                  .build();
          }
        }
     }
     return getGetAllOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skander.grpc.Shop.OrderIdRequest,
      com.skander.grpc.Shop.OrderResponse> getGetOrderByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrderById",
      requestType = com.skander.grpc.Shop.OrderIdRequest.class,
      responseType = com.skander.grpc.Shop.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skander.grpc.Shop.OrderIdRequest,
      com.skander.grpc.Shop.OrderResponse> getGetOrderByIdMethod() {
    io.grpc.MethodDescriptor<com.skander.grpc.Shop.OrderIdRequest, com.skander.grpc.Shop.OrderResponse> getGetOrderByIdMethod;
    if ((getGetOrderByIdMethod = shopGrpc.getGetOrderByIdMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getGetOrderByIdMethod = shopGrpc.getGetOrderByIdMethod) == null) {
          shopGrpc.getGetOrderByIdMethod = getGetOrderByIdMethod = 
              io.grpc.MethodDescriptor.<com.skander.grpc.Shop.OrderIdRequest, com.skander.grpc.Shop.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "GetOrderById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.OrderIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.OrderResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("GetOrderById"))
                  .build();
          }
        }
     }
     return getGetOrderByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skander.grpc.Shop.CreateOrderRequest,
      com.skander.grpc.Shop.OrderResponse> getCreateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrder",
      requestType = com.skander.grpc.Shop.CreateOrderRequest.class,
      responseType = com.skander.grpc.Shop.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skander.grpc.Shop.CreateOrderRequest,
      com.skander.grpc.Shop.OrderResponse> getCreateOrderMethod() {
    io.grpc.MethodDescriptor<com.skander.grpc.Shop.CreateOrderRequest, com.skander.grpc.Shop.OrderResponse> getCreateOrderMethod;
    if ((getCreateOrderMethod = shopGrpc.getCreateOrderMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getCreateOrderMethod = shopGrpc.getCreateOrderMethod) == null) {
          shopGrpc.getCreateOrderMethod = getCreateOrderMethod = 
              io.grpc.MethodDescriptor.<com.skander.grpc.Shop.CreateOrderRequest, com.skander.grpc.Shop.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "CreateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.CreateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.OrderResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("CreateOrder"))
                  .build();
          }
        }
     }
     return getCreateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skander.grpc.Shop.OrderIdRequest,
      com.skander.grpc.Shop.Empty> getDeleteOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrder",
      requestType = com.skander.grpc.Shop.OrderIdRequest.class,
      responseType = com.skander.grpc.Shop.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skander.grpc.Shop.OrderIdRequest,
      com.skander.grpc.Shop.Empty> getDeleteOrderMethod() {
    io.grpc.MethodDescriptor<com.skander.grpc.Shop.OrderIdRequest, com.skander.grpc.Shop.Empty> getDeleteOrderMethod;
    if ((getDeleteOrderMethod = shopGrpc.getDeleteOrderMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getDeleteOrderMethod = shopGrpc.getDeleteOrderMethod) == null) {
          shopGrpc.getDeleteOrderMethod = getDeleteOrderMethod = 
              io.grpc.MethodDescriptor.<com.skander.grpc.Shop.OrderIdRequest, com.skander.grpc.Shop.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "DeleteOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.OrderIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("DeleteOrder"))
                  .build();
          }
        }
     }
     return getDeleteOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skander.grpc.Shop.LoginRequest,
      com.skander.grpc.Shop.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.skander.grpc.Shop.LoginRequest.class,
      responseType = com.skander.grpc.Shop.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skander.grpc.Shop.LoginRequest,
      com.skander.grpc.Shop.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.skander.grpc.Shop.LoginRequest, com.skander.grpc.Shop.APIResponse> getLoginMethod;
    if ((getLoginMethod = shopGrpc.getLoginMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getLoginMethod = shopGrpc.getLoginMethod) == null) {
          shopGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.skander.grpc.Shop.LoginRequest, com.skander.grpc.Shop.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skander.grpc.Shop.Empty,
      com.skander.grpc.Shop.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.skander.grpc.Shop.Empty.class,
      responseType = com.skander.grpc.Shop.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skander.grpc.Shop.Empty,
      com.skander.grpc.Shop.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.skander.grpc.Shop.Empty, com.skander.grpc.Shop.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = shopGrpc.getLogoutMethod) == null) {
      synchronized (shopGrpc.class) {
        if ((getLogoutMethod = shopGrpc.getLogoutMethod) == null) {
          shopGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.skander.grpc.Shop.Empty, com.skander.grpc.Shop.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skander.grpc.Shop.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new shopMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static shopStub newStub(io.grpc.Channel channel) {
    return new shopStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static shopBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new shopBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static shopFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new shopFutureStub(channel);
  }

  /**
   * <pre>
   * ShopService provides CRUD operations for items and orders.
   * </pre>
   */
  public static abstract class shopImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllItems(com.skander.grpc.Shop.Empty request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.ItemListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllItemsMethod(), responseObserver);
    }

    /**
     */
    public void getItemById(com.skander.grpc.Shop.ItemIdRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.ItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemByIdMethod(), responseObserver);
    }

    /**
     */
    public void createItem(com.skander.grpc.Shop.CreateItemRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.ItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateItemMethod(), responseObserver);
    }

    /**
     */
    public void deleteItem(com.skander.grpc.Shop.ItemIdRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteItemMethod(), responseObserver);
    }

    /**
     */
    public void getAllOrders(com.skander.grpc.Shop.Empty request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.OrderListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllOrdersMethod(), responseObserver);
    }

    /**
     */
    public void getOrderById(com.skander.grpc.Shop.OrderIdRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.OrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrderByIdMethod(), responseObserver);
    }

    /**
     */
    public void createOrder(com.skander.grpc.Shop.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.OrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOrderMethod(), responseObserver);
    }

    /**
     */
    public void deleteOrder(com.skander.grpc.Shop.OrderIdRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOrderMethod(), responseObserver);
    }

    /**
     */
    public void login(com.skander.grpc.Shop.LoginRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.skander.grpc.Shop.Empty request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllItemsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skander.grpc.Shop.Empty,
                com.skander.grpc.Shop.ItemListResponse>(
                  this, METHODID_GET_ALL_ITEMS)))
          .addMethod(
            getGetItemByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skander.grpc.Shop.ItemIdRequest,
                com.skander.grpc.Shop.ItemResponse>(
                  this, METHODID_GET_ITEM_BY_ID)))
          .addMethod(
            getCreateItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skander.grpc.Shop.CreateItemRequest,
                com.skander.grpc.Shop.ItemResponse>(
                  this, METHODID_CREATE_ITEM)))
          .addMethod(
            getDeleteItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skander.grpc.Shop.ItemIdRequest,
                com.skander.grpc.Shop.Empty>(
                  this, METHODID_DELETE_ITEM)))
          .addMethod(
            getGetAllOrdersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skander.grpc.Shop.Empty,
                com.skander.grpc.Shop.OrderListResponse>(
                  this, METHODID_GET_ALL_ORDERS)))
          .addMethod(
            getGetOrderByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skander.grpc.Shop.OrderIdRequest,
                com.skander.grpc.Shop.OrderResponse>(
                  this, METHODID_GET_ORDER_BY_ID)))
          .addMethod(
            getCreateOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skander.grpc.Shop.CreateOrderRequest,
                com.skander.grpc.Shop.OrderResponse>(
                  this, METHODID_CREATE_ORDER)))
          .addMethod(
            getDeleteOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skander.grpc.Shop.OrderIdRequest,
                com.skander.grpc.Shop.Empty>(
                  this, METHODID_DELETE_ORDER)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skander.grpc.Shop.LoginRequest,
                com.skander.grpc.Shop.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skander.grpc.Shop.Empty,
                com.skander.grpc.Shop.APIResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   * <pre>
   * ShopService provides CRUD operations for items and orders.
   * </pre>
   */
  public static final class shopStub extends io.grpc.stub.AbstractStub<shopStub> {
    private shopStub(io.grpc.Channel channel) {
      super(channel);
    }

    private shopStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected shopStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new shopStub(channel, callOptions);
    }

    /**
     */
    public void getAllItems(com.skander.grpc.Shop.Empty request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.ItemListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemById(com.skander.grpc.Shop.ItemIdRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.ItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createItem(com.skander.grpc.Shop.CreateItemRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.ItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteItem(com.skander.grpc.Shop.ItemIdRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllOrders(com.skander.grpc.Shop.Empty request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.OrderListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrderById(com.skander.grpc.Shop.OrderIdRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.OrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrderByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOrder(com.skander.grpc.Shop.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.OrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOrder(com.skander.grpc.Shop.OrderIdRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.skander.grpc.Shop.LoginRequest request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.skander.grpc.Shop.Empty request,
        io.grpc.stub.StreamObserver<com.skander.grpc.Shop.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ShopService provides CRUD operations for items and orders.
   * </pre>
   */
  public static final class shopBlockingStub extends io.grpc.stub.AbstractStub<shopBlockingStub> {
    private shopBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private shopBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected shopBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new shopBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skander.grpc.Shop.ItemListResponse getAllItems(com.skander.grpc.Shop.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skander.grpc.Shop.ItemResponse getItemById(com.skander.grpc.Shop.ItemIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetItemByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skander.grpc.Shop.ItemResponse createItem(com.skander.grpc.Shop.CreateItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skander.grpc.Shop.Empty deleteItem(com.skander.grpc.Shop.ItemIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skander.grpc.Shop.OrderListResponse getAllOrders(com.skander.grpc.Shop.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skander.grpc.Shop.OrderResponse getOrderById(com.skander.grpc.Shop.OrderIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrderByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skander.grpc.Shop.OrderResponse createOrder(com.skander.grpc.Shop.CreateOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skander.grpc.Shop.Empty deleteOrder(com.skander.grpc.Shop.OrderIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skander.grpc.Shop.APIResponse login(com.skander.grpc.Shop.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skander.grpc.Shop.APIResponse logout(com.skander.grpc.Shop.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ShopService provides CRUD operations for items and orders.
   * </pre>
   */
  public static final class shopFutureStub extends io.grpc.stub.AbstractStub<shopFutureStub> {
    private shopFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private shopFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected shopFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new shopFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skander.grpc.Shop.ItemListResponse> getAllItems(
        com.skander.grpc.Shop.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skander.grpc.Shop.ItemResponse> getItemById(
        com.skander.grpc.Shop.ItemIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skander.grpc.Shop.ItemResponse> createItem(
        com.skander.grpc.Shop.CreateItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skander.grpc.Shop.Empty> deleteItem(
        com.skander.grpc.Shop.ItemIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skander.grpc.Shop.OrderListResponse> getAllOrders(
        com.skander.grpc.Shop.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skander.grpc.Shop.OrderResponse> getOrderById(
        com.skander.grpc.Shop.OrderIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrderByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skander.grpc.Shop.OrderResponse> createOrder(
        com.skander.grpc.Shop.CreateOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skander.grpc.Shop.Empty> deleteOrder(
        com.skander.grpc.Shop.OrderIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skander.grpc.Shop.APIResponse> login(
        com.skander.grpc.Shop.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skander.grpc.Shop.APIResponse> logout(
        com.skander.grpc.Shop.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_ITEMS = 0;
  private static final int METHODID_GET_ITEM_BY_ID = 1;
  private static final int METHODID_CREATE_ITEM = 2;
  private static final int METHODID_DELETE_ITEM = 3;
  private static final int METHODID_GET_ALL_ORDERS = 4;
  private static final int METHODID_GET_ORDER_BY_ID = 5;
  private static final int METHODID_CREATE_ORDER = 6;
  private static final int METHODID_DELETE_ORDER = 7;
  private static final int METHODID_LOGIN = 8;
  private static final int METHODID_LOGOUT = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final shopImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(shopImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_ITEMS:
          serviceImpl.getAllItems((com.skander.grpc.Shop.Empty) request,
              (io.grpc.stub.StreamObserver<com.skander.grpc.Shop.ItemListResponse>) responseObserver);
          break;
        case METHODID_GET_ITEM_BY_ID:
          serviceImpl.getItemById((com.skander.grpc.Shop.ItemIdRequest) request,
              (io.grpc.stub.StreamObserver<com.skander.grpc.Shop.ItemResponse>) responseObserver);
          break;
        case METHODID_CREATE_ITEM:
          serviceImpl.createItem((com.skander.grpc.Shop.CreateItemRequest) request,
              (io.grpc.stub.StreamObserver<com.skander.grpc.Shop.ItemResponse>) responseObserver);
          break;
        case METHODID_DELETE_ITEM:
          serviceImpl.deleteItem((com.skander.grpc.Shop.ItemIdRequest) request,
              (io.grpc.stub.StreamObserver<com.skander.grpc.Shop.Empty>) responseObserver);
          break;
        case METHODID_GET_ALL_ORDERS:
          serviceImpl.getAllOrders((com.skander.grpc.Shop.Empty) request,
              (io.grpc.stub.StreamObserver<com.skander.grpc.Shop.OrderListResponse>) responseObserver);
          break;
        case METHODID_GET_ORDER_BY_ID:
          serviceImpl.getOrderById((com.skander.grpc.Shop.OrderIdRequest) request,
              (io.grpc.stub.StreamObserver<com.skander.grpc.Shop.OrderResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((com.skander.grpc.Shop.CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.skander.grpc.Shop.OrderResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORDER:
          serviceImpl.deleteOrder((com.skander.grpc.Shop.OrderIdRequest) request,
              (io.grpc.stub.StreamObserver<com.skander.grpc.Shop.Empty>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.skander.grpc.Shop.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.skander.grpc.Shop.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.skander.grpc.Shop.Empty) request,
              (io.grpc.stub.StreamObserver<com.skander.grpc.Shop.APIResponse>) responseObserver);
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

  private static abstract class shopBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    shopBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skander.grpc.Shop.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("shop");
    }
  }

  private static final class shopFileDescriptorSupplier
      extends shopBaseDescriptorSupplier {
    shopFileDescriptorSupplier() {}
  }

  private static final class shopMethodDescriptorSupplier
      extends shopBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    shopMethodDescriptorSupplier(String methodName) {
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
      synchronized (shopGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new shopFileDescriptorSupplier())
              .addMethod(getGetAllItemsMethod())
              .addMethod(getGetItemByIdMethod())
              .addMethod(getCreateItemMethod())
              .addMethod(getDeleteItemMethod())
              .addMethod(getGetAllOrdersMethod())
              .addMethod(getGetOrderByIdMethod())
              .addMethod(getCreateOrderMethod())
              .addMethod(getDeleteOrderMethod())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
