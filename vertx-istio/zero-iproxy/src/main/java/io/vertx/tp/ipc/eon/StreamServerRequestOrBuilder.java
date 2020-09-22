// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zero.stream.proto

package io.vertx.tp.ipc.eon;

public interface StreamServerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.vertx.tp.ipc.eon.StreamServerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.vertx.tp.ipc.eon.em.Format response_type = 1;</code>
   * @return The enum numeric value on the wire for responseType.
   */
  int getResponseTypeValue();
  /**
   * <code>.io.vertx.tp.ipc.eon.em.Format response_type = 1;</code>
   * @return The responseType.
   */
  io.vertx.tp.ipc.eon.em.Format getResponseType();

  /**
   * <code>repeated .io.vertx.tp.ipc.eon.ResponseParams response_params = 2;</code>
   */
  java.util.List<io.vertx.tp.ipc.eon.ResponseParams> 
      getResponseParamsList();
  /**
   * <code>repeated .io.vertx.tp.ipc.eon.ResponseParams response_params = 2;</code>
   */
  io.vertx.tp.ipc.eon.ResponseParams getResponseParams(int index);
  /**
   * <code>repeated .io.vertx.tp.ipc.eon.ResponseParams response_params = 2;</code>
   */
  int getResponseParamsCount();
  /**
   * <code>repeated .io.vertx.tp.ipc.eon.ResponseParams response_params = 2;</code>
   */
  java.util.List<? extends io.vertx.tp.ipc.eon.ResponseParamsOrBuilder> 
      getResponseParamsOrBuilderList();
  /**
   * <code>repeated .io.vertx.tp.ipc.eon.ResponseParams response_params = 2;</code>
   */
  io.vertx.tp.ipc.eon.ResponseParamsOrBuilder getResponseParamsOrBuilder(
      int index);

  /**
   * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 3;</code>
   * @return Whether the envelop field is set.
   */
  boolean hasEnvelop();
  /**
   * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 3;</code>
   * @return The envelop.
   */
  io.vertx.tp.ipc.eon.IpcEnvelop getEnvelop();
  /**
   * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 3;</code>
   */
  io.vertx.tp.ipc.eon.IpcEnvelopOrBuilder getEnvelopOrBuilder();

  /**
   * <code>.io.vertx.tp.ipc.eon.em.Compression algorithm = 4;</code>
   * @return The enum numeric value on the wire for algorithm.
   */
  int getAlgorithmValue();
  /**
   * <code>.io.vertx.tp.ipc.eon.em.Compression algorithm = 4;</code>
   * @return The algorithm.
   */
  io.vertx.tp.ipc.eon.em.Compression getAlgorithm();

  /**
   * <code>.io.vertx.tp.ipc.eon.IpcStatus response_status = 5;</code>
   * @return Whether the responseStatus field is set.
   */
  boolean hasResponseStatus();
  /**
   * <code>.io.vertx.tp.ipc.eon.IpcStatus response_status = 5;</code>
   * @return The responseStatus.
   */
  io.vertx.tp.ipc.eon.IpcStatus getResponseStatus();
  /**
   * <code>.io.vertx.tp.ipc.eon.IpcStatus response_status = 5;</code>
   */
  io.vertx.tp.ipc.eon.IpcStatusOrBuilder getResponseStatusOrBuilder();
}