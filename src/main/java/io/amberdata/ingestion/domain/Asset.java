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
    return type;
  }

  public void setType(AssetType type) {
    this.type = type;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getIssuerAccount() {
    return issuerAccount;
  }

  public void setIssuerAccount(String issuerAccount) {
    this.issuerAccount = issuerAccount;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Map<String, Object> getMeta () {
    return meta;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
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

  public void setMeta (Map<String, Object> meta) {
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
    Asset asset = (Asset) obj;
    return type == asset.type
        && Objects.equals(code, asset.code)
        && Objects.equals(issuerAccount, asset.issuerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, issuerAccount);
  }

  @Override
  public String toString() {
    return "Asset{" +
        "type=" + type +
        ", code='" + code + '\'' +
        ", issuerAccount='" + issuerAccount + '\'' +
        ", amount='" + amount + '\'' +
        ", transactionHash='" + transactionHash + '\'' +
        ", functionCallHash='" + functionCallHash + '\'' +
        ", timestamp=" + timestamp +
        ", meta=" + meta +
        '}';
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
