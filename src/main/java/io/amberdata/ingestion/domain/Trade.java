package io.amberdata.ingestion.domain;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

public class Trade implements BlockchainEntity {
  private String tradeId;
  private Integer type;
  private String buyAddress;
  private String buyAsset;
  private BigDecimal buyAmount;
  private String sellAddress;
  private String sellAsset;
  private BigDecimal sellAmount;
  private BigDecimal fee;
  private Long timestamp;
  private Long timestampNanoseconds;
  private String orderId;
  private Long blockNumber;
  private String transactionHash;
  private String functionCallHash;
  private Map<String, Object> meta;

  public Trade() {
  }

  private Trade(Builder builder) {
    this.tradeId = builder.tradeId;
    this.type = builder.type;
    this.buyAddress = builder.buyAddress;
    this.buyAsset = builder.buyAsset;
    this.buyAmount = builder.buyAmount;
    this.sellAddress = builder.sellAddress;
    this.sellAsset = builder.sellAsset;
    this.sellAmount = builder.sellAmount;
    this.fee = builder.fee;
    this.timestamp = builder.timestamp;
    this.timestampNanoseconds = builder.timestampNanoseconds;
    this.orderId = builder.orderId;
    this.blockNumber = builder.blockNumber;
    this.transactionHash = builder.transactionHash;
    this.functionCallHash = builder.functionCallHash;
    this.meta = builder.meta;
  }

  public String getTradeId() {
    return tradeId;
  }

  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getBuyAddress() {
    return buyAddress;
  }

  public void setBuyAddress(String buyAddress) {
    this.buyAddress = buyAddress;
  }

  public String getBuyAsset() {
    return buyAsset;
  }

  public void setBuyAsset(String buyAsset) {
    this.buyAsset = buyAsset;
  }

  public BigDecimal getBuyAmount() {
    return buyAmount;
  }

  public void setBuyAmount(BigDecimal buyAmount) {
    this.buyAmount = buyAmount;
  }

  public String getSellAddress() {
    return sellAddress;
  }

  public void setSellAddress(String sellAddress) {
    this.sellAddress = sellAddress;
  }

  public String getSellAsset() {
    return sellAsset;
  }

  public void setSellAsset(String sellAsset) {
    this.sellAsset = sellAsset;
  }

  public BigDecimal getSellAmount() {
    return sellAmount;
  }

  public void setSellAmount(BigDecimal sellAmount) {
    this.sellAmount = sellAmount;
  }

  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
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

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
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

  public String getFunctionCallHash() {
    return functionCallHash;
  }

  public void setFunctionCallHash(String functionCallHash) {
    this.functionCallHash = functionCallHash;
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
    Trade trade = (Trade) object;
    return Objects.equals(tradeId, trade.tradeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeId);
  }

  @Override
  public String toString() {
    return "Trade{"
        + "tradeId='" + tradeId + '\''
        + ", type=" + type
        + ", buyAddress='" + buyAddress + '\''
        + ", buyAsset='" + buyAsset + '\''
        + ", buyAmount=" + buyAmount
        + ", sellAddress='" + sellAddress + '\''
        + ", sellAsset='" + sellAsset + '\''
        + ", sellAmount=" + sellAmount
        + ", fee=" + fee
        + ", timestamp=" + timestamp
        + ", timestampNanoseconds=" + timestampNanoseconds
        + ", orderId='" + orderId + '\''
        + ", blockNumber=" + blockNumber
        + ", transactionHash='" + transactionHash + '\''
        + ", functionCallHash='" + functionCallHash + '\''
        + ", meta=" + meta
        + '}';
  }

  public static class Builder {
    private String tradeId;
    private Integer type;
    private String buyAddress;
    private String buyAsset;
    private BigDecimal buyAmount;
    private String sellAddress;
    private String sellAsset;
    private BigDecimal sellAmount;
    private BigDecimal fee;
    private Long timestamp;
    private Long timestampNanoseconds;
    private String orderId;
    private Long blockNumber;
    private String transactionHash;
    private String functionCallHash;
    private Map<String, Object> meta;

    public Trade.Builder tradeId(String value) {
      this.tradeId = value;
      return this;
    }

    public Trade.Builder type(Integer value) {
      this.type = value;
      return this;
    }

    public Trade.Builder buyAddress(String value) {
      this.buyAddress = value;
      return this;
    }

    public Trade.Builder buyAsset(String value) {
      this.buyAsset = value;
      return this;
    }

    public Trade.Builder buyAmount(BigDecimal value) {
      this.buyAmount = value;
      return this;
    }

    public Trade.Builder sellAddress(String value) {
      this.sellAddress = value;
      return this;
    }

    public Trade.Builder sellAsset(String value) {
      this.sellAsset = value;
      return this;
    }

    public Trade.Builder sellAmount(BigDecimal value) {
      this.sellAmount = value;
      return this;
    }

    public Trade.Builder fee(BigDecimal value) {
      this.fee = value;
      return this;
    }

    public Trade.Builder timestamp(Long value) {
      this.timestamp = value;
      return this;
    }

    public Trade.Builder timestampNanoseconds(Long value) {
      this.timestampNanoseconds = value;
      return this;
    }

    public Trade.Builder orderId(String value) {
      this.orderId = value;
      return this;
    }

    public Trade.Builder blockNumber(Long value) {
      this.blockNumber = value;
      return this;
    }

    public Trade.Builder transactionHash(String value) {
      this.transactionHash = value;
      return this;
    }

    public Trade.Builder functionCallHash(String value) {
      this.functionCallHash = value;
      return this;
    }

    public Trade.Builder meta(Map<String, Object> value) {
      this.meta = value;
      return this;
    }

    public Trade build() {
      return new Trade(this);
    }
  }
}
