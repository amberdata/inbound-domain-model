package io.amberdata.inbound.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;

public class Block implements BlockchainEntity {

  private BigInteger          number;
  private BigInteger          difficulty;
  private String              hash;
  private String              parentHash;
  private BigDecimal          gasUsed;
  private Integer             numTransactions;
  private BigDecimal          reward;
  private BigDecimal          rewardFees;
  private Long                timestamp;
  private Map<String, Object> meta;

  public Block() {
  }

  private Block(Builder builder) {
    this.number          = builder.number;
    this.difficulty      = builder.difficulty;
    this.hash            = builder.hash;
    this.parentHash      = builder.parentHash;
    this.gasUsed         = builder.gasUsed;
    this.timestamp       = builder.timestamp;
    this.numTransactions = builder.numTransactions;
    this.reward          = builder.reward;
    this.rewardFees      = builder.rewardFees;
    this.meta            = builder.meta;
  }

  public BigInteger getNumber() {
    return this.number;
  }

  public void setNumber(BigInteger number) {
    this.number = number;
  }

  public BigInteger getDifficulty() {
    return this.difficulty;
  }

  public void setDifficulty(BigInteger difficulty) {
    this.difficulty = difficulty;
  }

  public String getHash() {
    return this.hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getParentHash() {
    return this.parentHash;
  }

  public void setParentHash(String parentHash) {
    this.parentHash = parentHash;
  }

  public BigDecimal getGasUsed() {
    return this.gasUsed;
  }

  public void setGasUsed(BigDecimal gasUsed) {
    this.gasUsed = gasUsed;
  }

  public Long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Integer getNumTransactions() {
    return this.numTransactions;
  }

  public void setNumTransactions(Integer numTransactions) {
    this.numTransactions = numTransactions;
  }

  public BigDecimal getReward() {
    return this.reward;
  }

  public void setReward(BigDecimal reward) {
    this.reward = reward;
  }

  public BigDecimal getRewardFees() {
    return this.rewardFees;
  }

  public void setRewardFees(BigDecimal rewardFees) {
    this.rewardFees = rewardFees;
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

    Block that = (Block) object;
    return Objects.equals(this.number,          that.number)
        && Objects.equals(this.difficulty,      that.difficulty)
        && Objects.equals(this.hash,            that.hash)
        && Objects.equals(this.parentHash,      that.parentHash)
        && Objects.equals(this.gasUsed,         that.gasUsed)
        && Objects.equals(this.timestamp,       that.timestamp)
        && Objects.equals(this.numTransactions, that.numTransactions)
        && Objects.equals(this.reward,          that.reward)
        && Objects.equals(this.rewardFees,      that.rewardFees)
        && Objects.equals(this.meta,            that.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        this.number,
        this.difficulty,
        this.hash,
        this.parentHash,
        this.gasUsed,
        this.timestamp,
        this.numTransactions,
        this.reward,
        this.rewardFees,
        this.meta
    );
  }

  @Override
  public String toString() {
    return "Block{"
        + "number="          + this.number            + ","
        + "difficulty="      + this.difficulty        + ","
        + "hash='"           + this.hash + '\''       + ","
        + "parentHash='"     + this.parentHash + '\'' + ","
        + "gasUsed="         + this.gasUsed           + ","
        + "numTransactions=" + this.numTransactions   + ","
        + "reward="          + this.reward            + ","
        + "rewardFees="      + this.rewardFees        + ","
        + "timestamp="       + this.timestamp         + ","
        + "meta="            + this.meta
        + '}';
  }

  public static class Builder {

    private BigInteger          number;
    private BigInteger          difficulty;
    private String              hash;
    private String              parentHash;
    private BigDecimal          gasUsed;
    private Long                timestamp;
    private Integer             numTransactions;
    private BigDecimal          reward;
    private BigDecimal          rewardFees;
    private Map<String, Object> meta;

    public Block.Builder number(BigInteger value) {
      this.number = value;
      return this;
    }

    public Block.Builder difficulty(BigInteger value) {
      this.difficulty = value;
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

    public Block.Builder reward(BigDecimal value) {
      this.reward = value;
      return this;
    }

    public Block.Builder rewardFees(BigDecimal value) {
      this.rewardFees = value;
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
