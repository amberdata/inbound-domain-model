package io.amberdata.domain;

import java.util.Objects;

public class Asset {

  private AssetType type;
  private String code;
  private String issuerAccount;
  private String amount;
  private boolean isAuthRequired;
  private boolean isAuthRevocable;

  public Asset() {
  }

  private Asset(Builder builder) {
    this.type = builder.type;
    this.code = builder.code;
    this.issuerAccount = builder.issuerAccount;
    this.amount = builder.amount;
    this.isAuthRequired = builder.isAuthRequired;
    this.isAuthRevocable = builder.isAuthRevocable;
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

  public boolean isAuthRequired() {
    return isAuthRequired;
  }

  public void setAuthRequired(boolean authRequired) {
    isAuthRequired = authRequired;
  }

  public boolean isAuthRevocable() {
    return isAuthRevocable;
  }

  public void setAuthRevocable(boolean authRevocable) {
    isAuthRevocable = authRevocable;
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
    return "Asset{"
        + "type=" + type
        + ", code=" + code
        + ", issuerAccount='" + issuerAccount + '\''
        + '}';
  }

  public static class Builder {

    private AssetType type;
    private String code;
    private String issuerAccount;
    private String amount;
    private boolean isAuthRequired;
    private boolean isAuthRevocable;

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

    public Builder isAuthRequired(boolean value) {
      this.isAuthRequired = value;
      return this;
    }

    public Builder isAuthRevocable(boolean value) {
      this.isAuthRevocable = value;
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
