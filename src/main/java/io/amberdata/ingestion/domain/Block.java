package io.amberdata.ingestion.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;

public class Block implements BlockchainEntity {

  private BigInteger number;
  private String hash;
  private String parentHash;
  private BigDecimal gasUsed;
  private Integer numTransactions;
  private Long timestamp;

  private Map<String, Object> meta;

  public Block() {
  }

  private Block(Builder builder) {
    this.number = builder.number;
    this.hash = builder.hash;
    this.parentHash = builder.parentHash;
    this.gasUsed = builder.gasUsed;
    this.timestamp = builder.timestamp;
    this.numTransactions = builder.numTransactions;
    this.meta = builder.meta;
  }

  public BigInteger getNumber() {
    return number;
  }

  public void setNumber(BigInteger number) {
    this.number = number;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getParentHash() {
    return parentHash;
  }

  public void setParentHash(String parentHash) {
    this.parentHash = parentHash;
  }

  public BigDecimal getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(BigDecimal gasUsed) {
    this.gasUsed = gasUsed;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Integer getNumTransactions() {
    return numTransactions;
  }

  public void setNumTransactions(Integer numTransactions) {
    this.numTransactions = numTransactions;
  }

  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Block block = (Block) obj;
    return Objects.equals(number, block.number)
        && Objects.equals(hash, block.hash)
        && Objects.equals(parentHash, block.parentHash)
        && Objects.equals(gasUsed, block.gasUsed)
        && Objects.equals(timestamp, block.timestamp)
        && Objects.equals(numTransactions, block.numTransactions)
        && Objects.equals(meta, block.meta);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(number, hash, parentHash, gasUsed, timestamp, numTransactions, meta);
  }

  @Override
  public String toString() {
    return "Block{"
        + "number=" + number
        + ", hash='" + hash + '\''
        + ", parentHash='" + parentHash + '\''
        + ", gasUsed=" + gasUsed
        + ", numTransactions=" + numTransactions
        + ", timestamp=" + timestamp
        + ", meta=" + meta
        + '}';
  }

  public static class Builder {

    private BigInteger number;
    private String hash;
    private String parentHash;
    private BigDecimal gasUsed;
    private Long timestamp;
    private Integer numTransactions;
    private Map<String, Object> meta;

    public Block.Builder number(BigInteger value) {
      this.number = value;
      return this;
    }

    public Block.Builder hash(String value) {
      this.hash = value;
      return this;
    }

    public Block.Builder parentHash(String value) {
      this.parentHash = value;
      return this;
    }

    public Block.Builder gasUsed(BigDecimal value) {
      this.gasUsed = value;
      return this;
    }

    public Block.Builder timestamp(Long value) {
      this.timestamp = value;
      return this;
    }

    public Block.Builder numTransactions(Integer value) {
      this.numTransactions = value;
      return this;
    }

    public Block.Builder meta(Map<String, Object> value) {
      this.meta = value;
      return this;
    }

    public Block build() {
      return new Block(this);
    }
  }
}
