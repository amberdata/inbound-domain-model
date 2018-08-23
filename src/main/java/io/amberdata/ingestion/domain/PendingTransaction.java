package io.amberdata.ingestion.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;

public class PendingTransaction implements BlockchainEntity {

  public static final String PROPERTY_R = "r";
  public static final String PROPERTY_S = "s";
  public static final String PROPERTY_V = "v";

  private String hash;
  private BigInteger blockNumber;
  private String blockHash;
  private String creates;
  private String from;
  private BigInteger gas;
  private BigInteger gasPrice;
  private Long transactionIndex;
  private String input;
  private BigInteger nonce;
  private String publicKey;
  private String raw;
  private String to;
  private BigDecimal value;
  private Map<String, Object> meta;

  private Long createdAt;
  private Long createdAtNanoseconds;

  private String confirmedHash;
  private Long confirmedAt;
  private Long confirmedAtNanoseconds;

  private Integer state;

  public PendingTransaction() {

  }

  private PendingTransaction(Builder builder) {
    this.hash = builder.hash;
    this.blockNumber = builder.blockNumber;
    this.blockHash = builder.blockHash;
    this.creates = builder.creates;
    this.from = builder.from;
    this.gas = builder.gas;
    this.gasPrice = builder.gasPrice;
    this.transactionIndex = builder.transactionIndex;
    this.input = builder.input;
    this.nonce = builder.nonce;
    this.publicKey = builder.publicKey;
    this.raw = builder.raw;
    this.to = builder.to;
    this.value = builder.value;
    this.meta = builder.meta;

    this.createdAt = builder.createdAt;
    this.createdAtNanoseconds = builder.createdAtNanoseconds;

    this.confirmedHash = builder.confirmedHash;
    this.confirmedAt = builder.confirmedAt;
    this.confirmedAtNanoseconds = builder.confirmedAtNanoseconds;

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

  public String getCreates() {
    return creates;
  }

  public void setCreates(String creates) {
    this.creates = creates;
  }

  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public String getRaw() {
    return raw;
  }

  public void setRaw(String raw) {
    this.raw = raw;
  }

  public Long getConfirmedAtNanoseconds() {
    return confirmedAtNanoseconds;
  }

  public void setConfirmedAtNanoseconds(Long confirmedAtNanoseconds) {
    this.confirmedAtNanoseconds = confirmedAtNanoseconds;
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
    private BigInteger blockNumber;
    private String blockHash;
    private String creates;
    private String from;
    private BigInteger gas;
    private BigInteger gasPrice;
    private Long transactionIndex;
    private String input;
    private BigInteger nonce;
    private String publicKey;
    private String raw;
    private String to;
    private BigDecimal value;
    private Map<String, Object> meta;

    private Long createdAt;
    private Long createdAtNanoseconds;

    private String confirmedHash;
    private Long confirmedAt;
    private Long confirmedAtNanoseconds;

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

    public Builder confirmedAtNanoseconds(Long aValue) {
      this.confirmedAtNanoseconds = aValue;
      return this;
    }

    public Builder state(Integer aValue) {
      this.state = aValue;
      return this;
    }

    public Builder creates(String aValue) {
      this.creates = aValue;
      return this;
    }

    public Builder publicKey(String aValue) {
      this.publicKey = aValue;
      return this;
    }

    public Builder raw(String aValue) {
      this.raw = aValue;
      return this;
    }

    public PendingTransaction build() {
      return new PendingTransaction(this);
    }

  }

}
