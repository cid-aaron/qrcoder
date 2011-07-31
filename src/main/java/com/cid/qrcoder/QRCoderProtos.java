// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package com.cid.qrcoder;

public final class QRCoderProtos {
  private QRCoderProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface QREncodeRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string data = 1;
    boolean hasData();
    String getData();
    
    // optional int32 size = 2;
    boolean hasSize();
    int getSize();
  }
  public static final class QREncodeRequest extends
      com.google.protobuf.GeneratedMessage
      implements QREncodeRequestOrBuilder {
    // Use QREncodeRequest.newBuilder() to construct.
    private QREncodeRequest(Builder builder) {
      super(builder);
    }
    private QREncodeRequest(boolean noInit) {}
    
    private static final QREncodeRequest defaultInstance;
    public static QREncodeRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public QREncodeRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cid.qrcoder.QRCoderProtos.internal_static_qrcoder_QREncodeRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cid.qrcoder.QRCoderProtos.internal_static_qrcoder_QREncodeRequest_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string data = 1;
    public static final int DATA_FIELD_NUMBER = 1;
    private java.lang.Object data_;
    public boolean hasData() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          data_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 size = 2;
    public static final int SIZE_FIELD_NUMBER = 2;
    private int size_;
    public boolean hasSize() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getSize() {
      return size_;
    }
    
    private void initFields() {
      data_ = "";
      size_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getDataBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, size_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getDataBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, size_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.cid.qrcoder.QRCoderProtos.QREncodeRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.cid.qrcoder.QRCoderProtos.QREncodeRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.cid.qrcoder.QRCoderProtos.QREncodeRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cid.qrcoder.QRCoderProtos.internal_static_qrcoder_QREncodeRequest_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cid.qrcoder.QRCoderProtos.internal_static_qrcoder_QREncodeRequest_fieldAccessorTable;
      }
      
      // Construct using com.cid.qrcoder.QRCoderProtos.QREncodeRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        data_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        size_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cid.qrcoder.QRCoderProtos.QREncodeRequest.getDescriptor();
      }
      
      public com.cid.qrcoder.QRCoderProtos.QREncodeRequest getDefaultInstanceForType() {
        return com.cid.qrcoder.QRCoderProtos.QREncodeRequest.getDefaultInstance();
      }
      
      public com.cid.qrcoder.QRCoderProtos.QREncodeRequest build() {
        com.cid.qrcoder.QRCoderProtos.QREncodeRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.cid.qrcoder.QRCoderProtos.QREncodeRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.cid.qrcoder.QRCoderProtos.QREncodeRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.cid.qrcoder.QRCoderProtos.QREncodeRequest buildPartial() {
        com.cid.qrcoder.QRCoderProtos.QREncodeRequest result = new com.cid.qrcoder.QRCoderProtos.QREncodeRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.data_ = data_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.size_ = size_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.cid.qrcoder.QRCoderProtos.QREncodeRequest) {
          return mergeFrom((com.cid.qrcoder.QRCoderProtos.QREncodeRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.cid.qrcoder.QRCoderProtos.QREncodeRequest other) {
        if (other == com.cid.qrcoder.QRCoderProtos.QREncodeRequest.getDefaultInstance()) return this;
        if (other.hasData()) {
          setData(other.getData());
        }
        if (other.hasSize()) {
          setSize(other.getSize());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasData()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              data_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              size_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string data = 1;
      private java.lang.Object data_ = "";
      public boolean hasData() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          data_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setData(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        data_ = value;
        onChanged();
        return this;
      }
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      void setData(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        data_ = value;
        onChanged();
      }
      
      // optional int32 size = 2;
      private int size_ ;
      public boolean hasSize() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getSize() {
        return size_;
      }
      public Builder setSize(int value) {
        bitField0_ |= 0x00000002;
        size_ = value;
        onChanged();
        return this;
      }
      public Builder clearSize() {
        bitField0_ = (bitField0_ & ~0x00000002);
        size_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:qrcoder.QREncodeRequest)
    }
    
    static {
      defaultInstance = new QREncodeRequest(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:qrcoder.QREncodeRequest)
  }
  
  public interface QREncodeResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required bool successful = 1;
    boolean hasSuccessful();
    boolean getSuccessful();
    
    // optional bytes qr_code = 2;
    boolean hasQrCode();
    com.google.protobuf.ByteString getQrCode();
  }
  public static final class QREncodeResponse extends
      com.google.protobuf.GeneratedMessage
      implements QREncodeResponseOrBuilder {
    // Use QREncodeResponse.newBuilder() to construct.
    private QREncodeResponse(Builder builder) {
      super(builder);
    }
    private QREncodeResponse(boolean noInit) {}
    
    private static final QREncodeResponse defaultInstance;
    public static QREncodeResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public QREncodeResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cid.qrcoder.QRCoderProtos.internal_static_qrcoder_QREncodeResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cid.qrcoder.QRCoderProtos.internal_static_qrcoder_QREncodeResponse_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required bool successful = 1;
    public static final int SUCCESSFUL_FIELD_NUMBER = 1;
    private boolean successful_;
    public boolean hasSuccessful() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getSuccessful() {
      return successful_;
    }
    
    // optional bytes qr_code = 2;
    public static final int QR_CODE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString qrCode_;
    public boolean hasQrCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.google.protobuf.ByteString getQrCode() {
      return qrCode_;
    }
    
    private void initFields() {
      successful_ = false;
      qrCode_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSuccessful()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, successful_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, qrCode_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, successful_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, qrCode_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.cid.qrcoder.QRCoderProtos.QREncodeResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.cid.qrcoder.QRCoderProtos.QREncodeResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.cid.qrcoder.QRCoderProtos.QREncodeResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.cid.qrcoder.QRCoderProtos.QREncodeResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cid.qrcoder.QRCoderProtos.internal_static_qrcoder_QREncodeResponse_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cid.qrcoder.QRCoderProtos.internal_static_qrcoder_QREncodeResponse_fieldAccessorTable;
      }
      
      // Construct using com.cid.qrcoder.QRCoderProtos.QREncodeResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        successful_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        qrCode_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cid.qrcoder.QRCoderProtos.QREncodeResponse.getDescriptor();
      }
      
      public com.cid.qrcoder.QRCoderProtos.QREncodeResponse getDefaultInstanceForType() {
        return com.cid.qrcoder.QRCoderProtos.QREncodeResponse.getDefaultInstance();
      }
      
      public com.cid.qrcoder.QRCoderProtos.QREncodeResponse build() {
        com.cid.qrcoder.QRCoderProtos.QREncodeResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.cid.qrcoder.QRCoderProtos.QREncodeResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.cid.qrcoder.QRCoderProtos.QREncodeResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.cid.qrcoder.QRCoderProtos.QREncodeResponse buildPartial() {
        com.cid.qrcoder.QRCoderProtos.QREncodeResponse result = new com.cid.qrcoder.QRCoderProtos.QREncodeResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.successful_ = successful_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.qrCode_ = qrCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.cid.qrcoder.QRCoderProtos.QREncodeResponse) {
          return mergeFrom((com.cid.qrcoder.QRCoderProtos.QREncodeResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.cid.qrcoder.QRCoderProtos.QREncodeResponse other) {
        if (other == com.cid.qrcoder.QRCoderProtos.QREncodeResponse.getDefaultInstance()) return this;
        if (other.hasSuccessful()) {
          setSuccessful(other.getSuccessful());
        }
        if (other.hasQrCode()) {
          setQrCode(other.getQrCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSuccessful()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              successful_ = input.readBool();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              qrCode_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required bool successful = 1;
      private boolean successful_ ;
      public boolean hasSuccessful() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getSuccessful() {
        return successful_;
      }
      public Builder setSuccessful(boolean value) {
        bitField0_ |= 0x00000001;
        successful_ = value;
        onChanged();
        return this;
      }
      public Builder clearSuccessful() {
        bitField0_ = (bitField0_ & ~0x00000001);
        successful_ = false;
        onChanged();
        return this;
      }
      
      // optional bytes qr_code = 2;
      private com.google.protobuf.ByteString qrCode_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasQrCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.google.protobuf.ByteString getQrCode() {
        return qrCode_;
      }
      public Builder setQrCode(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        qrCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearQrCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        qrCode_ = getDefaultInstance().getQrCode();
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:qrcoder.QREncodeResponse)
    }
    
    static {
      defaultInstance = new QREncodeResponse(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:qrcoder.QREncodeResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_qrcoder_QREncodeRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_qrcoder_QREncodeRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_qrcoder_QREncodeResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_qrcoder_QREncodeResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016messages.proto\022\007qrcoder\"-\n\017QREncodeReq" +
      "uest\022\014\n\004data\030\001 \002(\t\022\014\n\004size\030\002 \001(\005\"7\n\020QREn" +
      "codeResponse\022\022\n\nsuccessful\030\001 \002(\010\022\017\n\007qr_c" +
      "ode\030\002 \001(\0142P\n\017QREncodeService\022=\n\006Encode\022\030" +
      ".qrcoder.QREncodeRequest\032\031.qrcoder.QREnc" +
      "odeResponseB \n\017com.cid.qrcoderB\rQRCoderP" +
      "rotos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_qrcoder_QREncodeRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_qrcoder_QREncodeRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_qrcoder_QREncodeRequest_descriptor,
              new java.lang.String[] { "Data", "Size", },
              com.cid.qrcoder.QRCoderProtos.QREncodeRequest.class,
              com.cid.qrcoder.QRCoderProtos.QREncodeRequest.Builder.class);
          internal_static_qrcoder_QREncodeResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_qrcoder_QREncodeResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_qrcoder_QREncodeResponse_descriptor,
              new java.lang.String[] { "Successful", "QrCode", },
              com.cid.qrcoder.QRCoderProtos.QREncodeResponse.class,
              com.cid.qrcoder.QRCoderProtos.QREncodeResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
