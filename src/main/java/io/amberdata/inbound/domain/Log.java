package io.amberdata.inbound.domain;

import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;

public class Log implements BlockchainEntity {

  private String              id;
  private String              transactionHash;
  private Integer             logIndex;
  private String              blockHash;
  private BigInteger          blockNumber;
  private String              address;
  private String              data;
  private long                timestamp;
  private Map<String, Object> meta;

  public Log() {
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTransactionHash() {
    return this.transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public int getLogIndex() {
    return this.logIndex;
  }

  public void setLogIndex(int logIndex) {
    this.logIndex = logIndex;
  }

  public String getBlockHash() {
    return this.blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public BigInteger getBlockNumber() {
    return this.blockNumber;
  }

  public void setBlockNumber(BigInteger blockNumber) {
    this.blockNumber = blockNumber;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public Map<String, Object> getMeta() {
    return this.meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || this.getClass() != object.getClass()) {
      return false;
    }
    Log log = (Log) object;
    return this.timestamp == log.timestamp
        && Objects.equals(this.id,              log.id)
        && Objects.equals(this.transactionHash, log.transactionHash)
        && Objects.equals(this.logIndex,        log.logIndex)
        && Objects.equals(this.blockHash,       log.blockHash)
        && Objects.equals(this.blockNumber,     log.blockNumber)
        && Objects.equals(this.address,         log.address)
        && Objects.equals(this.data,            log.data)
        && Objects.equals(this.meta,            log.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        this.id,
        this.transactionHash,
        this.logIndex,
        this.blockHash,
        this.blockNumber,
        this.address,
        this.data,
        this.timestamp,
        this.meta
    );
  }

  @Override
  public String toString() {
    return "Log{"
        + "id='"              + this.getId() + '\''         + ","
        + "transactionHash='" + this.transactionHash + '\'' + ","
        + "logIndex='"        + this.logIndex + '\''        + ","
        + "blockHash='"       + this.blockHash + '\''       + ","
        + "blockNumber="      + this.blockNumber            + ","
        + "address='"         + this.address + '\''         + ","
        + "data='"            + this.data + '\''            + ","
        + "timestamp="        + this.timestamp              + ","
        + "meta="             + this.meta
        + '}';
  }

  private Log(Builder builder) {
    this.id              = builder.id;
    this.logIndex        = builder.logIndex;
    this.transactionHash = builder.transactionHash;
    this.blockHash       = builder.blockHash;
    this.blockNumber     = builder.blockNumber;
    this.address         = builder.address;
    this.data            = builder.data;
    this.timestamp       = builder.timestamp;
    this.meta            = builder.meta;
  }

  public static class Builder {

    private String              id;
    private Integer             logIndex;
    private String              transactionHash;
    private String              blockHash;
    private BigInteger          blockNumber;
    private String              address;
    private String              data;
    private long                timestamp;
    private Map<String, Object> meta;

    public Builder id(String value) {
      this.id = value;
      return this;
    }

    public Builder logIndex(int value) {
      this.logIndex = value;
      return this;
    }

    public Builder transactionHash(String value) {
      this.transactionHash = value;
      return this;
    }

    public Builder blockHash(String value) {
      this.blockHash = value;
      return this;
    }

    public Builder blockNumber(BigInteger value) {
      this.blockNumber = value;
      return this;
    }

    public Builder address(String value) {
      this.address = value;
      return this;
    }

    public Builder data(String value) {
      this.data = value;
      return this;
    }

    public Builder timestamp(long value) {
      this.timestamp = value;
      return this;
    }

    public Builder meta(Map<String, Object> value) {
      this.meta = value;
      return this;
    }

    public Log build() {
      return new Log(this);
    }

  }

}
