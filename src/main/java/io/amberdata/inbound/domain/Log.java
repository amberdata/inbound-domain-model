package io.amberdata.inbound.domain;

import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;

public class Log implements BlockchainEntity {

  private String id;
  private String transactionHash;
  private String blockHash;
  private BigInteger blockNumber;
  private String address;
  private String data;
  private long timestamp;

  private Map<String, Object> meta;

  public Log() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public BigInteger getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(BigInteger blockNumber) {
    this.blockNumber = blockNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Log log = (Log) object;
    return timestamp == log.timestamp
        && Objects.equals(id, log.id)
        && Objects.equals(transactionHash, log.transactionHash)
        && Objects.equals(blockHash, log.blockHash)
        && Objects.equals(blockNumber, log.blockNumber)
        && Objects.equals(address, log.address)
        && Objects.equals(data, log.data)
        && Objects.equals(meta, log.meta);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(
            transactionHash, id,
            blockHash, blockNumber,
            address, data,
            timestamp, meta
        );
  }

  @Override
  public String toString() {
    return "Log{"
        + "id='" + getId() + '\''
        + ", transactionHash='" + transactionHash + '\''
        + ", blockHash='" + blockHash + '\''
        + ", blockNumber=" + blockNumber
        + ", address='" + address + '\''
        + ", data='" + data + '\''
        + ", timestamp=" + timestamp
        + ", meta=" + meta
        + '}';
  }

  private Log(Builder builder) {
    this.transactionHash = builder.transactionHash;
    this.blockHash = builder.blockHash;
    this.blockNumber = builder.blockNumber;
    this.address = builder.address;
    this.data = builder.data;
    this.timestamp = builder.timestamp;
    this.meta = builder.meta;

    this.id = String.format("%s_%s", builder.address, builder.blockNumber.toString());
  }

  public static class Builder {

    private String transactionHash;
    private String blockHash;
    private BigInteger blockNumber;
    private String address;
    private String data;
    private long timestamp;
    private Map<String, Object> meta;

    public Builder transactionHash(String transactionHash) {
      this.transactionHash = transactionHash;
      return this;
    }

    public Builder blockHash(String blockHash) {
      this.blockHash = blockHash;
      return this;
    }

    public Builder blockNumber(BigInteger blockNumber) {
      this.blockNumber = blockNumber;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder data(String data) {
      this.data = data;
      return this;
    }

    public Builder timestamp(long timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder meta(Map<String, Object> meta) {
      this.meta = meta;
      return this;
    }

    public Log build() {
      return new Log(this);
    }
  }
}
