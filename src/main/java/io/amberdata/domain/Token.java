package io.amberdata.domain;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

public class Token implements BlockchainEntity {

  private String address;
  private String symbol;
  private String name;
  private BigDecimal decimals;
  private boolean erc20;
  private boolean erc721;

  private Map<String, Object> optionalProperties;

  private Token(Builder builder) {
    this.address = builder.address;
    this.symbol = builder.symbol;
    this.name = builder.name;
    this.decimals = builder.decimals;
    this.erc20 = builder.erc20;
    this.erc721 = builder.erc721;

    this.optionalProperties = builder.optionalProperties;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getDecimals() {
    return decimals;
  }

  public void setDecimals(BigDecimal decimals) {
    this.decimals = decimals;
  }

  public boolean isErc20() {
    return erc20;
  }

  public void setErc20(boolean erc20) {
    this.erc20 = erc20;
  }

  public boolean isErc721() {
    return erc721;
  }

  public void setErc721(boolean erc721) {
    this.erc721 = erc721;
  }

  public Map<String, Object> getOptionalProperties() {
    return optionalProperties;
  }

  public void setOptionalProperties(Map<String, Object> optionalProperties) {
    this.optionalProperties = optionalProperties;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Token token = (Token) obj;
    return erc20 == token.erc20
        && erc721 == token.erc721
        && Objects.equals(address, token.address)
        && Objects.equals(symbol, token.symbol)
        && Objects.equals(name, token.name)
        && Objects.equals(decimals, token.decimals)
        && Objects.equals(optionalProperties, token.optionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, symbol, name, decimals, erc20, erc721, optionalProperties);
  }

  @Override
  public String toString() {
    return "Token{"
        + "address='" + address + '\''
        + ", symbol='" + symbol + '\''
        + ", name='" + name + '\''
        + ", decimals=" + decimals
        + ", erc20=" + erc20
        + ", erc721=" + erc721
        + ", optionalProperties=" + optionalProperties
        + '}';
  }

  public static class Builder {

    private String address;
    private String symbol;
    private String name;
    private BigDecimal decimals;
    private boolean erc20;
    private boolean erc721;

    private Map<String, Object> optionalProperties;

    public Builder address(String value) {
      this.address = value;
      return this;
    }

    public Builder symbol(String value) {
      this.symbol = value;
      return this;
    }

    public Builder name(String value) {
      this.name = value;
      return this;
    }

    public Builder decimals(BigDecimal value) {
      this.decimals = value;
      return this;
    }

    public Builder erc20(boolean value) {
      this.erc20 = value;
      return this;
    }

    public Builder erc721(boolean value) {
      this.erc721 = value;
      return this;
    }

    public Builder optionalProperties(Map<String, Object> value) {
      this.optionalProperties = value;
      return this;
    }

    public Token build() {
      return new Token(this);
    }
  }
}
