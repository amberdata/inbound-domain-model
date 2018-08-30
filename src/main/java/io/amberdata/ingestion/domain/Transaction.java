package io.amberdata.ingestion.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Transaction implements BlockchainEntity {
  private String hash;
  private BigInteger nonce;
  private BigInteger blockNumber;
  private String from;
  private List<String> to;
  private BigInteger gas;
  private BigInteger gasUsed;
  private Integer numLogs;
  private List<FunctionCall> functionCalls;
  private String status;
  private BigDecimal value;
  private Long timestamp;
  private Map<String, Object> meta;

  public Transaction() {
  }

  private Transaction(Builder builder) {
    this.hash = builder.hash;
    this.nonce = builder.nonce;
    this.blockNumber = builder.blockNumber;
    this.from = builder.from;
    this.to = builder.to;
    this.gas = builder.gas;
    this.gasUsed = builder.gasUsed;
    this.numLogs = builder.numLogs;
    this.timestamp = builder.timestamp;
    this.functionCalls = builder.functionCalls;
    this.status = builder.status;
    this.value = builder.value;
    this.meta = builder.meta;
  }

  public String getHash() {
    return this.hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public BigInteger getNonce() {
    return this.nonce;
  }

  public void setNonce(BigInteger nonce) {
    this.nonce = nonce;
  }

  public BigInteger getBlockNumber() {
    return this.blockNumber;
  }

  public void setBlockNumber(BigInteger blockNumber) {
    this.blockNumber = blockNumber;
  }

  public String getFrom() {
    return this.from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public void setTo(List<String> to) {
    this.to = to;
  }
  
  public BigInteger getGas() {
    return this.gas;
  }

  public void setGas(BigInteger gas) {
    this.gas = gas;
  }

  public BigInteger getGasUsed() {
    return this.gasUsed;
  }

  public void setGasUsed(BigInteger gasUsed) {
    this.gasUsed = gasUsed;
  }

  public Integer getNumLogs() {
    return this.numLogs;
  }

  public void setNumLogs(Integer numLogs) {
    this.numLogs = numLogs;
  }

  public Long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public List<FunctionCall> getFunctionCalls() {
    return this.functionCalls;
  }

  public void setFunctionCalls(List<FunctionCall> functionCalls) {
    this.functionCalls = functionCalls;
  }

  public Map<String, Object> getMeta() {
    return this.meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BigDecimal getValue() {
    return this.value;
  }

  public void setValue(BigDecimal value) {
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

    Transaction that = (Transaction) object;
    return Objects.equals(this.hash, that.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.hash);
  }

  @Override
  public String toString() {
    return "Transaction{"
        + "hash='" + this.hash + '\''
        + ", nonce=" + this.nonce
        + ", blockNumber=" + this.blockNumber
        + ", from='" + this.from + '\''
        + ", to='" + this.to + '\''
        + ", gas=" + this.gas
        + ", gasUsed=" + this.gasUsed
        + ", numLogs=" + this.numLogs
        + ", functionCalls=" + this.functionCalls
        + ", status='" + this.status + '\''
        + ", value=" + this.value
        + ", timestamp=" + this.timestamp
        + ", meta=" + this.meta
        + '}';
  }

  public static class Builder {
    private String hash;
    private BigInteger nonce;
    private BigInteger blockNumber;
    private String from;
    private List<String> to;
    private BigInteger gas;
    private BigInteger gasUsed;
    private Integer numLogs;
    private Long timestamp;
    private List<FunctionCall> functionCalls;
    private String status;
    private BigDecimal value;
    private Map<String, Object> meta;

    public Transaction.Builder hash(String value) {
      this.hash = value;
      return this;
    }

    public Transaction.Builder nonce(BigInteger value) {
      this.nonce = value;
      return this;
    }

    public Transaction.Builder blockNumber(BigInteger value) {
      this.blockNumber = value;
      return this;
    }

    public Transaction.Builder from(String value) {
      this.from = value;
      return this;
    }

    public Transaction.Builder to(List<String> value) {
      this.to = value;
      return this;
    }
    
    public Transaction.Builder gas(BigInteger value) {
      this.gas = value;
      return this;
    }

    public Transaction.Builder gasUsed(BigInteger value) {
      this.gasUsed = value;
      return this;
    }

    public Transaction.Builder numLogs(Integer value) {
      this.numLogs = value;
      return this;
    }

    public Transaction.Builder timestamp(Long value) {
      this.timestamp = value;
      return this;
    }

    public Transaction.Builder functionCalls(List<FunctionCall> value) {
      this.functionCalls = value;
      return this;
    }

    public Transaction.Builder status(String value) {
      this.status = value;
      return this;
    }

    public Transaction.Builder value(BigDecimal value) {
      this.value = value;
      return this;
    }

    public Transaction.Builder meta(Map<String, Object> value) {
      this.meta = value;
      return this;
    }

    public Transaction build() {
      return new Transaction(this);
    }
  }
}
