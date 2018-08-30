package io.amberdata.ingestion.domain;

import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;

public class Uncle implements BlockchainEntity {

  public static final String PROPERTY_EXTRA_DATA = "extraData";

  private BigInteger blockNumber;
  private String blockHash;
  private BigInteger difficulty;
  private BigInteger gasLimit;
  private BigInteger gasUsed;
  private String hash;
  private String logsBloom;
  private String miner;
  private String mixHash;
  private BigInteger nonce;
  private BigInteger number;
  private String parentHash;
  private Integer positionIndex;
  private String rewardValue;
  private String receiptsRoot;
  private String sha3Uncles;
  private Long size;
  private String stateRoot;
  private Long timestamp;
  private Long timestampNanoseconds;
  private BigInteger totalDifficulty;
  private String transactionsRoot;

  private Map<String, Object> meta;

  private Long blockTimestamp;
  private Long blockTimestampNanoseconds;

  public Uncle() {

  }

  private Uncle(Builder builder) {
    this.blockNumber = builder.blockNumber;
    this.blockHash = builder.blockHash;
    this.difficulty = builder.difficulty;
    this.gasLimit = builder.gasLimit;
    this.gasUsed = builder.gasUsed;
    this.hash = builder.hash;
    this.logsBloom = builder.logsBloom;
    this.miner = builder.miner;
    this.mixHash = builder.mixHash;
    this.nonce = builder.nonce;
    this.number = builder.number;
    this.parentHash = builder.parentHash;
    this.positionIndex = builder.positionIndex;
    this.rewardValue = builder.rewardValue;
    this.receiptsRoot = builder.receiptsRoot;
    this.sha3Uncles = builder.sha3Uncles;
    this.size = builder.size;
    this.stateRoot = builder.stateRoot;
    this.timestamp = builder.timestamp;
    this.timestampNanoseconds = builder.timestampNanoseconds;
    this.totalDifficulty = builder.totalDifficulty;
    this.transactionsRoot = builder.transactionsRoot;
    this.meta = builder.meta;
    this.blockTimestamp = builder.blockTimestamp;
    this.blockTimestampNanoseconds = builder.blockTimestampNanoseconds;
  }

  public BigInteger getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(BigInteger blockNumber) {
    this.blockNumber = blockNumber;
  }

  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public BigInteger getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(BigInteger difficulty) {
    this.difficulty = difficulty;
  }

  public BigInteger getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(BigInteger gasLimit) {
    this.gasLimit = gasLimit;
  }

