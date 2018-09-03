package io.amberdata.ingestion.domain;

import java.util.Map;
import java.util.Objects;

public class Asset implements BlockchainEntity {
  private AssetType type;
  private String code;
  private String issuerAccount;
  private String amount;
  private String transactionHash;
  private String functionCallHash;
  private Long timestamp;
  private Map<String, Object> meta;

  public Asset() {
  }

  private Asset(Builder builder) {
    this.type = builder.type;
    this.code = builder.code;
    this.issuerAccount = builder.issuerAccount;
    this.amount = builder.amount;
    this.timestamp = builder.timestamp;
    this.transactionHash = builder.transactionHash;
    this.functionCallHash = builder.functionCallHash;
    this.meta = builder.meta;
  }

  public AssetType getType() {
    return this.type;
  }

  public void setType(AssetType type) {
    this.type = type;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getIssuerAccount() {
    return this.issuerAccount;
  }

  public void setIssuerAccount(String issuerAccount) {
    this.issuerAccount = issuerAccount;
  }

  public String getAmount() {
    return this.amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Map<String, Object> getMeta() {
    return this.meta;
  }

  public Long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
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

    Asset that = (Asset) object;
    return this.type == that.type
        && Objects.equals(this.code, that.code)
        && Objects.equals(this.issuerAccount, that.issuerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.type, this.code, this.issuerAccount);
  }

  @Override
  public String toString() {
    return "Asset{"
        + "type=" + this.type
        + ", code='" + this.code + '\''
        + ", issuerAccount='" + this.issuerAccount + '\''
        + ", amount='" + this.amount + '\''
        + ", transactionHash='" + this.transactionHash + '\''
        + ", functionCallHash='" + this.functionCallHash + '\''
        + ", timestamp=" + this.timestamp
        + ", meta=" + this.meta
        + '}';
  }

  public static class Builder {
    private AssetType type;
    private String code;
    private String issuerAccount;
    private String amount;
    private Long timestamp;
    private String transactionHash;
    private String functionCallHash;

    private Map<String, Object> meta;

    public Builder type(AssetType value) {
      this.type = value;
      return this;
    }

    public Builder code(String value) {
      this.code = value;
      return this;
    }

    public Builder issuerAccount(String value) {
      this.issuerAccount = value;
      return this;
    }

    public Builder amount(String value) {
      this.amount = value;
      return this;
    }

    public Builder timestamp(Long value) {
      this.timestamp = value;
      return this;
    }

    public Builder transactionHash(String value) {
      this.transactionHash = value;
      return this;
    }

    public Builder functionCallHash(String value) {
      this.functionCallHash = value;
      return this;
    }

    public Builder meta(Map<String, Object> value) {
      this.meta = value;
      return this;
    }

    public Asset build() {
      return new Asset(this);
    }
  }

  public enum AssetType {
    ASSET_TYPE_NATIVE(0, "native"),
    ASSET_TYPE_CREDIT_ALPHANUM4(1, "credit_alphanum4"),
    ASSET_TYPE_CREDIT_ALPHANUM12(2, "credit_alphanum12"),
    ASSET_TYPE_UNKNOWN(3, "unknown");

    private int value;
    private String name;

    AssetType(int value, String name) {
      this.value = value;
      this.name = name;
    }

    /**
     * Creates an AssetType object by its string name.
     * @param name name of the asset used in stellar network
     * @return an object of AssetType
     */
    public static AssetType fromName(String name) {
      for (AssetType assetType : values()) {
        if (assetType.getName().equals(name)) {
          return assetType;
        }
      }

      return AssetType.ASSET_TYPE_UNKNOWN;
    }

    public int getValue() {
      return this.value;
    }

    public String getName() {
      return name;
    }
  }
}
