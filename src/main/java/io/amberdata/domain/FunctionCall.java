package io.amberdata.domain;

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
  private String meta;
  private List<FunctionCall> subFunctions;
  private Map<String, Object> optionalProperties;
  private Long blockNumber;
  private String transactionHash;
  private Integer depth;
  private Integer index;
  private Long timestamp;

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
    this.meta = builder.meta;
    this.subFunctions = builder.subFunctions;
    this.optionalProperties = builder.optionalProperties;
    this.blockNumber = builder.blockNumber;
    this.transactionHash = builder.transactionHash;
    this.depth = builder.depth;
    this.index = builder.index;
    this.timestamp = builder.timestamp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public List<Argument> getArguments() {
    return arguments;
  }

  public void setArguments(List<Argument> arguments) {
    this.arguments = arguments;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getMeta() {
    return meta;
  }

  public void setMeta(String meta) {
    this.meta = meta;
  }

  public List<FunctionCall> getSubFunctions() {
    return subFunctions;
  }

  public void setSubFunctions(List<FunctionCall> subFunctions) {
    this.subFunctions = subFunctions;
  }

  public Map<String, Object> getOptionalProperties() {
    return optionalProperties;
  }

  public void setOptionalProperties(Map<String, Object> optionalProperties) {
    this.optionalProperties = optionalProperties;
  }

  public Long getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }

  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    FunctionCall that = (FunctionCall) obj;
    return Objects.equals(name, that.name)
        && Objects.equals(signature, that.signature)
        && Objects.equals(arguments, that.arguments)
        && Objects.equals(type, that.type)
        && Objects.equals(from, that.from)
        && Objects.equals(to, that.to)
        && Objects.equals(assetType, that.assetType)
        && Objects.equals(value, that.value)
        && Objects.equals(meta, that.meta)
        && Objects.equals(subFunctions, that.subFunctions)
        && Objects.equals(optionalProperties, that.optionalProperties)
        && Objects.equals(blockNumber, that.blockNumber)
        && Objects.equals(transactionHash, that.transactionHash)
        && Objects.equals(timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name,
        signature,
        arguments,
        type,
        from,
        to,
        assetType,
        value,
        meta,
        subFunctions,
        optionalProperties,
        blockNumber,
        transactionHash,
        timestamp
    );
  }

  @Override
  public String toString() {
    return "FunctionCall{"
        + "name='" + name + '\''
        + ", signature='" + signature + '\''
        + ", arguments=" + arguments
        + ", type='" + type + '\''
        + ", from='" + from + '\''
        + ", to='" + to + '\''
        + ", assetType='" + assetType + '\''
        + ", value='" + value + '\''
        + ", meta='" + meta + '\''
        + ", subFunctions=" + subFunctions
        + ", optionalProperties=" + optionalProperties
        + ", blockNumber='" + blockNumber + '\''
        + ", transactionHash='" + transactionHash + '\''
        + ", timestamp='" + timestamp + '\''
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
    private String meta;
    private List<FunctionCall> subFunctions;
    private Map<String, Object> optionalProperties;
    private Long blockNumber;
    private String transactionHash;
    private Integer depth;
    private Integer index;
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

    public FunctionCall.Builder meta(String meta) {
      this.meta = meta;
      return this;
    }

    public FunctionCall.Builder subFunctions(List<FunctionCall> subFunctions) {
      this.subFunctions = subFunctions;
      return this;
    }

    public FunctionCall.Builder optionalProperties(Map<String, Object> optionalProperties) {
      this.optionalProperties = optionalProperties;
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
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getValue() {
      return value;
    }

    public void setValue(String value) {
      this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }

      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Argument argument = (Argument) obj;
      return Objects.equals(name, argument.name)
          && Objects.equals(value, argument.value);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, value);
    }

    @Override
    public String toString() {
      return "Argument{"
          + "name='" + name + '\''
          + ", value='" + value + '\''
          + '}';
    }
  }
}
