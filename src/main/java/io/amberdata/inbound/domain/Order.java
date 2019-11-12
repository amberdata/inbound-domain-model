package io.amberdata.inbound.domain;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

public class Order implements BlockchainEntity {
  private Integer             type;
  private String              orderId;
  private String              buyAsset;
  private String              sellAsset;
  private BigDecimal          buyAmount;
  private BigDecimal          sellAmount;
  private Long                expirationMs;
  private Long                expirationNanoseconds;
  private String              makerAddress;
  private Long                timestamp;
  private Long                timestampNanoseconds;
  private Long                blockNumber;
  private String              transactionHash;
  private String              functionCallHash;
  private Map<String, Object> meta;

  public Order() {
  }

  private Order(Builder builder) {
    this.type                  = builder.type;
    this.orderId               = builder.orderId;
    this.buyAsset              = builder.buyAsset;
    this.sellAsset             = builder.sellAsset;
    this.buyAmount             = builder.buyAmount;
    this.sellAmount            = builder.sellAmount;
    this.expirationMs          = builder.expirationMs;
    this.expirationNanoseconds = builder.expirationNanoseconds;
    this.makerAddress          = builder.makerAddress;
    this.timestamp             = builder.timestamp;
    this.timestampNanoseconds  = builder.timestampNanoseconds;
    this.blockNumber           = builder.blockNumber;
    this.transactionHash       = builder.transactionHash;
    this.functionCallHash      = builder.functionCallHash;
    this.meta                  = builder.meta;
  }

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getOrderId() {
    return this.orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getBuyAsset() {
    return this.buyAsset;
  }

  public void setBuyAsset(String buyAsset) {
    this.buyAsset = buyAsset;
  }

  public String getSellAsset() {
    return this.sellAsset;
  }

  public void setSellAsset(String sellAsset) {
    this.sellAsset = sellAsset;
  }

  public BigDecimal getBuyAmount() {
    return this.buyAmount;
  }

  public void setBuyAmount(BigDecimal buyAmount) {
    this.buyAmount = buyAmount;
  }

  public BigDecimal getSellAmount() {
    return this.sellAmount;
  }

  public void setSellAmount(BigDecimal sellAmount) {
    this.sellAmount = sellAmount;
  }

  public Long getExpirationMs() {
    return this.expirationMs;
  }

  public void setExpirationMs(Long expirationMs) {
    this.expirationMs = expirationMs;
  }

  public Long getExpirationNanoseconds() {
    return this.expirationNanoseconds;
  }

  public void setExpirationNanoseconds(Long expirationNanoseconds) {
    this.expirationNanoseconds = expirationNanoseconds;
  }

  public String getMakerAddress() {
    return this.makerAddress;
  }

  public void setMakerAddress(String makerAddress) {
    this.makerAddress = makerAddress;
  }

  public Long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Long getTimestampNanoseconds() {
    return this.timestampNanoseconds;
  }

  public void setTimestampNanoseconds(Long timestampNanoseconds) {
    this.timestampNanoseconds = timestampNanoseconds;
  }

  public Long getBlockNumber() {
    return this.blockNumber;
  }

  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }

  public String getTransactionHash() {
    return this.transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public String getFunctionCallHash() {
    return this.functionCallHash;
  }

  public void setFunctionCallHash(String functionCallHash) {
    this.functionCallHash = functionCallHash;
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
    Order order = (Order) object;
    return Objects.equals(this.orderId, order.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.orderId);
  }

  @Override
  public String toString() {
    return "Order{"
        + "type="                  + this.type                    + ","
        + "orderId='"              + this.orderId + '\''          + ","
        + "buyAsset='"             + this.buyAsset + '\''         + ","
        + "sellAsset='"            + this.sellAsset + '\''        + ","
        + "buyAmount="             + this.buyAmount               + ","
        + "sellAmount="            + this.sellAmount              + ","
        + "expirationMs="          + this.expirationMs            + ","
        + "expirationNanoseconds=" + this.expirationNanoseconds   + ","
        + "makerAddress='"         + this.makerAddress + '\''     + ","
        + "timestamp="             + this.timestamp               + ","
        + "timestampNanoseconds="  + this.timestampNanoseconds    + ","
        + "blockNumber="           + this.blockNumber             + ","
        + "transactionHash='"      + this.transactionHash + '\''  + ","
        + "functionCallHash='"     + this.functionCallHash + '\'' + ","
        + "meta="                  + this.meta
        + '}';
  }

  public static class Builder {

    private Integer             type;
    private String              orderId;
    private String              buyAsset;
    private String              sellAsset;
    private BigDecimal          buyAmount;
    private BigDecimal          sellAmount;
    private Long                expirationMs;
    private Long                expirationNanoseconds;
    private String              makerAddress;
    private Long                timestamp;
    private Long                timestampNanoseconds;
    private Long                blockNumber;
    private String              transactionHash;
    private String              functionCallHash;
    private Map<String, Object> meta;

    public Order.Builder type(Integer value) {
      this.type = value;
      return this;
    }

    public Order.Builder orderId(String value) {
      this.orderId = value;
      return this;
    }

    public Order.Builder buyAsset(String value) {
      this.buyAsset = value;
      return this;
    }

    public Order.Builder sellAsset(String value) {
      this.sellAsset = value;
      return this;
    }

    public Order.Builder buyAmount(BigDecimal value) {
      this.buyAmount = value;
      return this;
    }

    public Order.Builder sellAmount(BigDecimal value) {
      this.sellAmount = value;
      return this;
    }

    public Order.Builder expirationMs(Long value) {
      this.expirationMs = value;
      return this;
    }

    public Order.Builder expirationNanoseconds(Long value) {
      this.expirationNanoseconds = value;
      return this;
    }

    public Order.Builder makerAddress(String value) {
      this.makerAddress = value;
      return this;
    }

    public Order.Builder timestamp(Long value) {
      this.timestamp = value;
      return this;
    }

    public Order.Builder timestampNanoseconds(Long value) {
      this.timestampNanoseconds = value;
      return this;
    }

    public Order.Builder blockNumber(Long value) {
      this.blockNumber = value;
      return this;
    }

    public Order.Builder transactionHash(String value) {
      this.transactionHash = value;
      return this;
    }

    public Order.Builder functionCallHash(String value) {
      this.functionCallHash = value;
      return this;
    }

    public Order.Builder meta(Map<String, Object> value) {
      this.meta = value;
      return this;
    }

    public Order build() {
      return new Order(this);
    }

  }
}
