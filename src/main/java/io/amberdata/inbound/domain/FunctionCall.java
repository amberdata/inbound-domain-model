package io.amberdata.inbound.domain;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FunctionCall implements BlockchainEntity {
  private String name;
  private String hash;
  private String signature;
  private List<Argument> arguments;
  private String type;
  private String from;
  private String to;
  private String assetType;
  private String value;
  private List<FunctionCall> subFunctions;
  private Long blockNumber;
  private String transactionHash;
  private Integer depth;
  private Integer index;
  private String result;
  private Long timestamp;
  private Map<String, Object> meta;

  public FunctionCall() {
  }

  private FunctionCall(Builder builder) {
    this.name = builder.name;
    this.hash = builder.hash;
    this.signature = builder.signature;
    this.arguments = builder.arguments;
    this.type = builder.type;
    this.from = builder.from;
    this.to = builder.to;
    this.assetType = builder.assetType;
    this.value = builder.value;
    this.subFunctions = builder.subFunctions;
    this.meta = builder.meta;
    this.blockNumber = builder.blockNumber;
    this.transactionHash = builder.transactionHash;
    this.depth = builder.depth;
    this.index = builder.index;
    this.result = builder.result;
    this.timestamp = builder.timestamp;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHash() {
    return this.hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getSignature() {
    return this.signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public List<Argument> getArguments() {
    return this.arguments;
  }

  public void setArguments(List<Argument> arguments) {
    this.arguments = arguments;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getFrom() {
    return this.from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return this.to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getAssetType() {
    return this.assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public List<FunctionCall> getSubFunctions() {
    return this.subFunctions;
  }

  public void setSubFunctions(List<FunctionCall> subFunctions) {
    this.subFunctions = subFunctions;
  }

  public Map<String, Object> getMeta() {
    return this.meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  public Long getBlockNumber() {
    return this.blockNumber;
  }

  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }

  public String getTransactionHash() {
    return this.transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public Integer getDepth() {
    return this.depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public Integer getIndex() {
    return this.index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public String getResult() {
    return this.result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public Long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || this.getClass() != object.getClass()) {
      return false;
    }

    FunctionCall that = (FunctionCall) object;
    return Objects.equals(this.name, that.name)
        && Objects.equals(this.signature, that.signature)
        && Objects.equals(this.arguments, that.arguments)
        && Objects.equals(this.type, that.type)
        && Objects.equals(this.from, that.from)
        && Objects.equals(this.to, that.to)
        && Objects.equals(this.assetType, that.assetType)
        && Objects.equals(this.value, that.value)
        && Objects.equals(this.subFunctions, that.subFunctions)
        && Objects.equals(this.meta, that.meta)
        && Objects.equals(this.blockNumber, that.blockNumber)
        && Objects.equals(this.transactionHash, that.transactionHash)
        && Objects.equals(this.result, that.result)
        && Objects.equals(this.timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        this.name,
        this.signature,
        this.arguments,
        this.type,
        this.from,
        this.to,
        this.assetType,
        this.value,
        this.subFunctions,
        this.meta,
        this.blockNumber,
        this.transactionHash,
        this.result,
        this.timestamp
    );
  }

  @Override
  public String toString() {
    return "FunctionCall{"
        + "name='" + this.name + '\''
        + ", hash='" + this.hash + '\''
        + ", signature='" + this.signature + '\''
        + ", arguments=" + this.arguments
        + ", type='" + this.type + '\''
        + ", from='" + this.from + '\''
        + ", to='" + this.to + '\''
        + ", assetType='" + this.assetType + '\''
        + ", value='" + this.value + '\''
        + ", subFunctions=" + this.subFunctions
        + ", blockNumber=" + this.blockNumber
        + ", transactionHash='" + this.transactionHash + '\''
        + ", depth=" + this.depth
        + ", index=" + this.index
        + ", result=" + this.result
        + ", timestamp=" + this.timestamp
        + ", meta=" + this.meta
        + '}';
  }

  public static class Builder {
    private String name;
    private String hash;
    private String signature;
    private List<Argument> arguments;
    private String type;
    private String from;
    private String to;
    private String assetType;
    private String value;
    private List<FunctionCall> subFunctions;
    private Map<String, Object> meta;
    private Long blockNumber;
    private String transactionHash;
    private Integer depth;
    private Integer index;
    private String result;
    private Long timestamp;

    public FunctionCall.Builder name(String name) {
      this.name = name;
      return this;
    }

    public FunctionCall.Builder hash(String hash) {
      this.hash = hash;
      return this;
    }

    public FunctionCall.Builder signature(String signature) {
      this.signature = signature;
      return this;
    }

    public FunctionCall.Builder arguments(List<Argument> arguments) {
      this.arguments = arguments;
      return this;
    }

    public FunctionCall.Builder type(String type) {
      this.type = type;
      return this;
    }

    public FunctionCall.Builder from(String from) {
      this.from = from;
      return this;
    }

    public FunctionCall.Builder to(String to) {
      this.to = to;
      return this;
    }

    public FunctionCall.Builder assetType(String assetType) {
      this.assetType = assetType;
      return this;
    }

    public FunctionCall.Builder value(String value) {
      this.value = value;
      return this;
    }

    public FunctionCall.Builder subFunctions(List<FunctionCall> subFunctions) {
      this.subFunctions = subFunctions;
      return this;
    }

    public FunctionCall.Builder meta(Map<String, Object> meta) {
      this.meta = meta;
      return this;
    }

    public FunctionCall.Builder blockNumber(Long value) {
      this.blockNumber = value;
      return this;
    }

    public FunctionCall.Builder transactionHash(String value) {
      this.transactionHash = value;
      return this;
    }

    public FunctionCall.Builder depth(Integer value) {
      this.depth = value;
      return this;
    }

    public FunctionCall.Builder index(Integer value) {
      this.index = value;
      return this;
    }

    public FunctionCall.Builder result(String value) {
      this.result = value;
      return this;
    }

    public FunctionCall.Builder timestamp(Long value) {
      this.timestamp = value;
      return this;
    }

    public FunctionCall build() {
      return new FunctionCall(this);
    }
  }

  public static class Argument {

    private String name;
    private String value;

    private Argument(String name, String value) {
      this.name = name;
      this.value = value;
    }

    public static Argument from(String name, String value) {
      return new Argument(name, value);
    }

    public String getName() {
      return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getValue() {
      return this.value;
    }

    public void setValue(String value) {
      this.value = value;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
        return true;
      }

      if (object == null || this.getClass() != object.getClass()) {
        return false;
      }

      Argument that = (Argument) object;
      return Objects.equals(this.name, that.name)
          && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.name, this.value);
    }

    @Override
    public String toString() {
      return "Argument{"
          + "name='" + this.name + '\''
          + ", value='" + this.value + '\''
          + '}';
    }
  }
}
