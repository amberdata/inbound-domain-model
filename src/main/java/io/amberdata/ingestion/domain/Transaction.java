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
    this.gas = builder.gas;
    this.gasUsed = builder.gasUsed;
    this.numLogs = builder.numLogs;
    this.timestamp = builder.timestamp;
    this.functionCalls = builder.functionCalls;
    this.meta = builder.meta;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public BigInteger getNonce() {
    return nonce;
  }

  public void setNonce(BigInteger nonce) {
    this.nonce = nonce;
  }

  public BigInteger getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(BigInteger blockNumber) {
    this.blockNumber = blockNumber;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public BigInteger getGas() {
    return gas;
  }

  public void setGas(BigInteger gas) {
    this.gas = gas;
  }

  public BigInteger getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(BigInteger gasUsed) {
    this.gasUsed = gasUsed;
  }

  public Integer getNumLogs() {
    return numLogs;
  }

  public void setNumLogs(Integer numLogs) {
    this.numLogs = numLogs;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public List<FunctionCall> getFunctionCalls() {
    return functionCalls;
  }

  public void setFunctionCalls(List<FunctionCall> functionCalls) {
    this.functionCalls = functionCalls;
  }

  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
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
    Transaction that = (Transaction) obj;
    return Objects.equals(hash, that.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash);
  }

  @Override
  public String toString() {
    return "Transaction{" +
        "hash='" + hash + '\'' +
        ", nonce=" + nonce +
        ", blockNumber=" + blockNumber +
        ", from='" + from + '\'' +
        ", gas=" + gas +
        ", gasUsed=" + gasUsed +
        ", numLogs=" + numLogs +
        ", functionCalls=" + functionCalls +
        ", status='" + status + '\'' +
        ", value=" + value +
        ", timestamp=" + timestamp +
        ", meta=" + meta +
        '}';
  }

  public static class Builder {

    private String hash;
    private BigInteger nonce;
    private BigInteger blockNumber;
    private String from;
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
