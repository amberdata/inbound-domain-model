package io.amberdata.ingestion.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;

public class PendingTransaction implements BlockchainEntity {

  public static final String PROPERTY_R = "r";
  public static final String PROPERTY_S = "s";
  public static final String PROPERTY_V = "v";
  public static final String PROPERTY_CREATES = "creates";
  public static final String PROPERTY_PUBLIC_KEY = "publicKey";
  public static final String PROPERTY_RAW = "raw";

  private String hash;
  private BigInteger nonce;
  private String blockHash;
  private BigInteger blockNumber;
  private Long transactionIndex;
  private String from;
  private String to;
  private BigDecimal value;
  private String input;
  private BigInteger gasPrice;
  private BigInteger gas;
  private Long createdAt;
  private Long createdAtNanoseconds;
  private Map<String, Object> meta;

  private String confirmedHash;
  private Long confirmedAt;
  private Integer state;

  public PendingTransaction() {

  }

  private PendingTransaction(Builder builder) {
    this.hash = builder.hash;
    this.nonce = builder.nonce;
    this.blockHash = builder.blockHash;
    this.blockNumber = builder.blockNumber;
    this.transactionIndex = builder.transactionIndex;
    this.from = builder.from;
    this.to = builder.to;
    this.value = builder.value;
    this.input = builder.input;
    this.gasPrice = builder.gasPrice;
    this.gas = builder.gas;
    this.createdAt = builder.createdAt;
    this.createdAtNanoseconds = builder.createdAtNanoseconds;
    this.meta = builder.meta;
    this.confirmedHash = builder.confirmedHash;
    this.confirmedAt = builder.confirmedAt;
    this.state = builder.state;
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

  public Long getTransactionIndex() {
    return this.transactionIndex;
  }

  public void setTransactionIndex(Long transactionIndex) {
    this.transactionIndex = transactionIndex;
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

  public BigDecimal getValue() {
    return this.value;
  }

  public void setValue(BigDecimal aValue) {
    this.value = aValue;
  }

  public String getInput() {
    return this.input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public BigInteger getGasPrice() {
    return this.gasPrice;
  }

  public void setGasPrice(BigInteger gasPrice) {
    this.gasPrice = gasPrice;
  }

  public BigInteger getGas() {
    return this.gas;
  }

  public void setGas(BigInteger gas) {
    this.gas = gas;
  }

  public Long getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public Long getCreatedAtNanoseconds() {
    return this.createdAtNanoseconds;
  }

  public void setCreatedAtNanoseconds(Long createdAtNanoseconds) {
    this.createdAtNanoseconds = createdAtNanoseconds;
  }

  public Map<String, Object> getMeta() {
    return this.meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  public String getConfirmedHash() {
    return confirmedHash;
  }

  public void setConfirmedHash(String confirmedHash) {
    this.confirmedHash = confirmedHash;
  }

  public Long getConfirmedAt() {
    return confirmedAt;
  }

  public void setConfirmedAt(Long confirmedAt) {
    this.confirmedAt = confirmedAt;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if ((object == null) || (this.getClass() != object.getClass())) {
      return false;
    }

    PendingTransaction that = (PendingTransaction) object;
    return Objects.equals(this.hash, that.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.hash);
  }

  public static class Builder {

    private String hash;
    private BigInteger nonce;
    private String blockHash;
    private BigInteger blockNumber;
    private Long transactionIndex;
    private String from;
    private String to;
    private BigDecimal value;
    private String input;
    private BigInteger gasPrice;
    private BigInteger gas;
    private Long createdAt;
    private Long createdAtNanoseconds;
    private Map<String, Object> meta;

    private String confirmedHash;
    private Long confirmedAt;
    private Integer state;

    public Builder hash(String aValue) {
      this.hash = aValue;
      return this;
    }

    public Builder nonce(BigInteger aValue) {
      this.nonce = aValue;
      return this;
    }

    public Builder blockHash(String aValue) {
      this.blockHash = aValue;
      return this;
    }

    public Builder blockNumber(BigInteger aValue) {
      this.blockNumber = aValue;
      return this;
    }

    public Builder transactionIndex(Long aValue) {
      this.transactionIndex = aValue;
      return this;
    }

    public Builder from(String aValue) {
      this.from = aValue;
      return this;
    }

    public Builder to(String aValue) {
      this.to = aValue;
      return this;
    }

    public Builder value(BigDecimal aValue) {
      this.value = aValue;
      return this;
    }

    public Builder input(String aValue) {
      this.input = aValue;
      return this;
    }

    public Builder gasPrice(BigInteger aValue) {
      this.gasPrice = aValue;
      return this;
    }

    public Builder gas(BigInteger aValue) {
      this.gas = aValue;
      return this;
    }

    public Builder createdAt(Long aValue) {
      this.createdAt = aValue;
      return this;
    }

    public Builder createdAtNanoseconds(Long aValue) {
      this.createdAtNanoseconds = aValue;
      return this;
    }

    public Builder meta(Map<String, Object> aValue) {
      this.meta = aValue;
      return this;
    }

    public Builder confirmedHash(String aValue) {
      this.confirmedHash = aValue;
      return this;
    }

    public Builder confirmedAt(Long aValue) {
      this.confirmedAt = aValue;
      return this;
    }

    public void state(Integer aValue) {
      this.state = aValue;
    }

    public PendingTransaction build() {
      return new PendingTransaction(this);
    }

  }

}
