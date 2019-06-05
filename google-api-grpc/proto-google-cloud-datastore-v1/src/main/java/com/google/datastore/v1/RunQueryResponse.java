// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

/**
 *
 *
 * <pre>
 * The response for
 * [Datastore.RunQuery][google.datastore.v1.Datastore.RunQuery].
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.RunQueryResponse}
 */
public final class RunQueryResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.RunQueryResponse)
    RunQueryResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RunQueryResponse.newBuilder() to construct.
  private RunQueryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RunQueryResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RunQueryResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RunQueryResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              com.google.datastore.v1.QueryResultBatch.Builder subBuilder = null;
              if (batch_ != null) {
                subBuilder = batch_.toBuilder();
              }
              batch_ =
                  input.readMessage(
                      com.google.datastore.v1.QueryResultBatch.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(batch_);
                batch_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.datastore.v1.Query.Builder subBuilder = null;
              if (query_ != null) {
                subBuilder = query_.toBuilder();
              }
              query_ = input.readMessage(com.google.datastore.v1.Query.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(query_);
                query_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_RunQueryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_RunQueryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.RunQueryResponse.class,
            com.google.datastore.v1.RunQueryResponse.Builder.class);
  }

  public static final int BATCH_FIELD_NUMBER = 1;
  private com.google.datastore.v1.QueryResultBatch batch_;
  /**
   *
   *
   * <pre>
   * A batch of query results (always present).
   * </pre>
   *
   * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
   */
  public boolean hasBatch() {
    return batch_ != null;
  }
  /**
   *
   *
   * <pre>
   * A batch of query results (always present).
   * </pre>
   *
   * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
   */
  public com.google.datastore.v1.QueryResultBatch getBatch() {
    return batch_ == null ? com.google.datastore.v1.QueryResultBatch.getDefaultInstance() : batch_;
  }
  /**
   *
   *
   * <pre>
   * A batch of query results (always present).
   * </pre>
   *
   * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
   */
  public com.google.datastore.v1.QueryResultBatchOrBuilder getBatchOrBuilder() {
    return getBatch();
  }

  public static final int QUERY_FIELD_NUMBER = 2;
  private com.google.datastore.v1.Query query_;
  /**
   *
   *
   * <pre>
   * The parsed form of the `GqlQuery` from the request, if it was set.
   * </pre>
   *
   * <code>.google.datastore.v1.Query query = 2;</code>
   */
  public boolean hasQuery() {
    return query_ != null;
  }
  /**
   *
   *
   * <pre>
   * The parsed form of the `GqlQuery` from the request, if it was set.
   * </pre>
   *
   * <code>.google.datastore.v1.Query query = 2;</code>
   */
  public com.google.datastore.v1.Query getQuery() {
    return query_ == null ? com.google.datastore.v1.Query.getDefaultInstance() : query_;
  }
  /**
   *
   *
   * <pre>
   * The parsed form of the `GqlQuery` from the request, if it was set.
   * </pre>
   *
   * <code>.google.datastore.v1.Query query = 2;</code>
   */
  public com.google.datastore.v1.QueryOrBuilder getQueryOrBuilder() {
    return getQuery();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (batch_ != null) {
      output.writeMessage(1, getBatch());
    }
    if (query_ != null) {
      output.writeMessage(2, getQuery());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (batch_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getBatch());
    }
    if (query_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getQuery());
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
    if (!(obj instanceof com.google.datastore.v1.RunQueryResponse)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.RunQueryResponse other = (com.google.datastore.v1.RunQueryResponse) obj;

    if (hasBatch() != other.hasBatch()) return false;
    if (hasBatch()) {
      if (!getBatch().equals(other.getBatch())) return false;
    }
    if (hasQuery() != other.hasQuery()) return false;
    if (hasQuery()) {
      if (!getQuery().equals(other.getQuery())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBatch()) {
      hash = (37 * hash) + BATCH_FIELD_NUMBER;
      hash = (53 * hash) + getBatch().hashCode();
    }
    if (hasQuery()) {
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getQuery().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.RunQueryResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.RunQueryResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.RunQueryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.RunQueryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.RunQueryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.RunQueryResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.RunQueryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.RunQueryResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.RunQueryResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.RunQueryResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.RunQueryResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.RunQueryResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.datastore.v1.RunQueryResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response for
   * [Datastore.RunQuery][google.datastore.v1.Datastore.RunQuery].
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.RunQueryResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.RunQueryResponse)
      com.google.datastore.v1.RunQueryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_RunQueryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_RunQueryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.RunQueryResponse.class,
              com.google.datastore.v1.RunQueryResponse.Builder.class);
    }

    // Construct using com.google.datastore.v1.RunQueryResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (batchBuilder_ == null) {
        batch_ = null;
      } else {
        batch_ = null;
        batchBuilder_ = null;
      }
      if (queryBuilder_ == null) {
        query_ = null;
      } else {
        query_ = null;
        queryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_RunQueryResponse_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.RunQueryResponse getDefaultInstanceForType() {
      return com.google.datastore.v1.RunQueryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.RunQueryResponse build() {
      com.google.datastore.v1.RunQueryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.RunQueryResponse buildPartial() {
      com.google.datastore.v1.RunQueryResponse result =
          new com.google.datastore.v1.RunQueryResponse(this);
      if (batchBuilder_ == null) {
        result.batch_ = batch_;
      } else {
        result.batch_ = batchBuilder_.build();
      }
      if (queryBuilder_ == null) {
        result.query_ = query_;
      } else {
        result.query_ = queryBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.datastore.v1.RunQueryResponse) {
        return mergeFrom((com.google.datastore.v1.RunQueryResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.RunQueryResponse other) {
      if (other == com.google.datastore.v1.RunQueryResponse.getDefaultInstance()) return this;
      if (other.hasBatch()) {
        mergeBatch(other.getBatch());
      }
      if (other.hasQuery()) {
        mergeQuery(other.getQuery());
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
      com.google.datastore.v1.RunQueryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.RunQueryResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.datastore.v1.QueryResultBatch batch_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.QueryResultBatch,
            com.google.datastore.v1.QueryResultBatch.Builder,
            com.google.datastore.v1.QueryResultBatchOrBuilder>
        batchBuilder_;
    /**
     *
     *
     * <pre>
     * A batch of query results (always present).
     * </pre>
     *
     * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
     */
    public boolean hasBatch() {
      return batchBuilder_ != null || batch_ != null;
    }
    /**
     *
     *
     * <pre>
     * A batch of query results (always present).
     * </pre>
     *
     * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
     */
    public com.google.datastore.v1.QueryResultBatch getBatch() {
      if (batchBuilder_ == null) {
        return batch_ == null
            ? com.google.datastore.v1.QueryResultBatch.getDefaultInstance()
            : batch_;
      } else {
        return batchBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A batch of query results (always present).
     * </pre>
     *
     * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
     */
    public Builder setBatch(com.google.datastore.v1.QueryResultBatch value) {
      if (batchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        batch_ = value;
        onChanged();
      } else {
        batchBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A batch of query results (always present).
     * </pre>
     *
     * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
     */
    public Builder setBatch(com.google.datastore.v1.QueryResultBatch.Builder builderForValue) {
      if (batchBuilder_ == null) {
        batch_ = builderForValue.build();
        onChanged();
      } else {
        batchBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A batch of query results (always present).
     * </pre>
     *
     * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
     */
    public Builder mergeBatch(com.google.datastore.v1.QueryResultBatch value) {
      if (batchBuilder_ == null) {
        if (batch_ != null) {
          batch_ =
              com.google.datastore.v1.QueryResultBatch.newBuilder(batch_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          batch_ = value;
        }
        onChanged();
      } else {
        batchBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A batch of query results (always present).
     * </pre>
     *
     * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
     */
    public Builder clearBatch() {
      if (batchBuilder_ == null) {
        batch_ = null;
        onChanged();
      } else {
        batch_ = null;
        batchBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A batch of query results (always present).
     * </pre>
     *
     * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
     */
    public com.google.datastore.v1.QueryResultBatch.Builder getBatchBuilder() {

      onChanged();
      return getBatchFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A batch of query results (always present).
     * </pre>
     *
     * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
     */
    public com.google.datastore.v1.QueryResultBatchOrBuilder getBatchOrBuilder() {
      if (batchBuilder_ != null) {
        return batchBuilder_.getMessageOrBuilder();
      } else {
        return batch_ == null
            ? com.google.datastore.v1.QueryResultBatch.getDefaultInstance()
            : batch_;
      }
    }
    /**
     *
     *
     * <pre>
     * A batch of query results (always present).
     * </pre>
     *
     * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.QueryResultBatch,
            com.google.datastore.v1.QueryResultBatch.Builder,
            com.google.datastore.v1.QueryResultBatchOrBuilder>
        getBatchFieldBuilder() {
      if (batchBuilder_ == null) {
        batchBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.datastore.v1.QueryResultBatch,
                com.google.datastore.v1.QueryResultBatch.Builder,
                com.google.datastore.v1.QueryResultBatchOrBuilder>(
                getBatch(), getParentForChildren(), isClean());
        batch_ = null;
      }
      return batchBuilder_;
    }

    private com.google.datastore.v1.Query query_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.Query,
            com.google.datastore.v1.Query.Builder,
            com.google.datastore.v1.QueryOrBuilder>
        queryBuilder_;
    /**
     *
     *
     * <pre>
     * The parsed form of the `GqlQuery` from the request, if it was set.
     * </pre>
     *
     * <code>.google.datastore.v1.Query query = 2;</code>
     */
    public boolean hasQuery() {
      return queryBuilder_ != null || query_ != null;
    }
    /**
     *
     *
     * <pre>
     * The parsed form of the `GqlQuery` from the request, if it was set.
     * </pre>
     *
     * <code>.google.datastore.v1.Query query = 2;</code>
     */
    public com.google.datastore.v1.Query getQuery() {
      if (queryBuilder_ == null) {
        return query_ == null ? com.google.datastore.v1.Query.getDefaultInstance() : query_;
      } else {
        return queryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The parsed form of the `GqlQuery` from the request, if it was set.
     * </pre>
     *
     * <code>.google.datastore.v1.Query query = 2;</code>
     */
    public Builder setQuery(com.google.datastore.v1.Query value) {
      if (queryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        query_ = value;
        onChanged();
      } else {
        queryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The parsed form of the `GqlQuery` from the request, if it was set.
     * </pre>
     *
     * <code>.google.datastore.v1.Query query = 2;</code>
     */
    public Builder setQuery(com.google.datastore.v1.Query.Builder builderForValue) {
      if (queryBuilder_ == null) {
        query_ = builderForValue.build();
        onChanged();
      } else {
        queryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The parsed form of the `GqlQuery` from the request, if it was set.
     * </pre>
     *
     * <code>.google.datastore.v1.Query query = 2;</code>
     */
    public Builder mergeQuery(com.google.datastore.v1.Query value) {
      if (queryBuilder_ == null) {
        if (query_ != null) {
          query_ = com.google.datastore.v1.Query.newBuilder(query_).mergeFrom(value).buildPartial();
        } else {
          query_ = value;
        }
        onChanged();
      } else {
        queryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The parsed form of the `GqlQuery` from the request, if it was set.
     * </pre>
     *
     * <code>.google.datastore.v1.Query query = 2;</code>
     */
    public Builder clearQuery() {
      if (queryBuilder_ == null) {
        query_ = null;
        onChanged();
      } else {
        query_ = null;
        queryBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The parsed form of the `GqlQuery` from the request, if it was set.
     * </pre>
     *
     * <code>.google.datastore.v1.Query query = 2;</code>
     */
    public com.google.datastore.v1.Query.Builder getQueryBuilder() {

      onChanged();
      return getQueryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The parsed form of the `GqlQuery` from the request, if it was set.
     * </pre>
     *
     * <code>.google.datastore.v1.Query query = 2;</code>
     */
    public com.google.datastore.v1.QueryOrBuilder getQueryOrBuilder() {
      if (queryBuilder_ != null) {
        return queryBuilder_.getMessageOrBuilder();
      } else {
        return query_ == null ? com.google.datastore.v1.Query.getDefaultInstance() : query_;
      }
    }
    /**
     *
     *
     * <pre>
     * The parsed form of the `GqlQuery` from the request, if it was set.
     * </pre>
     *
     * <code>.google.datastore.v1.Query query = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.Query,
            com.google.datastore.v1.Query.Builder,
            com.google.datastore.v1.QueryOrBuilder>
        getQueryFieldBuilder() {
      if (queryBuilder_ == null) {
        queryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.datastore.v1.Query,
                com.google.datastore.v1.Query.Builder,
                com.google.datastore.v1.QueryOrBuilder>(
                getQuery(), getParentForChildren(), isClean());
        query_ = null;
      }
      return queryBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.datastore.v1.RunQueryResponse)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.RunQueryResponse)
  private static final com.google.datastore.v1.RunQueryResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.RunQueryResponse();
  }

  public static com.google.datastore.v1.RunQueryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunQueryResponse> PARSER =
      new com.google.protobuf.AbstractParser<RunQueryResponse>() {
        @java.lang.Override
        public RunQueryResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RunQueryResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RunQueryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunQueryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.RunQueryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