  public BigInteger getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(BigInteger gasUsed) {
    this.gasUsed = gasUsed;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getLogsBloom() {
    return logsBloom;
  }

  public void setLogsBloom(String logsBloom) {
    this.logsBloom = logsBloom;
  }

  public String getMiner() {
    return miner;
  }

  public void setMiner(String miner) {
    this.miner = miner;
  }

  public String getMixHash() {
    return mixHash;
  }

  public void setMixHash(String mixHash) {
    this.mixHash = mixHash;
  }

  public BigInteger getNonce() {
    return nonce;
  }

  public void setNonce(BigInteger nonce) {
    this.nonce = nonce;
  }

  public BigInteger getNumber() {
    return number;
  }

  public void setNumber(BigInteger number) {
    this.number = number;
  }

  public String getParentHash() {
    return parentHash;
  }

  public void setParentHash(String parentHash) {
    this.parentHash = parentHash;
  }

  public Integer getPositionIndex() {
    return positionIndex;
  }

  public void setPositionIndex(Integer positionIndex) {
    this.positionIndex = positionIndex;
  }

  public String getRewardValue() {
    return rewardValue;
  }

  public void setRewardValue(String rewardValue) {
    this.rewardValue = rewardValue;
  }

  public String getReceiptsRoot() {
    return receiptsRoot;
  }

  public void setReceiptsRoot(String receiptsRoot) {
    this.receiptsRoot = receiptsRoot;
  }

  public String getSha3Uncles() {
    return sha3Uncles;
  }

  public void setSha3Uncles(String sha3Uncles) {
    this.sha3Uncles = sha3Uncles;
  }

  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public String getStateRoot() {
    return stateRoot;
  }

  public void setStateRoot(String stateRoot) {
    this.stateRoot = stateRoot;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Long getTimestampNanoseconds() {
    return timestampNanoseconds;
  }

  public void setTimestampNanoseconds(Long timestampNanoseconds) {
    this.timestampNanoseconds = timestampNanoseconds;
  }

  public BigInteger getTotalDifficulty() {
    return totalDifficulty;
  }

  public void setTotalDifficulty(BigInteger totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
  }

  public String getTransactionsRoot() {
    return transactionsRoot;
  }

  public void setTransactionsRoot(String transactionsRoot) {
    this.transactionsRoot = transactionsRoot;
  }

  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  public Long getBlockTimestamp() {
    return blockTimestamp;
  }

  public void setBlockTimestamp(Long blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
  }

  public Long getBlockTimestampNanoseconds() {
    return blockTimestampNanoseconds;
  }

  public void setBlockTimestampNanoseconds(Long blockTimestampNanoseconds) {
    this.blockTimestampNanoseconds = blockTimestampNanoseconds;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if ((object == null) || (this.getClass() != object.getClass())) {
      return false;
    }

    Uncle that = (Uncle) object;
    return Objects.equals(this.hash, that.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.hash);
  }

  @Override
  public String toString() {
    return "Uncle{"
        + "blockNumber=" + this.blockNumber
        + ", blockHash='" + this.blockHash + '\''
        + ", difficulty=" + this.difficulty
        + ", gasLimit=" + this.gasLimit
        + ", gasUsed=" + this.gasUsed
        + ", hash='" + this.hash + '\''
        + ", logsBloom='" + this.logsBloom + '\''
        + ", miner='" + this.miner + '\''
        + ", mixHash='" + this.mixHash + '\''
        + ", nonce=" + this.nonce
        + ", number=" + this.number
        + ", parentHash='" + this.parentHash + '\''
        + ", positionIndex=" + this.positionIndex
        + ", rewardValue='" + this.rewardValue + '\''
        + ", receiptsRoot='" + this.receiptsRoot + '\''
        + ", sha3Uncles='" + this.sha3Uncles + '\''
        + ", size=" + this.size
        + ", stateRoot='" + this.stateRoot + '\''
        + ", timestamp=" + this.timestamp
        + ", timestampNanoseconds=" + this.timestampNanoseconds
        + ", totalDifficulty=" + this.totalDifficulty
        + ", transactionsRoot='" + this.transactionsRoot + '\''
        + ", meta=" + this.meta
        + ", blockTimestamp=" + this.blockTimestamp
        + ", blockTimestampNanoseconds=" + this.blockTimestampNanoseconds
        + '}';
  }

  public static class Builder {

    private BigInteger blockNumber;
    private String blockHash;
    private BigInteger difficulty;
    private BigInteger gasLimit;
    private BigInteger gasUsed;
    private String hash;
    private String logsBloom;
    private String miner;
    private String mixHash;
    private BigInteger nonce;
    private BigInteger number;
    private String parentHash;
    private Integer positionIndex;
    private String rewardValue;
    private String receiptsRoot;
    private String sha3Uncles;
    private Long size;
    private String stateRoot;
    private Long timestamp;
    private Long timestampNanoseconds;
    private BigInteger totalDifficulty;
    private String transactionsRoot;

    private Map<String, Object> meta;

    private Long blockTimestamp;
    private Long blockTimestampNanoseconds;

    public Builder blockNumber(BigInteger blockNumber) {
      this.blockNumber = blockNumber;
      return this;
    }

    public Builder blockHash(String blockHash) {
      this.blockHash = blockHash;
      return this;
    }

    public Builder difficulty(BigInteger difficulty) {
      this.difficulty = difficulty;
      return this;
    }

    public Builder gasLimit(BigInteger gasLimit) {
      this.gasLimit = gasLimit;
      return this;
    }

    public Builder gasUsed(BigInteger gasUsed) {
      this.gasUsed = gasUsed;
      return this;
    }

    public Builder hash(String hash) {
      this.hash = hash;
      return this;
    }

    public Builder logsBloom(String logsBloom) {
      this.logsBloom = logsBloom;
      return this;
    }

    public Builder miner(String miner) {
      this.miner = miner;
      return this;
    }

    public Builder mixHash(String mixHash) {
      this.mixHash = mixHash;
      return this;
    }

    public Builder nonce(BigInteger nonce) {
      this.nonce = nonce;
      return this;
    }

    public Builder number(BigInteger number) {
      this.number = number;
      return this;
    }

    public Builder parentHash(String parentHash) {
      this.parentHash = parentHash;
      return this;
    }

    public Builder positionIndex(Integer positionIndex) {
      this.positionIndex = positionIndex;
      return this;
    }

    public Builder rewardValue(String rewardValue) {
      this.rewardValue = rewardValue;
      return this;
    }

    public Builder receiptsRoot(String receiptsRoot) {
      this.receiptsRoot = receiptsRoot;
      return this;
    }

    public Builder sha3Uncles(String sha3Uncles) {
      this.sha3Uncles = sha3Uncles;
      return this;
    }

    public Builder size(Long size) {
      this.size = size;
      return this;
    }

    public Builder stateRoot(String stateRoot) {
      this.stateRoot = stateRoot;
      return this;
    }

    public Builder timestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder timestampNanoseconds(Long timestampNanoseconds) {
      this.timestampNanoseconds = timestampNanoseconds;
      return this;
    }

    public Builder totalDifficulty(BigInteger totalDifficulty) {
      this.totalDifficulty = totalDifficulty;
      return this;
    }

    public Builder transactionsRoot(String transactionsRoot) {
      this.transactionsRoot = transactionsRoot;
      return this;
    }

    public Builder meta(Map<String, Object> meta) {
      this.meta = meta;
      return this;
    }

    public Builder blockTimestamp(Long blockTimestamp) {
      this.blockTimestamp = blockTimestamp;
      return this;
    }

    public Builder blockTimestampNanoseconds(Long blockTimestampNanoseconds) {
      this.blockTimestampNanoseconds = blockTimestampNanoseconds;
      return this;
    }

    public Uncle build() {
      return new Uncle(this);
    }

  }

}
