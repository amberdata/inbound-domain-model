package io.amberdata.ingestion.domain;

import java.util.Map;
import java.util.Objects;

public class Address implements BlockchainEntity {

  private String hash;
  private Long timestamp;

  private Map<String, Object> optionalProperties;

  public Address() {
  }

  private Address(Builder builder) {
    this.hash = builder.hash;
    this.timestamp = builder.timestamp;
    this.optionalProperties = builder.optionalProperties;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
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
    Address address = (Address) obj;
    return Objects.equals(hash, address.hash)
        && Objects.equals(timestamp, address.timestamp)
        && Objects.equals(optionalProperties, address.optionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, timestamp, optionalProperties);
  }

  @Override
  public String toString() {
    return "Address{"
        + "hash='" + hash + '\''
        + ", timestamp=" + timestamp
        + ", optionalProperties=" + optionalProperties
        + '}';
  }

  public static class Builder {

    private String hash;
    private Long timestamp;
    private Map<String, Object> optionalProperties;

    public Address.Builder hash(String value) {
      this.hash = value;
      return this;
    }

    public Address.Builder timestamp(Long value) {
      this.timestamp = value;
      return this;
    }

    public Address.Builder optionalProperties(Map<String, Object> value) {
      this.optionalProperties = value;
      return this;
    }

    public Address build() {
      return new Address(this);
    }
  }
}
